package com.whatsapp.components;

import X.AnonymousClass0Q7;
import X.C002001d;
import X.C004402b;
import X.C06140Ry;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;

public class Button extends WaButton {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public final Paint A05 = new Paint(1);
    public final Rect A06 = new Rect();
    public final RectF A07 = new RectF();

    public Button(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        int i;
        int i2;
        ColorStateList colorStateList;
        Resources.Theme theme = context.getTheme();
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.button_stroke_width);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.button_inset_horizontal);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.button_inset_vertical);
        this.A05.setStyle(Paint.Style.STROKE);
        this.A05.setStrokeWidth((float) this.A03);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C06140Ry.A0O, R.attr.buttonStyle, 2131952307);
        if (obtainStyledAttributes.hasValue(2)) {
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(2);
            this.A04 = colorStateList2;
            if (colorStateList2 != null) {
                this.A05.setColor(colorStateList2.getColorForState(getDrawableState(), 0));
            }
        }
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(R.dimen.control_corner_material));
        if (Build.VERSION.SDK_INT < 21) {
            if (!obtainStyledAttributes.hasValue(1) || (colorStateList = obtainStyledAttributes.getColorStateList(1)) == null) {
                i = 0;
                i2 = 0;
            } else {
                i2 = colorStateList.getDefaultColor();
                i = colorStateList.getColorForState(new int[]{-16842910}, i2);
            }
            int A022 = C004402b.A02(C002001d.A06(context, R.attr.colorControlHighlight, R.color.buttonPressOverlay), i2);
            AnonymousClass0Q7.A0a(this, new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842910}, new int[]{16842908, 16842919}, new int[]{-16842910}, new int[0]}, new int[]{A022, i2, A022, i, i2}));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // X.C29581Zk
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.A04;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Paint paint = this.A05;
            if (colorForState != paint.getColor()) {
                paint.setColor(colorForState);
                invalidate();
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null && this.A04 != null && this.A03 > 0) {
            Rect rect = this.A06;
            rect.set(getBackground().getBounds());
            RectF rectF = this.A07;
            float f = (float) rect.left;
            float f2 = ((float) this.A03) / 2.0f;
            float f3 = (float) this.A01;
            float f4 = f2 + ((float) rect.top);
            float f5 = (float) this.A02;
            rectF.set(f2 + f + f3, f4 + f5, (((float) rect.right) - f2) - f3, (((float) rect.bottom) - f2) - f5);
            float f6 = ((float) this.A00) - (((float) this.A03) / 2.0f);
            canvas.drawRoundRect(rectF, f6, f6, this.A05);
        }
    }
}
