package com.whatsapp.payments.ui;

import X.AnonymousClass01I;
import X.AnonymousClass04j;
import X.AnonymousClass0GP;
import X.AnonymousClass3EB;
import X.C01970Ad;
import X.C03340Fu;
import X.C68393Da;
import X.C68683Ed;
import android.view.View;
import android.widget.ListView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

public final class IndiaUpiContactPicker extends ContactPicker {

    public class IndiaUpiContactPickerFragment extends PaymentContactPickerFragment {
        public final AnonymousClass01I A00 = AnonymousClass01I.A00();
        public final AnonymousClass04j A01 = AnonymousClass04j.A00();
        public final C68393Da A02 = C68393Da.A00();
        public final AnonymousClass0GP A03 = AnonymousClass0GP.A00();
        public final C03340Fu A04 = C03340Fu.A00();
        public final C01970Ad A05 = C01970Ad.A00();
        public final C68683Ed A06 = C68683Ed.A00();

        @Override // com.whatsapp.contact.picker.ContactPickerFragment
        public void A0r() {
            View A0p = A0p(R.drawable.ic_send_to_upi, R.string.send_payment_to_vpa, new ViewOnClickEBaseShape7S0100000_I1_5(this, 12));
            View A0p2 = A0p(R.drawable.ic_scan_qr, R.string.menuitem_scan_qr, new ViewOnClickEBaseShape7S0100000_I1_5(this, 13));
            ListView listView = (ListView) ((ContactPickerFragment) this).A07.findViewById(16908298);
            ((ContactPickerFragment) this).A0A = listView;
            listView.addHeaderView(A0p, null, true);
            ((ContactPickerFragment) this).A0A.addHeaderView(A0p2, null, true);
            super.A0r();
        }

        @Override // com.whatsapp.payments.ui.PaymentContactPickerFragment
        public void A1H(UserJid userJid) {
            new AnonymousClass3EB(A00(), this.A14, this.A00, this.A05, this.A01, this.A04, this.A06, this.A03, this.A02, null).A00(userJid, null);
            super.A1H(userJid);
        }
    }
}
