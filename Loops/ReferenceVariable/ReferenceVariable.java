
//In Java, a reference variable is a variable that does not store the actual object, but instead stores the memory address (reference) of the object in the heap.
//Student s1 = new Student();
//Student s2 = s1; 
//Here, only one object is created in the heap.

Both s1 and s2 hold the same memory address of that object.

✅ Memory address → same

package Loops.ReferenceVariable;

public class ReferenceVariable {
    
    String name;
    int age;
    public static void main(String args[])
    {
        ReferenceVariable r1= new ReferenceVariable();
        ReferenceVariable r2 =new ReferenceVariable();
        r1.name="Gotam";
        r2.name="Gotam";
        
        System.out.println(r1==r2);

    }
}
