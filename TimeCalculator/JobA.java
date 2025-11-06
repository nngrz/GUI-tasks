package TimeCalculator;

public class JobA extends Template {

    long num = 0;
    @Override
    public void job() {
        for (int i = 1; i <= 800000; i++) {
            num += i;
        }
        System.out.print("Job A ");
    }
}
