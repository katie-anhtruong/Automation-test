package day5_BTVN;

public class Tester extends Employee {
    private String testingType;

    public Tester(String name, int age, String department, String testingType) {
        super(name, age, department);
        this.testingType = testingType;
    }

    public String getTestingType() {
        return testingType;
    }

    public void setTestingType(String testingType) {
        this.testingType = testingType;
    }

    @Override
    public void displayInformation() {
        System.out.println("Tester: " + getName() + ", Age: " + getAge() + ", Department: " + getDepartment() + ", Testing Type: " + testingType);
    }
}