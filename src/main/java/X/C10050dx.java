package X;

import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0dx  reason: invalid class name and case insensitive filesystem */
public class C10050dx extends AnonymousClass0JW {
    public final ArrayList A00;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A01;

    public C10050dx(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, ArrayList arrayList) {
        this.A01 = paymentGroupParticipantPickerActivity;
        this.A00 = arrayList != null ? new ArrayList(arrayList) : null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        paymentGroupParticipantPickerActivity.A04 = null;
        C63092vq r0 = paymentGroupParticipantPickerActivity.A05;
        r0.A00 = (List) obj;
        r0.notifyDataSetChanged();
    }
}
