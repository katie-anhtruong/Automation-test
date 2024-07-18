package day5_BTVN;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Developer Developer1 = new Developer(null, 0, null, null);
    Developer1.setName("Nguyen A");
    Developer1.setAge(32);
    Developer1.setDepartment("FE");
    Developer1.setProgrammingLanguage("Java");
    Developer1.displayInformation();
    
    Tester Tester1 = new Tester(null, 0, null, null);
    Tester1.setAge(24);
    Tester1.setDepartment("Mobile");
    Tester1.setName("Nguyen B");
    Tester1.setTestingType("BE");
    Tester1.displayInformation();
    
    BA BA1 = new BA(null, 0, null, null);
    BA1.setAge(36);
    BA1.setDepartment("eComer");
    BA1.setName("Nguyen C");
    BA1.setSpecialization("Manager");
    BA1.displayInformation();
 
	}
	
}
