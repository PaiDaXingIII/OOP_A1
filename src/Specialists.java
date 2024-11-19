public class Specialists extends HealthProfessional {

    private String department;
    public Specialists() {
        super();
    }
    public Specialists(int ID, String name, String type, String department) {
        super(ID, name, type);
        this.department = department;
    }
    @Override
    public void printAllVariables() {
        super.printAllVariables();
        System.out.println("Department: " + department);
        System.out.println("Health Professional Type: Specialists");
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}