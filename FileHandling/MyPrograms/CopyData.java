package FileHandling.MyPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData {
    public static void main(String[] args) {
        File source = new File("//Users//gotamsingh//JavaBtm//FileHandling//FilesCreated//NewFile1.txt");
        File destination = new File("//Users//gotamsingh//JavaBtm//FileHandling//FilesCreated//NewFileCopied.txt");

        try (FileReader reader = new FileReader(source);
             FileWriter writer = new FileWriter(destination)) {

            int size = (int) source.length();
            char[] buffer = new char[size];

            // ✅ Read content from source file
            reader.read(buffer);

            // ✅ Write content to destination file
            writer.write(buffer);

            System.out.println("✅ File copied successfully!");
            System.out.println("Copied Content:\n" + new String(buffer));

        } catch (IOException e) {
            System.out.println("❌ Exception handled: " + e.getMessage());
        }
    }
}
