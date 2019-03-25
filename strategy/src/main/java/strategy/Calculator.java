package strategy;

public class Calculator {

    private Processor processor;
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.setA(a);
        this.setB(b);
    }

    public int getResult() {
        return this.processor.process(this.a, this.b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

}
