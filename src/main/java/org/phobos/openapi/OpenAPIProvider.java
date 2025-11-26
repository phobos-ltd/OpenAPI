package org.phobos.openapi;

import java.util.Optional;

/**
 * Provides controller access
 */
public interface OpenAPIProvider {
    /**
     * @param name Module's name
     * @return OpenAPI Module access
     */
    Optional<OpenModule> getModule(String name);
}
