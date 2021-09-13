package com.pep.http;

import java.io.IOException;

/**
 * ExchangeHandler
 */
public interface ExchangeHandler {
    public void accept(Exchange exchange) throws IOException;
}
