package org.phobos.openapi;

import org.jetbrains.annotations.Nullable;

import java.util.Optional;

/**
 * Module layout
 */
public interface OpenModule {
    /**
     * Enables the module
     */
    void enable();

    /**
     * Disables the module
     */
    void disable();

    /**
     * @return True if the module is enabled
     */
    boolean isEnabled();

    /**
     * Toggles the module state
     */
    void toggle();

    /**
     * @return Module's display info
     */
    @Nullable String getDisplayInfo();

    /**
     * @return Module's drawn name
     */
    @Nullable String getDisplayName();

    /**
     * @param name Setting name
     * @param type Setting value type, e.g (Boolean, Enum, String, Integer)
     *
     * @return OpenAPI Setting access
     * @param <T> Setting typename
     */
    <T> Optional<OpenSetting<T>> getSetting(String name, Class<T> type);
}
