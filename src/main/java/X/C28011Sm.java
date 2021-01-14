package X;

import java.io.File;

/* renamed from: X.1Sm  reason: invalid class name and case insensitive filesystem */
public class C28011Sm {
    public static volatile C28011Sm A04;
    public C664334g A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass00G A02;
    public final C02660Cy A03;

    public C28011Sm(AnonymousClass00G r1, AnonymousClass02M r2, C02660Cy r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A03 = r3;
    }

    public static C28011Sm A00() {
        if (A04 == null) {
            synchronized (C28011Sm.class) {
                if (A04 == null) {
                    A04 = new C28011Sm(AnonymousClass00G.A01, AnonymousClass02M.A00(), C02660Cy.A00());
                }
            }
        }
        return A04;
    }

    public C664334g A01() {
        C664334g r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C664234e r1 = new C664234e(this.A01, this.A03, new File(this.A02.A00.getCacheDir(), "bloks_images"));
        r1.A01 = Integer.MAX_VALUE;
        r1.A05 = true;
        C664334g A002 = r1.A00();
        this.A00 = A002;
        return A002;
    }
}
