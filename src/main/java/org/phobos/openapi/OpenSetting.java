package org.phobos.openapi;

import com.google.gson.JsonElement;
import org.jetbrains.annotations.Nullable;

/**
 * Setting layout
 */
public interface OpenSetting<T> {
    /**
     * @return Setting's value
     */
    T getValue();

    /**
     * @return Setting's default value
     */
    T getDefaultValue();

    /**
     * Sets the setting value
     */
    void setValue(T value);

    /**
     * Resets the setting to its default value
     */
    void reset();

    /**
     * @return Setting's description
     */
    @Nullable String getDescription();

    /**
     * Serializes the setting into json
     */
    JsonElement serialize();
}
