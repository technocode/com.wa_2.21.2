package com.facebook.common.time;

import X.AbstractC20100w7;
import android.os.SystemClock;

public class RealtimeSinceBootClock implements AbstractC20100w7 {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    @Override // X.AbstractC20100w7
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
