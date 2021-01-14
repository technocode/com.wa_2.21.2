package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.1Jw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC26191Jw implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC07170We A01;

    public /* synthetic */ DialogInterface$OnClickListenerC26191Jw(AbstractC07170We r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC07170We r1 = this.A01;
        int i2 = this.A00;
        Activity activity = r1.A01;
        C002001d.A2N(activity, i2);
        C002001d.A2O(activity, 106);
    }
}
