package workers;

import java.util.ArrayList;

public class Worker {
    public String name;
    public String position;
    public int phone;
    public float salary;
    public int age;

    public Worker(String name, String position, int phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getPhone() {
        return phone;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public static void averageage (ArrayList<Worker> workers){
        int averAge = 0;
        int count = 0;
        int age = 0;
        for (Worker worker: workers) {
            count++;
            age = age + worker.getAge();
        }
        averAge = age / count;
        System.out.printf("Средний возраст сотрудников в компании - " + averAge + "\n");

    }

    public static void averagealary (ArrayList<Worker> workers){
        float averSalary = 0;
        int count = 0;
        float allSalary = 0;
        for (Worker worker: workers) {
            count++;
            allSalary = allSalary + worker.getSalary();
        }
        averSalary = allSalary / count;
        System.out.printf("Средняя зарплата в компании - " + averSalary + "\n");

    }

    public void salaryup(int age, float salary){
        if (this.getAge() > age){
            setSalary(this.salary + salary);
            System.out.println("Сотрудник - " + getName() + " получил прибавку - " + salary + ", теперь у него зарплата" +
                    " - " + this.getSalary() + "\n");
        }else {
            System.out.printf("Сотрудник - " + getName() + " не достиг возраста повышения зарпалаты.\n");
        }

    }






    @Override
    public String toString() {
        return "Сотрудник - " + getName() + ", возраст - " + getAge() + " лет" + ", должность - " + getPosition() +
                ", с зарплатой - " + getSalary() +" руб." + ", телефон - " + getPhone();
    }


}
