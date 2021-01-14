package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: X.1ah  reason: invalid class name and case insensitive filesystem */
public class C30081ah extends AbstractC14710ml {
    public C30081ah(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // X.AbstractC14710ml
    public void A02(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public void getOutline(Outline outline) {
        A01();
        outline.setRoundRect(this.A0B, this.A00);
    }
}
