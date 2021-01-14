package X;

import android.app.Activity;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;

/* renamed from: X.2x3  reason: invalid class name and case insensitive filesystem */
public class C63812x3 {
    public final C01980Ae A00;

    public C63812x3(C01980Ae r1) {
        this.A00 = r1;
    }

    public void A00(Activity activity) {
        boolean z;
        C01980Ae r1 = this.A00;
        if (r1.A08()) {
            z = true;
        } else {
            r1.A09();
            z = false;
        }
        C002001d.A2V(activity, IndiaUpiPayIntentReceiverActivity.class, z);
    }
}
