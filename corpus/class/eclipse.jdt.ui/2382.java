package argument_out;

public class TestLiteralReferenceRead {

    public void main() {
        int i = 10;
        bar(10);
    }

    public void foo(int x) {
        int i = x;
        bar(x);
    }

    public void bar(int z) {
    }
}
