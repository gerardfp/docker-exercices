import com.github.gerardfp.NanoServer;

public class Main {
    public static void main(String[] args) {
        NanoServer
                .create("0.0.0.0",80)
                .endpoint("/", (query, res) -> {
                    if (query.equals("password="+System.getenv("PASSWORD"))) {
                         res.send("WELCOME");
                    } else {
                         res.send("Access denied");
                    }
                })
                .start();
        System.out.println("Server started at 8001");
    }
}
