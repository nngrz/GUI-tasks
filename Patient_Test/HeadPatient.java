package Patient_Test;

public class HeadPatient extends Patient {

    public HeadPatient(String name) {
        super(name);
    }

    @Override
    public String getIllness() {
        return "head";
    }

    @Override
    public String getTreatment() {
        return "aspirin";
    }
}
