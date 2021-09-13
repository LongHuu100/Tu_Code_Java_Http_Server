package com.pep.http;

import java.io.IOException;

/**
 * HttpHandler
 */
public interface HttpHandler {
    public void accept(HttpReader reader, HttpWriter writer) throws IOException;
}
