package X;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: X.0dd  reason: invalid class name and case insensitive filesystem */
public class C09850dd extends AnonymousClass0JW {
    public final Uri A00;
    public final AnonymousClass0PA A01;
    public final C71273Og A02;

    public C09850dd(AnonymousClass0PA r1, Uri uri, C71273Og r3) {
        this.A01 = r1;
        this.A00 = uri;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        this.A02.A00(((C657631l[]) objArr)[0]);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C657631l r2 = (C657631l) obj;
        if (!super.A00.isCancelled()) {
            this.A02.A00(r2);
            return;
        }
        Bitmap bitmap = r2.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
