public class TypeCasting{
    public static void main(String[] args){
        int a = 300;
        byte b = (byte) a;      // Overflow로 인한 300 - 256 = 44
        System.out.println(b);
    }
}