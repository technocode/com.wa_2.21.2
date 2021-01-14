package X;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.whatsapp.ViewSharedContactArrayActivity;

/* renamed from: X.1K5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1K5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ ViewSharedContactArrayActivity A01;
    public final /* synthetic */ AnonymousClass1Z4 A02;

    public /* synthetic */ AnonymousClass1K5(ViewSharedContactArrayActivity viewSharedContactArrayActivity, AnonymousClass1Z4 r2, Bitmap bitmap) {
        this.A01 = viewSharedContactArrayActivity;
        this.A02 = r2;
        this.A00 = bitmap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ViewSharedContactArrayActivity viewSharedContactArrayActivity = this.A01;
        if (((ActivityC004602e) viewSharedContactArrayActivity).A04.A06(viewSharedContactArrayActivity, AnonymousClass36B.A00(viewSharedContactArrayActivity, this.A02, this.A00, true), 1)) {
            viewSharedContactArrayActivity.A02.A02(true, 10);
        }
    }
}
