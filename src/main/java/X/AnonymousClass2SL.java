package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.2SL  reason: invalid class name */
public class AnonymousClass2SL extends BroadcastReceiver {
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A00;

    public AnonymousClass2SL(AbstractView$OnCreateContextMenuListenerC56112i5 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().matches("android.location.PROVIDERS_CHANGED")) {
            AbstractView$OnCreateContextMenuListenerC56112i5 r4 = this.A00;
            boolean A08 = r4.A0w.A08();
            if (r4.A0q != A08) {
                r4.A0q = A08;
                C02900Dx r0 = r4.A0n;
                if (r0 != null) {
                    if (A08) {
                        r4.A0p = true;
                    } else {
                        r0.A05 = 0;
                        r4.A0I();
                    }
                }
                r4.A0D = 0;
                r4.A0J();
            }
        }
    }
}
