package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.0pl  reason: invalid class name and case insensitive filesystem */
public class C16410pl extends ViewGroup.MarginLayoutParams {
    public AbstractC11910hD A00;
    public boolean A01 = true;
    public boolean A02 = false;
    public final Rect A03 = new Rect();

    public C16410pl(int i, int i2) {
        super(i, i2);
    }

    public C16410pl(C16410pl r2) {
        super((ViewGroup.LayoutParams) r2);
    }

    public C16410pl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C16410pl(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C16410pl(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public boolean A00() {
        return (this.A00.A00 & 2) != 0;
    }
}
