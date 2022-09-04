import java.util.Arrays;
import java.util.Comparator;

public class EmployeeBook {
    private final Employee [] employee;
    private  int size;



    public EmployeeBook() {
        this.employee =new Employee[10];//новый массив с предельным колчеством записей 10


    }
    public  void addEmployees(String surName, String name, String patronymic, int department, float wages) {
        if (size >= employee.length) {
            System.out.println("Журнал записей полон");
        }
        Employee newEmployees = new Employee(surName, name, patronymic, department, wages);
        employee[size++] = newEmployees;//новая запись в массив и увеличение номера элемента

    }
    public void outtAllRecords() {
        for (int i = 0; i < size; i++) {
            if (this.employee[i] != null) {
                Employee employee =this.employee[i];
                System.out.println("ID:"+ employee.getId() + ",  " + employee.getSurName()+" "+employee.getName()+" "+employee.getPatronymic()+". Отдел:"+ employee.getDepartment()+". З/П="+employee.getWages()+" руб.");
            }
      }
    }

    public void removeEmployee(String surName) //Удаление сотрудника по фамилии
    {
        for (int i = 0; i < size; i++) {
            if (employee[i].getSurName().equals(surName)) {
                employee[i] = null;
                if (i != size - 1) {
                    System.arraycopy(employee, i + 1, employee, i, size - i);
                }
                size--;


                System.out.println("Сотрудник " + surName + " удален");
            }

        }
           }

    // перенесенные методы из прошлых уровней
    public   float suma() {
        float s = 0;
        for (int i = 0; i <size; i++) {
            if (this.employee[i] != null) {
                s += employee[i].getWages();
            }

        }
        return s;
    }

