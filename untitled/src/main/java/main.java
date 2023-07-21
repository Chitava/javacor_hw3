import workers.Worker;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Worker worker_1 = new Worker("Игорь", "вахтер", 123, 25000,29);
        Worker worker_2 = new Worker("Сергей", "охранник", 234, 45000,35);
        Worker worker_3 = new Worker("Анна", "секретарь", 345, 65000,25);
        Worker worker_4 = new Worker("Татьяна", "бухгалтер", 456, 95000,39);
        Worker worker_5 = new Worker("Иван", "водитель", 567, 55000,31);
        ArrayList <Worker> workers= new ArrayList<>();
        workers.add(worker_1);
        workers.add(worker_2);
        workers.add(worker_3);
        workers.add(worker_4);
        workers.add(worker_5);
        for (Worker worker: workers) {
            System.out.println(worker.toString());
        }

    }
}
