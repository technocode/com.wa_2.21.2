package X;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: X.0k3  reason: invalid class name */
public class AnonymousClass0k3 implements AbsListView.OnScrollListener {
    public final /* synthetic */ C29631Zu A00;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public AnonymousClass0k3(C29631Zu r1) {
        this.A00 = r1;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C29631Zu r2 = this.A00;
            if (r2.A0D.getInputMethodMode() != 2 && r2.A0D.getContentView() != null) {
                Handler handler = r2.A0K;
                RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0 = r2.A0O;
                handler.removeCallbacks(runnableEBaseShape5S0100000_I1_0);
                runnableEBaseShape5S0100000_I1_0.run();
            }
        }
    }
}
