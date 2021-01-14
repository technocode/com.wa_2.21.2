package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.SmsDefaultAppWarning;

/* renamed from: X.2JV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JV implements DialogInterface.OnClickListener {
    public final /* synthetic */ SmsDefaultAppWarning A00;

    public /* synthetic */ AnonymousClass2JV(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.A00 = smsDefaultAppWarning;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SmsDefaultAppWarning smsDefaultAppWarning = this.A00;
        C002001d.A2N(smsDefaultAppWarning, 0);
        smsDefaultAppWarning.A00.A01(smsDefaultAppWarning, smsDefaultAppWarning.getIntent().getData(), smsDefaultAppWarning.getIntent().getStringExtra("sms_body"), null);
        smsDefaultAppWarning.finish();
    }
}
