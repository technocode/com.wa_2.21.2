package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.0WV  reason: invalid class name */
public class AnonymousClass0WV implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AnonymousClass084.A01(activity, AnonymousClass082.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        AnonymousClass084.A01(activity, AnonymousClass082.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        AnonymousClass084.A01(activity, AnonymousClass082.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        AnonymousClass084.A01(activity, AnonymousClass082.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        AnonymousClass084.A01(activity, AnonymousClass082.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        AnonymousClass084.A01(activity, AnonymousClass082.ON_STOP);
    }
}
