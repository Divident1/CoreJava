package FileHandling.MyPrograms;

import java.io.File;

public class GetInfomation {
    public static void main(String[] args) {
        
         File f1= new File("//Users//gotamsingh//JavaBtm//FileHandling//FilesCreated//NewFile.txt");

         if(f1.exists())
         {
            System.out.println("File name:"+f1.getName());
            System.out.println("File Size:"+f1.length());
            System.out.println("File writeable?"+f1.canWrite());
            System.out.println("File readabel:"+ f1.canRead());
            System.out.println("File path:"+f1.getAbsolutePath());
            System.out.println("File is deleted"+f1.delete());

         }else{
            System.out.println("File does not exit");
         }
    }
}
