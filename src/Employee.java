public class Employee {
    private String surName;// фамилия
    private String name;// имя
    private String patronymic; //отчество
    private int department; // отдел
    private int wages;// заработная плата

    public static int counter=0;

    private synchronized static int nextCounter() {
        return counter++;
    }
    public final int id;

    {
        id = nextCounter();
    }

    public Employee(String surName, String name, String patronymic, int department, int wages) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.wages = wages;

    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public  int getId() {
        return id;
    }



}

