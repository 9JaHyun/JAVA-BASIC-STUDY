public class ConstructorSample {
    private String field1;

    // 기본(default) 생성자
    public ConstructorSample() {}
    public ConstructorSample(String field){
        field1 = field;
    }

    public static void main(String[] args) {
        // field1이 비어있는 인스턴스 생성
        ConstructorSample instance1 = new ConstructorSample();

        String sayHello = "hello";
        // field1 = "hello"로 차있는 인스턴스 생성.
        ConstructorSample instance2 = new ConstructorSample(sayHello);

    }
    
}
