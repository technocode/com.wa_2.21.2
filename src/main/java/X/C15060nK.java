package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;

/* renamed from: X.0nK  reason: invalid class name and case insensitive filesystem */
public class C15060nK extends AccessibilityNodeProvider {
    public final C07750Zj A00;

    public C15060nK(C07750Zj r1) {
        this.A00 = r1;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C07890a3 r1;
        C07750Zj r12 = this.A00;
        if (!(r12 instanceof C07760Zk)) {
            r1 = null;
        } else {
            r1 = new C07890a3(AccessibilityNodeInfo.obtain(((C07760Zk) r12).A00.A03(i).A02));
        }
        if (r1 == null) {
            return null;
        }
        return r1.A02;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i) {
        if (this.A00 != null) {
            return null;
        }
        throw null;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        C07750Zj r1 = this.A00;
        if (!(r1 instanceof C07760Zk)) {
            return false;
        }
        AnonymousClass0Pz r2 = ((C07760Zk) r1).A00;
        if (i == -1) {
            return r2.A06.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return r2.A0A(i);
        }
        if (i2 == 2) {
            return r2.A09(i);
        }
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = r2.A07;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = r2.A00) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE && i3 == i3) {
                r2.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                r2.A06.invalidate();
                r2.A05(i3, 65536);
            }
            r2.A00 = i;
            r2.A06.invalidate();
            r2.A05(i, 32768);
            return true;
        } else if (i2 != 128) {
            return r2.A0B(i, i2, bundle);
        } else {
            if (r2.A00 != i) {
                return false;
            }
            r2.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            r2.A06.invalidate();
            r2.A05(i, 65536);
            return true;
        }
    }
}
