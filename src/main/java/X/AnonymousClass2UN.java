package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.2UN  reason: invalid class name */
public class AnonymousClass2UN extends BitmapDrawable {
    public final AnonymousClass0M3 A00;

    public AnonymousClass2UN(AnonymousClass0M3 r1, Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.A00 = r1;
    }

    public int getIntrinsicHeight() {
        AnonymousClass0M4 r0 = this.A00.A02;
        if (r0 != null) {
            int i = r0.A06;
            return i <= 0 ? super.getIntrinsicHeight() : i;
        }
        throw null;
    }

    public int getIntrinsicWidth() {
        AnonymousClass0M4 r0 = this.A00.A02;
        if (r0 != null) {
            int i = r0.A08;
            return i <= 0 ? super.getIntrinsicWidth() : i;
        }
        throw null;
    }
}
