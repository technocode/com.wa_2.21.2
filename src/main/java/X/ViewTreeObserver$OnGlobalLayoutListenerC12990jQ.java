package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: X.0jQ  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC12990jQ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass23N A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC12990jQ(AnonymousClass23N r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass23N r2 = this.A00;
        if (r2.ABa()) {
            List<C13010jS> list = r2.A0O;
            if (list.size() > 0 && !((C13010jS) list.get(0)).A02.A0G) {
                View view = r2.A06;
                if (view == null || !view.isShown()) {
                    r2.dismiss();
                    return;
                }
                for (C13010jS r0 : list) {
                    r0.A02.APf();
                }
            }
        }
    }
}
