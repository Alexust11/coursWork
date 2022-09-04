

public class Main {


    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployees("Иванов", "Иван", "Иванович", 2, 50000.45f);
        employeeBook.addEmployees("Петров", "Петр", "Петрович", 2, 60000f);
        employeeBook.addEmployees("Сидоров", "Николай", "Кузьмич", 1, 45000f);
        employeeBook.addEmployees("Криворучко ", "Семен", "Семеныч", 1, 70000f);
        employeeBook.addEmployees("Баулин", "Николай", "Васильевч", 3, 64000f);
        employeeBook.addEmployees("Пономарев", "Игорь", "Анатольевич", 4, 48000f);
        employeeBook.addEmployees("Сучков", "Сергей", "Сергееич", 1, 48000f);
        // перенос всех методов из предыдущих уровней
        employeeBook.outtAllRecords();
        System.out.println("__________________________________________");
        System.out.println("Сумма затрат на зарплаты в месяц= " + employeeBook.suma());
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.max());
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.min());
        System.out.println("Средняя заработная плата сотрудников= " + employeeBook.averageSalary() + " руб.");
        employeeBook.indexationWage(15f);
        System.out.println("__________________________________________");
        employeeBook.outtAllRecords();
        System.out.println("__________________________________________");

        employeeBook.searchDepMin(3);
        employeeBook.searchDepMax(2);
        System.out.println("__________________________________________");
        employeeBook.indexWageDep(15, 2);
        employeeBook.outputRecordsDep(2);
        int numDep = 2;
        System.out.println("Сумма затрат на отдел № " + numDep + "=" + employeeBook.costCalcDep(numDep) + " руб");
        System.out.println("Средняя сумма затрат на отдел № " + numDep + "=" + employeeBook.calcSredDep(numDep) + " руб");
        System.out.println("__________________________________________");
        employeeBook.outputFio();
        System.out.println("__________________________________________");
        employeeBook.searchWorkMin(60000f);//поиск сотрудников с меньшей зарплатой
        employeeBook.searchWorkMax(50000f);//поиск сотрудников с большей зарплатой
        System.out.println("__________________________________________");
        System.out.println("__________________________________________");
        employeeBook.removeEmployee("Баулин");
        employeeBook.outtAllRecords();
        System.out.println("__________________________________________");
        employeeBook.addEmployees("Свиноренко", "Николай", "Николаевич", 3, 50000f);
        employeeBook.outtAllRecords();
        employeeBook.modernWages("Иванов", "Иван", "Иванович", 39000f);
        employeeBook.modernDepartmens("Иванов", "Иван", "Иванович", 3);
        // Задача 6
        System.out.println("__________________________________________");
        employeeBook.outtAllRecords();
        System.out.println("__________________________________________");
        employeeBook.sortDepertmens();

//            employee[4] = new Employee("Нилов", "Иннокентий", "Петрович", 3, 30000f);
//            employee[5] = new Employee("Бобков", "Александр", "Степанович", 4, 43000f);
//            employee[7] = new Employee( "Раков", "Александр", "Юрьевич", 1, 66000f);
//            employee[8] = new Employee("Шишкин", "Андрей", "Ильич", 2, 74000f);
//
//
//        // Базовая часть


//        System.out.println("__________________________________________");
//        // Повышенный уровень
//
//            // 2-я задача
//
//

//

//            System.out.println("__________________________________________");
//            // 3-я задача
//
//            searchWorkMin(70000f);
//            System.out.println("__________________________________________");
//            searchWorkMax(80000f);

    }


}
