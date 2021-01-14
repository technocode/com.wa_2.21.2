package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.083  reason: invalid class name */
public class AnonymousClass083 extends C013607t {
    public final /* synthetic */ C013707u this$0;

    public AnonymousClass083(C013707u r1) {
        this.this$0 = r1;
    }

    @Override // X.C013607t
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            ((AnonymousClass084) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).A00 = this.this$0.A03;
        }
    }

    @Override // X.C013607t
    public void onActivityPaused(Activity activity) {
        C013707u r1 = this.this$0;
        int i = r1.A00 - 1;
        r1.A00 = i;
        if (i == 0) {
            r1.A02.postDelayed(r1.A04, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new AnonymousClass085(this));
    }

    @Override // X.C013607t
    public void onActivityStopped(Activity activity) {
        C013707u r3 = this.this$0;
        int i = r3.A01 - 1;
        r3.A01 = i;
        if (i == 0 && r3.A05) {
            r3.A07.A04(AnonymousClass082.ON_STOP);
            r3.A06 = true;
        }
    }
}
