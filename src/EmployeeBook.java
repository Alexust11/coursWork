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
    public void outtAllContacts() {
        for (int i = 0; i < size; i++) {
           Employee employee =this.employee[i];
            System.out.println("ID:"+ employee.getId() + ",  " + employee.getSurName()+" "+employee.getName()+" "+employee.getPatronymic()+". Отдел:"+ employee.getDepartment()+". З/П="+employee.getWages()+" руб.");
        }
    }
    public   float suma() {
        float s = 0;
        for (int i = 0; i <size; i++) {
            s += employee[i].getWages();
        }
        return s;
    }

    public  String max() {
        float maxWages = employee[0].getWages();
        int number = 0;
        for (int i = 1; i < size; i++) {
            if (employee[i].getWages() > maxWages) {
                maxWages = employee[i].getWages();
                number = i;
            }
        }
        return employee[number].getSurName() + " " + employee[number].getName() + " " + employee[number].getPatronymic();
    }
}
