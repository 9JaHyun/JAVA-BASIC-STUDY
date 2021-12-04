public class ClassField {

    // 인스턴스 필드
    public String field1;
    public String field2;
    public String field3;

    // 정적(클래스, Static) 필드
    public static String staticField1;
    public static String staticField2;
    
    // 파라미터
    void method1(String parameter){
        System.out.println(parameter);
    }

    public static void main(String[] args) {
        // 인스턴스 필드는 인스턴스를 만들어야 사용할 수 있다.
        // String usingField1 = field1;  사용 불가

        ClassField instance = new ClassField(); // 인스턴스 생성...
        ClassField instance1 = new ClassField(); // 인스턴스 생성...
        String usingField2 = instance.field1;   // 사용 가능!

        // 정적 필드는 클래스 로드 시점에 메모리에 올라가기 때문에 사용이 가능하다.
        String usingField3 = ClassField.staticField1;
        String usingField4 = ClassField.staticField2;
    }
}
