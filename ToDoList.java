import java.util.ArrayList;
import java.util.Scanner;

/* 参考記事　https://qiita.com/EasyCoder/items/311a70719a3ae0b14ca7 */
public class ToDoList {
    ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task){
        tasks.add(task);
    }

    public void removeTask(int index){
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index - 1);            
        } else {
            System.out.println("無効なインデックスです。");
        }
    }

    public void displayTasks(){
        System.out.println("ToDoリスト：");

        for( int i = 0; i < tasks.size(); i++ ){
            System.out.println(i+1 + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args){
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in, "UTF-8");

        while(true){
            System.out.println("");
            System.out.println("■操作を選択してください。");
            System.out.println("");
            System.out.println("１．タスクを追加");
            System.out.println("２．タスクを削除");
            System.out.println("３．タスクを表示");
            System.out.println("４．終了");
            System.out.println("");

            int userChoice = scanner.nextInt();
            scanner.nextLine();                        //改行が残っていた場合に捨てるため。 

            switch (userChoice) {
                case 1:
                    System.out.println("");
                    System.out.println("■ 新しいタスクを入力してください。");
                    System.out.println("");
                    String newTask = scanner.nextLine();
                    toDoList.addTask(newTask);
                    break;
                
                case 2:
                    System.out.println("");
                    System.out.println("■ 削除するタスクのインデックスを入力してください。");
                    System.out.println("");
                    int rmIndex = scanner.nextInt();
                    toDoList.removeTask(rmIndex);
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("■ タスクを一覧表示します。");
                    System.out.println("");
                    toDoList.displayTasks();
                    break;
                
                case 4:
                    System.out.println("アプリケーションを終了します。");
                    scanner.close();
                    System.exit(0);
                    break;
            
                default:
                    System.out.println("");
                    System.out.println("無効な選択です。もう一度入力してください。");
                    System.out.println("");
            }
        }
    }
}

