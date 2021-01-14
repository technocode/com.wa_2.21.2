package X;

import android.content.DialogInterface;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.util.Log;

/* renamed from: X.2zb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65282zb implements DialogInterface.OnClickListener {
    public final /* synthetic */ SelectPhoneNumberDialog A00;

    public /* synthetic */ DialogInterface$OnClickListenerC65282zb(SelectPhoneNumberDialog selectPhoneNumberDialog) {
        this.A00 = selectPhoneNumberDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SelectPhoneNumberDialog selectPhoneNumberDialog = this.A00;
        Log.i("select-phone-number-dialog/no-phone-number-selected");
        AnonymousClass0HW r0 = selectPhoneNumberDialog.A00;
        if (r0 != null) {
            r0.ADq();
        }
        selectPhoneNumberDialog.A0w(false, false);
    }
}
