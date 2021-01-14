package com.facebook.profilo.provider.stacktrace;

import X.AnonymousClass10A;
import X.AnonymousClass10B;
import X.AnonymousClass10P;
import X.C33401gg;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.Logger;

public final class StackFrameThread extends AnonymousClass10A {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public AnonymousClass10P mSavedTraceContext;
    public int mSystemClockTimeIntervalMs = -1;

    public static native int nativeSystemClockTickIntervalMs();

    static {
        AnonymousClass10B r1 = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = r1.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = r1.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = r1.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.mContext = applicationContext;
        } else {
            this.mContext = context;
        }
    }

    @Override // X.AnonymousClass10A
    public void disable() {
        if (!this.mEnabled) {
            this.mProfilerThread = null;
            return;
        }
        this.mSavedTraceContext = null;
        this.mEnabled = false;
        synchronized (CPUProfiler.class) {
            if (CPUProfiler.sInitialized) {
                CPUProfiler.nativeStopProfiling();
            }
        }
        Thread thread = this.mProfilerThread;
        if (thread != null) {
            try {
                thread.join();
                this.mProfilerThread = null;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeStartProfiling(r1, r6, r8, r9, r7) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a3, code lost:
        r17.mSavedTraceContext = r2;
        r0 = new java.lang.Thread(new java.lang.RunnableEBaseShape0S0000000_I1(r17, 1), "Prflo:Profiler");
        r17.mProfilerThread = r0;
        r0.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    @Override // X.AnonymousClass10A
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void enable() {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }

    @Override // X.AnonymousClass10A
    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if ((r2 & r1) != 0) goto L_0x0017;
     */
    @Override // X.AnonymousClass10A
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTracingProviders() {
        /*
            r4 = this;
            X.10P r1 = r4.mSavedTraceContext
            boolean r0 = r4.mEnabled
            r3 = 0
            if (r0 == 0) goto L_0x001d
            if (r1 == 0) goto L_0x001d
            int r2 = r1.A02
            int r1 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r2 & r1
            if (r0 != 0) goto L_0x0017
            int r1 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_STACK_FRAME
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r3 = r3 | r1
        L_0x0018:
            int r0 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_NATIVE_STACK_TRACE
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    public static void logAnnotation(String str, String str2) {
        int writeStandardEntry = Logger.writeStandardEntry(PROVIDER_STACK_FRAME, 7, 52, 0, 0, 0, 0, 0);
        int i = PROVIDER_STACK_FRAME;
        Logger.writeBytesEntry(i, 1, 57, Logger.writeBytesEntry(i, 1, 56, writeStandardEntry, str), str2);
    }

    @Override // X.AnonymousClass10A
    public void onTraceEnded(AnonymousClass10P r4, C33401gg r5) {
        int i;
        if ((r4.A02 & PROVIDER_STACK_FRAME) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int providersToTracers = providersToTracers(r4.A02);
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(providersToTracers & i));
        }
    }

    @Override // X.AnonymousClass10A
    public void onTraceStarted(AnonymousClass10P r2, C33401gg r3) {
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
    }

    public static int providersToTracers(int i) {
        int i2 = 0;
        if (((PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE) & i) != 0) {
            i2 = 16369;
        }
        return (i & PROVIDER_NATIVE_STACK_TRACE) != 0 ? i2 | 4 : i2;
    }
}
