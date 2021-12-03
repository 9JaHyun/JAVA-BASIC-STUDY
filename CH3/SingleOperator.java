public class SingleOperator{
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c;

        c = a++;
        System.out.println(c);
        System.out.println(a);

        c = ++a;
        System.out.println(c);
        System.out.println(a);
    }
}