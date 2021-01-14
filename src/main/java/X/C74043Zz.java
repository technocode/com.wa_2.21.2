package X;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: X.3Zz  reason: invalid class name and case insensitive filesystem */
public class C74043Zz extends C08490bD {
    public C74043Zz(Context context) {
        super(context, null);
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, (int) (((double) ((float) defaultSize)) * 1.5d));
    }
}
