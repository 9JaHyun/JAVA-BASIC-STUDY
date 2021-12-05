public class SwitchStatement {
    public static void main(String[] args) {
        
    }

    private static void sameCase() {
        int switchCase = 1;
        switch(switchCase)
        {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
             // 실행 코드
                break; 
          
            case 5 :
            case 6 :
            case 7 :
            case 8 :
              // 실행 코드
            break; 
            default : 
                // 실행 코드
       }
    }

    private static void nestedSwitch() {
        String date = "일요일";
        switch(date){
            case "평일" :
                System.out.println("마트 안쉬는 날");
                break; // optional
            
            case "토요일" :
                System.out.println("마트 안쉬는 날");
                break; // optional
            case "일요일" : 

            switch(date){
                case "홀수번 째" :
                    System.out.println("마트 안쉬는 날");
                    break; // optional
            
                case "짝수번 째" :
                System.out.println("마트 쉬는 날");
                    break; // optional
                default : 
                    // code inside the default case .
            }

            default : 
                // code inside the default case .
        }
    }
}
