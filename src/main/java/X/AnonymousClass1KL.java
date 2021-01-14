package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.1KL  reason: invalid class name */
public final class AnonymousClass1KL extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass0HE A00;

    public AnonymousClass1KL(AnonymousClass0HE r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        AnonymousClass357 A02;
        C001801b.A1J();
        AnonymousClass0HE r3 = this.A00;
        boolean z = false;
        if (r3.A00.A0D(AbstractC000400g.A2a)) {
            z = true;
        }
        if (z && (A02 = r3.A05.A02()) != null) {
            int i = A02.A00;
            AnonymousClass008.A0v("UserNoticeManager/handleLocaleChange/notice id:", i);
            AnonymousClass0HF r1 = r3.A04;
            r1.A04(i);
            if (r3.A03.A02()) {
                r1.A05(i);
            }
        }
    }
}
