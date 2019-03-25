package strategy.processors;

import strategy.Processor;

public class Subtraction implements Processor {

    @Override
    public int process(int a, int b) {
        return a - b;
    }
}
