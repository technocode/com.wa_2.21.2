package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.SmsDefaultAppWarning;
import com.whatsapp.util.Log;

/* renamed from: X.2JX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JX implements DialogInterface.OnClickListener {
    public final /* synthetic */ SmsDefaultAppWarning A00;

    public /* synthetic */ AnonymousClass2JX(SmsDefaultAppWarning smsDefaultAppWarning) {
        this.A00 = smsDefaultAppWarning;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SmsDefaultAppWarning smsDefaultAppWarning = this.A00;
        Log.i("smsdefaultappwarning/reset");
        smsDefaultAppWarning.getPackageManager().clearPackagePreferredActivities("com.whatsapp");
        smsDefaultAppWarning.finish();
    }
}
