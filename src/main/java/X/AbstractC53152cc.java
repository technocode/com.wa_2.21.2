package X;

import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.2cc  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC53152cc extends AbstractC48582Mw {
    @Override // X.AbstractC48582Mw
    public void A0E(RectF rectF, float f, float f2, float f3, float f4) {
        float width;
        if (this instanceof C59472nj) {
            C59472nj r3 = (C59472nj) this;
            Drawable drawable = r3.A02;
            if (drawable == null) {
                width = 0.0f;
            } else if (drawable instanceof C71913Qu) {
                width = ((float) drawable.getBounds().right) / ((float) r3.A02.getBounds().bottom);
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                width = ((float) bitmapDrawable.getBitmap().getWidth()) / ((float) bitmapDrawable.getBitmap().getHeight());
            }
        } else if (this instanceof C59462ni) {
            C59462ni r32 = (C59462ni) this;
            BitmapDrawable bitmapDrawable2 = r32.A00;
            if (bitmapDrawable2 == null) {
                width = 0.0f;
            } else {
                width = ((float) bitmapDrawable2.getBitmap().getWidth()) / ((float) r32.A00.getBitmap().getHeight());
            }
        } else if (!(this instanceof C59452nh)) {
            AbstractC59482nk r33 = (AbstractC59482nk) this;
            if (r33 instanceof C60502pa) {
                C60502pa r34 = (C60502pa) r33;
                Picture picture = r34.A03;
                width = (picture == null || picture.getHeight() == 0) ? 0.0f : ((float) r34.A03.getWidth()) / ((float) r34.A03.getHeight());
            } else if (!(r33 instanceof C60482pY)) {
                width = 0.0f;
            } else {
                C60482pY r35 = (C60482pY) r33;
                Picture picture2 = r35.A04;
                width = ((picture2 == null && (picture2 = r35.A05) == null) || picture2.getHeight() == 0) ? 0.0f : ((float) picture2.getWidth()) / ((float) picture2.getHeight());
            }
        } else {
            width = ((C59452nh) this).A00 / 116.0f;
        }
        if (width != 0.0f) {
            float f5 = f3 - f;
            float f6 = f4 - f2;
            if (f5 / f6 < width) {
                f6 = f5 / width;
            } else {
                f5 = f6 * width;
            }
            float f7 = (f + f3) / 2.0f;
            float f8 = (f2 + f4) / 2.0f;
            float f9 = f5 / 2.0f;
            float f10 = f6 / 2.0f;
            super.A0E(rectF, f7 - f9, f8 - f10, f7 + f9, f8 + f10);
            return;
        }
        super.A0E(rectF, f, f2, f3, f4);
    }
}
