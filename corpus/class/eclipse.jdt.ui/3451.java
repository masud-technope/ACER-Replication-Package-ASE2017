package staticMethods_in;

interface A_test105 {

    enum E implements  {

        A() {

            int foo() {
                return extracted();
            }
        }
        ;
    }

    static int extracted() {
        /*[*/
        return /*]*/
        0;
    }
}
