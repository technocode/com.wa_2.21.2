package X;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.SettingsNotifications;
import com.whatsapp.util.Log;

/* renamed from: X.1JO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JO implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsNotifications A00;

    public /* synthetic */ AnonymousClass1JO(SettingsNotifications settingsNotifications) {
        this.A00 = settingsNotifications;
    }

    /* JADX INFO: finally extract failed */
    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsNotifications settingsNotifications = this.A00;
        AnonymousClass0BB r4 = settingsNotifications.A0j;
        ContentValues contentValues = new ContentValues(8);
        contentValues.put("use_custom_notifications", Boolean.FALSE);
        contentValues.put("message_tone", (String) null);
        contentValues.put("message_vibrate", (String) null);
        contentValues.put("message_popup", (String) null);
        contentValues.put("message_light", (String) null);
        contentValues.put("call_tone", (String) null);
        contentValues.put("call_vibrate", (String) null);
        contentValues.put("low_pri_notifications", Boolean.FALSE);
        AnonymousClass0BK A02 = r4.A0A().A02();
        SQLiteDatabase sQLiteDatabase = A02.A00;
        sQLiteDatabase.beginTransaction();
        try {
            A02.A00("settings", contentValues, null, null, "resetNotificationSettings/UPDATE_CHAT_SETTINGS");
            int A01 = A02.A01("settings", "(mute_end < ? or mute_end is NULL) and (status_muted is NULL or status_muted = 0) and (media_visibility = 0)", new String[]{Long.toString(r4.A09.A01())}, "resetNotificationSettings/DELETE_CHAT_SETTINGS");
            sQLiteDatabase.setTransactionSuccessful();
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/deleted-count");
            sb.append(A01);
            Log.i(sb.toString());
            sQLiteDatabase.endTransaction();
            r4.A0O.clear();
            if (AnonymousClass0BB.A0Q) {
                AnonymousClass0BF.A06(r4.A0A.A00);
                r4.A0L.A0F(sQLiteDatabase);
            }
            settingsNotifications.A0V();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }
}
