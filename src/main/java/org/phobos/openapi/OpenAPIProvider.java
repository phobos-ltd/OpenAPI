package org.phobos.openapi;

import java.util.Optional;

public interface OpenAPIProvider {
    Optional<OpenModule> getModule(String name);
}
