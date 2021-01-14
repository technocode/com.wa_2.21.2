package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.1bU  reason: invalid class name and case insensitive filesystem */
public class C30521bU extends AbstractC16520pw {
    public int A00 = 0;
    public int A01 = 0;
    public PointF A02;
    public final float A03;
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public final LinearInterpolator A05 = new LinearInterpolator();

    public C30521bU(Context context) {
        float applyDimension;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (this instanceof C74163aH) {
            applyDimension = 40.0f / TypedValue.applyDimension(1, 40.0f, displayMetrics);
        } else if (this instanceof C59552nt) {
            applyDimension = 150.0f / ((float) displayMetrics.densityDpi);
        } else if (this instanceof C59492nl) {
            applyDimension = 40.0f / TypedValue.applyDimension(1, 40.0f, displayMetrics);
        } else if (this instanceof AnonymousClass245) {
            applyDimension = 100.0f / ((float) displayMetrics.densityDpi);
        } else if (!(this instanceof AnonymousClass243)) {
            applyDimension = 25.0f / ((float) displayMetrics.densityDpi);
        } else {
            applyDimension = 100.0f / ((float) displayMetrics.densityDpi);
        }
        this.A03 = applyDimension;
    }

    public int A03(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.A03));
    }
}
