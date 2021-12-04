public class BreakAndContinue {
    public static void main(String[] args) {
        breakMethod();
        continueMethod();
    }

    private static void breakMethod() {
        int num = 0;
        while(true){
            num++;
            System.out.println(num);
            if(num == 25) break;        // 25가 되면 반복문 종료
        }
    }

    private static void continueMethod() {
        int num = 0;
         while(num < 30){
             num++;
            if(num == 25) continue;        // 25는 출력하지 않음!
                 System.out.println(num);
        }
    }
}
