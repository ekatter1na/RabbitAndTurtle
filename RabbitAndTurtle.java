

class AnimalThread extends Thread {

    AnimalThread(String name,int priority) {
        this.name = name;
        this.priority = priority;
    }
    int priority;
    String name;
    public void run() {
        Thread theard = new Thread();
        for(int i = 0; i<=1000;i+=100){
            System.out.println(name + " пробежал(а): " + i + " метров");
            if(i == 500) {
                priority = NORM_PRIORITY;
                theard.setPriority(priority);
            }
        }
    }
}
public class RabbitAndTurtle{
    public static void main(String args[]){
        AnimalThread rabbit = new AnimalThread("Кролик",Thread.MIN_PRIORITY);
        rabbit.start();
        AnimalThread turtle = new AnimalThread("Черепаха",Thread.MAX_PRIORITY);
        turtle.start();
    }
}
