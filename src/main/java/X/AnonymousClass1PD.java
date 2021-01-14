package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.1PD  reason: invalid class name */
public class AnonymousClass1PD implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        if (this instanceof C52142ae) {
            C52142ae r2 = (C52142ae) this;
            AnonymousClass02J r1 = r2.A04;
            if (r1.A00) {
                r2.A00();
                r1.A00 = false;
            }
        } else if (this instanceof AnonymousClass2ZC) {
            AnonymousClass2ZC r0 = (AnonymousClass2ZC) this;
            r0.A00();
            r0.A08.setSelected(true);
        }
    }
}
