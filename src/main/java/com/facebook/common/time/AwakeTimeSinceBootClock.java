package com.facebook.common.time;

import X.AbstractC20100w7;
import android.os.SystemClock;

public class AwakeTimeSinceBootClock implements AbstractC20100w7 {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // X.AbstractC20100w7
    public long now() {
        return SystemClock.uptimeMillis();
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
