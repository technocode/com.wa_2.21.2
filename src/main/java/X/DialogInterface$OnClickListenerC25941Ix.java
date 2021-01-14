package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.ResetGroupPhoto;

/* renamed from: X.1Ix  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25941Ix implements DialogInterface.OnClickListener {
    public final /* synthetic */ ResetGroupPhoto.ConfirmDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC25941Ix(ResetGroupPhoto.ConfirmDialogFragment confirmDialogFragment) {
        this.A00 = confirmDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ResetGroupPhoto.ConfirmDialogFragment confirmDialogFragment = this.A00;
        ActivityC004902h A0A = confirmDialogFragment.A0A();
        if (A0A != null) {
            Intent intent = new Intent();
            intent.putExtra("is_reset", true);
            A0A.setResult(-1, intent);
        }
        confirmDialogFragment.A0r();
    }
}
