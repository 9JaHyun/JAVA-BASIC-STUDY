public class ForStatement{
    public static void main(String[] args) {
        basicForStatement();
        arrayForStatement();
    }

    private static void arrayForStatement() {
        String[] str = {"이것은", "배열", "입니다."};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        for (String string : str) {
            System.out.println(string);
        }
    }

    private static void basicForStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}