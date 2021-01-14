package X;

import android.util.Pair;
import java.util.concurrent.Executor;

/* renamed from: X.2ju  reason: invalid class name and case insensitive filesystem */
public class C57222ju implements AnonymousClass1W7 {
    public final C03140Ey A00 = new C03140Ey();
    public final C03140Ey A01 = new C03140Ey();
    public final Executor A02;

    public C57222ju(Executor executor) {
        this.A02 = executor;
    }

    @Override // X.AnonymousClass1W7
    public void AFF(boolean z) {
        this.A00.A04(Boolean.valueOf(z));
    }

    @Override // X.AnonymousClass1W7
    public void AFG(AnonymousClass1W8 r3, C49982Sy r4) {
        this.A01.A04(Pair.create(r3, r4));
    }
}
