package X;

import android.content.DialogInterface;
import com.whatsapp.SettingsNetworkUsage;

/* renamed from: X.1JN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JN implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsNetworkUsage.ResetUsageConfirmationDialog A00;

    public /* synthetic */ AnonymousClass1JN(SettingsNetworkUsage.ResetUsageConfirmationDialog resetUsageConfirmationDialog) {
        this.A00 = resetUsageConfirmationDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsNetworkUsage settingsNetworkUsage = (SettingsNetworkUsage) this.A00.A0A();
        if (settingsNetworkUsage != null) {
            settingsNetworkUsage.A0U(true);
        }
    }
}
