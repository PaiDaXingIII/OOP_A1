public class GeneralPractitioner extends HealthProfessional {
    private String specialtyArea;
    public GeneralPractitioner() {
        super();
    }

    public GeneralPractitioner(int ID, String name, String type, String specialtyArea) {
        super(ID, name, type);
        this.specialtyArea = specialtyArea;
    }

    @Override
    public void printAllVariables() {
        super.printAllVariables();
        System.out.println("Specialty Area: " + specialtyArea);
        System.out.println("Health Professional Type: General Practitioner");
    }

    public String getSpecialtyArea() {
        return specialtyArea;
    }

    public void setSpecialtyArea(String specialtyArea) {
        this.specialtyArea = specialtyArea;
    }
}