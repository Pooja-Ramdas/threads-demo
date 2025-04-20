// This class performs Task One using Runnable

public class TaskOne implements Runnable {
    @Override
    public void run() {
        System.out.println("TaskOne started.");
        // Add operation logic here
        for (int i = 1; i <= 5; i++) {
            System.out.println("TaskOne: " + i);
        }
        System.out.println("TaskOne finished.");
    }
}
