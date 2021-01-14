package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.io.File;

/* renamed from: X.0dc  reason: invalid class name and case insensitive filesystem */
public class C09840dc extends AnonymousClass0JW {
    public final Context A00;
    public final ImageView A01;
    public final C002701k A02;
    public final File A03;

    public C09840dc(C002701k r1, Context context, ImageView imageView, File file) {
        this.A02 = r1;
        this.A00 = context;
        this.A01 = imageView;
        this.A03 = file;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!super.A00.isCancelled()) {
            this.A01.setImageBitmap(bitmap);
        } else {
            bitmap.recycle();
        }
    }
}
