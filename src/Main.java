

public class Main {
    private static String min(Employee[] employee) {
        int minWages=employee[1].getWages();
        int number=0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getWages() < minWages) {
                minWages=employee[i].getWages();
                number=i;
            }
        }
        return "Сотрудник с минимальной зарплатой: "+employee[number].getSurName()+" "+ employee[number].getName()+" "+employee[number].getPatronymic();

    }
    private static String max(Employee[] employee) {
        int maxWages = employee[1].getWages();
        int number = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getWages() > maxWages) {
                maxWages = employee[i].getWages();
                number = i;
            }
        }
        return "Сотрудник с максимальной зарплатой: " + employee[number].getSurName() + " " + employee[number].getName() + " " + employee[number].getPatronymic();
    }
        public static int suma(Employee[] employee) {
        int s = 0;
        for (int i = 0; i < employee.length; i++) {
            s += employee[i].getWages();
        }
        return s;
    }
//

    public static void main(String[] args) {


        Employee [] employee=new  Employee[10];
        employee[0] = new Employee("Иванов", "Иван", "Иванович", 2, 50000);
        employee[1] = new Employee("Петров", "Петр", "Петрович", 2, 60000);
        employee[2] = new Employee("Сидоров", "Николай", "Кузьмич", 1, 45000);
        employee[3] = new Employee("Криворучко ", "Семен", "Семеныч", 1, 70000);
        employee[4] = new Employee("Нилов", "Иннокентий", "Петрович", 3, 30000);
        employee[5] = new Employee("Бобков", "Александр", "Степанович", 4, 43000);
        employee[6] = new Employee("Баулин", "Николай", "Васильевч", 3, 54000);
        employee[7] = new Employee("Раков", "Александр", "Юрьевич", 1, 66000);
        employee[8] = new Employee("Шишкин", "Андрей", "Ильич", 2, 74000);
        employee[9] = new Employee("Пономарев", "Игорь", "Анатольевич", 4, 48000);


        for (int i = 0; i < employee.length; i++) { System.out.println(employee[i].toString());}

        System.out.println("Сумма затрат на зарплаты в месяц= "+ suma(employee)+ " руб.");

        System.out.println(min(employee));

        System.out.println(max(employee));

        double averageSalary=suma(employee)/employee.length;
        System.out.println("Средняя заработная плата сотрудников= "+averageSalary+ " руб");

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getSurName()+" "+employee[i].getName()+" "+employee[i].getPatronymic());
        }
    }


}