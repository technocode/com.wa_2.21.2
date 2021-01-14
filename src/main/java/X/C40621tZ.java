package X;

import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SettingsChat;
import com.whatsapp.util.Log;

/* renamed from: X.1tZ  reason: invalid class name and case insensitive filesystem */
public class C40621tZ implements AbstractC07200Wh {
    public final /* synthetic */ SettingsChat A00;

    public C40621tZ(SettingsChat settingsChat) {
        this.A00 = settingsChat;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        Log.i("settings-chat/readonly-external-storage-readonly");
        SettingsChat settingsChat = this.A00;
        boolean A01 = AnonymousClass00C.A01();
        int i = R.string.read_only_media_message_shared_storage;
        if (A01) {
            i = R.string.read_only_media_message;
        }
        settingsChat.APq(R.string.msg_store_backup_skipped, i, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        Log.i("settings-chat/readonly-external-storage-readonly-permission");
        SettingsChat settingsChat = this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_backup_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_backup;
        }
        RequestPermissionActivity.A09(settingsChat, R.string.permission_storage_need_write_access_on_backup_request, i2);
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        Log.i("settings-chat/external-storage-unavailable");
        C002001d.A2O(this.A00, 602);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        Log.i("settings-chat/external-storage-unavailable-permission");
        SettingsChat settingsChat = this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_backup_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_backup;
        }
        RequestPermissionActivity.A09(settingsChat, R.string.permission_storage_need_write_access_on_backup_request, i2);
    }
}
