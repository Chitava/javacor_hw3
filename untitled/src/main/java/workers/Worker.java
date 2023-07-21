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

    public static void upsalaryall (ArrayList<Worker> workers){
        for (Worker worker: workers) {
            if (worker.getAge() > 45){
                worker.setSalary(worker.getSalary() + 5000);
                System.out.println(worker.getPosition()+ " " + worker.getName() + " получил прибавку, теперь у него зарплата" +
                        " - " + worker.getSalary());
            }else {
                System.out.printf(worker.getPosition()+ " " + worker.getName() + " не достиг возраста повышения зарпалаты.\n");
            }
        }
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
