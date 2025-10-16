package Final.Variable;

 class Test {
    

        private final  int age;

        Test(){
            age=10;
        }




    public int getAge() {
        return age;
    }


    

}

public class Student{
    public static void main(String[] args) {
     Test t= new Test();
     System.out.println(t.getAge());
    }
}
