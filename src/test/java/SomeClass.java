import org.junit.Test;

public class SomeClass {
    @Test
    public void test1(){
        int x=1;
        int y=2;
        assert x+1==y;
    }

    @Test
    public void test2(){
        int x=2;
        int y=3;
        assert x*y==6;
    }
}

public class MathUtils {
    public int multiply(int a, int b) {
        return a * b;
    }
}
