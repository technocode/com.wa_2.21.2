package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.Me;
import java.util.Locale;

/* renamed from: X.1Rg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC27751Rg implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Me A01;

    public /* synthetic */ DialogInterface$OnClickListenerC27751Rg(Activity activity, Me me) {
        this.A00 = activity;
        this.A01 = me;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String format;
        Activity activity = this.A00;
        Me me = this.A01;
        StringBuilder A0S = AnonymousClass008.A0S("catalog not available");
        if (me == null) {
            format = "";
        } else {
            format = String.format(Locale.US, " +%s%s", me.cc, me.number);
        }
        A0S.append(format);
        activity.startActivity(C002001d.A0R(activity, A0S.toString(), null, null, null, null, null));
    }
}
