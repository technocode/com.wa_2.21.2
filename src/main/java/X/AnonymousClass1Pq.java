package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.authentication.FingerprintBottomSheet;

/* renamed from: X.1Pq  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1Pq implements DialogInterface.OnShowListener {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FingerprintBottomSheet A01;

    public /* synthetic */ AnonymousClass1Pq(FingerprintBottomSheet fingerprintBottomSheet, Bundle bundle) {
        this.A01 = fingerprintBottomSheet;
        this.A00 = bundle;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.A01.A12(this.A00, dialogInterface);
    }
}
