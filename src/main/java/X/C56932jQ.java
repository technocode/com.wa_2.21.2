package X;

import java.io.File;
import java.util.UUID;

/* renamed from: X.2jQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56932jQ {
    public final /* synthetic */ AnonymousClass1O7 A00;
    public final /* synthetic */ AnonymousClass2Mt A01;
    public final /* synthetic */ AnonymousClass2T4 A02;
    public final /* synthetic */ AnonymousClass2TG A03;
    public final /* synthetic */ C02950Ed A04;
    public final /* synthetic */ AnonymousClass2TT A05;

    public /* synthetic */ C56932jQ(C02950Ed r1, AnonymousClass2TG r2, AnonymousClass2T4 r3, AnonymousClass1O7 r4, AnonymousClass2TT r5, AnonymousClass2Mt r6) {
        this.A04 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A05 = r5;
        this.A01 = r6;
    }

    public final void A00(File file, boolean z) {
        C02950Ed r0 = this.A04;
        AnonymousClass2TG r6 = this.A03;
        AnonymousClass2T4 r7 = this.A02;
        AnonymousClass1O7 r8 = this.A00;
        AnonymousClass2TT r2 = this.A05;
        AnonymousClass2Mt r3 = this.A01;
        if (z && file != null) {
            r6.A02.A04(new AnonymousClass2TR(file, file.getName(), file.length(), C002001d.A3j(C002001d.A0V(file))));
        }
        C56962jT r9 = new C56962jT(r0, r7, r2, r6);
        C56982jV r10 = r6.A06;
        C56912jO r11 = r6.A05;
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append(".mp4");
        r0.A04.A01(new C57092jh(r7, r8, r9, r10, r11, r0.A00(file, sb.toString()), r2.A02, r2.A03, r3, file), AnonymousClass1XO.A04);
    }
}
