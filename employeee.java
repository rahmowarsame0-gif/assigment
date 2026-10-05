package paractice;

public class employeee {

        private int id;
        private String firstName;
        private  String lastName;
        private int salary;


        public employeee (int id, String firstName, String lastName, int salary) {
            this.id = id;
            this.firstName=firstName;
            this.lastName=lastName;
            this.salary=salary;
        }

        public int getId () {
            return id;
        }
        public String getFirstName () {
            return firstName;
        }
        public String getLastName () {
            return  lastName;
        }
        public String getName () {
            return firstName + " " + lastName;
        }
        public int getSalary () {
            return salary;
        }
        public void setSalary (int salary) {
            this.salary= salary;
        }
        public int getAnnualSalary () {
            return salary * 12;
        }
        public int riseSalary (int percent) {
            int amount = percent / 100;
            return  salary + amount;
        }
        public String toString () {
            return  "Employee: "  +
                    "\n \t Id is: " + id +
                    "\n \t Name Is: " + getName() +
                    "\n \t Salary Is: " + salary;
        }

    }

    class tes {
        public static void main(String[] args) {

            employeee e1 = new employeee(2, "Safia", "Abdirahmaan", 1000);
            System.out.println(e1);  // To String

            e1.setSalary(500);
            System.out.println(e1);  // toString();
            System.out.println("id is: " + e1.getId());
            System.out.println("firstname is: " + e1.getFirstName());
            System.out.println("lastname is: " + e1.getLastName());
            System.out.println("salary is: " + e1.getSalary());

            System.out.println("name is: " + e1.getName());
            System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

            // Test raiseSalary()

            System.out.println(e1);
        }
    }

