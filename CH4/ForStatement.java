public class ForStatement{
    public static void main(String[] args) {
        basicForStatement();
        arrayForStatement();
    }

    private static void arrayForStatement() {
        String[] array = {"이것은", "배열", "입니다."};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (String element : array) {
            System.out.println(element);
        }
    }

    private static void basicForStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }
}