package com.pep.http;

import java.io.IOException;

public class Server implements AutoCloseable {
    private final ExchangeFactory factory;
    private final ExchangeHandler handler;

    public Server(ExchangeFactory factory, ExchangeHandler handler) {
        if (factory == null || handler == null)
            throw new IllegalArgumentException();
        this.factory = factory;
        this.handler = handler;
    }

    public void await() throws IOException {
        handler.accept(factory.create());
    }

    /* Được gọi từ main thread
    * Khi có một request kết nối đến thì factory sẽ sản xuất ra một Exchange có InputStream, OutputStream
    * Exchange này sẽ được đẩy vào handler.accept, accept này chính là com.pep.http.HttpExchangeHandler */
    public void listen() throws IOException {
        while (!isClosed())
            handler.accept(factory.create());
    }

    public boolean isClosed() throws IOException {
        return factory.isClosed();
    }

    @Override
    public void close() throws Exception {
        factory.close();
    }
}
