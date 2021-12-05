public class Quiz {
    public static void main(String[] args) {
        // question5();
        // question6();
        question6_1();
    }

    /** Q5. 다음과 같이 출력하시오
     *  =============   
     *  *       (for)
     *  **      (for)
     *  ***     (for)
     *  ****    (for)
     *  =============    
     */
    // Key-Point! 반복 수가 적은걸 밖으로 빼라!
    // `줄 띄우기`
    // `* 그리기` 
    private static void question5(){
        for (int i = 1; i <= 4; i++) {      // 줄 띄우기
            for (int j = 1; j <= i; j++) {  // `*` 그리기
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /** Q6. 다음과 같이 출력하시오
     *  ==========  
     *     *
     *    **
     *   ***
     *  ****
     *  ==========   
     */
    // `줄 띄우기`
    // `공백 그리기`
    // `* 그리기`
    private static void question6(){
        for (int i = 1; i <= 4; i++) {
            // 공백 for문
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }

            // 별 그리는 for문
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void question6_1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > 0; j--) {
                if(i < j){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
