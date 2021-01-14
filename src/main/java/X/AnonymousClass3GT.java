package X;

import java.io.File;

/* renamed from: X.3GT  reason: invalid class name */
public class AnonymousClass3GT {
    public static volatile AnonymousClass3GT A04;
    public final AnonymousClass02M A00;
    public final AnonymousClass00G A01;
    public final C02660Cy A02;
    public final C664334g A03;

    public AnonymousClass3GT(AnonymousClass02M r4, AnonymousClass00G r5, C02660Cy r6) {
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        C664234e r2 = new C664234e(r4, r6, new File(r5.A00.getCacheDir(), "brazilpay_image_cache"));
        r2.A02 = 16777216;
        r2.A05 = true;
        this.A03 = r2.A00();
    }

    public static AnonymousClass3GT A00() {
        if (A04 == null) {
            synchronized (AnonymousClass3GT.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass3GT(AnonymousClass02M.A00(), AnonymousClass00G.A01, C02660Cy.A00());
                }
            }
        }
        return A04;
    }
}
