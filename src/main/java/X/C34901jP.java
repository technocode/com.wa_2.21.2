package X;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1jP  reason: invalid class name and case insensitive filesystem */
public final class C34901jP implements AnonymousClass176 {
    public final /* synthetic */ AnonymousClass260 A00;
    public final /* synthetic */ C34881jN A01;
    public final /* synthetic */ AtomicReference A02;

    public C34901jP(C34881jN r1, AtomicReference atomicReference, AnonymousClass260 r3) {
        this.A01 = r1;
        this.A02 = atomicReference;
        this.A00 = r3;
    }

    @Override // X.AnonymousClass176
    public final void AEZ(int i) {
    }

    @Override // X.AnonymousClass176
    public final void AEX(Bundle bundle) {
        C34881jN r5 = this.A01;
        AnonymousClass178 r4 = (AnonymousClass178) this.A02.get();
        r4.A01(new AnonymousClass2AQ(r4)).A01(new C34921jR(r5, this.A00, true, r4));
    }
}
