public class WhileStatement{
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(i < 5){
            i++;
            sum += i;
            System.out.printf("%d 번째 반복문 : sum = %d \n", i, sum);
        }
    }
}