package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.ShareInviteLinkActivity;

/* renamed from: X.1Ne  reason: invalid class name and case insensitive filesystem */
public class C26921Ne extends BroadcastReceiver {
    public final /* synthetic */ ShareInviteLinkActivity A00;

    public C26921Ne(ShareInviteLinkActivity shareInviteLinkActivity) {
        this.A00 = shareInviteLinkActivity;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.nfc.action.ADAPTER_STATE_CHANGED".equals(intent.getAction())) {
            this.A00.invalidateOptionsMenu();
        }
    }
}
