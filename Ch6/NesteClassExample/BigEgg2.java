package NesteClassExample;
public class BigEgg2 extends Egg2 {

    public class Yolk extends Egg2.Yolk {
        public Yolk(){
            print("BigEgg2.Yolk()");
        }

        public void f() {
            print("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();    // 
                                    // y = new Yolk() -> Egg2.Yolk()
                                    // 
        e2.g();                     // Egg2.Yolk.f();
    }
}

// BigEgg2() -> insertYolk(new Yolk());
// private Yolk y = new Yolk();
// Yolk() 실행 -> print("Egg2.Yolk()") -> Egg2.Yolk 출력
// Egg2(){print("New Egg2()")} 실행 -> New Egg2() 출력
// insertYolk 종료

// e2.g() 실행
    // Egg2.Yolk.f() 출력

