package p;

enum MyEnum implements  {

    FOO() {
    }
    , BAR() {
    }
    ;

    void someMethod(A a) {
        switch(this) {
            case FOO:
                System.out.println(A.a);
                break;
            case BAR:
                System.out.println(a.b);
        }
    }
}
