public class Test {

    private int bb(int u, int v, int w) {
        return (u & v) | (~u & w);
    }

    private int aa(int x, int n) {
        return (x << n) | (x >>> (32 - n));
    }

    protected void processBlock() {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        a = aa((a + bb(b, c, d)), 0) + b;
    }
}
