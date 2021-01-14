package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.1ZP  reason: invalid class name */
public class AnonymousClass1ZP implements AbstractC13340k5 {
    public final /* synthetic */ AnonymousClass23N A00;

    public AnonymousClass1ZP(AnonymousClass23N r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC13340k5
    public void AGr(AnonymousClass0T8 r12, MenuItem menuItem) {
        AnonymousClass23N r0 = this.A00;
        Handler handler = r0.A0J;
        Object obj = null;
        handler.removeCallbacksAndMessages(null);
        List list = r0.A0O;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (r12 == ((C13010jS) list.get(i)).A01) {
                if (i != -1) {
                    int i2 = i + 1;
                    if (i2 < list.size()) {
                        obj = list.get(i2);
                    }
                    handler.postAtTime(new RunnableEBaseShape1S0400000_I1(this, obj, menuItem, r12, 0), r12, SystemClock.uptimeMillis() + 200);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC13340k5
    public void AGs(AnonymousClass0T8 r2, MenuItem menuItem) {
        this.A00.A0J.removeCallbacksAndMessages(r2);
    }
}
