package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.soloader.SoLoader;

/* renamed from: X.10A  reason: invalid class name */
public abstract class AnonymousClass10A {
    public int A00;
    public AnonymousClass10P A01;
    public String A02;
    public boolean A03;

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public void onTraceEnded(AnonymousClass10P r1, C33401gg r2) {
    }

    public void onTraceStarted(AnonymousClass10P r1, C33401gg r2) {
    }

    public AnonymousClass10A(String str) {
        this.A02 = str;
        this.A03 = str == null;
    }

    public final void A00() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    SoLoader.A03(this.A02);
                    this.A03 = true;
                }
            }
        }
    }

    public final void A01(AnonymousClass10P r4) {
        int supportedProviders = getSupportedProviders() & TraceEvents.sProviders;
        int i = this.A00;
        if (i == 0 || (i & TraceEvents.sProviders) == 0) {
            if (this.A00 != 0) {
                disable();
                this.A01 = null;
            }
            if (supportedProviders != 0) {
                this.A01 = r4;
                enable();
            }
            this.A00 = supportedProviders;
        }
    }
}
