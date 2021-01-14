package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.0mK  reason: invalid class name and case insensitive filesystem */
public final class C14470mK implements Application.ActivityLifecycleCallbacks {
    public Activity A00;
    public Object A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public C14470mK(Activity activity) {
        this.A00 = activity;
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.A00 == activity) {
            this.A00 = null;
            this.A02 = true;
        }
    }

    public void onActivityPaused(Activity activity) {
        if (this.A02 && !this.A04 && !this.A03) {
            Object obj = this.A01;
            try {
                Object obj2 = C14480mL.A03.get(activity);
                if (obj2 == obj) {
                    C14480mL.A00.postAtFrontOfQueue(new RunnableEBaseShape5S0200000_I1_0(C14480mL.A02.get(activity), obj2, 5));
                    this.A04 = true;
                    this.A01 = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        if (this.A00 == activity) {
            this.A03 = true;
        }
    }
}
