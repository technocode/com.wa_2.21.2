package X;

import android.content.DialogInterface;
import com.whatsapp.registration.VerifySms;

/* renamed from: X.2zg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65332zg implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ VerifySms A01;

    public /* synthetic */ DialogInterface$OnClickListenerC65332zg(VerifySms verifySms, int i) {
        this.A01 = verifySms;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VerifySms verifySms = this.A01;
        C002001d.A2N(verifySms, this.A00);
        verifySms.A0j();
    }
}
