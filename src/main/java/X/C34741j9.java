package X;

import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* renamed from: X.1j9  reason: invalid class name and case insensitive filesystem */
public final class C34741j9 implements AbstractC237817o, AbstractC236717b {
    public IAccountAccessor A00 = null;
    public Set A01 = null;
    public boolean A02 = false;
    public final AbstractC34701j2 A03;
    public final C237017e A04;
    public final /* synthetic */ AnonymousClass17J A05;

    public C34741j9(AnonymousClass17J r2, AbstractC34701j2 r3, C237017e r4) {
        this.A05 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    public final void A00(C34661ix r3) {
        C457125z r1 = (C457125z) this.A05.A08.get(this.A04);
        C001801b.A1L(r1.A0C.A05);
        r1.A04.A3k();
        r1.AEY(r3);
    }

    @Override // X.AbstractC237817o
    public final void AJN(C34661ix r4) {
        this.A05.A05.post(new RunnableEBaseShape5S0200000_I1_0(r4, this, 36));
    }
}
