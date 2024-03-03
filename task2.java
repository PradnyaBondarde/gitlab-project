class TaskManager {
    List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void editTask(int index, Task newTask) {
        if(index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void deleteTask(int index) {
        if(index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for(int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    public void sortTasksByProgress() {
        tasks.sort(Comparator.comparing(task -> task.progress));
    }
}
