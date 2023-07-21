import workers.Worker;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Worker worker_1 = new Worker("Игорь", "Вахтер", 123, 25000,29);
        Worker worker_2 = new Worker("Сергей", "Охранник", 234, 45000,35);
        Worker worker_3 = new Worker("Анна", "Секретарь", 345, 65000,46);
        Worker worker_4 = new Worker("Татьяна", "Бухгалтер", 456, 95000,50);
        Worker worker_5 = new Worker("Иван", "Водитель", 567, 55000,31);
        ArrayList <Worker> workers= new ArrayList<>();
        workers.add(worker_1);
        workers.add(worker_2);
        workers.add(worker_3);
        workers.add(worker_4);
        workers.add(worker_5);
//        for (Worker worker: workers) {
//            System.out.println(worker.toString());
//        }
//        worker_2.salaryup(30, 10000);
//        System.out.println(worker_2.toString());
//        Worker.upsalaryall(workers);
        Worker.averageage(workers);
        Worker.averagealary(workers);
    }
}
