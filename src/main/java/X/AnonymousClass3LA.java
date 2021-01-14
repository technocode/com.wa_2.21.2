package X;

import java.lang.ref.WeakReference;

/* renamed from: X.3LA  reason: invalid class name */
public class AnonymousClass3LA implements AnonymousClass09O {
    public final AnonymousClass02M A00;
    public final AnonymousClass09H A01;
    public final WeakReference A02;
    public final boolean A03;

    public AnonymousClass3LA(AnonymousClass02M r2, AnonymousClass09H r3, AbstractC64492yH r4, boolean z) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = new WeakReference(r4);
        this.A03 = z;
    }

    public void A00(AnonymousClass02U r17) {
        String str;
        AnonymousClass09H r9 = this.A01;
        String A022 = r9.A02();
        boolean z = this.A03;
        int i = 106;
        if (z) {
            i = 105;
        }
        if (z) {
            str = "set";
        } else {
            str = "get";
        }
        AnonymousClass0M5 r4 = new AnonymousClass0M5("invite", null, null, null);
        r9.A06(i, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:g2", null, (byte) 0), new AnonymousClass0OS("type", str, null, (byte) 0), new AnonymousClass0OS("to", r17)}, r4), this, 32000);
    }

    public final void A01(String str, int i) {
        Object obj = this.A02.get();
        if (obj != null) {
            AnonymousClass02M r0 = this.A00;
            r0.A02.post(new RunnableEBaseShape1S1201000_I1(this, obj, str, i, 1));
        }
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        A01(null, 0);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r4) {
        A01(null, C002001d.A0E(r4));
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r6) {
        AnonymousClass0M5 A0C = r6.A0C(0);
        AnonymousClass0M5.A01(A0C, "invite");
        A01(A0C.A0G("code", null), 0);
    }
}
