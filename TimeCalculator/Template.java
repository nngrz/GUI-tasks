package TimeCalculator;

abstract class Template {

    public abstract void job();

    public void calculateTime() {

        // Get the start time
        long start = System.currentTimeMillis();
        job();
        // Get the end time
        long end = System.currentTimeMillis();
        System.out.println("Task execution time " + (end - start));
    }
}
