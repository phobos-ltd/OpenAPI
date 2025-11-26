package org.phobos.openapi;

import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public interface OpenModule {
    void enable();

    void disable();

    boolean isEnabled();

    void toggle();

    @Nullable String getDisplayInfo();

    @Nullable String getDisplayName();

    <T> Optional<OpenSetting<T>> getSetting(String name, Class<T> type);
}
