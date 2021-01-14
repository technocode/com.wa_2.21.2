package X;

import android.content.DialogInterface;
import com.whatsapp.ConnectionUnavailableDialogFragment;

/* renamed from: X.1Hk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25551Hk implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConnectionUnavailableDialogFragment A00;
    public final /* synthetic */ ActivityC004602e A01;

    public /* synthetic */ DialogInterface$OnClickListenerC25551Hk(ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment, ActivityC004602e r2) {
        this.A00 = connectionUnavailableDialogFragment;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = this.A00;
        ActivityC004602e r3 = this.A01;
        connectionUnavailableDialogFragment.A0w(false, false);
        connectionUnavailableDialogFragment.A05.ANC(new C39451rY(r3, connectionUnavailableDialogFragment.A01, connectionUnavailableDialogFragment.A03, connectionUnavailableDialogFragment.A00, connectionUnavailableDialogFragment.A02, connectionUnavailableDialogFragment.A04, true, true, false, "", null), new String[0]);
    }
}
