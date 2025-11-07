package Patient_Test;

public class LegPatient extends Patient{

    public LegPatient(String name) {
        super(name);
    }

    @Override
    public String getIllness() {
        return "leg";
    }

    @Override
    public String getTreatment() {
        return "cast";
    }
}
