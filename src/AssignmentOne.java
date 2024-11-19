public class AssignmentOne {
    public static void main(String[] args) {
        // Part3
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General Practitioner", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General Practitioner", "Internal Medicine");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Brown", "General Practitioner", "Pediatrics");
        // Create three objects for General Practitioners
        Specialists ohp1 = new Specialists(4, "Nurse Lisa", "Nurse", "Cardiology Department");
        Specialists ohp2 = new Specialists(5, "Physiotherapist Tom", "Physiotherapist", "Rehabilitation Department");
        // Print detailed information about the General Practitioners object
        gp1.printAllVariables();
        System.out.println("------------------------------");
        gp2.printAllVariables();
        System.out.println("------------------------------");
        gp3.printAllVariables();
        System.out.println("------------------------------");
        // Print details of other health professional types of objects
        ohp1.printAllVariables();
        System.out.println("------------------------------");
        ohp2.printAllVariables();
        System.out.println("------------------------------");
    }
}