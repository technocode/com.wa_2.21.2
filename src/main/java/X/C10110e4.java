package X;

import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0e4  reason: invalid class name and case insensitive filesystem */
public class C10110e4 extends AnonymousClass0JW {
    public final /* synthetic */ IndiaUpiChangePinActivity A00;

    public C10110e4(IndiaUpiChangePinActivity indiaUpiChangePinActivity) {
        this.A00 = indiaUpiChangePinActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass1VM r1;
        List list = (List) obj;
        if (list != null && list.size() == 1) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = this.A00;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r1 = null;
                    break;
                }
                r1 = (AnonymousClass1VM) it.next();
                if (r1.A04() == 2) {
                    break;
                }
            }
            indiaUpiChangePinActivity.A02 = (C43751yt) r1;
        }
        this.A00.A0m();
    }
}
