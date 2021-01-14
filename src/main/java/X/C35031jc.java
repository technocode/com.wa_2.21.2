package X;

import android.os.Bundle;

/* renamed from: X.1jc  reason: invalid class name and case insensitive filesystem */
public final class C35031jc implements AnonymousClass176, AnonymousClass177 {
    public AbstractC35041jd A00;
    public final AnonymousClass16z A01;
    public final boolean A02;

    public C35031jc(AnonymousClass16z r1, boolean z) {
        this.A01 = r1;
        this.A02 = z;
    }

    @Override // X.AnonymousClass176
    public final void AEX(Bundle bundle) {
        C001801b.A1R(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.AEX(bundle);
    }

    @Override // X.AnonymousClass177
    public final void AEY(C34661ix r4) {
        C001801b.A1R(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.ARQ(r4, this.A01, this.A02);
    }

    @Override // X.AnonymousClass176
    public final void AEZ(int i) {
        C001801b.A1R(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.AEZ(i);
    }
}
