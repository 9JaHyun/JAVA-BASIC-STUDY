import java.lang.reflect.Constructor;

public class 붕어빵 {
    private Sauce sauce;
    private int 소스량;
    private String 굽기정도;

    public 붕어빵(Sauce sauce, int amount, String cookStatus){
        this.sauce = sauce;     // 파라미터와, 필드의 이름이 같은 경우 구분을 위해 this 사용
        소스량 = amount;
        굽기정도 = cookStatus;
    }
    
    public static void main(String[] args) {
        붕어빵 붕어빵1 = new 붕어빵(Sauce.슈크림, 15, "잘굽혔다");
        붕어빵 붕어빵2 = new 붕어빵(Sauce.슈크림, 20, "덜익었다");
        붕어빵 붕어빵3 = new 붕어빵(Sauce.팥, 15, "잘굽혔다");
        붕어빵 붕어빵4 = new 붕어빵(Sauce.팥, 20, "탔다");
    }

    public void 굽기(){
        System.out.println("잘 굽히고 있습니다.");
    }

    public void 뒤집기(){
        System.out.println("붕어빵을 뒤집습니다.");
    }
}
