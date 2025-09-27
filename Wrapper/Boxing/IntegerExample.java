package Wrapper.Boxing;

public class IntegerExample {
    public static void main(String[] args) {
        int a = 100;

        // Autoboxing
        Integer obj = a;

        // Utility methods
        System.out.println(Integer.toString(a));   // "100"
        System.out.println(Integer.parseInt("200"));// 200
        System.out.println(Integer.max(10, 20));   // 20
    }
}
