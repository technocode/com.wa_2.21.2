package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;

/* renamed from: X.0mJ  reason: invalid class name and case insensitive filesystem */
public class C14460mJ {
    public static C14460mJ A00(Activity activity, AnonymousClass02R... r6) {
        if (Build.VERSION.SDK_INT < 21) {
            return new C14460mJ();
        }
        Pair[] pairArr = null;
        if (r6 != null) {
            int length = r6.length;
            pairArr = new Pair[length];
            for (int i = 0; i < length; i++) {
                AnonymousClass02R r0 = r6[i];
                pairArr[i] = Pair.create(r0.A00, r0.A01);
            }
        }
        return new C29901aO(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public Bundle A01() {
        if (!(this instanceof C29901aO)) {
            return null;
        }
        return ((C29901aO) this).A00.toBundle();
    }
}
