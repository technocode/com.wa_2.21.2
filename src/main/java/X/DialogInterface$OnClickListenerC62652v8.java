package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;

/* renamed from: X.2v8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62652v8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass1DU A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62652v8(AnonymousClass1DU r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1DU r3 = this.A00;
        r3.A0G(R.string.register_wait_message);
        r3.A08 = true;
        C002001d.A2N(r3, 19);
        r3.A09 = true;
        r3.A00++;
        r3.A0J.A07(null, "showUPIAppErrorAndConfirmRetry got yes; deleting tokens and keys", null);
        r3.A0D.A0B();
        r3.A02.A00();
    }
}
