package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.views.TokenizedSearchInput;

/* renamed from: X.0Zm  reason: invalid class name and case insensitive filesystem */
public class C07780Zm extends AnonymousClass0Q0 {
    public final /* synthetic */ TokenizedSearchInput A00;

    public C07780Zm(TokenizedSearchInput tokenizedSearchInput) {
        this.A00 = tokenizedSearchInput;
    }

    @Override // X.AnonymousClass0Q0
    public void A01(View view, C07890a3 r7) {
        View.AccessibilityDelegate accessibilityDelegate = this.A01;
        AccessibilityNodeInfo accessibilityNodeInfo = r7.A02;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TokenizedSearchInput tokenizedSearchInput = this.A00;
        if (C002001d.A3H(tokenizedSearchInput.A09.A0G())) {
            if (Build.VERSION.SDK_INT < 23) {
                String A06 = tokenizedSearchInput.A0A.A06(R.string.accessibility_role_button);
                if (Build.VERSION.SDK_INT >= 19) {
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", A06);
                }
            }
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setCheckable(false);
            accessibilityNodeInfo.setClickable(true);
            r7.A06(new C06790Us(16, tokenizedSearchInput.A0A.A06(R.string.accessibility_action_click_remove)));
        }
    }
}
