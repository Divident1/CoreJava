package OOPS.Encapsulation.EncapBtm;


public class Person {
    private String name;
    private String gname;

    
    public Person(String name, String gname) {
        this.name = name;
        this.gname = gname;
    }


    public String getName() {
        return name;
    }



    public String getGname() {
        return gname;
    }

  
    public void setGname(String gname) {
        this.gname = gname;
    }
}
