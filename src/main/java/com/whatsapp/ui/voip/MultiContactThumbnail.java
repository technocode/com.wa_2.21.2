package com.whatsapp.ui.voip;

import X.AbstractC12270hp;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01X;
import X.AnonymousClass0YX;
import X.C007003k;
import X.C07990aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

public class MultiContactThumbnail extends ViewGroup {
    public float A00 = 0.0f;
    public int A01;
    public int A02;
    public Canvas A03;
    public Paint A04;
    public RectF A05;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public MultiContactThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C07990aH.A1Y);
            this.A00 = obtainStyledAttributes.getDimension(1, 0.0f);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, this.A02);
            obtainStyledAttributes.recycle();
        }
        int i = ((int) this.A00) << 1;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        this.A03 = new Canvas(createBitmap);
        float f = (float) i;
        this.A05 = new RectF(0.0f, 0.0f, f, f);
        this.A04 = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A04.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        setWillNotDraw(false);
    }

    public void A00(List list, AnonymousClass0YX r7, AbstractC12270hp r8) {
        boolean z = true;
        if (list.size() < 1) {
            z = false;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Value %d out of bounds for numImages");
        A0S.append(this.A01);
        AnonymousClass00E.A08(z, A0S.toString());
        int i = 4;
        if (list.size() <= 4) {
            i = list.size();
        }
        setNumImages(i);
        for (int i2 = 0; i2 < i; i2++) {
            r7.A04((C007003k) list.get(i2), (ImageView) getChildAt(i2), false, r8);
        }
    }

    public void draw(Canvas canvas) {
        this.A03.drawColor(0, PorterDuff.Mode.CLEAR);
        super.draw(this.A03);
        RectF rectF = this.A05;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r0 <= 1) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ui.voip.MultiContactThumbnail.onLayout(boolean, int, int, int, int):void");
    }

    private void setNumImages(int i) {
        if (i == this.A01) {
            invalidate();
            return;
        }
        if (i <= getChildCount()) {
            int childCount = getChildCount() - i;
            int childCount2 = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt((childCount2 - 1) - i2).setVisibility(8);
            }
        } else {
            int childCount3 = i - getChildCount();
            for (int i3 = 0; i3 < childCount3; i3++) {
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                addView(imageView);
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 0) {
                childAt.setVisibility(0);
            }
        }
        this.A01 = i;
    }
}
