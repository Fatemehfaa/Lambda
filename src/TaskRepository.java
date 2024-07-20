import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

   static List<Task> tasks = new ArrayList<>(List.of(
            new Task(1L, "volvo"),
            new Task(2L, "dena"))
    );

    public static Task getTask(Long id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElseGet(() -> null);
    }


    public static void addTask(Task task) {
        tasks.add(task);
    }


}
