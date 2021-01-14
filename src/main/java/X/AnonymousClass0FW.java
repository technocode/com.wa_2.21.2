package X;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.0FW  reason: invalid class name */
public class AnonymousClass0FW {
    public static volatile AnonymousClass0FW A06;
    public final AnonymousClass00G A00;
    public final AnonymousClass00D A01;
    public final AnonymousClass094 A02;
    public final C014508d A03;
    public final AnonymousClass0BZ A04;
    public final AnonymousClass00T A05;

    public AnonymousClass0FW(AnonymousClass00G r1, AnonymousClass00T r2, AnonymousClass0BZ r3, C014508d r4, AnonymousClass00D r5, AnonymousClass094 r6) {
        this.A00 = r1;
        this.A05 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }

    public static AnonymousClass0FW A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0FW.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0FW(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass0BZ.A00(), C014508d.A00(), AnonymousClass00D.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A06;
    }

    public void A01() {
        String string = this.A01.A00.getString("registration_sibling_app_country_code", null);
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled/sibling-country-code = ");
        sb.append(string);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb2.append(false);
        Log.i(sb2.toString());
        AnonymousClass008.A1a(new StringBuilder("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled = "), false);
    }

    public void A02() {
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb.append(false);
        Log.i(sb.toString());
        bundle.putBoolean("database_migration_is_enabled_on_requester_side", false);
        Log.i("InterAppCommunicationManager/sendInitialMigrationInfoNeededBroadcast/sendInitialMigrationInfoNeededBroadcast");
        A03("com.whatsapp.registration.directmigration.initialMigrationInfoAction", bundle);
    }

    public final void A03(String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/sendRequesterToProviderOrderedBroadcast/action = ");
        sb.append(str);
        Log.i(sb.toString());
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.whatsapp.w4b", MigrationProviderOrderedBroadcastReceiver.class.getName()));
        intent.setAction(str);
        intent.addFlags(32);
        this.A00.A00.sendOrderedBroadcast(intent, "com.whatsapp.permission.REGISTRATION", new C655330c(), null, 1, null, bundle);
    }
}
