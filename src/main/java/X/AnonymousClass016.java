package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: X.016  reason: invalid class name */
public class AnonymousClass016 extends Resources {
    public static boolean A01;
    public final WeakReference A00;

    public AnonymousClass016(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.A00 = new WeakReference(context);
    }

    public static boolean A00() {
        return A01 && Build.VERSION.SDK_INT <= 20;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = (Context) this.A00.get();
        if (context == null) {
            return super.getDrawable(i);
        }
        AnonymousClass0TZ A012 = AnonymousClass0TZ.A01();
        synchronized (A012) {
            Drawable A04 = A012.A04(context, i);
            if (A04 == null) {
                A04 = super.getDrawable(i);
            }
            if (A04 == null) {
                return null;
            }
            return A012.A07(context, i, false, A04);
        }
    }
}
