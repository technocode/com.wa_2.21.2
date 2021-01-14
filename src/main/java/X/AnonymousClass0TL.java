package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.0TL  reason: invalid class name */
public class AnonymousClass0TL {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public AnonymousClass0TL(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }

    public static AnonymousClass0TL A00(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new AnonymousClass0TL(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public ColorStateList A01(int i) {
        int resourceId;
        ColorStateList A002;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A002 = AnonymousClass05p.A00(this.A01, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return A002;
    }

    public Drawable A02(int i) {
        int resourceId;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return typedArray.getDrawable(i);
        }
        return AnonymousClass05p.A01(this.A01, resourceId);
    }

    public Drawable A03(int i) {
        int resourceId;
        Drawable A06;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        C06340Sv A012 = C06340Sv.A01();
        Context context = this.A01;
        synchronized (A012) {
            A06 = A012.A00.A06(context, resourceId, true);
        }
        return A06;
    }
}
