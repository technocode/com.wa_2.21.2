package X;

import com.facebook.profilo.core.ProvidersRegistry;

/* renamed from: X.22g  reason: invalid class name and case insensitive filesystem */
public final class C449422g extends AnonymousClass10A {
    public static final int A00 = ProvidersRegistry.A00.A02("qpl");

    @Override // X.AnonymousClass10A
    public void disable() {
    }

    @Override // X.AnonymousClass10A
    public void enable() {
    }

    public C449422g() {
        super(null);
    }

    @Override // X.AnonymousClass10A
    public int getSupportedProviders() {
        return A00;
    }

    @Override // X.AnonymousClass10A
    public int getTracingProviders() {
        AnonymousClass10P r0 = this.A01;
        if (r0 == null) {
            return 0;
        }
        return r0.A02 & A00;
    }
}
