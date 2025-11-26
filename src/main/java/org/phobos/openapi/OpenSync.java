package org.phobos.openapi;

import java.util.ArrayList;
import java.util.List;

public class OpenSync {
    private static final OpenSync instance = new OpenSync();

    private final List<Runnable> callbacks = new ArrayList<>();

    public static OpenSync synchronizer() {
        return instance;
    }

    /**
     * Adds a callback after Phobos fully initializes
     */
    public void synchronize(Runnable callback) {
        callbacks.add(callback);
    }

    /**
     * For internal use only. Please do not call this method
     */
    public void poll() {
        for (Runnable callback : callbacks) {
            callback.run();
        }
    }
}
