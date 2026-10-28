package zm.zut;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            // Allows the UI team to put HTML/CSS in src/main/resources/public
            config.staticFiles.add("/public"); 
        });

        // A simple test endpoint for the logic team to verify the server
        app.get("/api/status", ctx -> {
            ctx.json("{\"status\": \"Chilimba Tracker API is Live!\"}");
        });

        // Dynamic port for Render cloud deployment, defaults to 7070 locally
        int port = System.getenv("PORT") != null ? Integer.parseInt(System.getenv("PORT")) : 7070;
        app.start(port);
    }
}