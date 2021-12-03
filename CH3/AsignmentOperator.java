public class AsignmentOperator{
    public static void main(String[] args){
        basic();
        reference();
        deepCopy();
    }

    private static void basic(){
        int num01 = 7;
        int num02 = 7;
        int num03 = 7;  

        num01 = num01 - 5;
        num02 -= 5;
        num03 =- 5;  

        println(num01);
        println(num02);
        println(num03);  
    }

    private static void reference(){
        Member member1 = new Member("member1");
        Member member2 = new Member("member2");

        member1 = member2;
        member2.setName("newMember1");
        System.out.println(member1.getName());  // newMember1
    }

    private static void deepCopy(){
        Member member1 = new Member("member1");
        Member member2 = new Member("member2");

        member1 = member2.clone();
        member2.setName("newMember1");
        System.out.println(member1.getName());  // member2;
    }
}

public class Member {
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