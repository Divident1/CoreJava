package Section3.Exception.UnChecked;

public class StringBoundException {
    

  public static void main(String[] args) {
      String s= new String("Gotam");

    for(int i=5;i<=8;i++)
    {
       s.charAt(i) ;
    }
  }
}
