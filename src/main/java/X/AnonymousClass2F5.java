package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.companiondevice.LinkedDevicesLogoutOneDeviceConfirmationDialogFragment;

/* renamed from: X.2F5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2F5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ LinkedDevicesLogoutOneDeviceConfirmationDialogFragment A00;

    public /* synthetic */ AnonymousClass2F5(LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment) {
        this.A00 = linkedDevicesLogoutOneDeviceConfirmationDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment = this.A00;
        Bundle bundle = ((AnonymousClass037) linkedDevicesLogoutOneDeviceConfirmationDialogFragment).A06;
        if (bundle != null) {
            String string = bundle.getString("browserId");
            String string2 = ((AnonymousClass037) linkedDevicesLogoutOneDeviceConfirmationDialogFragment).A06.getString("deviceJid");
            if (string != null) {
                linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A00.A01(string);
            } else {
                linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A00.A00(string2);
            }
        } else {
            throw null;
        }
    }
}
