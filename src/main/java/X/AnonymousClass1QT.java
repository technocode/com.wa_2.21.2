package X;

import android.content.DialogInterface;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1QT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QT implements DialogInterface.OnCancelListener {
    public final /* synthetic */ RestoreFromBackupActivity A00;

    public /* synthetic */ AnonymousClass1QT(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A00 = restoreFromBackupActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A00;
        Log.i("gdrive-activity/create user declined to install Google Play Services.");
        restoreFromBackupActivity.A0l(true);
    }
}
