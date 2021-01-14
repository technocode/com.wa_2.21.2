package X;

import android.content.DialogInterface;

/* renamed from: X.2zU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65212zU implements DialogInterface.OnClickListener {
    public final /* synthetic */ ActivityC004702f A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ DialogInterface$OnClickListenerC65212zU(ActivityC004702f r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004702f r4 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        C002001d.A2N(r4, 125);
        StringBuilder sb = new StringBuilder("blocked +");
        sb.append(str);
        sb.append(str2);
        r4.startActivity(C002001d.A0R(r4, sb.toString(), null, null, null, null, null));
    }
}
