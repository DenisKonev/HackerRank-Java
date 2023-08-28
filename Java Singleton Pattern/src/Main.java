import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singleton singleton = Singleton.getSingleInstance(scanner.nextLine());
        scanner.close();
    }
}

class Singleton {
    private static final Singleton instance = new Singleton();
    public String str;
    private Singleton() {}
    public static Singleton getSingleInstance(String str) {
        System.out.println("Hello I am a singleton! Let me say " + str + " to you");
        return instance;
    }
}