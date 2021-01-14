package X;

import android.content.DialogInterface;
import com.whatsapp.backup.google.SettingsGoogleDrive;

/* renamed from: X.1QW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QW implements DialogInterface.OnCancelListener {
    public final /* synthetic */ SettingsGoogleDrive.AuthRequestDialogFragment A00;

    public /* synthetic */ AnonymousClass1QW(SettingsGoogleDrive.AuthRequestDialogFragment authRequestDialogFragment) {
        this.A00 = authRequestDialogFragment;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        SettingsGoogleDrive settingsGoogleDrive = (SettingsGoogleDrive) this.A00.A0A();
        if (settingsGoogleDrive != null) {
            settingsGoogleDrive.A0h = true;
            return;
        }
        throw null;
    }
}
