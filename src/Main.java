

public class Main {

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


        for (Employee value : employee)
            if (value != null) {
                System.out.println(value.getId());
            }



    }
}