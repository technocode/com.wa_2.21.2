package X;

import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;

/* renamed from: X.3H8  reason: invalid class name */
public class AnonymousClass3H8 implements AnonymousClass0YR {
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public AnonymousClass3H8(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A00 = paymentGroupParticipantPickerActivity;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        ArrayList A03 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) paymentGroupParticipantPickerActivity).A01);
        paymentGroupParticipantPickerActivity.A07 = A03;
        if (A03.isEmpty()) {
            paymentGroupParticipantPickerActivity.A07 = null;
        }
        C10050dx r0 = paymentGroupParticipantPickerActivity.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            paymentGroupParticipantPickerActivity.A04 = null;
        }
        C10050dx r3 = new C10050dx(paymentGroupParticipantPickerActivity, paymentGroupParticipantPickerActivity.A07);
        paymentGroupParticipantPickerActivity.A04 = r3;
        paymentGroupParticipantPickerActivity.A0J.ANC(r3, new Void[0]);
        return false;
    }
}
