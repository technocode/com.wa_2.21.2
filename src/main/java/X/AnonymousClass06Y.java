package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import java.util.Arrays;

/* renamed from: X.06Y  reason: invalid class name */
public class AnonymousClass06Y implements AnonymousClass06R {
    public AnonymousClass06R A00;
    public AnonymousClass06R A01;
    public Integer A02;

    @Override // X.AnonymousClass06R
    public boolean AMv() {
        return false;
    }

    @Override // X.AnonymousClass06R
    public Drawable A3G(AnonymousClass05r r5, AnonymousClass06Q r6) {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A01.A3G(r5, r6);
        }
        Drawable A3G = this.A00.A3G(r5, r6);
        ShapeDrawable shapeDrawable = null;
        if (r6 != null) {
            float[] fArr = new float[8];
            Arrays.fill(fArr, r6.A01);
            shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        }
        return new RippleDrawable(ColorStateList.valueOf(this.A02.intValue()), A3G, shapeDrawable);
    }
}
