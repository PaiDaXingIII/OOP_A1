public class HealthProfessional {
    private int ID;
    private String name;
    private String type;
    public HealthProfessional() {
    }
    public HealthProfessional(int ID, String name, String type) {
        this.ID = ID;
        this.name = name;
        this.type = type;
    }
    public void printAllVariables() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
