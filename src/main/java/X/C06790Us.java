package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.0Us  reason: invalid class name and case insensitive filesystem */
public class C06790Us {
    public static final C06790Us A04 = new C06790Us(16, null);
    public static final C06790Us A05 = new C06790Us(32, null);
    public static final C06790Us A06 = new C06790Us(8192, null);
    public static final C06790Us A07;
    public static final C06790Us A08 = new C06790Us(4096, null);
    public static final C06790Us A09;
    public final int A00;
    public final AbstractC06800Ut A01;
    public final Class A02;
    public final Object A03;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(1, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(2, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(4, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(8, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(64, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(128, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(256, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(512, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(1024, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(2048, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(16384, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(32768, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(65536, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(131072, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(262144, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(524288, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(1048576, null);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        if (i >= 21 && accessibilityAction == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908342, null);
        }
        if (i >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        if (i >= 21 && accessibilityAction2 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908343, null);
        }
        if (i >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        A09 = new C06790Us(accessibilityAction3, 16908344, null, null, null);
        if (i >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        if (i >= 21 && accessibilityAction4 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908345, null);
        }
        if (i >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        A07 = new C06790Us(accessibilityAction5, 16908346, null, null, null);
        if (i >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        if (i >= 21 && accessibilityAction6 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908347, null);
        }
        if (i >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        if (i >= 21 && accessibilityAction7 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908358, null);
        }
        if (i >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        if (i >= 21 && accessibilityAction8 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908359, null);
        }
        if (i >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        if (i >= 21 && accessibilityAction9 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908360, null);
        }
        if (i >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        if (i >= 21 && accessibilityAction10 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908361, null);
        }
        if (i >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        if (i >= 21 && accessibilityAction11 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908348, null);
        }
        if (i >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        if (i >= 21 && accessibilityAction12 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908349, null);
        }
        if (i >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        if (i >= 21 && accessibilityAction13 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908354, null);
        }
        if (i >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction14 = null;
        }
        if (i >= 21 && accessibilityAction14 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908356, null);
        }
        if (i >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction15 = null;
        }
        if (i >= 21 && accessibilityAction15 == null) {
            new AccessibilityNodeInfo.AccessibilityAction(16908357, null);
        }
    }

    public C06790Us(int i, CharSequence charSequence) {
        this(null, i, charSequence, null, null);
    }

    public C06790Us(Object obj, int i, CharSequence charSequence, AbstractC06800Ut r6, Class cls) {
        this.A00 = i;
        this.A01 = r6;
        if (Build.VERSION.SDK_INT < 21 || obj != null) {
            this.A03 = obj;
        } else {
            this.A03 = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        }
        this.A02 = cls;
    }

    public int A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.A03).getId();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C06790Us)) {
            return false;
        }
        Object obj2 = this.A03;
        Object obj3 = ((C06790Us) obj).A03;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
            return true;
        } else if (!obj2.equals(obj3)) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        Object obj = this.A03;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
