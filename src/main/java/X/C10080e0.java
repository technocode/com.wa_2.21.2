package X;

import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0e0  reason: invalid class name and case insensitive filesystem */
public class C10080e0 extends AnonymousClass0JW {
    public final /* synthetic */ IndiaUpiResetPinActivity A00;

    public C10080e0(IndiaUpiResetPinActivity indiaUpiResetPinActivity) {
        this.A00 = indiaUpiResetPinActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        IndiaUpiResetPinActivity indiaUpiResetPinActivity;
        AnonymousClass1VM r2;
        List list = (List) obj;
        if (list == null || list.size() <= 0) {
            indiaUpiResetPinActivity = this.A00;
            indiaUpiResetPinActivity.A0i();
        } else {
            indiaUpiResetPinActivity = this.A00;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r2 = null;
                    break;
                }
                r2 = (AnonymousClass1VM) it.next();
                if (r2.A01 == 2) {
                    break;
                }
            }
            indiaUpiResetPinActivity.A04 = (C43751yt) r2;
            indiaUpiResetPinActivity.A0m();
        }
        indiaUpiResetPinActivity.A06 = null;
    }
}
