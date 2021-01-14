package X;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Pair;
import com.whatsapp.registration.directmigration.MigrationRequesterBroadcastReceiver;
import com.whatsapp.util.Log;
import java.io.Serializable;

/* renamed from: X.0dg  reason: invalid class name and case insensitive filesystem */
public class C09880dg extends AnonymousClass0JW {
    public final AnonymousClass0FW A00;

    public C09880dg(AnonymousClass0FW r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass0FW r4 = this.A00;
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/sendProviderToRequesterBroadcast/action = ");
        sb.append("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction");
        Log.i(sb.toString());
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.whatsapp.w4b", MigrationRequesterBroadcastReceiver.class.getName()));
        intent.addFlags(32);
        intent.setAction("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction");
        if ("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction".equals("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction") && pair != null) {
            intent.putExtra("extra_min_storage_needed", (Serializable) pair.first);
            intent.putExtra("extra_msg_db_size", (Serializable) pair.second);
        }
        r4.A00.A00.sendBroadcast(intent, "com.whatsapp.permission.REGISTRATION");
    }
}
