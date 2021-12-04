class Egg2 {
    public static void print(String x) {
        System.out.println(x);
    }

    
    protected class Yolk {
        public Yolk() {
            print("Egg2.Yolk()");
        }

        public void f() {
            print("Egg2.Yolk.f()");
        }
    }


    private Yolk y = new Yolk();

    public Egg2() {
        print("New Egg2()");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }
}