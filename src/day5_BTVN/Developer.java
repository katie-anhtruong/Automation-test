package day5_BTVN;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, String department, String programmingLanguage) {
        super(name, age, department);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInformation() {
        System.out.println("Developer: " + getName() + ", Age: " + getAge() + ", Department: " + getDepartment() + ", Programming Language: " + programmingLanguage);
    }
}