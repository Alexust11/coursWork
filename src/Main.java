import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Employee [] employee=new  Employee[10];
        employee[0] = new Employee("Иванов", "Иван", "Иванович", 2, 50000);
        employee[1] = new Employee("Петров", "Петр", "Петрович", 2, 60000);
        employee[2] = new Employee("Петров", "Петр", "Петрович", 2, 60000);
        employee[3] = new Employee("Петров", "Петр", "Петрович", 2, 60000);
        employee[4] = new Employee("Петров", "Петр", "Петрович", 2, 60000);

        for (int i = 0; i < employee.length; i++)
            if (employee[i] != null) {
                System.out.println(employee[i].getId()) ;
            }



    }
}