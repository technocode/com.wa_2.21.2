package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;

/* renamed from: X.1W2  reason: invalid class name */
public class AnonymousClass1W2 {
    public final AnonymousClass02N A00;
    public final boolean A01;

    public AnonymousClass1W2(AnonymousClass02N r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void A00(int i) {
        if (!(this instanceof C56242iJ)) {
            AnonymousClass008.A0u("locationssubscriberesponsehandler/error ", i);
        } else {
            ((C56242iJ) this).A00.A00(i);
        }
    }

    public void A01(int i) {
        if (this instanceof C56242iJ) {
            ((C56242iJ) this).A00.A01(i);
        } else if (!(this instanceof C40481tL)) {
            Log.i("locationssubscriberesponsehandler/subscription list updated");
        } else {
            C40481tL r1 = (C40481tL) this;
            Log.i("locationssubscriberesponsehandler/subscription list updated");
            if (((AnonymousClass1W2) r1).A01) {
                r1.A00.A07(r1.A01, ((AnonymousClass1W2) r1).A00, i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            }
        }
    }

    public void A02(int i) {
        AnonymousClass008.A0v("locationssubscriberesponsehandler/success ", i);
    }
}
