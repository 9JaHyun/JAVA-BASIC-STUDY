import javax.print.event.PrintJobListener;
import javax.sound.sampled.SourceDataLine;

public class AsignmentOperator{
    public static void main(String[] args){
        basic();
        reference();
        // deepCopy();
    }

    private static void basic(){
        int num01 = 7;
        int num02 = 7;
        int num03 = 7;

        num01 = num01 - 5;
        num02 -= 5;    // num02 = num02 - 5;  => 2

        
        num03 =-5;    //  num03 = -5;

        System.out.println(num01);
        System.out.println(num02);
        System.out.println(num03);
    }



    private static void reference(){
        Member member1 = new Member("member1");
        Member member2 = new Member("member2");

        member1 = member2;
        member2.setName("newMember1");
        System.out.println(member1.getName());  // newMember1
    }
}

class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}