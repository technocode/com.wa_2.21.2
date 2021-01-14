package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0jD  reason: invalid class name and case insensitive filesystem */
public class C12870jD implements Drawable.Callback {
    public Drawable.Callback A00;

    public void invalidateDrawable(Drawable drawable) {
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.A00;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.A00;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
