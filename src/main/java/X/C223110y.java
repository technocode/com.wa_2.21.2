package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.10y  reason: invalid class name and case insensitive filesystem */
public class C223110y implements Application.ActivityLifecycleCallbacks {
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

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (C223210z.A01.containsKey(activity)) {
            throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Map map = C223210z.A01;
        map.remove(activity);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Context context = (Context) ((Map.Entry) it.next()).getKey();
            while (true) {
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == activity) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        WeakHashMap weakHashMap = C223210z.A02;
        Activity activity2 = activity;
        while ((activity2 instanceof ContextWrapper) && !(activity2 instanceof Activity) && !(activity2 instanceof Application) && !(activity2 instanceof Service)) {
            activity2 = activity2.getBaseContext();
        }
        weakHashMap.put(activity2, Boolean.TRUE);
    }
}
