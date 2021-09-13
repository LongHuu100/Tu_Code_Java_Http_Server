package com.pep.http;

import java.io.IOException;

/**
 * ExchangeFactory
 */
public interface ExchangeFactory extends AutoCloseable {
    public Exchange create() throws IOException;
    public boolean isClosed() throws IOException;
}
