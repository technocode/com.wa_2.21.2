package X;

import java.io.File;
import java.util.UUID;

/* renamed from: X.2jS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56952jS implements AbstractC49942Su {
    public final /* synthetic */ AnonymousClass1O7 A00;
    public final /* synthetic */ AnonymousClass2T4 A01;
    public final /* synthetic */ AnonymousClass2TG A02;
    public final /* synthetic */ C02950Ed A03;
    public final /* synthetic */ AnonymousClass2TT A04;

    public /* synthetic */ C56952jS(C02950Ed r1, AnonymousClass2T4 r2, AnonymousClass1O7 r3, AnonymousClass2TT r4, AnonymousClass2TG r5) {
        this.A03 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }

    @Override // X.AbstractC49942Su
    public final void AH9(AnonymousClass2Mt r22) {
        C02950Ed r4 = this.A03;
        AnonymousClass2T4 r6 = this.A01;
        AnonymousClass1O7 r7 = this.A00;
        AnonymousClass2TT r2 = this.A04;
        AnonymousClass2TG r0 = this.A02;
        C56922jP r8 = new C56922jP(r4, r6, r2, r0);
        C56982jV r9 = r0.A06;
        C56912jO r10 = r0.A05;
        File file = r2.A07;
        if (file != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(UUID.randomUUID().toString());
            sb.append(".mp4");
            r4.A04.A01(new C57162jo(r6, r7, r8, r9, r10, file, r4.A00(file, sb.toString()), r2.A02, r2.A03, r22, r2.A0G, r2.A0D, r2.A0F), AnonymousClass1XO.A0N);
            return;
        }
        throw null;
    }
}
