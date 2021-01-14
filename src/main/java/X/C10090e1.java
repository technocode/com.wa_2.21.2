package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0e1  reason: invalid class name and case insensitive filesystem */
public class C10090e1 extends AnonymousClass0JW {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public C10090e1(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        this.A00.A0G(R.string.register_wait_message);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        if (!((AnonymousClass1DU) indiaUpiPaymentActivity).A08 && !indiaUpiPaymentActivity.A0H) {
            ((ActivityC004702f) indiaUpiPaymentActivity).A0K.A00();
        }
        if (list == null || list.size() == 0) {
            indiaUpiPaymentActivity.A0W.A07(null, "PopulateMethodsForSend could not find methods;", null);
            indiaUpiPaymentActivity.finish();
            return;
        }
        C018809u r3 = indiaUpiPaymentActivity.A0W;
        StringBuilder A0S = AnonymousClass008.A0S("onPostExecute got methods: ");
        A0S.append(list.size());
        r3.A07(null, A0S.toString(), null);
        List A03 = AnonymousClass1VM.A03(list, ((AnonymousClass1DU) indiaUpiPaymentActivity).A0G.A02());
        indiaUpiPaymentActivity.A0B = A03;
        StringBuilder A0S2 = AnonymousClass008.A0S("onPostExecute got paymentMethodList for store: ");
        A0S2.append(Integer.valueOf(A03.size()));
        r3.A03(A0S2.toString());
        List list2 = indiaUpiPaymentActivity.A0B;
        if (list2 != null && list2.size() > 0) {
            if (indiaUpiPaymentActivity.A02 != null) {
                Iterator it = indiaUpiPaymentActivity.A0B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass1VM r2 = (AnonymousClass1VM) it.next();
                    if (r2.A07.equals(indiaUpiPaymentActivity.A02.A07)) {
                        indiaUpiPaymentActivity.A0B.remove(r2);
                        break;
                    }
                }
                indiaUpiPaymentActivity.A0B.add(0, indiaUpiPaymentActivity.A02);
            } else {
                indiaUpiPaymentActivity.A02 = (AnonymousClass1VM) indiaUpiPaymentActivity.A0B.get(0);
            }
            indiaUpiPaymentActivity.A0C = new ArrayList(list.size());
            indiaUpiPaymentActivity.A09.setBankLogo(indiaUpiPaymentActivity.A02.A05());
            for (AnonymousClass1VM r6 : indiaUpiPaymentActivity.A0B) {
                indiaUpiPaymentActivity.A0C.add(C28051Sr.A0y(((AnonymousClass1DU) indiaUpiPaymentActivity).A0H, ((AnonymousClass1DU) indiaUpiPaymentActivity).A0B, r6));
            }
            indiaUpiPaymentActivity.A09.setPaymentMethodText((String) indiaUpiPaymentActivity.A0C.get(indiaUpiPaymentActivity.A0m()));
            PaymentView paymentView = indiaUpiPaymentActivity.A09;
            if (paymentView.A00 != 1) {
                paymentView.A03(false);
            }
        }
        indiaUpiPaymentActivity.A08 = null;
    }
}
