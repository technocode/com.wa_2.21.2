package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.1jz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C35221jz implements AbstractC27871Rx {
    public static final /* synthetic */ C35221jz A00 = new C35221jz();

    @Override // X.AbstractC27871Rx
    public final void AHF(C42301wU r3, Bitmap bitmap, boolean z) {
        ImageView imageView = (ImageView) r3.A09.get();
        if (imageView != null) {
            imageView.setBackgroundColor(0);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
