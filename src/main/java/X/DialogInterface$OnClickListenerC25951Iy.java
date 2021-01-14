package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.ResetProfilePhoto;

/* renamed from: X.1Iy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25951Iy implements DialogInterface.OnClickListener {
    public final /* synthetic */ ResetProfilePhoto.ConfirmDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC25951Iy(ResetProfilePhoto.ConfirmDialogFragment confirmDialogFragment) {
        this.A00 = confirmDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ResetProfilePhoto.ConfirmDialogFragment confirmDialogFragment = this.A00;
        ActivityC004902h A0A = confirmDialogFragment.A0A();
        if (A0A != null) {
            Intent intent = new Intent();
            intent.putExtra("is_reset", true);
            A0A.setResult(-1, intent);
        }
        confirmDialogFragment.A0r();
    }
}
