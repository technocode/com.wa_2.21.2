package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.1wC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42131wC implements AbstractC27871Rx {
    public final /* synthetic */ C60662pu A00;

    public /* synthetic */ C42131wC(C60662pu r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC27871Rx
    public final void AHF(C42301wU r3, Bitmap bitmap, boolean z) {
        C60662pu r1 = this.A00;
        r1.setBackgroundColor(0);
        r1.setImageBitmap(bitmap);
        r1.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
