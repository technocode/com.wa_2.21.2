package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0Bh  reason: invalid class name and case insensitive filesystem */
public class C02260Bh extends AnonymousClass02J {
    public static volatile C02260Bh A0B;
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass088 A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass01I A05;
    public final AnonymousClass00C A06;
    public final AnonymousClass03S A07;
    public final AnonymousClass0BE A08;
    public final C02210Bb A09;
    public final C02220Bc A0A;

    public C02260Bh(AnonymousClass00G r8, C002701k r9, AnonymousClass02M r10, AnonymousClass01I r11, AnonymousClass088 r12, AnonymousClass03R r13, C000300f r14, C02220Bc r15, AnonymousClass00C r16, AnonymousClass03S r17, C02210Bb r18, AnonymousClass0BB r19, AnonymousClass0BE r20) {
        super(r8, r9, r13, r14, r19);
        this.A04 = r10;
        this.A05 = r11;
        this.A03 = r12;
        this.A0A = r15;
        this.A06 = r16;
        this.A07 = r17;
        this.A09 = r18;
        this.A08 = r20;
    }

    public static C02260Bh A04() {
        if (A0B == null) {
            synchronized (C02260Bh.class) {
                A0B = new C02260Bh(AnonymousClass00G.A01, C002701k.A00(), AnonymousClass02M.A00(), AnonymousClass01I.A00(), AnonymousClass088.A00(), AnonymousClass03R.A00(), C000300f.A00(), C02220Bc.A00(), AnonymousClass00C.A00(), AnonymousClass03S.A00(), new C02210Bb(), AnonymousClass0BB.A00(), AnonymousClass0BE.A01());
            }
        }
        return A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r10 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C71253Oe A0A(android.content.Context r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02260Bh.A0A(android.content.Context, boolean):X.3Oe");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r3 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(android.content.Context r5, android.graphics.drawable.Drawable r6) {
        /*
            r4 = this;
            java.lang.String r1 = "wallpaper.jpg"
            r0 = 0
            java.io.FileOutputStream r3 = r5.openFileOutput(r1, r0)     // Catch:{ IOException -> 0x0024 }
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6     // Catch:{ all -> 0x001b }
            android.graphics.Bitmap r2 = r6.getBitmap()     // Catch:{ all -> 0x001b }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x001b }
            r0 = 90
            r2.compress(r1, r0, r3)     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0028
            r3.close()
            goto L_0x0028
        L_0x001b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            if (r3 == 0) goto L_0x0023
            r3.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r0
        L_0x0024:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
        L_0x0028:
            r4.A07(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02260Bh.A0B(android.content.Context, android.graphics.drawable.Drawable):void");
    }
}
