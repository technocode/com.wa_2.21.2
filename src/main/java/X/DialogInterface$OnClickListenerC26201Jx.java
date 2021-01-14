package X;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

/* renamed from: X.1Jx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC26201Jx implements DialogInterface.OnClickListener {
    public final /* synthetic */ AbstractC07170We A00;

    public /* synthetic */ DialogInterface$OnClickListenerC26201Jx(AbstractC07170We r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC07170We r2 = this.A00;
        C002001d.A2N(r2.A01, 105);
        Log.i("verifymsgstore/dialog/restoreduetoerror/restore");
        r2.A00 = true;
        r2.A03(true, false);
    }
}
