package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.1uU  reason: invalid class name and case insensitive filesystem */
public final class C41111uU extends AnonymousClass0Q0 {
    public final /* synthetic */ String A00 = "Button";

    @Override // X.AnonymousClass0Q0
    public void A01(View view, C07890a3 r6) {
        View.AccessibilityDelegate accessibilityDelegate = this.A01;
        AccessibilityNodeInfo accessibilityNodeInfo = r6.A02;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        String str = this.A00;
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
        }
    }
}
