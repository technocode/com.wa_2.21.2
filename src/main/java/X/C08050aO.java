package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0aO  reason: invalid class name and case insensitive filesystem */
public class C08050aO {
    public final AnonymousClass05W A00 = new AnonymousClass05W();

    public static C08050aO A00(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return A02(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return A02(arrayList);
        } catch (Exception e) {
            StringBuilder A0S = AnonymousClass008.A0S("Can't load animation resource ID #0x");
            A0S.append(Integer.toHexString(i));
            Log.w("MotionSpec", A0S.toString(), e);
            return null;
        }
    }

    public static C08050aO A01(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return A00(context, resourceId);
    }

    public static C08050aO A02(List list) {
        C08050aO r5 = new C08050aO();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C08060aP.A02;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C08060aP.A01;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C08060aP.A04;
                }
                C08070aQ r6 = new C08070aQ(startDelay, duration, interpolator);
                r6.A00 = objectAnimator.getRepeatCount();
                r6.A01 = objectAnimator.getRepeatMode();
                r5.A00.put(propertyName, r6);
            } else {
                StringBuilder sb = new StringBuilder("Animator must be an ObjectAnimator: ");
                sb.append(animator);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return r5;
    }

    public C08070aQ A03(String str) {
        AnonymousClass05W r2 = this.A00;
        if (r2.getOrDefault(str, null) != null) {
            return (C08070aQ) r2.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C08050aO.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C08050aO) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C08050aO.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.A00);
        sb.append("}\n");
        return sb.toString();
    }
}
