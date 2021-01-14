package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.1Qp  reason: invalid class name and case insensitive filesystem */
public class C27591Qp extends BroadcastReceiver {
    public final /* synthetic */ C09080cG A00;

    public C27591Qp(C09080cG r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i("gdrive-notification-manager/user-decided-to-backup-over-data-connection");
        C09080cG r4 = this.A00;
        AnonymousClass00G r3 = r4.A0F;
        Intent intent2 = new Intent(r3.A00, SettingsGoogleDrive.class);
        intent2.setAction("action_perform_backup_over_cellular");
        intent2.setFlags(335544320);
        r3.A00.startActivity(intent2);
        r3.A00.unregisterReceiver(this);
        r4.A03();
    }
}
