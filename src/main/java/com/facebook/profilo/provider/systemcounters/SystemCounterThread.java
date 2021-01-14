package com.facebook.profilo.provider.systemcounters;

import X.AnonymousClass10A;
import X.AnonymousClass10B;
import X.AnonymousClass10P;
import X.C221810h;
import X.HandlerC221910i;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.soloader.SoLoader;

public final class SystemCounterThread extends AnonymousClass10A {
    public static final int PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    public static final int PROVIDER_SYSTEM_COUNTERS;
    public boolean mAllThreadsMode;
    public boolean mEnabled;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public volatile boolean mHighFrequencyMode;
    public HybridData mHybridData;
    public C221810h mSystemCounterLogger = new C221810h();

    public static native HybridData initHybrid();

    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    public native void logCounters();

    public native void logHighFrequencyThreadCounters();

    public native void logTraceAnnotations();

    public native void nativeSetHighFrequencyMode(boolean z);

    public class WhitelistApi {
        static {
            SoLoader.A03("profilo_systemcounters");
        }

        public static void add(int i) {
            SystemCounterThread.nativeAddToWhitelist(i);
        }

        public static void remove(int i) {
            SystemCounterThread.nativeRemoveFromWhitelist(i);
        }
    }

    static {
        AnonymousClass10B r1 = ProvidersRegistry.A00;
        PROVIDER_SYSTEM_COUNTERS = r1.A02("system_counters");
        PROVIDER_HIGH_FREQ_THREAD_COUNTERS = r1.A02("high_freq_main_thread_counters");
    }

    public SystemCounterThread() {
        super("profilo_systemcounters");
    }

    @Override // X.AnonymousClass10A
    public synchronized void disable() {
        if (this.mEnabled) {
            this.mSystemCounterLogger.A02();
            if (this.mAllThreadsMode) {
                logCounters();
            }
            if (this.mHighFrequencyMode) {
                logHighFrequencyThreadCounters();
                logTraceAnnotations();
            }
        }
        this.mEnabled = false;
        this.mAllThreadsMode = false;
        this.mHighFrequencyMode = false;
        nativeSetHighFrequencyMode(false);
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
            this.mHybridData = null;
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mHandler = null;
        Debug.stopAllocCounting();
    }

    @Override // X.AnonymousClass10A
    public synchronized void enable() {
        this.mHybridData = initHybrid();
        this.mEnabled = true;
        if (this.mHandler == null) {
            HandlerThread handlerThread = new HandlerThread("Prflo:Counters");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new HandlerC221910i(this, this.mHandlerThread.getLooper());
        }
        AnonymousClass10P r4 = this.A01;
        boolean z = false;
        if ((PROVIDER_SYSTEM_COUNTERS & TraceEvents.sProviders) != 0) {
            z = true;
        }
        if (z) {
            this.mHighFrequencyMode = false;
            nativeSetHighFrequencyMode(false);
            this.mAllThreadsMode = true;
            Debug.startAllocCounting();
            C221810h r2 = this.mSystemCounterLogger;
            r2.A00 = 0;
            r2.A01 = 0;
            r2.A04 = 0;
            r2.A05 = 0;
            r2.A02 = 0;
            r2.A03 = 0;
            r2.A06 = 0;
            r2.A07 = 0;
            r2.A08 = 0;
            r2.A09 = 0;
            int i = 50;
            if (r4 != null) {
                i = r4.A07.A00("provider.system_counters.sampling_rate_ms", 50);
            }
            this.mHandler.obtainMessage(1, i, 0).sendToTarget();
        }
        if ((PROVIDER_HIGH_FREQ_THREAD_COUNTERS & TraceEvents.sProviders) != 0) {
            nativeAddToWhitelist(Process.myPid());
            this.mHighFrequencyMode = true;
            nativeSetHighFrequencyMode(true);
            int i2 = 7;
            if (r4 != null) {
                i2 = r4.A07.A00("provider.high_freq_main_thread_counters.sampling_rate_ms", 7);
            }
            this.mHandler.obtainMessage(2, i2, 0).sendToTarget();
        }
    }

    @Override // X.AnonymousClass10A
    public int getSupportedProviders() {
        return PROVIDER_SYSTEM_COUNTERS | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    }

    @Override // X.AnonymousClass10A
    public int getTracingProviders() {
        int i = 0;
        if (!this.mEnabled) {
            return 0;
        }
        if (this.mAllThreadsMode) {
            i = 0 | PROVIDER_SYSTEM_COUNTERS;
        }
        return this.mHighFrequencyMode ? i | PROVIDER_HIGH_FREQ_THREAD_COUNTERS : i;
    }
}
