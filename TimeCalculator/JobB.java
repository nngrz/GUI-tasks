package TimeCalculator;

public class JobB extends Template {

    long num = 0;
    @Override
    public void job() {
        for (int i = 1; i <= 80000; i++) {
            num *= i;
        }
        System.out.print("Job B ");
    }
}
