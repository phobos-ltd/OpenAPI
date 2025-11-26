package org.phobos.openapi;

public interface OpenAPI {
    static OpenAPIProvider getProvider() {
        throw new IllegalStateException("OpenAPI is not initialized");
    }
}