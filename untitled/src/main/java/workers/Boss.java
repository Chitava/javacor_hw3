package workers;

import java.util.ArrayList;

public class Boss extends Worker {
    public Boss(String name, String position, int phone, float salary, int age) {
        super(name, position, phone, salary, age);
    }
    public static void upsalaryall (ArrayList<Worker> workers){
        for (Worker worker: workers) {
            if (worker.getAge() > 45 && worker.getClass() == Worker.class){
                worker.setSalary(worker.getSalary() + 5000);
                System.out.println(worker.getPosition()+ " " + worker.getName() + " получил прибавку, теперь у него зарплата" +
                        " - " + worker.getSalary());
            }else if (worker.getClass().equals(Boss.class)){
                System.out.printf(worker.getPosition()+ " " + worker.getName() + " руководителям не повышаем зарплату.\n");
            }else {
                System.out.printf(worker.getPosition()+ " " + worker.getName() + " не достиг возраста повышения зарпалаты.\n");
            }
        }
    }
}
