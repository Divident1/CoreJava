package Interface;

interface A{
    void voice();
}

interface B extends A{
    void display();
}

class C implements A,B{

    @Override
    public void display() {
        // TODO Auto-generated method stub
      System.out.println("Should i display here ");
    }

    @Override
    public void voice() {
        // TODO Auto-generated method stub
        System.out.println("Should i generete a voice here ");
    }
    
}

 class Main {
    public static void main(String[] args) {
        
        C a1 = new C();
        a1.voice();
        a1.display();
    }
    
}
