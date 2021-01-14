package X;

import android.view.View;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.0Q0  reason: invalid class name */
public class AnonymousClass0Q0 {
    public static final View.AccessibilityDelegate A02 = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate A00;
    public final View.AccessibilityDelegate A01;

    public AnonymousClass0Q0() {
        this.A01 = A02;
        this.A00 = new C06740Un(this);
    }

    public AnonymousClass0Q0(View.AccessibilityDelegate accessibilityDelegate) {
        this.A01 = accessibilityDelegate;
        this.A00 = new C06740Un(this);
    }

    public void A00(View view, int i) {
        if (!(this instanceof C08320at)) {
            if (!(this instanceof C57582kX)) {
                this.A01.sendAccessibilityEvent(view, i);
                return;
            }
            C57582kX r1 = (C57582kX) this;
            if (i == 256) {
                ExoPlaybackControlView exoPlaybackControlView = r1.A00;
                if (exoPlaybackControlView.A07()) {
                    exoPlaybackControlView.A00();
                    return;
                }
                exoPlaybackControlView.A01();
                exoPlaybackControlView.A06(3000);
                return;
            }
            r1.A01.sendAccessibilityEvent(view, i);
        } else if (i != 4) {
            this.A01.sendAccessibilityEvent(view, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        if (r1 <= 1) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.view.View r9, X.C07890a3 r10) {
        /*
        // Method dump skipped, instructions count: 614
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q0.A01(android.view.View, X.0a3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r1 == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q0.A02(android.view.View, int, android.os.Bundle):boolean");
    }
}
