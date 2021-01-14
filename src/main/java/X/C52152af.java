package X;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* renamed from: X.2af  reason: invalid class name and case insensitive filesystem */
public final class C52152af implements AnonymousClass1PC {
    public final Activity A00;
    public final AbstractC004502c A01;
    public final AnonymousClass02M A02;
    public final C000300f A03;
    public final AbstractC28311Tv A04;
    public final AnonymousClass2JG A05;
    public final AnonymousClass03P A06;
    public final AnonymousClass01X A07;
    public final AnonymousClass02J A08;

    public C52152af(Activity activity, AnonymousClass02M r2, C000300f r3, AnonymousClass03P r4, AnonymousClass01X r5, AnonymousClass02J r6, AbstractC004502c r7, AbstractC28311Tv r8, AnonymousClass2JG r9) {
        this.A00 = activity;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = r6;
        this.A01 = r7;
        this.A04 = r8;
        this.A05 = r9;
    }

    public final void A00(AnonymousClass02N r17, Uri uri, int i, int i2, int i3, boolean z) {
        AnonymousClass02J r9;
        Activity activity;
        AnonymousClass31V A062;
        if (uri != null) {
            r9 = this.A08;
            activity = this.A00;
            A062 = r9.A06(r17, activity, uri, z, 0, 0);
        } else if (i == -1) {
            r9 = this.A08;
            activity = this.A00;
            A062 = r9.A06(r17, activity, null, z, 0, 0);
        } else {
            r9 = this.A08;
            activity = this.A00;
            if (!(r9 instanceof C02200Ba)) {
                C02260Bh r4 = (C02260Bh) r9;
                AnonymousClass008.A0y("wallpaper/set with resId with size (width x height): ", i2, "x", i3);
                Drawable A032 = AnonymousClass1VY.A03(r4.A04, activity, i, i2, i3);
                r4.A00 = A032;
                if (A032 != null) {
                    r4.A0B(activity, A032);
                }
                A062 = new AnonymousClass31V(r4.A00);
            } else {
                C02200Ba r42 = (C02200Ba) r9;
                Drawable A033 = AnonymousClass1VY.A03(r42.A01, activity, i, i2, i3);
                if (A033 == null) {
                    A062 = r42.A05(r17, activity);
                } else {
                    boolean z2 = false;
                    if (r17 == null) {
                        z2 = true;
                    }
                    A062 = r42.A0B(r42.A0D(r17, activity, (BitmapDrawable) A033), activity, z2);
                }
            }
        }
        this.A04.APM(r9.A09(A062));
        if (z) {
            C02230Bd.A0R(activity, uri);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0241, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0242, code lost:
        if (r1 != null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0247, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0297, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0298, code lost:
        if (r1 != null) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x029d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0135, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0136, code lost:
        if (r10 != null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0154, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d7, code lost:
        if (r1 != null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01dc, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass1PC
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
        // Method dump skipped, instructions count: 755
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52152af.onActivityResult(int, int, android.content.Intent):boolean");
    }
}
