package X;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.14E  reason: invalid class name */
public class AnonymousClass14E {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Bitmap A0A;
    public final Layout.Alignment A0B;
    public final CharSequence A0C;
    public final boolean A0D;

    public AnonymousClass14E(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public AnonymousClass14E(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Float.MIN_VALUE, f3, Float.MIN_VALUE, false, -16777216);
    }

    public AnonymousClass14E(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.A0C = charSequence;
        this.A0B = alignment;
        this.A0A = bitmap;
        this.A01 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A02 = f2;
        this.A07 = i3;
        this.A03 = f4;
        this.A00 = f5;
        this.A0D = z;
        this.A09 = i5;
        this.A08 = i4;
        this.A04 = f3;
    }
}
