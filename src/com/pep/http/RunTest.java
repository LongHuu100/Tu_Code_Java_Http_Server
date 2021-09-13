package com.pep.http;

import com.pep.http.routes.Controller;
import com.pep.http.routes.Get;
import com.pep.http.util.Status;
import java.io.IOException;

public class RunTest {
    public static void main(String ...arg) throws IOException {
        HttpServer server = HttpServer.bind(8080);
        server.accept(new Controller() {
            @Get("/")
            public HttpHandler index() {
                return Status.ok("hello world .!");
            }
        });
        server.listen();
    }
}
