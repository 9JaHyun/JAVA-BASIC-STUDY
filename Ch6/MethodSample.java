public class MethodSample {
    // 클래스 필드
    private static String staticField1;

    // 인스턴스 필드
    private String field1;

    // 클래스(정적) 메서드는 클래스(정적) 필드만 사용 가능.
    public static void staticMethod1(){
        System.out.println(staticField1);
        // System.out.println(field1);  컴파일 에러
    }

    // 인스턴스 메서드는 모두 사용 가능.
    public void method1(){
        System.out.println(field1);
        System.out.println(staticField1);
    }
}
