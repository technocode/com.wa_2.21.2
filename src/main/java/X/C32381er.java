package X;

import android.graphics.Point;

/* renamed from: X.1er  reason: invalid class name and case insensitive filesystem */
public class C32381er implements AbstractC21140yF {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC32431ew A00;

    public C32381er(TextureView$SurfaceTextureListenerC32431ew r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC21140yF
    public void AGE(EnumC21130yE r8, Point point) {
        TextureView$SurfaceTextureListenerC32431ew r6 = this.A00;
        AbstractC19770va r5 = r6.A05;
        if (r5 != null) {
            int ordinal = r8.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    r6.A0J.A00(14, r5);
                } else if (ordinal != 3) {
                    if (ordinal == 4 || ordinal == 5) {
                        r6.A0J.A00(13, r5);
                    }
                } else if (point != null) {
                    r6.A0J.A00(12, new Object[]{r5, point});
                }
            } else if (point != null) {
                r6.A0J.A00(11, new Object[]{r5, point});
            }
        }
    }
}
