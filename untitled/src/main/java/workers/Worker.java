package workers;

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

    @Override
    public String toString() {
        return "Сотрудник - " + getName() + ", возраст - " + getAge() + " лет" + ", должность - " + getPosition() +
                ", с зарплатой - " + getSalary() +" руб." + ", телефон - " + getPhone();
    }

}
