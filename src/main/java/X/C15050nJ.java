package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0nJ  reason: invalid class name and case insensitive filesystem */
public class C15050nJ {
    public final Object A00;

    public C15050nJ(Object obj) {
        this.A00 = obj;
    }

    public static C15050nJ A00(int i, int i2, int i3, int i4, boolean z) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            return new C15050nJ(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, false));
        }
        if (i5 >= 19) {
            return new C15050nJ(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }
        return new C15050nJ(null);
    }
}
