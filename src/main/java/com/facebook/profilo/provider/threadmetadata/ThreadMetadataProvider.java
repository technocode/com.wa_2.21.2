package com.facebook.profilo.provider.threadmetadata;

import X.AnonymousClass10A;
import X.AnonymousClass10P;
import X.C33401gg;

public final class ThreadMetadataProvider extends AnonymousClass10A {
    public static native void nativeLogThreadMetadata();

    @Override // X.AnonymousClass10A
    public void disable() {
    }

    @Override // X.AnonymousClass10A
    public void enable() {
    }

    @Override // X.AnonymousClass10A
    public int getSupportedProviders() {
        return -1;
    }

    @Override // X.AnonymousClass10A
    public int getTracingProviders() {
        return 0;
    }

    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    @Override // X.AnonymousClass10A
    public void onTraceEnded(AnonymousClass10P r3, C33401gg r4) {
        if (r3.A00 != 2) {
            nativeLogThreadMetadata();
        }
    }
}
