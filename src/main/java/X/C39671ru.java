package X;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;

/* renamed from: X.1ru  reason: invalid class name and case insensitive filesystem */
public class C39671ru extends AnonymousClass0Q0 {
    public final /* synthetic */ Conversation A00;

    public C39671ru(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AnonymousClass0Q0
    public void A01(View view, C07890a3 r5) {
        View.AccessibilityDelegate accessibilityDelegate = this.A01;
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A02;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        r5.A07(C06790Us.A04);
        if (Build.VERSION.SDK_INT <= 29) {
            accessibilityNodeInfo.setContentDescription(((AnonymousClass2C0) this.A00).A01.A06(R.string.record_audio_description));
        }
    }
}
