package X;

import android.widget.PopupWindow;

/* renamed from: X.0k6  reason: invalid class name and case insensitive filesystem */
public class C13350k6 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C13380k9 A00;

    public C13350k6(C13380k9 r1) {
        this.A00 = r1;
    }

    public void onDismiss() {
        C13380k9 r1 = this.A00;
        AbstractC13360k7 r0 = r1.A00;
        if (r0 != null) {
            r0.AFA(r1);
        }
    }
}
