import com.github.gerardfp.NanoClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("== WELCOME TO NANO TASKS ==\n1. Add task\n2. View tasks\n\nSelect option: ");
            switch (scanner.nextInt()) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.print("Task description: ");
                    String task = scanner.nextLine();
                    NanoClient.fetch("http://server:8001/add?" + task);
                    System.out.println("Task added.\n");
                }
                case 2 -> {
                    System.out.println("\nTask List\n---------");
                    System.out.println(NanoClient.fetch("http://server:8001/get"));
                }
            }
        }
    }
}