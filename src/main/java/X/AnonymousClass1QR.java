package X;

import android.content.DialogInterface;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1QR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QR implements DialogInterface.OnCancelListener {
    public final /* synthetic */ RestoreFromBackupActivity A00;

    public /* synthetic */ AnonymousClass1QR(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A00 = restoreFromBackupActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A00;
        Log.i("gdrive-activity/gps-unavailable user declined to install Google Play Services.");
        restoreFromBackupActivity.A0M.open();
    }
}
