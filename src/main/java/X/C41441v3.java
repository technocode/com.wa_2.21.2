package X;

import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.1v3  reason: invalid class name and case insensitive filesystem */
public class C41441v3 implements AbstractC07200Wh {
    public final /* synthetic */ SettingsGoogleDrive A00;

    public C41441v3(SettingsGoogleDrive settingsGoogleDrive) {
        this.A00 = settingsGoogleDrive;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        Log.i("settings-gdrive/readonly-external-storage-readonly");
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        boolean A01 = AnonymousClass00C.A01();
        int i = R.string.read_only_media_message_shared_storage;
        if (A01) {
            i = R.string.read_only_media_message;
        }
        settingsGoogleDrive.APq(R.string.msg_store_backup_skipped, i, new Object[0]);
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        Log.i("settings-gdrive/readonly-external-storage-readonly-permission");
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_backup_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_backup;
        }
        RequestPermissionActivity.A09(settingsGoogleDrive, R.string.permission_storage_need_write_access_on_backup_request, i2);
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        Log.i("settings-gdrive/external-storage-unavailable");
        C002001d.A2O(this.A00, 602);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        Log.i("settings-gdrive/external-storage-unavailable-permission");
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_backup_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_backup;
        }
        RequestPermissionActivity.A09(settingsGoogleDrive, R.string.permission_storage_need_write_access_on_backup_request, i2);
    }
}
