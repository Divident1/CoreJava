package FileHandling.MyPrograms;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)  {

        //! Either i can use throws in main declaration and without usng try catch
        File f1= new File("//Users//gotamsingh//JavaBtm//FileHandling//FilesCreated//New1.txt");

       try{
         if(f1.createNewFile())
        {
                System.out.println("File created Succesfully");
        }else{
            System.out.println("File is not craeted successfully");
        }
       }catch(IOException e)
       {
        System.out.println("Exception handled successfully");
       }
    }
}
