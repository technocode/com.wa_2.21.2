package com.whatsapp.biz.catalog;

import X.C27811Rn;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class CarouselScrollbarView extends View {
    public RecyclerView A00;
    public boolean A01 = false;
    public final C27811Rn A02;

    public CarouselScrollbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C27811Rn r0 = new C27811Rn(context);
        this.A02 = r0;
        r0.setCallback(this);
    }

    public final void A00() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            int computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            int computeHorizontalScrollOffset = this.A00.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = this.A00.computeHorizontalScrollRange();
            if (computeHorizontalScrollExtent < computeHorizontalScrollRange) {
                int width = (getWidth() * computeHorizontalScrollExtent) / computeHorizontalScrollRange;
                int width2 = ((getWidth() - width) * computeHorizontalScrollOffset) / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
                C27811Rn r1 = this.A02;
                if (!(r1.A01 == width2 && r1.A00 == width)) {
                    r1.A00 = width;
                    r1.A01 = width2;
                    r1.A00();
                }
                this.A01 = true;
                return;
            }
            C27811Rn r2 = this.A02;
            if (!(r2.A01 == 0 && r2.A00 == 0)) {
                r2.A00 = 0;
                r2.A01 = 0;
                r2.A00();
            }
            this.A01 = false;
            return;
        }
        throw null;
    }

    public void onDraw(Canvas canvas) {
        if (this.A01) {
            C27811Rn r1 = this.A02;
            r1.A03.draw(canvas);
            r1.A02.draw(canvas);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.A02.setBounds(0, 0, i, i2);
        A00();
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.A02 == drawable;
    }
}
