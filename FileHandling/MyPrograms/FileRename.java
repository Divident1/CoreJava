package FileHandling.MyPrograms;

import java.io.File;


public class FileRename {
    public static void main(String[] args){
        File f= new File("//Users//gotamsingh//JavaBtm//FileHandling//FilesCreated//NewFile.txt");
          File r= new File("//Users//gotamsingh//JavaBtm//FileHandling//FilesCreated//NewFile1.txt");


          if(f.exists()){
            System.out.println(f.renameTo(r));
          }
         else
          {
            System.out.println("Exceptio handled Successfully");
          }
    }
}
