package communication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Demo of writing the content of a remote resource to a text file
 *
 * @author the OpenClassrooms Education Team
 *
 */
public class WriteFile {

    /**
     * Connect to a resource from a URL and print its content type
     * @param args not used in this example
     */
    public static void main(String[] args){
        // define the string representation of the URL to connect to
        String urlString=UserInput.askForUrl();

        // connect and print the content type of the retrieved resource
        try {
            URLConnection myURLConnection=RemoteContent.connectFromURL(urlString);
            List<String> content= RemoteContent.getContent(myURLConnection);
            writeToFile(content, "output.txt");

        }
        // manage errors if the connection fails
        catch (MalformedURLException e) {
            System.err.println("Malformed URL - " + e.getLocalizedMessage());
        }
        catch(IOException e){
            System.err.println("Cannot establish connection - "+ e.toString());
        }
    }

    /** writes the content of a list of strings to a file
     *
     * @param content the list of strings
     * @param fileName the name of the output file
     */
    public static void writeToFile(List<String> content, String fileName) {
        Path pathToFile= Paths.get(fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(pathToFile)){
            for(String line: content) {
                writer.write(line);
            }
            System.out.println("Content written to " + pathToFile  );
        } catch (IOException e) {
            System.out.println("Could not write file to " + pathToFile);
            e.printStackTrace();
        }
    }
}