import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    // 放入隊尾
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // 從隊首取出元素
    public T dequeue() {
        if (queue.isEmpty()) {
            return null; // 或者丟 Exception，視需求決定
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        System.out.println(intQueue.dequeue()); // 1
        System.out.println(intQueue.size());    // 1
    }
}


//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------