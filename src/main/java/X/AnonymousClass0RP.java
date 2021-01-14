package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.whatsapp.util.Log;

/* renamed from: X.0RP  reason: invalid class name */
public final class AnonymousClass0RP extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        StringBuilder A0S = AnonymousClass008.A0S("app/shutdown/external_media/state/");
        A0S.append(Environment.getExternalStorageState());
        Log.i(A0S.toString());
        AnonymousClass00D.A00().A0R(0);
    }
}
