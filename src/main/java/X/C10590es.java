package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* renamed from: X.0es  reason: invalid class name and case insensitive filesystem */
public class C10590es extends AnonymousClass0JW {
    public final Rect A00;
    public final Rect A01;
    public final WeakReference A02;

    public C10590es(Rect rect, Rect rect2, C52902bw r4) {
        this.A01 = rect;
        this.A00 = rect2;
        this.A02 = new WeakReference(r4);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C52902bw r0 = (C52902bw) this.A02.get();
        if (r0 != null) {
            AnonymousClass2MF r1 = r0.A00;
            r1.A04.setBlurBackground(bitmap);
            r1.A02();
        }
    }
}
