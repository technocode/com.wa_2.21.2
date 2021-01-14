package X;

import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0dv  reason: invalid class name and case insensitive filesystem */
public class C10030dv extends AnonymousClass0JW {
    public AnonymousClass3GN A00;
    public final AnonymousClass2w3 A01;
    public final ArrayList A02;
    public final /* synthetic */ PaymentTransactionHistoryActivity A03;

    public C10030dv(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, ArrayList arrayList, AnonymousClass3GN r4, AnonymousClass2w3 r5) {
        ArrayList arrayList2;
        this.A03 = paymentTransactionHistoryActivity;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A02 = arrayList2;
        this.A00 = r4;
        this.A01 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass02R r6 = (AnonymousClass02R) obj;
        AnonymousClass3GN r4 = this.A00;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A03;
        String str = paymentTransactionHistoryActivity.A08;
        if (str == null) {
            str = "";
        }
        AnonymousClass1X3 r2 = paymentTransactionHistoryActivity.A0N;
        Object obj2 = r6.A00;
        if (obj2 != null) {
            List list = (List) obj2;
            Object obj3 = r6.A01;
            if (obj3 != null) {
                r4.A00(str, r2, list, (List) obj3);
                return;
            }
            throw null;
        }
        throw null;
    }
}
