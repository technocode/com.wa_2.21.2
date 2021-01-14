package X;

import java.util.Set;

/* renamed from: X.2gS  reason: invalid class name and case insensitive filesystem */
public class C55382gS implements AnonymousClass09O {
    public final /* synthetic */ AnonymousClass2RT A00;
    public final /* synthetic */ C08580bN A01;
    public final /* synthetic */ Set A02;

    public C55382gS(AnonymousClass2RT r1, Set set, C08580bN r3) {
        this.A00 = r1;
        this.A02 = set;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A01.A08(Boolean.FALSE);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r4) {
        this.A01.A08(Boolean.FALSE);
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r5) {
        String str2;
        AnonymousClass0OS A0A = r5.A0E("privacy").A0E("category").A0A("dhash");
        if (A0A == null || (str2 = A0A.A03) == null) {
            this.A00.A02();
            this.A01.A08(Boolean.FALSE);
            return;
        }
        AnonymousClass2RT r1 = this.A00;
        AnonymousClass2RT.A01(r1, this.A02, str2);
        AnonymousClass008.A0k(r1.A02, "privacy_groupadd", 3);
        this.A01.A08(Boolean.TRUE);
    }
}
