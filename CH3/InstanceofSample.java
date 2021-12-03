public class InstanceofSample{
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        System.out.println(a instanceof A); // true
        System.out.println(b instanceof A); // true
        System.out.println(a instanceof B); // false
        System.out.println(b instanceof B); // true
    }
}

class A{}
class B extends A{}
