package X;

import android.content.DialogInterface;
import com.whatsapp.dialogs.RoomsRedirectDialogFragment;

/* renamed from: X.2Lr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC48302Lr implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RoomsRedirectDialogFragment A01;
    public final /* synthetic */ AnonymousClass02N A02;

    public /* synthetic */ DialogInterface$OnClickListenerC48302Lr(RoomsRedirectDialogFragment roomsRedirectDialogFragment, AnonymousClass02N r2, int i) {
        this.A01 = roomsRedirectDialogFragment;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RoomsRedirectDialogFragment roomsRedirectDialogFragment = this.A01;
        roomsRedirectDialogFragment.A00.A06(this.A02, this.A00);
        roomsRedirectDialogFragment.A0w(false, false);
    }
}
