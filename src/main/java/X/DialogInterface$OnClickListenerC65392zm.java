package X;

import android.content.DialogInterface;
import com.whatsapp.registration.VerifySms;

/* renamed from: X.2zm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65392zm implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ VerifySms A01;

    public /* synthetic */ DialogInterface$OnClickListenerC65392zm(VerifySms verifySms, int i) {
        this.A01 = verifySms;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VerifySms verifySms = this.A01;
        C002001d.A2N(verifySms, this.A00);
        VerifySms.A0w = 0;
        verifySms.A0k();
        verifySms.A0o.A0C(1);
        StringBuilder sb = new StringBuilder("+");
        sb.append(verifySms.A0L);
        sb.append(verifySms.A0M);
        String obj = sb.toString();
        verifySms.A0M = null;
        verifySms.A0i.A01(verifySms, AnonymousClass008.A0K("verify-tma ", obj), false, null);
    }
}
