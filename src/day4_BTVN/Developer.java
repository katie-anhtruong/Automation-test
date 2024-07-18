package day4_BTVN;

public class Developer {

    public static void main(String[] args) {
  
        Employee developer1 = new Employee();
        developer1.setemployee_id(1);
        developer1.setemployee_name("John Ho");
     

      
        Employee developer2 = new Employee();
        developer2.setemployee_id(2);
        developer2.setemployee_name("Jane Doe");
    

   
        System.out.println("employee_id: "+ String.valueOf(developer1.getemployee_id()) + ", name:"+ developer1.getemployee_name()+", salary:"+ String.valueOf(developer1.getemployee_salary()));
        System.out.println("employee_id: "+ String.valueOf(developer2.getemployee_id()) + ", name:"+ developer2.getemployee_name()+", salary:"+ String.valueOf(developer2.getemployee_salary()));
    }
}