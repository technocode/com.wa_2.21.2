package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.util.Log;

/* renamed from: X.1Jz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC26221Jz implements DialogInterface.OnClickListener {
    public final /* synthetic */ AbstractC07170We A00;

    public /* synthetic */ DialogInterface$OnClickListenerC26221Jz(AbstractC07170We r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.A00.A01;
        C002001d.A2N(activity, 105);
        Log.i("verifymsgstore/dialog/restoreduetoerror/skiprestore");
        C002001d.A2O(activity, 106);
    }
}
