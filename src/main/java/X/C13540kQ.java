package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.0kQ  reason: invalid class name and case insensitive filesystem */
public class C13540kQ {
    public static final ThreadLocal A00 = new ThreadLocal();
    public static final int[] A01 = {16842912};
    public static final int[] A02 = {-16842910};
    public static final int[] A03 = new int[0];
    public static final int[] A04 = {16842908};
    public static final int[] A05 = {16842919};
    public static final int[] A06 = new int[1];

    public static int A00(Context context, int i) {
        ColorStateList A022 = A02(context, i);
        if (A022 != null && A022.isStateful()) {
            return A022.getColorForState(A02, A022.getDefaultColor());
        }
        ThreadLocal threadLocal = A00;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int A012 = A01(context, i);
        return C004402b.A03(A012, Math.round(((float) Color.alpha(A012)) * f));
    }

    public static int A01(Context context, int i) {
        int[] iArr = A06;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList A02(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = A06;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AnonymousClass05p.A00(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
