package operator_out;

public class TestTimesPlus {

    int result;

    public void foo() {
        result/*]*/
         = 1 + /*[*/
        10 * 10;
    }

    public int inline(int x) {
        return 1 + x;
    }
}
