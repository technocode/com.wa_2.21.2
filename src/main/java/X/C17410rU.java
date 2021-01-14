package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.0rU  reason: invalid class name and case insensitive filesystem */
public class C17410rU implements Drawable.Callback {
    public final /* synthetic */ AnonymousClass24Q A00;

    public C17410rU(AnonymousClass24Q r1) {
        this.A00 = r1;
    }

    public void invalidateDrawable(Drawable drawable) {
        this.A00.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.A00.scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.A00.unscheduleSelf(runnable);
    }
}
