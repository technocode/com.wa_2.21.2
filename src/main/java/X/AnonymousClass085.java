package X;

import android.app.Activity;

/* renamed from: X.085  reason: invalid class name */
public class AnonymousClass085 extends C013607t {
    public final /* synthetic */ AnonymousClass083 this$1;

    public AnonymousClass085(AnonymousClass083 r1) {
        this.this$1 = r1;
    }

    public void onActivityPostResumed(Activity activity) {
        this.this$1.this$0.A00();
    }

    public void onActivityPostStarted(Activity activity) {
        C013707u r2 = this.this$1.this$0;
        int i = r2.A01 + 1;
        r2.A01 = i;
        if (i == 1 && r2.A06) {
            r2.A07.A04(AnonymousClass082.ON_START);
            r2.A06 = false;
        }
    }
}
