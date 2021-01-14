package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.0YV  reason: invalid class name */
public class AnonymousClass0YV {
    public ImageView A00;
    public ImageView A01;
    public boolean A02;

    public AnonymousClass0YV(ImageView imageView, ImageView imageView2) {
        if (imageView != null) {
            this.A00 = imageView;
            if (imageView2 != null) {
                this.A01 = imageView2;
                return;
            }
            throw null;
        }
        throw null;
    }

    public static Drawable A00(Drawable drawable, Drawable drawable2) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0) {
                drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
            }
        }
        if (drawable == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return drawable2;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(50);
        int intrinsicHeight = drawable.getIntrinsicHeight();
        transitionDrawable.setLayerWidth(0, drawable.getIntrinsicWidth());
        transitionDrawable.setLayerHeight(0, intrinsicHeight);
        transitionDrawable.setLayerGravity(0, 17);
        int intrinsicHeight2 = drawable2.getIntrinsicHeight();
        transitionDrawable.setLayerWidth(1, drawable2.getIntrinsicWidth());
        transitionDrawable.setLayerHeight(1, intrinsicHeight2);
        transitionDrawable.setLayerGravity(1, 17);
        return transitionDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r2 == null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass0Y2 r15) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YV.A01(X.0Y2):void");
    }
}
