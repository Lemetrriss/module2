package classWork.theme_2_17;

public class ThreadedCalculator implements Runnable{

    private Main main;
    private IntegralCalculator calculator;

    ThreadedCalculator(MyFunction f, double a, double b, int n, Main main){
        this.main = main;
        calculator = new IntegralCalculator(f, a, b, n);
    }

    @Override
    public void run() {
        double v = calculator.calculate();
        main.sendResult(v);
    }
}