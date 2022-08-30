public class Employee {
    private String surName;// фамилия
    private String name;// имя
    private String patronymic; //отчество
    private int department; // отдел
    private int wages;// заработная плата
    private int id;


    public Employee(String surName, String name, String patronymic, int department, int wages, int id ) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.wages = wages;
        this.id=id++;
    }
}
