package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.1Qq  reason: invalid class name and case insensitive filesystem */
public class C27601Qq extends BroadcastReceiver {
    public final /* synthetic */ C09080cG A00;

    public C27601Qq(C09080cG r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i("gdrive-notification-manager/user-decided-to-restore-over-low-battery");
        C09080cG r4 = this.A00;
        AnonymousClass0HQ r3 = r4.A0C;
        r3.A08 = true;
        r3.A04(r3.A0K.A00);
        r3.A0X.ANF(new RunnableEBaseShape2S0100000_I0_2(r3, 6));
        r4.A0F.A00.unregisterReceiver(this);
        r4.A03();
    }
}
