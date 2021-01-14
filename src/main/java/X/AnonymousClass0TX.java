package X;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* renamed from: X.0TX  reason: invalid class name */
public class AnonymousClass0TX extends C004302a {
    public static View A0A(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return activity.requireViewById(i);
        }
        View findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void A0B(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void A0C(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void A0D(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C14480mL.A00(activity)) {
            activity.recreate();
        }
    }

    public static void A0E(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    public static void A0F(Activity activity, AbstractC14640md r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(new SharedElementCallbackC14450mI(r3));
        }
    }

    public static void A0G(Activity activity, AbstractC14640md r3) {
        SharedElementCallbackC14450mI r0;
        if (Build.VERSION.SDK_INT >= 21) {
            if (r3 != null) {
                r0 = new SharedElementCallbackC14450mI(r3);
            } else {
                r0 = null;
            }
            activity.setExitSharedElementCallback(r0);
        }
    }

    public static void A0H(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof AbstractC005702r) {
                ((AbstractC005702r) activity).AR1(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof AbstractC005602q) {
            new Handler(Looper.getMainLooper()).post(new RunnableEBaseShape0S0201000_I0(activity, i, strArr, 0));
        }
    }

    public static boolean A0I(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
