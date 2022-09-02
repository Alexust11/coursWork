

public class Main {
    private static String min() {
        int minWages=Employee.employee[1].getWages();
        int number=0;
        for (int i = 1; i < Employee.employee.length; i++) {
            if (Employee.employee[i].getWages() < minWages) {
                minWages=Employee.employee[i].getWages();
                number=i;
            }
        }
        return "Сотрудник с минимальной зарплатой: "+Employee.employee[number].getSurName()+" "+ Employee.employee[number].getName()+" "+Employee.employee[number].getPatronymic();

    }
    private static String max() {
        int maxWages = Employee.employee[1].getWages();
        int number = 0;
        for (int i = 1; i < Employee.employee.length; i++) {
            if (Employee.employee[i].getWages() > maxWages) {
                maxWages = Employee.employee[i].getWages();
                number = i;
            }
        }
        return "Сотрудник с максимальной зарплатой: " + Employee.employee[number].getSurName() + " " + Employee.employee[number].getName() + " " + Employee.employee[number].getPatronymic();
    }
        public static int suma() {
        int s = 0;
        for (int i = 0; i < Employee.employee.length; i++) {
            s += Employee.employee[i].getWages();
        }
        return s;
    }
//

    public static void main(String[] args) {


        //Employee [] employee=new  Employee[10];
      // Employee[] employee;
        Employee.employee[0] = new Employee("Иванов", "Иван", "Иванович", 2, 50000);
        Employee.employee[1] = new Employee("Петров", "Петр", "Петрович", 2, 60000);
        Employee.employee[2] = new Employee("Сидоров", "Николай", "Кузьмич", 1, 45000);
        Employee.employee[3] = new Employee("Криворучко ", "Семен", "Семеныч", 1, 70000);
        Employee.employee[4] = new Employee("Нилов", "Иннокентий", "Петрович", 3, 30000);
        Employee.employee[5] = new Employee("Бобков", "Александр", "Степанович", 4, 43000);
        Employee.employee[6] = new Employee("Баулин", "Николай", "Васильевч", 3, 54000);
        Employee.employee[7] = new Employee("Раков", "Александр", "Юрьевич", 1, 66000);
        Employee.employee[8] = new Employee("Шишкин", "Андрей", "Ильич", 2, 74000);
        Employee.employee[9] = new Employee("Пономарев", "Игорь", "Анатольевич", 4, 48000);



      for (int i = 0; i < Employee.employee.length; i++) { System.out.println(Employee.employee[i].toString());}
        System.out.println("__________________________________________");

        System.out.println("Сумма затрат на зарплаты в месяц= "+ suma()+ " руб.");
        System.out.println(min());
        System.out.println(max());

//        double averageSalary=suma(employee)/employee.length;
//        System.out.println("Средняя заработная плата сотрудников= "+averageSalary+ " руб");
        System.out.println("__________________________________________");
        for (int i = 0; i < Employee.employee.length; i++) {
            System.out.println(Employee.employee[i].getSurName()+" "+Employee.employee[i].getName()+" "+Employee.employee[i].getPatronymic());
        }
    }


}