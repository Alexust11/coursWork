

public class Main {
//    private static String min() {
//        float minWages = Employee.employee[0].getWages();
//        int number = 0;
//        for (int i = 1; i < Employee.employee.length; i++) {
//            if (Employee.employee[i].getWages() < minWages) {
//                minWages = Employee.employee[i].getWages();
//                number = i;
//            }
//        }
//        return Employee.employee[number].getSurName() + " " + Employee.employee[number].getName() + " " + Employee.employee[number].getPatronymic();
//
//    }
//
//    private static String max() {
//        float maxWages = Employee.employee[0].getWages();
//        int number = 0;
//        for (int i = 1; i < Employee.employee.length; i++) {
//            if (Employee.employee[i].getWages() > maxWages) {
//                maxWages = Employee.employee[i].getWages();
//                number = i;
//            }
//        }
//        return Employee.employee[number].getSurName() + " " + Employee.employee[number].getName() + " " + Employee.employee[number].getPatronymic();
//    }
//
//    public static float suma() {
//        float s = 0;
//        for (int i = 0; i < Employee.employee.length; i++) {
//            s += Employee.employee[i].getWages();
//        }
//        return s;
//    }
//
//    //
//    public static float averageSalary() // средняя заработная плата
//    {       float k=Employee.employee.length;
//        return suma() / k;
//    }
//
//    public static void  outputFullRecords() //Вывод полной информации по записям
//    {
//        for (int i = 0; i < Employee.employee.length; i++) {
//            System.out.println(Employee.employee[i].toString());
//        }
//    }
//    public static void  outputFio()//Вывод только фио работников
//    {
//        for (int i = 0; i < Employee.employee.length; i++) {
//            System.out.println(Employee.employee[i].getSurName()+" "+Employee.employee[i].getName()+" "+Employee.employee[i].getPatronymic());
//        }
//    }
//
//    private static void  indexationWage(float percent) {
//        for (int i = 0; i < Employee.employee.length; i++) {
//            Employee.employee[i].setWages(Employee.employee[i].getWages()*(1+(percent/100)));
//        }
//    }

    public static void main(String[] args) {


        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов", "Иван", "Иванович", 2, 50000.45f);
        employee[1] = new Employee("Петров", "Петр", "Петрович", 2, 60000f);
        employee[2] = new Employee("Сидоров", "Николай", "Кузьмич", 1, 45000f);
        employee[3] = new Employee("Криворучко ", "Семен", "Семеныч", 1, 70000f);
        employee[4] = new Employee("Нилов", "Иннокентий", "Петрович", 3, 30000f);
        employee[5] = new Employee("Бобков", "Александр", "Степанович", 4, 43000f);
        employee[6] = new Employee("Баулин", "Николай", "Васильевч", 3, 64000f);
        employee[7] = new Employee("Раков", "Александр", "Юрьевич", 1, 66000f);
        employee[8] = new Employee("Шишкин", "Андрей", "Ильич", 2, 74000f);
        employee[9] = new Employee("Пономарев", "Игорь", "Анатольевич", 4, 48000f);
       // System.out.println(employee[1].getName());

        // Базовая часть
//        outputFullRecords();
//        System.out.println("__________________________________________");
//
//        System.out.println("Сумма затрат на зарплаты в месяц= "+ suma()+ " руб.");
//        System.out.println("Сотрудник с минимальное зарплатой: "+min());
//        System.out.println("Сотрудник с максимальной зарплатой: "+max());
//        System.out.println("__________________________________________");
//        System.out.println("Средняя заработная плата сотрудников= "+averageSalary()+ " руб");
//        System.out.println("__________________________________________");
//        outputFio();
//        System.out.println("__________________________________________");
//        // Повышенный уровень
//             // 1. Индексация з/п
//         indexationWage(13.1f);
//         outputFullRecords();
//        System.out.println("__________________________________________");
//
//    }

    }
}