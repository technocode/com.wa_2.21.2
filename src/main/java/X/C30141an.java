package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.1an  reason: invalid class name and case insensitive filesystem */
public class C30141an extends C15060nK {
    public C30141an(C07750Zj r1) {
        super(r1);
    }

    public AccessibilityNodeInfo findFocus(int i) {
        C07890a3 r1;
        C07750Zj r12 = this.A00;
        if (!(r12 instanceof C07760Zk)) {
            r1 = null;
        } else {
            AnonymousClass0Pz r2 = ((C07760Zk) r12).A00;
            int i2 = i == 2 ? r2.A00 : r2.A01;
            if (i2 == Integer.MIN_VALUE) {
                r1 = null;
            } else {
                r1 = new C07890a3(AccessibilityNodeInfo.obtain(r2.A03(i2).A02));
            }
        }
        if (r1 == null) {
            return null;
        }
        return r1.A02;
    }
}
