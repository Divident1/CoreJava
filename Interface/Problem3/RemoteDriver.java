package Interface.Problem3;

interface Remote {
    void up();
    void down();
}

class ACRemote implements Remote {

    @Override
    public void up() {
      System.out.println("Up karo ");
    }

    @Override
    public void down() {
       System.out.println("Down karo");
    }


    
}

class SpeakerRemote implements Remote{

    @Override
    public void up() {
     System.out.println("kyu uper karn ha");
    }

    @Override
    public void down() {
       System.out.println("Niche niche se kar lu");
    }

}

public class RemoteDriver{
    public static void main(String[] args) {
        Remote r = new ACRemote();
        r.up();
       
    }
}
