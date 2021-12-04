public class InitField{
    String field1 = "Hello"; //방법1 . 선언과 함께 초기화
    String field2;
    String field3;

    // 방법2. 생성자를 통한 초기화
    public InitField(String field2){
        this.field2 = field2;
        this.field3 = "HelloField3";
    }

    String field4;
    String field5;
    // 방법3. 초기화 블록을 통한 초기화 (보통 static 블록을 사용하지 그냥 블록은 생성자로 대체한다.)
    {
        this.field4 = "HelloField4";
        this.field5 = "HelloField5";
        System.out.println(field4);
    }

    // 문제 : 생성자 vs 초기화 블록
    // 생성자와 초기화블록이 겹치면 어느 것이 실행될까?
    // 정답은 new HelloField4 (오버라이딩 된다.)
    public InitField(){
        field4 = "new HelloField4";
    }

    public static void main(String[] args) {
        InitField initField = new InitField();
        System.out.println(initField.field4);
    }
}