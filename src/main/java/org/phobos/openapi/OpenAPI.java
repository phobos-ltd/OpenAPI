package org.phobos.openapi;

/**
 * Main interface for global access
 */
public interface OpenAPI {
    /**
     * Throws an OpenAPIException if there is no implementation for OpenAPI
     * <p>
     * Returns OpenAPI Provider, will throw an exception if it is accessed before phobos is initialized.
     * @see OpenSync#synchronize for safe access
     */
    static OpenAPIProvider getProvider() throws OpenAPIException {
        throw new OpenAPIException("Unable to locate OpenAPI implementation");
    }
}