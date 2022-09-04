

public class Main {

//    private static int min() {
//        float minWages = employee[0].getWages();
//        int number = 0;
//        for (int i = 1; i < employee.length; i++) {
//            if (employee[i].getWages() < minWages) {
//                minWages = employee[i].getWages();
//                number = i;
//            }
//        }
//        //return employee[number].getSurName() + " " + employee[number].getName() + " " + employee[number].getPatronymic();
//            return number;
//    }
//

////

//
//    //
//    private static float averageSalary() // средняя заработная плата
//    {       float k=employee.length;
//        return suma() / k;
//    }
//
//    private static void   outputFullRecords() //Вывод полной информации по записям
//    {
//
//        for (int i = 0; i <employee.length; i++) {
//            System.out.println(employee[i]);
//        }
// }
//    private static void   outputRecordsDep(int dep) //Вывод  информации по записям отдела
//    {
//
//        for (int i = 0; i <employee.length; i++) {
//            if (employee[i].getDepartment() == dep) {
//                   System.out.println(employee[i].getSurName()+ " "+employee[i].getName()+" "+ employee[i].getPatronymic()+" З/п ="+employee[i].getWages());
//            }
//        }
//    }
//    private static void  outputFio()//Вывод только фио работников
//    {
//        for (int i = 0; i < employee.length; i++) {
//            System.out.println(employee[i].getSurName()+" "+employee[i].getName()+" "+employee[i].getPatronymic());
//        }
//    }
//
//    private static void  indexationWage(float percent)
//    {
//        for (int i = 0; i < employee.length; i++) {
//            employee[i].setWages(employee[i].getWages()*(1+(percent/100)));
//        }
//    }
//    private static void  indexWageDep(float percent, int dep)
//    {
//        for (int i = 0; i < employee.length; i++) {
//            if (employee[i].getDepartment() == dep) {
//                employee[i].setWages(employee[i].getWages() * (1 + (percent / 100)));
//            }
//        }
//    }
//    private static int searchDepMin(int department)
//    {
//        float min = 0;int number = 0;
//        for (int i = 0; i < employee.length; i++) {
//            if (employee[i].getDepartment() == department) //    Нахождение первого сотрудника из отдела
//            {                                                // и присвоение его з/п минимальному
//                min = employee[i].getWages();
//
//                break;
//            }
//        }
//        int number1=0;
//        for (int i = 0; i < employee.length; i++) {
//            if (employee[i].getWages() <= min && employee[i].getDepartment() == department ) {
//                number = employee[i].getId();
//                 min = employee[i].getWages();
//            }
//        }
//        return number;
//    }
//    private static int searchDepMax(int department)
//    {
//        float max = 0;
//        for (int i = 0; i < employee.length; i++) {
//            if (employee[i].getDepartment() == department) //    Нахождение первого сотрудника из отдела
//            {                                                // и присвоение его з/п минимальному
//                max = employee[i].getWages();
//                break;
//            }
//        }
//        int number = 0;
//        for (int i = 0; i < employee.length; i++) {
//            if (employee[i].getWages() > max && employee[i].getDepartment() == department ) {
//                number = employee[i].getId();
//                max = employee[i].getWages();
//            }
//        }
//        return number;
//    }
//        private static float costCalcDep(int dep) {
//            float sum=0;
//            for (int i = 0; i < employee.length; i++) {
//                if (employee[i].getDepartment() == dep) {
//                    sum=sum+employee[i].getWages();
//                }
//            }
//            return sum;
//        }
//
//    private static float calcSredDep(int dep) {
//        float sred=0;
//        int quantity=0;
//        for (int i = 0; i < employee.length; i++) {
//            if (employee[i].getDepartment() == dep) {
//                quantity++;
//            }
//        }
//        sred=costCalcDep(dep)/quantity;
//        return sred;
//    }
//
//    private static void searchWorkMin(float wages) {
//        int count=0;
//        for (int i = 0; i < employee.length; i++) {
//            if (employee[i].getWages() < wages) {
//                System.out.println("id= " + employee[i].getId() + " " + employee[i].getSurName() + " " + employee[i].getName() + " " + employee[i].getPatronymic() + ". З/П= " + employee[i].getWages());
//            } else {
//               count++;
//            }
//        }
//        if (count == employee.length) {
//            System.out.println(" Сотрудников с меньшей зарплатой нет");
//        }
//    }
//    private static void searchWorkMax(float wages) {
//        int count=0;
//        for (int i = 0; i < employee.length; i++) {
//            if (employee[i].getWages() > wages) {
//                System.out.println("id= " + employee[i].getId() + " " + employee[i].getSurName() + " " + employee[i].getName() + " " + employee[i].getPatronymic() + ". З/П= " + employee[i].getWages());
//            } else {
//                count++;
//            }
//        }
//        if (count == employee.length) {
//            System.out.println(" Сотрудников с большей зарплатой нет");
//        }
//    }
        public static void main (String[]args){
           EmployeeBook employeeBook=new EmployeeBook();
            employeeBook.addEmployees("Иванов", "Иван", "Иванович", 2, 50000.45f);


            employeeBook.addEmployees("Петров", "Петр", "Петрович", 2, 60000f);
            employeeBook.addEmployees("Сидоров", "Николай", "Кузьмич", 1, 45000f);
            employeeBook.addEmployees("Криворучко ", "Семен", "Семеныч", 1, 70000f);
            employeeBook.addEmployees("Баулин", "Николай", "Васильевч", 3, 64000f);
            employeeBook.addEmployees("Пономарев", "Игорь", "Анатольевич", 4, 48000f);

            employeeBook.outtAllContacts();
            System.out.println("Сумма затрат на зарплаты в месяц= "+employeeBook.suma());
            System.out.println("Сотрудник с максимальной зарплатой: "+employeeBook.max());
//            employee[4] = new Employee("Нилов", "Иннокентий", "Петрович", 3, 30000f);
//            employee[5] = new Employee("Бобков", "Александр", "Степанович", 4, 43000f);
//            employee[7] = new Employee( "Раков", "Александр", "Юрьевич", 1, 66000f);
//            employee[8] = new Employee("Шишкин", "Андрей", "Ильич", 2, 74000f);
//
//
//        // Базовая часть
//        outputFullRecords();
//        System.out.println("__________________________________________");
//
//       System.out.println("Сумма затрат на зарплаты в месяц= "+ suma()+ " руб.");
//        System.out.println("Сотрудник с минимальное зарплатой: "+employee[min()].getSurName()+" "+employee[min()].getName()+" "+employee[min()].getPatronymic());
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
//            // 2-я задача
//
//            int numDep=3;
//            System.out.println("минимальная зарплата в отделе № "+numDep+": "+ employee[searchDepMin(numDep)].getSurName()+" "+employee[searchDepMin(numDep)].getName()+" "+employee[searchDepMin(numDep)].getPatronymic());
//            numDep=3;
//            System.out.println("максимальная зарплата в отделе № "+numDep+": "+ employee[searchDepMax(numDep)].getSurName()+" "+employee[searchDepMax(numDep)].getName()+" "+employee[searchDepMax(numDep)].getPatronymic());
//
//            System.out.println("Сумма затрат на отдел № "+numDep+" ="+costCalcDep(numDep)+ " руб");
//            System.out.println("Средняя сумма затрат на отдел № "+numDep+" ="+calcSredDep(numDep)+ " руб");
//            System.out.println("__________________________________________");
//            indexWageDep(15,1);
//            outputRecordsDep(1);
//            System.out.println("__________________________________________");
//            // 3-я задача
//
//            searchWorkMin(70000f);
//            System.out.println("__________________________________________");
//            searchWorkMax(80000f);

    }



}
