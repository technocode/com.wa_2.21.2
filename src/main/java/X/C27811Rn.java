package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Rn  reason: invalid class name and case insensitive filesystem */
public class C27811Rn extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final Drawable A03;

    public int getOpacity() {
        return -3;
    }

    public C27811Rn(Context context) {
        Drawable A032 = C004302a.A03(context, R.drawable.carousel_scrollbar_track);
        if (A032 != null) {
            this.A03 = A032;
            A032.setCallback(this);
            Drawable A033 = C004302a.A03(context, R.drawable.carousel_scrollbar_thumb);
            if (A033 != null) {
                this.A02 = A033;
                A033.setCallback(this);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A00() {
        Rect bounds = getBounds();
        this.A03.setBounds(bounds);
        Drawable drawable = this.A02;
        int i = bounds.left + this.A01;
        drawable.setBounds(i, bounds.top, i + this.A00, bounds.bottom);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.A03.draw(canvas);
        this.A02.draw(canvas);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        A00();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
