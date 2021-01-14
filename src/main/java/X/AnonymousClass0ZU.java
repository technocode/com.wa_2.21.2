package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.0ZU  reason: invalid class name */
public class AnonymousClass0ZU extends AnonymousClass0ZV {
    public final WeakReference A00;

    public AnonymousClass0ZU(Context context, Resources resources) {
        super(resources);
        this.A00 = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.A00.getDrawable(i);
        Context context = (Context) this.A00.get();
        if (!(drawable == null || context == null)) {
            AnonymousClass0TZ.A01().A0A(context, i, drawable);
        }
        return drawable;
    }
}
