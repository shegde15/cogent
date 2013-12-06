package annotation;

class Parent {
    public float calculate (float a, float b) {
        return a * b;
    }
}


public class Child extends Parent {
    
    public float calculat222 (float a, float b) {
        return (a + 1) * b;
    }
    @Override
    public float calculate (float a, float b) {
        return a * b;
    }
}