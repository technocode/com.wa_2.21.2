package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.0vi  reason: invalid class name and case insensitive filesystem */
public class C19850vi extends OrientationEventListener {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC32431ew A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19850vi(TextureView$SurfaceTextureListenerC32431ew r1, Context context) {
        super(context);
        this.A00 = r1;
    }

    public void onOrientationChanged(int i) {
        int i2 = ((((i + 45) + 360) / 90) % 4) * 90;
        TextureView$SurfaceTextureListenerC32431ew r2 = this.A00;
        int A002 = r2.A00();
        if (r2.A01 != i2 || r2.A02 != A002) {
            r2.A01 = i2;
            r2.A0M.AI9(i2);
            r2.A04(r2.A09);
        }
    }
}
