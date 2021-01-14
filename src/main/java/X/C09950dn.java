package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* renamed from: X.0dn  reason: invalid class name and case insensitive filesystem */
public class C09950dn extends AnonymousClass0JW {
    public int A00;
    public int A01;
    public WeakReference A02;
    public final Uri A03;
    public final C02220Bc A04 = C02220Bc.A00();

    public C09950dn(AnonymousClass1Y6 r2, Uri uri, int i, int i2) {
        this.A03 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = new WeakReference(r2);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass1Y6 r5 = (AnonymousClass1Y6) this.A02.get();
        if (r5 != null && !C002001d.A3D(r5)) {
            r5.A0W(bitmap);
            if (bitmap == null) {
                ((ActivityC004702f) r5).A0F.A06(R.string.error_load_image, 0);
                r5.A0E = false;
                ((ActivityC004702f) r5).A0K.A00();
                return;
            }
            r5.A0X.ANC(new C09980dq(r5.A0W, r5.A01), new Void[0]);
        }
    }
}
