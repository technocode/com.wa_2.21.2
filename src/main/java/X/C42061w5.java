package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.1w5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42061w5 implements AbstractC27871Rx {
    public static final /* synthetic */ C42061w5 A00 = new C42061w5();

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
