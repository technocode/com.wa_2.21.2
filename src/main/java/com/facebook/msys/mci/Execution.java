package com.facebook.msys.mci;

import X.AbstractRunnableC20910xi;
import X.AnonymousClass008;
import X.AnonymousClass0MT;

public class Execution {
    public static volatile boolean sInitialized;
    public static final ThreadLocal sThreadLocalExecutionContext = new AnonymousClass0MT();

    public static native int nativeGetExecutionContext();

    public static native void nativeInitialize();

    public static native void nativeInitializeExecutors(int[] iArr);

    public static native boolean nativeScheduleTask(Runnable runnable, int i, int i2, double d, String str);

    public static native void nativeStartExecutor(int i);

    public static void assertInitialized() {
        if (!sInitialized) {
            throw new RuntimeException("This class has to be initialized before it can be used");
        }
    }

    public static void ensureNotOnMsysThread() {
        if (sInitialized && ((Number) sThreadLocalExecutionContext.get()).intValue() != 0) {
            throw new IllegalStateException("The task cannot run on any MSYS thread");
        }
    }

    public static void executeAsync(AbstractRunnableC20910xi r7, int i) {
        assertInitialized();
        if (r7 != null) {
            assertInitialized();
            if (!nativeScheduleTask(r7, i, 0, ((double) 0) / 1000.0d, r7.toString())) {
                throw new RuntimeException(AnonymousClass008.A0F("UNKNOWN execution context ", i));
            }
            return;
        }
        throw null;
    }
}
