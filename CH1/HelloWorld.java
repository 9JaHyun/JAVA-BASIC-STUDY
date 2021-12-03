public class HelloWorld {
    // Static
    static final String str1 = "static final String1";
    
    // Static Method
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello World");
        method1();
    }

    // Instance Method
    public static void method1(){
        String str = "var1";
        System.out.println(str);
    }
}