package Patient_Test;

public class Test {
    public static void main(String[] args) {
        Patient[] patients = {new HeadPatient("Janek"),
                              new LegPatient("Edzio"),
                              new DyspepsiaPatient("Marian")
                            };

        for (Patient p : patients) {
            System.err.println("Patient: " + p.getName() + '\n' +
                            "Illness: " + p.getIllness() + '\n' +
                            "Treatment: " + p.getTreatment() + '\n'
                            );
        }
    }
}
