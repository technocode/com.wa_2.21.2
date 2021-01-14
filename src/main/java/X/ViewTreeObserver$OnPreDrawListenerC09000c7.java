package X;

import android.os.Build;
import android.view.ViewTreeObserver;

/* renamed from: X.0c7  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC09000c7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C08120aV A00;

    public ViewTreeObserver$OnPreDrawListenerC09000c7(C08120aV r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        C08120aV r4 = this.A00;
        C08010aK r5 = r4.A0P;
        float rotation = r5.getRotation();
        if (r4.A04 != rotation) {
            r4.A04 = rotation;
            if (Build.VERSION.SDK_INT == 19) {
                if (rotation % 90.0f != 0.0f) {
                    if (r5.getLayerType() != 1) {
                        r5.setLayerType(1, null);
                    }
                } else if (r5.getLayerType() != 0) {
                    r5.setLayerType(0, null);
                }
            }
            C08250ai r2 = r4.A0H;
            if (r2 != null) {
                float f = -r4.A04;
                if (r2.A03 != f) {
                    r2.A03 = f;
                    r2.invalidateSelf();
                }
            }
            C08230ag r22 = r4.A0G;
            if (r22 != null) {
                float f2 = -r4.A04;
                if (f2 != r22.A01) {
                    r22.A01 = f2;
                    r22.invalidateSelf();
                }
            }
        }
        return true;
    }
}
