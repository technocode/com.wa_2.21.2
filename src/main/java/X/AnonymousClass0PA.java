package X;

import java.util.concurrent.Executor;

/* renamed from: X.0PA  reason: invalid class name */
public class AnonymousClass0PA {
    public static volatile AnonymousClass0PA A08;
    public final C02270Bi A00 = new C02270Bi();
    public final C000300f A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass00G A03;
    public final C002701k A04;
    public final C657431j A05;
    public final C657531k A06;
    public final Executor A07;

    public AnonymousClass0PA(AnonymousClass00G r2, C002701k r3, AnonymousClass00T r4, C000300f r5, C657531k r6, AnonymousClass04j r7, C657431j r8) {
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = r5;
        this.A07 = r4.ACN();
        this.A06 = r6;
        this.A02 = r7;
        this.A05 = r8;
    }

    public static AnonymousClass0PA A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0PA.class) {
                AnonymousClass00G r6 = AnonymousClass00G.A01;
                C002701k A002 = C002701k.A00();
                C000300f A003 = C000300f.A00();
                AnonymousClass00T A004 = C002101e.A00();
                if (C657531k.A03 == null) {
                    synchronized (C657531k.class) {
                        AnonymousClass03U A005 = AnonymousClass03U.A00();
                        C02660Cy A006 = C02660Cy.A00();
                        if (C657531k.A03 == null) {
                            C657531k.A03 = new C657531k(r6, A005, A006);
                        }
                    }
                }
                C657531k r10 = C657531k.A03;
                AnonymousClass04j A007 = AnonymousClass04j.A00();
                if (C657431j.A03 == null) {
                    synchronized (C657431j.class) {
                        AnonymousClass0CL A008 = AnonymousClass0CL.A00();
                        C007703s A009 = C007703s.A00();
                        if (C657431j.A03 == null) {
                            C657431j.A03 = new C657431j(r6, A008, A009);
                        }
                    }
                }
                C657431j r12 = C657431j.A03;
                if (A08 == null) {
                    A08 = new AnonymousClass0PA(r6, A002, A004, A003, r10, A007, r12);
                }
            }
        }
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A01(java.io.File r5) {
        /*
            r4 = this;
            X.00G r0 = r4.A03
            android.app.Application r0 = r0.A00
            android.graphics.Point r3 = X.AnonymousClass02J.A00(r0)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0027, OutOfMemoryError -> 0x0025 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0027, OutOfMemoryError -> 0x0025 }
            r1 = 1
            X.01k r0 = r4.A04     // Catch:{ all -> 0x001e }
            X.02K r0 = X.AnonymousClass02J.A01(r3, r1, r0)     // Catch:{ all -> 0x001e }
            X.02L r0 = X.C002001d.A0o(r2, r0)     // Catch:{ all -> 0x001e }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x001e }
            r2.close()
            return r0
        L_0x001e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0
        L_0x0025:
            r1 = move-exception
            goto L_0x0028
        L_0x0027:
            r1 = move-exception
        L_0x0028:
            java.lang.String r0 = "DownloadableWallpaperManager/error when loading wallpaper resource"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PA.A01(java.io.File):android.graphics.Bitmap");
    }

    public void A02() {
        if (this.A01.A0D(AbstractC000400g.A2e)) {
            this.A07.execute(new RunnableEBaseShape4S0100000_I0_4(this, 20));
        }
    }
}
