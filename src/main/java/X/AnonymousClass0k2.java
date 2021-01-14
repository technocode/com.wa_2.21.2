package X;

import android.database.DataSetObserver;

/* renamed from: X.0k2  reason: invalid class name */
public class AnonymousClass0k2 extends DataSetObserver {
    public final /* synthetic */ C29631Zu A00;

    public AnonymousClass0k2(C29631Zu r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        C29631Zu r1 = this.A00;
        if (r1.ABa()) {
            r1.APf();
        }
    }

    public void onInvalidated() {
        this.A00.dismiss();
    }
}
