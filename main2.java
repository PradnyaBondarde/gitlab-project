switch(choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter start date (yyyy-mm-dd): ");
                    LocalDate startDate = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter end date (yyyy-mm-dd): ");
                    LocalDate endDate = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter progress: ");
                    String progress = scanner.nextLine();
                    taskManager.addTask(new Task(name, startDate, endDate, progress));
                    break;
                case 2:
                    System.out.print("Enter task index: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter new task name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new start date (yyyy-mm-dd): ");
                    startDate = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter new end date (yyyy-mm-dd): ");
                    endDate = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter new progress: ");
                    progress = scanner.nextLine();
                    taskManager.editTask(index, new Task(name, startDate, endDate, progress));
                    break;
                case 3:
                    System.out.print("Enter task index: ");
                    index = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    taskManager.deleteTask(index);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    taskManager.sortTasksByProgress();
                    System.out.println("Tasks sorted by progress");
                    break;
                case 6:
                    System.exit(0);
            }
