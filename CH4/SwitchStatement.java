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
        int switchCase = 5;
        switch(switchCase){
            case 1 :
                // code inside the case value1
                break; // optional
            
            case 2 :
                // code inside the case value2 
                break; // optional
            case 3 : 

            switch(variable/expression)
            {
                case valueOne :
                    // code inside the case valueOne 
                    break; // optional
            
                case valueTwo :
                    // code inside the case valueTwo 
                    break; // optional
                default : 
                    // code inside the default case .
            }

            default : 
                // code inside the default case .
        }
    }
}
