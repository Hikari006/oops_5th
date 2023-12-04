package prg1;
class Employee {
     String name;
     int roll;

     Employee(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

     

     void display() {
       System.out.println("Name is" +name);
       System.out.println("Roll no is"+roll);
    }
}

class Manager extends Employee {
    double Salary;
   

     Manager(String name, int roll, double Salary) {
        super(name, roll);
        this.Salary = Salary;
        
    }

   
     double salary() {
        return Salary;
    }
}

class Programmer extends Employee {
     double hourlyRate;
     int hr;

     Programmer(String name, int roll, double hourlyRate, int hr) {
        super(name, roll);
        this.hourlyRate = hourlyRate;
        this.hr = hr;
    }


     double salary() {
        return hourlyRate * hr;
    }
}

 class Test {
    public static void main(String[] args) {
        Employee employee= new Employee("Hiki",83);
        Manager manager = new Manager("Deepita", 101, 50000.0);
        Programmer programmer = new Programmer("Srijo", 102, 25.0, 1000);

         System.out.println("Employee Details:");
         employee.display();
          System.out.println("Manager Details:");
          manager.display();
          System.out.println("Manager salary " +manager.salary());

       

        System.out.println("\nProgrammer Details:");
        programmer.display();
        System.out.println("Programmer salary " +programmer.salary());

}
 }