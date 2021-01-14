package com.whatsapp.payments.ui;

import X.ActivityC004902h;
import X.C02040Ak;
import X.C68453Dg;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

public class PaymentContactPickerFragment extends ContactPickerFragment {
    public final C68453Dg A00 = C68453Dg.A00();
    public final C02040Ak A01 = C02040Ak.A00();

    @Override // X.AnonymousClass037, com.whatsapp.contact.picker.ContactPickerFragment
    public void A0b(Bundle bundle) {
        super.A0b(bundle);
        ((ContactPickerFragment) this).A0H.A00.A09().A08(this.A1O.A06(R.string.new_payment));
    }

    public void A1H(UserJid userJid) {
        Intent A012 = this.A00.A01(A00(), false, false);
        A012.putExtra("extra_jid", userJid.getRawString());
        A0h(A012);
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            A0A.finish();
        }
    }
}
