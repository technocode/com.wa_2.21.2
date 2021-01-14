package X;

import java.util.ArrayList;

/* renamed from: X.1V4  reason: invalid class name */
public class AnonymousClass1V4 {
    public final C018609s A00;
    public final C018709t A01;
    public final AbstractC449322f A02;
    public final AnonymousClass00T A03;

    public AnonymousClass1V4(AnonymousClass00T r1, C018709t r2, AbstractC449322f r3, C018609s r4) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    public C41191ud A00() {
        C41191ud r3 = new C41191ud();
        this.A03.ANF(new RunnableEBaseShape7S0200000_I1_2(this, r3, 41));
        return r3;
    }

    public void A01(AnonymousClass1VM r8, AbstractC48012Ko r9) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r8);
        AnonymousClass00T r2 = this.A03;
        r2.ANC(new C10680f1(r2, this.A01, this.A02, arrayList, r9), new Void[0]);
    }
}
