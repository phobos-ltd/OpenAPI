package org.phobos.openapi;

import com.google.gson.JsonElement;
import org.jetbrains.annotations.Nullable;

public interface OpenSetting<T> {
    T getValue();

    T getDefaultValue();

    void setValue(T value);

    void reset();

    @Nullable String getDescription();

    JsonElement serialize();
}
