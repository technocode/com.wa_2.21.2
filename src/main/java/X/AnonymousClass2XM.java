package X;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.companiondevice.LinkedDevicesActivity;

/* renamed from: X.2XM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2XM implements AbstractC000900m {
    public final /* synthetic */ LinkedDevicesActivity A00;

    public /* synthetic */ AnonymousClass2XM(LinkedDevicesActivity linkedDevicesActivity) {
        this.A00 = linkedDevicesActivity;
    }

    @Override // X.AbstractC000900m
    public final void AEa(AnonymousClass0JF r5) {
        DialogFragment dialogFragment;
        Dialog dialog;
        LinkedDevicesActivity linkedDevicesActivity = this.A00;
        AnonymousClass037 A01 = linkedDevicesActivity.A04().A0Q.A01("wifi_speed_bump_dialog");
        if (A01 instanceof DialogFragment) {
            dialogFragment = (DialogFragment) A01;
        } else {
            dialogFragment = null;
        }
        AnonymousClass0JF r0 = linkedDevicesActivity.A04;
        if ((r0 == null || r0.A00 != r5.A00) && r5.A00 == 1 && dialogFragment != null && (dialog = dialogFragment.A03) != null && dialog.isShowing()) {
            dialogFragment.A0q();
            linkedDevicesActivity.A0X();
        }
        linkedDevicesActivity.A04 = r5;
    }
}
