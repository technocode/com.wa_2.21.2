package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.0c0  reason: invalid class name and case insensitive filesystem */
public class C08930c0 extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass0G7 A00;

    public C08930c0(AnonymousClass0G7 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            this.A00.A00(false);
            return;
        }
        StringBuilder sb = new StringBuilder("unknown intent received in connectivity receiver ");
        sb.append(intent);
        Log.w(sb.toString());
    }
}
