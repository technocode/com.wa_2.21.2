package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* renamed from: X.0aN  reason: invalid class name and case insensitive filesystem */
public final class C08040aN {
    public static final int[] A00 = {R.attr.colorPrimary};
    public static final int[] A01 = {R.attr.colorSecondary};

    public static TypedArray A00(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        A01(context, attributeSet, i, i2);
        A02(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void A01(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08030aM.A0y, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            A03(context, A01, "Theme.MaterialComponents");
        }
        A03(context, A00, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r6.getResourceId(0, -1) != -1) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r7, android.util.AttributeSet r8, int[] r9, int r10, int r11, int... r12) {
        /*
            int[] r0 = X.C08030aM.A0y
            android.content.res.TypedArray r6 = r7.obtainStyledAttributes(r8, r0, r10, r11)
            r0 = 2
            r5 = 0
            boolean r0 = r6.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x0012
            r6.recycle()
            return
        L_0x0012:
            r4 = -1
            int r3 = r12.length
            if (r3 != 0) goto L_0x0023
            int r0 = r6.getResourceId(r5, r4)
            if (r0 == r4) goto L_0x001d
        L_0x001c:
            r5 = 1
        L_0x001d:
            r6.recycle()
            if (r5 == 0) goto L_0x003c
            return
        L_0x0023:
            android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r8, r9, r10, r11)
            r1 = 0
        L_0x0028:
            r0 = r12[r1]
            int r0 = r2.getResourceId(r0, r4)
            if (r0 != r4) goto L_0x0034
            r2.recycle()
            goto L_0x001d
        L_0x0034:
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x0028
            r2.recycle()
            goto L_0x001c
        L_0x003c:
            java.lang.String r1 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08040aN.A02(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void A03(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            throw new IllegalArgumentException(AnonymousClass008.A0L("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }
}
