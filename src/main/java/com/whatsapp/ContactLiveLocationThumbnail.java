package com.whatsapp;

import X.AnonymousClass008;
import X.C07990aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;

public class ContactLiveLocationThumbnail extends ThumbnailButton {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final RectF A04 = new RectF();

    public ContactLiveLocationThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A0k);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            this.A02 = obtainStyledAttributes.getInteger(2, this.A02);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.whatsapp.components.button.ThumbnailButton
    public void A02(Canvas canvas) {
        RectF rectF = this.A04;
        rectF.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f = this.A00;
        if (f > 0.0f && this.A01 != 0) {
            float f2 = f / 2.0f;
            rectF.inset(f2, f2);
            this.A05.setColor(this.A01);
            this.A05.setStrokeWidth(this.A00);
            this.A05.setStyle(Paint.Style.STROKE);
            float f3 = super.A02;
            if (f3 >= 0.0f) {
                canvas.drawRoundRect(rectF, f3, f3, this.A05);
            } else {
                canvas.drawOval(rectF, this.A05);
            }
            float f4 = this.A00 / 2.0f;
            rectF.inset(f4, f4);
        }
        float f5 = ((ThumbnailButton) this).A01;
        if (f5 > 0.0f && super.A03 != 0) {
            float f6 = f5 / 2.0f;
            rectF.inset(f6, f6);
            this.A05.setColor(super.A03);
            this.A05.setStrokeWidth(((ThumbnailButton) this).A01);
            this.A05.setStyle(Paint.Style.STROKE);
            float f7 = super.A02;
            if (f7 >= 0.0f) {
                canvas.drawRoundRect(rectF, f7, f7, this.A05);
            } else {
                canvas.drawOval(rectF, this.A05);
            }
            float f8 = ((ThumbnailButton) this).A01 / 2.0f;
            rectF.inset(f8, f8);
        }
        if (this.A03) {
            this.A05.setColor(getResources().getColor(R.color.live_location_no_avatar_overlay));
            this.A05.setStyle(Paint.Style.FILL);
            float f9 = super.A02;
            if (f9 >= 0.0f) {
                canvas.drawRoundRect(rectF, f9, f9, this.A05);
            } else {
                canvas.drawOval(rectF, this.A05);
            }
        }
        if (this.A02 > 1) {
            this.A05.setColor(1107296256);
            this.A05.setStyle(Paint.Style.FILL);
            float f10 = super.A02;
            if (f10 >= 0.0f) {
                canvas.drawRoundRect(rectF, f10, f10, this.A05);
            } else {
                canvas.drawOval(rectF, this.A05);
            }
            this.A05.setTextAlign(Paint.Align.CENTER);
            this.A05.setColor(-1);
            this.A05.setTextSize((float) getResources().getDimensionPixelSize(R.dimen.title_text_size));
            canvas.drawText(AnonymousClass008.A0N(new StringBuilder(), this.A02, ""), rectF.centerX(), rectF.centerY() - ((this.A05.descent() + this.A05.ascent()) / 2.0f), this.A05);
        }
    }

    public void setGlowColor(int i) {
        this.A01 = i;
    }

    public void setGlowSize(float f) {
        this.A00 = f;
    }

    public void setGreyOverlay(boolean z) {
        this.A03 = z;
    }

    public void setStackSize(int i) {
        this.A02 = i;
    }
}
