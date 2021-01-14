package com.facebook.msys.mci;

public class ExecutionIdle {
    public static volatile boolean sInitialized;

    public static native void nativeInitialize();

    public static native void nativeMaybeDelayIdleQueueAdvanceCallback();

    public static native void nativeStartIdleExecutor();
}
