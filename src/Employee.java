public class Employee {


    private String surName;// фамилия
    private  String name;// имя
    private  String patronymic; //отчество
    private int department; // отдел
    private float wages;// заработная плата



    private static int counter=0;


    private   int id;


    public Employee( String surName, String name, String patronymic, int department, float wages) {

        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.wages = wages;
        id=counter++;

    }

    public String getSurName() {
        return surName;
    }



    public String getName() {
        return name;
    }



    public String getPatronymic() {
        return patronymic;
    }



    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public float getWages() {
        return wages;
    }

    public void setWages(float wages) {
        this.wages = wages;
    }

    public  int getId() {
        return id;
    }

    public String toString() {
        return "Запись № "+ this.getId() + " :" + this.getSurName() + " " + this.getName() + " " + this.getPatronymic() + ". Отдел № " + this.getDepartment() + ".   З/П-" + this.getWages()+" руб.";

    }


}

