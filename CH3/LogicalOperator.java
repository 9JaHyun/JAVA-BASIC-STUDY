public class LogicalOperator{
    public static void main(String[] args){
        basic();
        becarefulShortCurcit();

    }
    private static void basic(){
        boolean a = false;
        boolean b = true;

        boolean result;

        result = a && b;        // a에서 바로 false
        result = a & b;         // a, b 모두 연산하고 false
        result = a || b;        // b까지 와서 true (a가 false기 때문)
        result = b || a;        // 이처럼 b가 앞에 나온다면 b까지만 연산하고 true 반환
        result = a | b;         // a, b 모두 연산하고 true
        result = a ^ b;         // true
        result = !a;            // true
        result = !b;            // false
    }
    private static void becarefulShortCurcit(){
        int num1 = 0;
        int num2 = 0;
        boolean result;

        result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
        System.out.println("num1: "+num1+" num2: "+num2 + " result: " + result);
        // 실행 결과: num1: 10 num2: 0 result: false
    }
}