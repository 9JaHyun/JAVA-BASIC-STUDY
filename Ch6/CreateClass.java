public class CreateClass {
    public String field1;

    public CreateClass() {}

    public CreateClass(String par1) {
        field1 = par1;
    }
    
    public static void main(String[] args) {
        // 선언
        CreateClass class1;

        // 초기화 -> 반드시 필요하다,
        // System.out.println(class1);  컴파일 에러 (에러 내용 : 초기화 필요)

        class1 = new CreateClass();
        CreateClass class2 = new CreateClass();
        System.out.println(class1); // 정상 작동

        // new를 통한 객체를 생성하는 방식을 인스턴스화라고 한다.
        CreateClass instance1 = new CreateClass("내용1");
        CreateClass instance2 = new CreateClass("내용2");
        CreateClass instance3 = new CreateClass("내용3");
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}


