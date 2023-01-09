import com.github.gerardfp.NanoServer;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        NanoServer
                .create("0.0.0.0",8001)
                .endpoint("/get", (query, res) -> {
                    res.send(Files.readString(Paths.get("/var/lib/nanotasks/todos.db")));
                })
                .endpoint("/add", (query, res) -> {
                    Files.writeString(Paths.get("/var/lib/nanotasks/todos.db"), query + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                    res.send("ok");
                })
                .start();
        System.out.println("Server started at 8001");
    }
}