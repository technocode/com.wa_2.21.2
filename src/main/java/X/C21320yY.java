package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;

/* renamed from: X.0yY  reason: invalid class name and case insensitive filesystem */
public class C21320yY implements Camera.PictureCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Rect A01;
    public final /* synthetic */ CallableC21330yZ A02;

    public C21320yY(CallableC21330yZ r1, int i, Rect rect) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = rect;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        Rect rect = null;
        if (bArr != null) {
            int A002 = AnonymousClass103.A00(bArr);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            rect = new Rect(0, 0, options.outWidth, options.outHeight);
            AnonymousClass0N2.A11(this.A00, A002, rect, this.A01);
        }
        CallableC21330yZ r0 = this.A02;
        C33081gA r4 = r0.A01;
        Rect rect2 = this.A01;
        r4.A0R.A05(r4.A0Q.A03, new RunnableC21350yb(r4, bArr, r0.A00, rect, rect2));
        r4.A09();
        if (rect != null) {
            rect.width();
            rect.height();
            C22100zr.A00();
        }
    }
}
