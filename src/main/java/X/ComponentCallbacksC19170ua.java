package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.0ua  reason: invalid class name and case insensitive filesystem */
public class ComponentCallbacksC19170ua implements ComponentCallbacks {
    public final /* synthetic */ C32061eH A00;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public ComponentCallbacksC19170ua(C32061eH r1) {
        this.A00 = r1;
    }

    public void onLowMemory() {
        this.A00.A04();
    }
}
