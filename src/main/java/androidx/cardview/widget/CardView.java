package androidx.cardview.widget;

import X.AbstractC13770kz;
import X.AbstractC13780l0;
import X.AnonymousClass1a2;
import X.AnonymousClass23X;
import X.C13760kx;
import X.C29711a4;
import X.C29731a6;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;

public class CardView extends FrameLayout {
    public static final AbstractC13780l0 A07;
    public static final int[] A08 = {16842801};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final Rect A04 = new Rect();
    public final Rect A05 = new Rect();
    public final AbstractC13770kz A06 = new AnonymousClass1a2(this);

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        AbstractC13780l0 r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            r0 = new C29711a4();
            A07 = r0;
        } else if (i >= 17) {
            r0 = new AnonymousClass23X();
            A07 = r0;
        } else {
            r0 = new C29731a6();
            A07 = r0;
        }
        r0.AAk();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13760kx.A00, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A08);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A02 = obtainStyledAttributes.getBoolean(7, false);
        this.A03 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.A04.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.A04.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        this.A04.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.A04.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        A07.AAo(this.A06, context, valueOf, dimension, dimension2, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return A07.A4s(this.A06);
    }

    public float getCardElevation() {
        return A07.A6A(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A07.A7E(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A07.A8e(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    public void onMeasure(int i, int i2) {
        AbstractC13780l0 r6 = A07;
        if (!(r6 instanceof C29711a4)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) r6.A7Y(this.A06)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) r6.A7W(this.A06)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        A07.ANw(this.A06, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A07.ANw(this.A06, colorStateList);
    }

    public void setCardElevation(float f) {
        A07.AOD(this.A06, f);
    }

    public void setMaxCardElevation(float f) {
        A07.AOV(this.A06, f);
    }

    public void setMinimumHeight(int i) {
        this.A00 = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.A01 = i;
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            A07.AIl(this.A06);
        }
    }

    public void setRadius(float f) {
        A07.AOw(this.A06, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            A07.AEN(this.A06);
        }
    }
}
