package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.Main;

/* renamed from: X.1IP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IP implements DialogInterface.OnClickListener {
    public final /* synthetic */ Main A00;

    public /* synthetic */ AnonymousClass1IP(Main main) {
        this.A00 = main;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Main main = this.A00;
        main.startActivity(new Intent("android.intent.action.VIEW").setDataAndType(null, "application/vnd.android.package-archive").setFlags(1));
        C002001d.A2N(main, 0);
        main.finish();
    }
}
