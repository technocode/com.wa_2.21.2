package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.1p7  reason: invalid class name and case insensitive filesystem */
public class C37981p7 extends AnonymousClass0Q0 {
    public final /* synthetic */ AnonymousClass06c A00;

    public C37981p7(AnonymousClass06c r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0Q0
    public void A01(View view, C07890a3 r9) {
        View.AccessibilityDelegate accessibilityDelegate = this.A01;
        AccessibilityNodeInfo accessibilityNodeInfo = r9.A02;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AnonymousClass06c r2 = this.A00;
        String str = r2.A01;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
        String str2 = r2.A02;
        if (str2 != null) {
            if ("Button".equals(str2) || "Image Button".equals(str2)) {
                accessibilityNodeInfo.setClassName("android.widget.Button");
            } else if ("Header".equals(str2)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    accessibilityNodeInfo.setHeading(true);
                } else {
                    r9.A05(2, true);
                }
            } else if ("Selected Button".equals(str2)) {
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setSelected(true);
            } else if ("Image".equals(str2)) {
                accessibilityNodeInfo.setClassName("Image");
            }
        }
        String str3 = r2.A00;
        if (str3 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                accessibilityNodeInfo.setTooltipText(str3);
            } else if (i >= 19) {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", str3);
            }
        }
    }
}
