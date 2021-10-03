package com.pep.http.util;

import com.pep.http.HttpHandler;
import com.pep.http.HttpServer;

public class Status {

    private Status() {}

    public static HttpHandler ok(String data) {
        return Status.code(ResponseCode.OK, data);
    }

    public static HttpHandler badRequest() {
        return Status.code(ResponseCode.BAD_REQUEST, null);
    }

    public static HttpHandler internalServerError() {
        return Status.code(ResponseCode.INTERNAL_SERVER_ERROR, null);
    }

    public static HttpHandler notFound() {
        return Status.code(ResponseCode.NOT_FOUND, null);
    }

    /* Trả về một lambda, lambda này sẽ chưa chạy cho đến khi gọi hàm accept của HttpHandler,
     lambda này gọi accept trong com.pep.http.routes.Router -> accept*/
    public static HttpHandler code(ResponseCode code, String data) {
        return (reader, writer) -> {
            writer.writeResponseHeader(HttpServer.VERSION, code);
            writer.endHeader();
            writer.flush();
            if(data != null) {
                writer.write(data);
            }
            writer.close();
        };
    }
}
