package X;

import android.content.DialogInterface;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.1QV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QV implements DialogInterface.OnCancelListener {
    public final /* synthetic */ SettingsGoogleDrive A00;

    public /* synthetic */ AnonymousClass1QV(SettingsGoogleDrive settingsGoogleDrive) {
        this.A00 = settingsGoogleDrive;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        SettingsGoogleDrive settingsGoogleDrive = this.A00;
        Log.i("settings-gdrive/gps-unavailable-and-user-declined-install");
        settingsGoogleDrive.A0P.open();
    }
}
