//Предположим у нас есть класс Task{int num, String title, String priority}.
// Поле priority может принимать следующие значения: “high”  “low”  “the boss said urgently”.
// Вам необходимо объединить задачи в очередь, так и написать метод getTask,
// чтобы  программист забирал задачи в порядке очереди но, в первую очередь,
// задачи  “the boss said urgently”, потом “high”, потом “low”.
// При этом важно, если есть несколько задач  например, “boss said urgently” они решаются в порядке очереди.
//Подсказка: посмотрите код примера PriorityQueue написанный в классе
public class Task implements Comparable<Task>{
     private int num;
     private String title;
     private String priority;

    public Task(int num, String title, String priority)  {
        this.num = num;
        this.title = title;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return num + ". " + title + " priority: " + priority ;
    }


    @Override
    public int compareTo(Task o) {
        if (priority.equals(o.priority)){
            return num-o.num;
        }
        if(priority.contains("Urgent!")){
            return -1;
        }
        if (priority.contains("Low")){
            return 1;
        }
        if(priority.contains("High") & o.priority.contains("Urgent!")){
            return 1;
        } else{
            return -1;
        }

        //return 0;
    }
}
