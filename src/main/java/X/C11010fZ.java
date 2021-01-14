package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0fZ  reason: invalid class name and case insensitive filesystem */
public class C11010fZ extends AnonymousClass0JW {
    public final AnonymousClass08V A00;
    public final C42931xW A01;
    public final C43111xo A02;
    public final String A03;

    public C11010fZ(C42931xW r1, String str, AnonymousClass08V r3, C43111xo r4) {
        this.A01 = r1;
        this.A03 = str;
        this.A00 = r3;
        this.A02 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.A00.A07(this.A03, new WeakReference(bitmap));
            this.A02.A00(bitmap);
        } else if (this.A02 != null) {
            Log.e("ImageComponentBinder/bindView/bitmap read failed");
        } else {
            throw null;
        }
    }
}
