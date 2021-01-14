package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.1Zs  reason: invalid class name and case insensitive filesystem */
public class C29621Zs extends C08260aj {
    public boolean A00 = true;

    public C29621Zs(Drawable drawable) {
        super(drawable);
    }

    @Override // X.C08260aj
    public void draw(Canvas canvas) {
        if (this.A00) {
            super.A00.draw(canvas);
        }
    }

    @Override // X.C08260aj
    public void setHotspot(float f, float f2) {
        if (this.A00) {
            C002001d.A2X(super.A00, f, f2);
        }
    }

    @Override // X.C08260aj
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.A00) {
            C002001d.A2a(super.A00, i, i2, i3, i4);
        }
    }

    @Override // X.C08260aj
    public boolean setState(int[] iArr) {
        if (this.A00) {
            return super.A00.setState(iArr);
        }
        return false;
    }

    @Override // X.C08260aj
    public boolean setVisible(boolean z, boolean z2) {
        if (this.A00) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
