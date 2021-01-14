package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2ps  reason: invalid class name and case insensitive filesystem */
public class C60652ps extends C60522pc {
    public C60652ps(Context context) {
        super(context);
    }

    @Override // X.C59592ny
    public void onMeasure(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.camera_thumb_size);
        setMeasuredDimension(dimensionPixelSize, dimensionPixelSize);
    }
}
