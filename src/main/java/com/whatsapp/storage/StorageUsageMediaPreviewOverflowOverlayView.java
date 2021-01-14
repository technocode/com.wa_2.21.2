package com.whatsapp.storage;

import X.C004302a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;

public class StorageUsageMediaPreviewOverflowOverlayView extends View {
    public Drawable A00;

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackgroundColor(C004302a.A00(context, R.color.black_alpha_40));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.A00.draw(canvas);
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A00 = drawable;
        invalidate();
    }
}
