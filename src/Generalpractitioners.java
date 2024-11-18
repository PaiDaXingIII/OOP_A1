public class Generalpractitioners extends HealthProfessional {

    private String department;
    public Generalpractitioners() {
        super();
    }
    public Generalpractitioners(int ID, String name, String type, String department) {
        super(ID, name, type);
        this.department = department;
    }
    @Override
    public void printAllVariables() {
        super.printAllVariables();
        System.out.println("Department: " + department);
        System.out.println("Health Professional Type: Other Health Professional");
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}