package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;

/* renamed from: X.0dw  reason: invalid class name and case insensitive filesystem */
public class C10040dw extends AnonymousClass0JW {
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A00;

    public C10040dw(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A00 = paymentGroupParticipantPickerActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        ((ActivityC004702f) paymentGroupParticipantPickerActivity).A0K.A00();
        C63092vq r0 = paymentGroupParticipantPickerActivity.A05;
        ArrayList arrayList = paymentGroupParticipantPickerActivity.A0K;
        r0.A00 = arrayList;
        r0.notifyDataSetChanged();
        AnonymousClass0S2 A09 = paymentGroupParticipantPickerActivity.A09();
        if (A09 != null) {
            A09.A07(((AnonymousClass2C0) paymentGroupParticipantPickerActivity).A01.A0A(R.plurals.n_contacts, (long) arrayList.size(), Integer.valueOf(arrayList.size())));
        }
    }
}
