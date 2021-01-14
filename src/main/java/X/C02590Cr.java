package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* renamed from: X.0Cr  reason: invalid class name and case insensitive filesystem */
public class C02590Cr {
    public static volatile C02590Cr A05;
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final C000300f A02;
    public final AnonymousClass0D0 A03;
    public final C02600Cs A04;

    public C02590Cr(C000300f r2, C02600Cs r3, AnonymousClass0D0 r4) {
        this.A02 = r2;
        this.A04 = r3;
        this.A03 = r4;
    }

    public static C02590Cr A00() {
        if (A05 == null) {
            synchronized (C02590Cr.class) {
                if (A05 == null) {
                    C000300f A002 = C000300f.A00();
                    C02600Cs A003 = C02600Cs.A00();
                    if (AnonymousClass0D0.A01 == null) {
                        synchronized (AnonymousClass0D0.class) {
                            if (AnonymousClass0D0.A01 == null) {
                                AnonymousClass0D0.A01 = new AnonymousClass0D0(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass0CL.A00(), C02640Cw.A00(), AnonymousClass03U.A00(), AnonymousClass04j.A00(), C02660Cy.A00(), AnonymousClass00D.A00());
                            }
                        }
                    }
                    A05 = new C02590Cr(A002, A003, AnonymousClass0D0.A01);
                }
            }
        }
        return A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01fa, code lost:
        if (r2 != null) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01ff, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.BitmapDrawable A01(android.content.Context r13, int r14, X.AnonymousClass0M7 r15) {
        /*
        // Method dump skipped, instructions count: 517
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02590Cr.A01(android.content.Context, int, X.0M7):android.graphics.drawable.BitmapDrawable");
    }

    public Drawable A02(Context context, int i, AnonymousClass0M7 r7, float f) {
        int[] iArr;
        BitmapDrawable A012 = A01(context, i, r7);
        if (A012 != null) {
            return A012;
        }
        if (!(r7 instanceof AnonymousClass0M6)) {
            iArr = ((AnonymousClass2d1) r7).A01;
        } else {
            AnonymousClass0M6 r72 = (AnonymousClass0M6) r7;
            int i2 = r72.A01;
            iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = Character.codePointAt(r72.A02, i3);
            }
        }
        return new C48632Nb(iArr, f);
    }
}
