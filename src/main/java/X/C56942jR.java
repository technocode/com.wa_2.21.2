package X;

import java.io.File;

/* renamed from: X.2jR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56942jR implements AbstractC49942Su {
    public final /* synthetic */ AnonymousClass1O7 A00;
    public final /* synthetic */ AnonymousClass2T4 A01;
    public final /* synthetic */ AnonymousClass2TG A02;
    public final /* synthetic */ C02950Ed A03;
    public final /* synthetic */ AnonymousClass2TT A04;

    public /* synthetic */ C56942jR(C02950Ed r1, AnonymousClass2T4 r2, AnonymousClass2TT r3, AnonymousClass2TG r4, AnonymousClass1O7 r5) {
        this.A03 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A00 = r5;
    }

    @Override // X.AbstractC49942Su
    public final void AH9(AnonymousClass2Mt r14) {
        C02950Ed r4 = this.A03;
        AnonymousClass2T4 r6 = this.A01;
        AnonymousClass2TT r8 = this.A04;
        AnonymousClass2TG r5 = this.A02;
        AnonymousClass1O7 r7 = this.A00;
        AnonymousClass0Ee r2 = r4.A03;
        File file = r8.A07;
        String str = r8.A0B;
        int i = r8.A00;
        C56932jQ r3 = new C56932jQ(r4, r5, r6, r7, r8, r14);
        if (file != null) {
            r3.A00(file, false);
        } else if (str != null) {
            C56852jI r72 = new C56852jI(r2.A00, r6, str, i, r3);
            r2.A01(r72.A7L(), r72);
        } else {
            throw null;
        }
    }
}