    public  String max() {
        float maxWages = employee[0].getWages();
        int number = 0;
        for (int i = 1; i < size; i++) {
            if (this.employee[i] != null) {
                if (employee[i].getWages() > maxWages) {
                    maxWages = employee[i].getWages();
                    number = i;
                }
            }

        }
        return employee[number].getSurName() + " " + employee[number].getName() + " " + employee[number].getPatronymic();
    }
        public String min() {
        float minWages = employee[0].getWages();
        int number = 0;
        for (int i = 1; i < size; i++) {
            if (this.employee[i] != null) {
                if (employee[i].getWages() < minWages) {
                    minWages = employee[i].getWages();
                    number = i;
                }
            }

        }
        return employee[number].getSurName() + " " + employee[number].getName() + " " + employee[number].getPatronymic();

    }
        public float averageSalary() // средняя заработная плата
        {
            float k = size;
            return suma() / k;
        }
    public void   indexationWage(float percent)
    {
        for (int i = 0; i < size; i++) {
            if (this.employee[i] != null) {
                employee[i].setWages(employee[i].getWages()*(1+(percent/100)));
            }


        }
    }
    public void searchDepMin(int department)
    {
        float min = 0;int number = 0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department && employee[i]!=null) //    Нахождение первого сотрудника из отдела
            {                                                // и присвоение его з/п минимальному
                min = employee[i].getWages();

                break;
            }
        }
        int number1=0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getWages() <= min && employee[i].getDepartment() == department && employee[i]!=null ) {
                number = employee[i].getId();
                min = employee[i].getWages();
            }
        }
        System.out.println("Минимальная зарплата по отделу № "+ department+ " у сотрудника: "+ employee[number].getSurName()+ " "+employee[number].getName()+ " "+ employee[number].getPatronymic());
    }
    public void searchDepMax(int department)
    {
        float max = 0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == department && employee[i]!=null) //    Нахождение первого сотрудника из отдела
            {                                                // и присвоение его з/п минимальному
                max = employee[i].getWages();
                break;
            }
        }
        int number = 0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getWages() > max && employee[i].getDepartment() == department && employee[i]!=null ) {
                number = employee[i].getId();
                max = employee[i].getWages();
            }
        }
        System.out.println("Максимальная зарплата по отделу № "+ department+ " у сотрудника: "+ employee[number].getSurName()+ " "+employee[number].getName()+ " "+ employee[number].getPatronymic());

    }
    public void  indexWageDep(float percent, int dep)//индексация зарплат в отделе
    {
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == dep) {
                if (employee[i]!=null) {
                    employee[i].setWages(employee[i].getWages() * (1 + (percent / 100)));
                }


            }
        }
    }
    public void   outputRecordsDep(int dep) //Вывод  информации по записям отдела
    {

        for (int i = 0; i <size; i++) {
            if (employee[i].getDepartment() == dep && employee[i]!=null) {
                   System.out.println(employee[i].getSurName()+ " "+employee[i].getName()+" "+ employee[i].getPatronymic()+" З/п ="+employee[i].getWages());
            }
        }
    }
        public float costCalcDep(int dep) {
            float sum=0;
            for (int i = 0; i < size; i++) {
                if (employee[i].getDepartment() == dep && employee[i]!=null) {
                    sum=sum+employee[i].getWages();
                }
            }
            return sum;
        }
    public float calcSredDep(int dep) {
        float sred=0;
        int quantity=0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getDepartment() == dep && employee[i]!=null ) {
                quantity++;
            }
        }
        sred=costCalcDep(dep)/quantity;
        return sred;
    }

    public void  outputFio()//Вывод только фио работников
    {
        for (int i = 0; i < size; i++) {
            if (employee[i]!=null) {
                System.out.println(employee[i].getSurName()+" "+employee[i].getName()+" "+employee[i].getPatronymic());
            }

        }
    }

    public void searchWorkMin(float wages) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getWages() < wages && employee[i]!=null  ) {
                System.out.println("id= " + employee[i].getId() + " " + employee[i].getSurName() + " " + employee[i].getName() + " " + employee[i].getPatronymic() + ". З/П= " + employee[i].getWages());
            } else {
               count++;
            }
        }
        if (count == size) {
            System.out.println(" Сотрудников с меньшей зарплатой нет");
        }
    }



    public void searchWorkMax(float wages) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if (employee[i].getWages() > wages && employee[i]!=null ) {
                System.out.println("id= " + employee[i].getId() + " " + employee[i].getSurName() + " " + employee[i].getName() + " " + employee[i].getPatronymic() + ". З/П= " + employee[i].getWages());
            } else {
                count++;
            }
        }
        if (count == size) {
            System.out.println(" Сотрудников с большей зарплатой нет");
        }
    }


    public void modernWages(String surName, String name, String patronymic, float wages) {
            int count=0;
        for (int i = 0; i < size; i++) {
            if (employee[i]!=null&&employee[i].getSurName().equals(surName) && employee[i].getName().equals(name) && employee[i].getPatronymic().equals(patronymic)) {
                employee[i].setWages(wages);
                count++;
                System.out.println("зарплата у сотрудника "+surName+" "+name+" "+ patronymic+ " изменена");
                System.out.println(employee[i].getSurName()+" "+employee[i].getName()+" "+employee[i].getPatronymic()+": "+employee[i].getWages()+ " руб.");

            }
        }
        if (count == 0) {
            System.out.println("Данный сотрудник не найден");
        }

    }

    public void modernDepartmens(String surName, String name, String patronymic, int departmens) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if (employee[i]!=null&&employee[i].getSurName().equals(surName) && employee[i].getName().equals(name) && employee[i].getPatronymic().equals(patronymic)) {
                employee[i].setDepartment(departmens);
                count++;
                System.out.println("Отдел у сотрудника "+surName+" "+name+" "+ patronymic+ " изменен");
                System.out.println(employee[i].getSurName()+" "+employee[i].getName()+" "+employee[i].getPatronymic()+": "+employee[i].getDepartment()+ " отдел");

            }
        }
        if (count == 0) {
            System.out.println("Данный сотрудник не найден");
        }

    }

}
