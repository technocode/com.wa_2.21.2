package com.whatsapp.biz.catalog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;

public class CatalogListImageFrame extends FrameLayout {
    public final Drawable A00 = getResources().getDrawable(R.drawable.album_card_bottom);
    public final Drawable A01 = getResources().getDrawable(R.drawable.album_card_top);

    public CatalogListImageFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable = this.A01;
        drawable.setBounds(0, getPaddingTop() - drawable.getIntrinsicHeight(), getWidth(), getPaddingTop());
        drawable.draw(canvas);
        Drawable drawable2 = this.A00;
        drawable2.setBounds(0, getHeight() - getPaddingBottom(), getWidth(), drawable2.getIntrinsicHeight() + (getHeight() - getPaddingBottom()));
        drawable2.draw(canvas);
        super.onDraw(canvas);
    }
}
