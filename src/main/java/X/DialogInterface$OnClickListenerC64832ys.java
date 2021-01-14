package X;

import android.content.DialogInterface;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$TryAgainDialogFragment;

/* renamed from: X.2ys  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC64832ys implements DialogInterface.OnClickListener {
    public final /* synthetic */ BaseQrActivity$TryAgainDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC64832ys(BaseQrActivity$TryAgainDialogFragment baseQrActivity$TryAgainDialogFragment) {
        this.A00 = baseQrActivity$TryAgainDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004902h A0A = this.A00.A0A();
        if (A0A != null) {
            A0A.finish();
        }
    }
}
