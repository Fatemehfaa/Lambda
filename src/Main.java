public class Main {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        sendMessage(telegram);

        sendMessage(() -> System.out.println("whatsapp"));
        Task task1 = new Task(3L, "task 1");
        task1.setCheck1(true);
        Task task2 = new Task(4L, "task 1");
        task2.setCheck2(true);
        Task task3 = new Task(5L, "task 1");
        task3.setCheck3(true);
        TaskRepository.addTask(task1);
        TaskRepository.addTask(task2);
        TaskRepository.addTask(task3);

        checkTask(3L, Task::getCheck1);
        checkTask(4L, Task::getCheck2);
        checkTask(5L, Task::getCheck3);
        checkTask(1L, Task::getCheck3);
    }

    private static void sendMessage(Messenger messenger) {
        messenger.send();
    }


    public static void checkTask(Long taskId, Extractor<Task, Boolean> extractor) {
        System.out.println(extractor.extract(TaskRepository.getTask(taskId)));
    }


}