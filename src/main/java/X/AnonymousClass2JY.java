package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.SmsDefaultAppWarning;

/* renamed from: X.2JY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JY implements DialogInterface.OnCancelListener {
    public final /* synthetic */ SmsDefaultAppWarning A00;

    public /* synthetic */ AnonymousClass2JY(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.A00 = smsDefaultAppWarning;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.finish();
    }
}
