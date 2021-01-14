package X;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.0dq  reason: invalid class name and case insensitive filesystem */
public class C09980dq extends AnonymousClass0JW {
    public String A00;
    public final Uri A01;
    public final C02220Bc A02 = C02220Bc.A00();
    public final WeakReference A03;

    public C09980dq(AbstractC64722ye r2, Uri uri) {
        this.A03 = new WeakReference(r2);
        this.A01 = uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass1Fh A00(X.C37251nt r11, android.graphics.Bitmap r12) {
        /*
            r3 = r12
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            int r0 = r0 * r1
            int[] r4 = new int[r0]
            int r6 = r12.getWidth()
            int r9 = r12.getWidth()
            int r10 = r12.getHeight()
            r5 = 0
            r7 = r5
            r8 = r5
            r3.getPixels(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r12.getWidth()
            int r0 = r12.getHeight()
            X.1nr r1 = new X.1nr
            r1.<init>(r2, r0, r4)
            X.1ns r0 = new X.1ns
            r0.<init>(r1)
            X.1Fc r1 = new X.1Fc
            r1.<init>(r0)
            r0 = 0
            X.1Fh r0 = r11.A00(r1, r0)     // Catch:{ 1Fg -> 0x003d, all -> 0x003b }
            return r0
        L_0x003b:
            r0 = move-exception
            throw r0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09980dq.A00(X.1nt, android.graphics.Bitmap):X.1Fh");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        int intValue = ((Number) obj).intValue();
        AbstractC64722ye r1 = (AbstractC64722ye) this.A03.get();
        if (r1 != null) {
            r1.AJd(this.A00, intValue);
        }
    }
}
