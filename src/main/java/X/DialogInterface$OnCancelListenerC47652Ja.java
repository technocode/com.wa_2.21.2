package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.SmsDefaultAppWarning;

/* renamed from: X.2Ja  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnCancelListenerC47652Ja implements DialogInterface.OnCancelListener {
    public final /* synthetic */ SmsDefaultAppWarning A00;

    public /* synthetic */ DialogInterface$OnCancelListenerC47652Ja(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.A00 = smsDefaultAppWarning;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.finish();
    }
}
