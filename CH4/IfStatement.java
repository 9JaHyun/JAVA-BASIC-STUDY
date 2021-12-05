public class IfStatement{
    public static void main(String[] args){
        // ifThen1();
        // ifThen2();
        // if_Else();
        if_ElseIf_Else();
        // nestedIf();
    }
    private static void ifThen1(){
        int a = 5;
        if(a < 10){
            System.out.println("a는 10보다 작습니다.");
        }
    }

    private static void ifThen2(){
        int a = 5;
        if(a < 10) System.out.println("a는 10보다 작습니다.");
        System.out.println("a는 10보다 작지 않습니다.");
    }

    private static void if_Else(){
        int a = 5;
        if(a < 10){
            System.out.println("a는 10보다 작습니다.");
        } else {
            System.out.println("a는 10보다 큽니다.");
        }
    }

    private static void if_ElseIf_Else(){
        int  a = 10;
        // 조건문 
        if(a > 5 && test1()) {
            System.out.println("a가 5보다 큰 경우 코드 실행");
        }else if(test2() && a < 5) {
            System.out.println("a가 5보다 작은 경우 코드 실행");
        }else {
            System.out.println("a가 5인경우 코드 실행");
        }
        // 조건문 끝
        System.out.println("테스트 종료");
    }

    private static boolean test1(){
        System.out.println("첫번째 else if문 실행");
        return true;
    }

    private static boolean test2(){
        System.out.println("두번째 else if문 실행");
        return true;
    }

    private static void nestedIf(){
        int a = 8;
        if(a > 5) {
            if(a < 10) {
                System.out.println("a가 5보다 크고 10보다 작으면 코드 실행");
            }else{
                System.out.println("a가 10이상이면 코드 실행");
            }
        }
    }

}