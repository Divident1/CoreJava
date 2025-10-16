package FileHandling.MyPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        
       

      try{
        File file = new File("//Users//gotamsingh//JavaBtm//FileHandling//FilesCreated//NewFile.txt");
        FileReader f1= new FileReader(file);
          try{

          
            
            int size = (int) file.length();
            char[] c= new char[size];
            f1.read(c);

            System.out.println("File read successfully");
            System.out.println(new String(c));
        
           
        }
         finally{
                f1.close();
            }
      }
      catch(IOException e)
      {
        System.out.println("Exception handled");
      }
    }
}
