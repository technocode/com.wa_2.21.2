package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.provider.atrace.Atrace;

/* renamed from: X.1gi  reason: invalid class name and case insensitive filesystem */
public final class C33421gi extends AnonymousClass10A {
    public static final int A00 = ProvidersRegistry.A00.A02("atrace");

    public C33421gi() {
        super("profilo_atrace");
    }

    @Override // X.AnonymousClass10A
    public void disable() {
        Atrace.restoreSystrace();
    }

    @Override // X.AnonymousClass10A
    public void enable() {
        Atrace.enableSystrace();
    }

    @Override // X.AnonymousClass10A
    public int getSupportedProviders() {
        return A00;
    }

    @Override // X.AnonymousClass10A
    public int getTracingProviders() {
        if (Atrace.isEnabled()) {
            return A00;
        }
        return 0;
    }
}
