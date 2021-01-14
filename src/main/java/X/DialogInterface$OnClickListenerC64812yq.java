package X;

import android.content.DialogInterface;
import com.whatsapp.qrcode.contactqr.BaseQrActivity$RevokeCodeDialogFragment;

/* renamed from: X.2yq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC64812yq implements DialogInterface.OnClickListener {
    public final /* synthetic */ BaseQrActivity$RevokeCodeDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC64812yq(BaseQrActivity$RevokeCodeDialogFragment baseQrActivity$RevokeCodeDialogFragment) {
        this.A00 = baseQrActivity$RevokeCodeDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1Y6 r1 = (AnonymousClass1Y6) this.A00.A0A();
        if (r1 != null) {
            r1.A0X(true);
        }
    }
}
