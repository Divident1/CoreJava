package FileHandling.MyPrograms;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        
      

        try{
              FileWriter f1 = new FileWriter("//Users//gotamsingh//JavaBtm//FileHandling//FilesCreated//NewFile.txt");
            try{
            f1.write("Java is the best Programming language js");
        }
        finally{
            f1.close();
        }
        System.out.println("SomeThings has been written successfully.");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
