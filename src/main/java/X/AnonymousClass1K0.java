package X;

import android.content.DialogInterface;
import com.whatsapp.util.Log;

/* renamed from: X.1K0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1K0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AbstractC07170We A00;

    public /* synthetic */ AnonymousClass1K0(AbstractC07170We r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC07170We r2 = this.A00;
        C002001d.A2N(r2.A01, 106);
        Log.i("verifymsgstore/dialog/checknorestore/skiprestore");
        r2.A00 = false;
        r2.A03(false, false);
    }
}