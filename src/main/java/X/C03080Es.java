package X;

import android.content.Context;

/* renamed from: X.0Es  reason: invalid class name and case insensitive filesystem */
public class C03080Es extends AbstractC02960Ef {
    public static volatile C03080Es A05;
    public final AnonymousClass088 A00;
    public final C000300f A01;
    public final AnonymousClass01X A02;
    public final C02590Cr A03;
    public final AnonymousClass0D1 A04;

    public C03080Es(AnonymousClass00T r3, AnonymousClass088 r4, C02590Cr r5, C000300f r6, AnonymousClass01X r7, AnonymousClass0D1 r8) {
        super(new C02980Ei(r3, "ProcessDoodleQueue"));
        this.A00 = r4;
        this.A03 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A04 = r8;
    }

    public void A07(AnonymousClass2T4 r12, String str, Context context, AbstractC49942Su r15) {
        if (str == null) {
            r15.AH9(null);
            return;
        }
        C60172ov r1 = new C60172ov(this.A00, this.A03, this.A01, r12, this.A02, this.A04, str, context, r15);
        A01(r1.A7L(), r1);
    }
}
