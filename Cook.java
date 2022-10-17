package 继承练习;

public class Cook extends Manager {
    public Cook() {
    }

    public Cook(String id, String name, double salary, double bouns) {
        super(id, name, salary, bouns);
    }

    @Override
    public void work() {
        System.out.println("正在炒菜");
    }
}
