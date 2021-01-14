package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.0ZT  reason: invalid class name */
public class AnonymousClass0ZT extends ContextWrapper {
    public static ArrayList A02;
    public static final Object A03 = new Object();
    public final Resources.Theme A00;
    public final Resources A01;

    public AnonymousClass0ZT(Context context) {
        super(context);
        if (AnonymousClass016.A00()) {
            AnonymousClass016 r0 = new AnonymousClass016(this, context.getResources());
            this.A01 = r0;
            Resources.Theme newTheme = r0.newTheme();
            this.A00 = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.A01 = new AnonymousClass0ZU(this, context.getResources());
    }

    public static Context A00(Context context) {
        AnonymousClass0ZT r1;
        if ((context instanceof AnonymousClass0ZT) || (context.getResources() instanceof AnonymousClass0ZU) || (context.getResources() instanceof AnonymousClass016) || (Build.VERSION.SDK_INT >= 21 && !AnonymousClass016.A00())) {
            return context;
        }
        synchronized (A03) {
            ArrayList arrayList = A02;
            if (arrayList == null) {
                A02 = new ArrayList();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) arrayList.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        arrayList.remove(size);
                    }
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) A02.get(size2);
                    if (!(weakReference2 == null || (r1 = (AnonymousClass0ZT) weakReference2.get()) == null || r1.getBaseContext() != context)) {
                        return r1;
                    }
                }
            }
            AnonymousClass0ZT r2 = new AnonymousClass0ZT(context);
            A02.add(new WeakReference(r2));
            return r2;
        }
    }

    public AssetManager getAssets() {
        return this.A01.getAssets();
    }

    public Resources getResources() {
        return this.A01;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.A00;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.A00;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
