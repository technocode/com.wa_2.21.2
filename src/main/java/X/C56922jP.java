package X;

import android.app.Application;

/* renamed from: X.2jP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56922jP implements AnonymousClass2TQ {
    public final /* synthetic */ AnonymousClass2T4 A00;
    public final /* synthetic */ AnonymousClass2TG A01;
    public final /* synthetic */ C02950Ed A02;
    public final /* synthetic */ AnonymousClass2TT A03;

    public /* synthetic */ C56922jP(C02950Ed r1, AnonymousClass2T4 r2, AnonymousClass2TT r3, AnonymousClass2TG r4) {
        this.A02 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass2TQ
    public final void AGC(AnonymousClass2TV r10) {
        C02950Ed r4 = this.A02;
        AnonymousClass2T4 r6 = this.A00;
        AnonymousClass2TT r3 = this.A03;
        AnonymousClass2TG r2 = this.A01;
        if (r10.A02) {
            C03080Es r1 = r4.A02;
            String str = r3.A08;
            Application application = r4.A00.A00;
            if (str != null) {
                C60162ou r32 = new C60162ou(r1.A00, r1.A03, r6, str, application);
                r1.A01(r32.A7L(), r32);
            }
        }
        r2.A04.A04(r10);
    }
}
