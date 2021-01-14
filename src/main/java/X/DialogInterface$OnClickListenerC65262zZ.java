package X;

import android.content.DialogInterface;
import com.whatsapp.registration.SelectPhoneNumberDialog;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2zZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65262zZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass30T A00;
    public final /* synthetic */ SelectPhoneNumberDialog A01;
    public final /* synthetic */ ArrayList A02;

    public /* synthetic */ DialogInterface$OnClickListenerC65262zZ(SelectPhoneNumberDialog selectPhoneNumberDialog, ArrayList arrayList, AnonymousClass30T r3) {
        this.A01 = selectPhoneNumberDialog;
        this.A02 = arrayList;
        this.A00 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SelectPhoneNumberDialog selectPhoneNumberDialog = this.A01;
        ArrayList arrayList = this.A02;
        AnonymousClass30T r1 = this.A00;
        Log.i("select-phone-number-dialog/use-clicked");
        AnonymousClass1LS r12 = (AnonymousClass1LS) arrayList.get(r1.A00);
        AnonymousClass0HW r0 = selectPhoneNumberDialog.A00;
        if (r0 != null) {
            r0.AI5(r12);
        }
        selectPhoneNumberDialog.A0w(false, false);
    }
}
