package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.0Va  reason: invalid class name and case insensitive filesystem */
public class C06870Va {
    public float A00 = Float.MAX_VALUE;
    public float A01;
    public float A02;
    public float A03;
    public float A04 = 0.0f;
    public float A05 = 1.0f;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public ColorStateList A0D;
    public Layout.Alignment A0E;
    public TextPaint A0F = new TextPaint(1);
    public TextUtils.TruncateAt A0G;
    public AbstractC06520Tq A0H;
    public CharSequence A0I;
    public boolean A0J = true;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public C06870Va() {
        boolean z = true;
        this.A0N = Build.VERSION.SDK_INT < 28 ? false : z;
        this.A0L = false;
        this.A0G = null;
        this.A0M = false;
        this.A0A = Integer.MAX_VALUE;
        this.A0E = Layout.Alignment.ALIGN_NORMAL;
        this.A0H = C06510Tp.A01;
        this.A06 = 0;
        this.A07 = 0;
        this.A08 = 0;
        this.A0K = false;
    }

    public void A00() {
        if (this.A0K) {
            TextPaint textPaint = new TextPaint(this.A0F);
            textPaint.set(this.A0F);
            this.A0F = textPaint;
            this.A0K = false;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int floatToIntBits = (Float.floatToIntBits(this.A0F.getTextSize()) + ((this.A0F.getColor() + 31) * 31)) * 31;
        int i5 = 0;
        if (this.A0F.getTypeface() != null) {
            i = this.A0F.getTypeface().hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits2 = (Float.floatToIntBits(this.A02) + ((Float.floatToIntBits(this.A01) + ((floatToIntBits + i) * 31)) * 31)) * 31;
        TextPaint textPaint = this.A0F;
        int floatToIntBits3 = (Float.floatToIntBits(textPaint.density) + ((((((Float.floatToIntBits(this.A03) + floatToIntBits2) * 31) + this.A09) * 31) + textPaint.linkColor) * 31)) * 31;
        int floatToIntBits4 = (((((Float.floatToIntBits(this.A00) + ((Float.floatToIntBits(this.A04) + ((Float.floatToIntBits(this.A05) + ((((((Arrays.hashCode(textPaint.drawableState) + floatToIntBits3) * 31) + this.A0C) * 31) + this.A0B) * 31)) * 31)) * 31)) * 31) + (this.A0J ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31;
        TextUtils.TruncateAt truncateAt = this.A0G;
        if (truncateAt != null) {
            i2 = truncateAt.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((((floatToIntBits4 + i2) * 31) + (this.A0M ? 1 : 0)) * 31) + this.A0A) * 31;
        Layout.Alignment alignment = this.A0E;
        if (alignment != null) {
            i3 = alignment.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        AbstractC06520Tq r0 = this.A0H;
        if (r0 != null) {
            i4 = r0.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = (Arrays.hashCode((int[]) null) + ((Arrays.hashCode((int[]) null) + ((((((i7 + i4) * 31) + this.A06) * 31) + this.A07) * 31)) * 31)) * 31;
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            i5 = charSequence.hashCode();
        }
        return hashCode + i5;
    }
}
