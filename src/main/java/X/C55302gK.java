package X;

import java.util.List;

/* renamed from: X.2gK  reason: invalid class name and case insensitive filesystem */
public class C55302gK extends AbstractC28771Vr {
    public final AnonymousClass00S A00;
    public final AnonymousClass0DG A01;
    public final C006903j A02;
    public final AnonymousClass01Q A03;
    public final AnonymousClass01K A04;
    public final C28691Vj A05;
    public final C447621j A06;
    public final AnonymousClass0BB A07;

    public C55302gK(AnonymousClass00S r1, C006903j r2, AnonymousClass0DG r3, AnonymousClass01K r4, AnonymousClass0BB r5, AnonymousClass01Q r6, C447621j r7, C28691Vj r8) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A04 = r4;
        this.A07 = r5;
        this.A03 = r6;
        this.A06 = r7;
        this.A05 = r8;
    }

    public final void A00(List list, AnonymousClass02N r17, long j) {
        long A032 = this.A02.A03(r17);
        AnonymousClass01K r8 = this.A04;
        AnonymousClass00S r2 = this.A00;
        C28511Up A052 = r8.A05(r17, A032, 100, r2.A05());
        if (A052.A00.moveToFirst()) {
            do {
                AbstractC007503q A033 = r8.A0J.A03(A052.A00, r17);
                if (A033 != null && A033.A0p != A032 && !A033.A0n.A02 && A033.A0C >= r2.A05() - j) {
                    list.add(A033);
                }
            } while (A052.A00.moveToNext());
        }
    }
}
