package ex_1106;

public class lab001 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //This is implicit casting done by JVM
         int a1 = (int)b; // EXplicit Cating- we mention specifically
        System.out.println(a1);
        System.out.println(a);
    }
}
