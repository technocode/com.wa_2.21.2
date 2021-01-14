package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.1cA  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC30911cA extends AbstractC09350ck {
    public static final String[] A01 = {"android:visibility:visibility", "android:visibility:parent"};
    public int A00 = 3;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (r9 == null) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C17370rQ A02(X.C17280rH r8, X.C17280rH r9) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC30911cA.A02(X.0rH, X.0rH):X.0rQ");
    }

    public static final void A03(C17280rH r3) {
        int visibility = r3.A00.getVisibility();
        Map map = r3.A02;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", r3.A00.getParent());
        int[] iArr = new int[2];
        r3.A00.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (A02(A09(r0, false), A0A(r0, false)).A05 != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016b, code lost:
        if (r4 == null) goto L_0x00f1;
     */
    @Override // X.AbstractC09350ck
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A0T(android.view.ViewGroup r21, X.C17280rH r22, X.C17280rH r23) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC30911cA.A0T(android.view.ViewGroup, X.0rH, X.0rH):android.animation.Animator");
    }

    public Animator A0U(ViewGroup viewGroup, View view, C17280rH r15, C17280rH r16) {
        float f;
        Number number;
        if (!(this instanceof AnonymousClass24J)) {
            AnonymousClass24C r2 = (AnonymousClass24C) this;
            C17340rN.A04.A02(view);
            if (r15 == null || (number = (Number) r15.A02.get("android:fade:transitionAlpha")) == null) {
                f = 1.0f;
            } else {
                f = number.floatValue();
            }
            return r2.A0V(view, f, 0.0f);
        }
        AnonymousClass24J r22 = (AnonymousClass24J) this;
        if (r15 == null) {
            return null;
        }
        int[] iArr = (int[]) r15.A02.get("android:slide:screenPosition");
        return AnonymousClass24J.A04(view, r15, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), r22.A00.A6Y(viewGroup, view), r22.A00.A6Z(viewGroup, view), AnonymousClass24J.A01);
    }
}
