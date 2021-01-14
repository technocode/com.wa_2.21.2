package X;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;

/* renamed from: X.2vP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62822vP implements AdapterView.OnItemClickListener {
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A00;

    public /* synthetic */ C62822vP(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A00 = paymentGroupParticipantPickerActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        C007003k r4 = ((C63082vp) view.getTag()).A04;
        if (r4 != null && !paymentGroupParticipantPickerActivity.A08.A0H((UserJid) r4.A02(UserJid.class)) && paymentGroupParticipantPickerActivity.A0H.A06((UserJid) r4.A02(UserJid.class))) {
            Intent intent = paymentGroupParticipantPickerActivity.getIntent();
            intent.putExtra("extra_jid", paymentGroupParticipantPickerActivity.A03.getRawString());
            intent.putExtra("extra_receiver_jid", AnonymousClass1VY.A0D(r4.A09));
            paymentGroupParticipantPickerActivity.setResult(-1, intent);
            paymentGroupParticipantPickerActivity.finish();
        }
    }
}
