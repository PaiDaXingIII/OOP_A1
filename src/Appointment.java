public class Appointment {
    private String patientName;
    private String patientPhone;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;
    public Appointment() {
    }
    public Appointment(String patientName, String patientPhone, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    public void printAllVariables() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        if (selectedDoctor instanceof GeneralPractitioner) {
            System.out.println("Selected Doctor Type: General Practitioner");
            GeneralPractitioner gp = (GeneralPractitioner) selectedDoctor;
            gp.printAllVariables();
        } else if (selectedDoctor instanceof Specialists) {
            System.out.println("Selected Doctor Type: Other Health Professional");
            Specialists ohp = (Specialists) selectedDoctor;
            ohp.printAllVariables();
        }
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}