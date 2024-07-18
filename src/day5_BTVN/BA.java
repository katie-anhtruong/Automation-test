package day5_BTVN;

public class BA extends Employee {
    private String specialization;

    public BA(String name, int age, String department, String specialization) {
        super(name, age, department);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayInformation() {
        System.out.println("BA: " + getName() + ", Age: " + getAge() + ", Department: " + getDepartment() + ", Specialization: " + specialization);
    }
}