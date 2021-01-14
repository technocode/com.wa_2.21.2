package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0jk  reason: invalid class name and case insensitive filesystem */
public class C13170jk extends PopupWindow {
    public static final boolean A01;
    public boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        }
        A01 = z;
    }

    public C13170jk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0T, i, i2);
        if (obtainStyledAttributes.hasValue(2)) {
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            if (A01) {
                this.A00 = z;
            } else {
                AnonymousClass0N2.A1H(this, z);
            }
        }
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = AnonymousClass05p.A01(context, resourceId);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (A01 && this.A00) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (A01 && this.A00) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (A01 && this.A00) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
