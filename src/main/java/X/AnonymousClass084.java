package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.084  reason: invalid class name */
public class AnonymousClass084 extends Fragment {
    public AnonymousClass081 A00;

    public static void A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new AnonymousClass0WV());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new AnonymousClass084(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static void A01(Activity activity, AnonymousClass082 r2) {
        if (activity instanceof AbstractC005102k) {
            AbstractC013907w A75 = ((AbstractC005102k) activity).A75();
            if (A75 instanceof C013807v) {
                ((C013807v) A75).A04(r2);
            }
        }
    }

    public final void A02(AnonymousClass082 r3) {
        if (Build.VERSION.SDK_INT < 29) {
            A01(getActivity(), r3);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A02(AnonymousClass082.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        A02(AnonymousClass082.ON_DESTROY);
        this.A00 = null;
    }

    public void onPause() {
        super.onPause();
        A02(AnonymousClass082.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        AnonymousClass081 r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass080) r0).A00.A00();
        }
        A02(AnonymousClass082.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        AnonymousClass081 r0 = this.A00;
        if (r0 != null) {
            C013707u r2 = ((AnonymousClass080) r0).A00;
            int i = r2.A01 + 1;
            r2.A01 = i;
            if (i == 1 && r2.A06) {
                r2.A07.A04(AnonymousClass082.ON_START);
                r2.A06 = false;
            }
        }
        A02(AnonymousClass082.ON_START);
    }

    public void onStop() {
        super.onStop();
        A02(AnonymousClass082.ON_STOP);
    }
}
