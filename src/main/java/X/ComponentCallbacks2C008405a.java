package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.05a  reason: invalid class name and case insensitive filesystem */
public final class ComponentCallbacks2C008405a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final ComponentCallbacks2C008405a A04 = new ComponentCallbacks2C008405a();
    public boolean A00 = false;
    public final ArrayList A01 = new ArrayList();
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final AtomicBoolean A03 = new AtomicBoolean();

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public static void A00(Application application) {
        ComponentCallbacks2C008405a r1 = A04;
        synchronized (r1) {
            if (!r1.A00) {
                application.registerActivityLifecycleCallbacks(r1);
                application.registerComponentCallbacks(r1);
                r1.A00 = true;
            }
        }
    }

    public final void A01(boolean z) {
        synchronized (A04) {
            ArrayList arrayList = this.A01;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((AnonymousClass05Z) obj).ADH(z);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.A02.compareAndSet(true, false);
        this.A03.set(true);
        if (compareAndSet) {
            A01(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.A02.compareAndSet(true, false);
        this.A03.set(true);
        if (compareAndSet) {
            A01(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.A02.compareAndSet(false, true)) {
            this.A03.set(true);
            A01(true);
        }
    }
}
