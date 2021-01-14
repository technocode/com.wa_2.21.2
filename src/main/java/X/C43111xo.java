package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* renamed from: X.1xo  reason: invalid class name and case insensitive filesystem */
public final class C43111xo {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass05r A01;
    public final /* synthetic */ C009405x A02;

    public C43111xo(C009405x r1, AnonymousClass05r r2, ImageView imageView) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = imageView;
    }

    public void A00(Bitmap bitmap) {
        C009405x r1 = this.A02;
        if (r1 != null) {
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(r1.A00(this.A01).intValue(), PorterDuff.Mode.SRC_IN));
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
            this.A00.setImageBitmap(createBitmap);
            return;
        }
        this.A00.setImageBitmap(bitmap);
    }
}
