package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.SmsDefaultAppWarning;

/* renamed from: X.2JU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JU implements DialogInterface.OnClickListener {
    public final /* synthetic */ SmsDefaultAppWarning A00;

    public /* synthetic */ AnonymousClass2JU(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.A00 = smsDefaultAppWarning;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SmsDefaultAppWarning smsDefaultAppWarning = this.A00;
        C002001d.A2N(smsDefaultAppWarning, 0);
        smsDefaultAppWarning.A0T();
        smsDefaultAppWarning.finish();
    }
}
