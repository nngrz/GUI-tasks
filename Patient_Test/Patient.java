package Patient_Test;

abstract public class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getIllness();

    public abstract String getTreatment();
}
