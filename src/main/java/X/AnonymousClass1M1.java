package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.1M1  reason: invalid class name */
public class AnonymousClass1M1 extends View.AccessibilityDelegate {
    public final /* synthetic */ CharSequence A00;

    public AnonymousClass1M1(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setContentDescription(this.A00);
    }
}
