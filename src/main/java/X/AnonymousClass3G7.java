package X;

import android.widget.EditText;
import android.widget.ProgressBar;
import com.facebook.redex.ViewOnClickEBaseShape0S0700000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;

/* renamed from: X.3G7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G7 implements AbstractC61032sO {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ ProgressBar A01;
    public final /* synthetic */ ViewOnClickEBaseShape0S0700000_I1 A02;
    public final /* synthetic */ Button A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass3G7(ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1, ProgressBar progressBar, Button button, EditText editText, String str) {
        this.A02 = viewOnClickEBaseShape0S0700000_I1;
        this.A01 = progressBar;
        this.A03 = button;
        this.A00 = editText;
        this.A04 = str;
    }

    @Override // X.AbstractC61032sO
    public final void AJh(boolean z, boolean z2, String str, String str2, UserJid userJid, boolean z3, C61072sS r16) {
        int i;
        ViewOnClickEBaseShape0S0700000_I1 viewOnClickEBaseShape0S0700000_I1 = this.A02;
        ProgressBar progressBar = this.A01;
        Button button = this.A03;
        EditText editText = this.A00;
        String str3 = this.A04;
        progressBar.setVisibility(8);
        button.setEnabled(true);
        editText.setEnabled(true);
        if (!z || r16 != null) {
            if (r16 == null || (i = C69293Gm.A00(r16.code, ((IndiaUpiSendPaymentToVpaDialogFragment) viewOnClickEBaseShape0S0700000_I1.A00).A05.A04)) == 0) {
                i = R.string.payment_invalid_vpa_error_text;
            }
            viewOnClickEBaseShape0S0700000_I1.A00(i);
        } else if (z3) {
            int i2 = R.string.payment_blocked_contact_error_text;
            if (userJid == null) {
                i2 = R.string.payment_blocked_vpa_error_text;
            }
            viewOnClickEBaseShape0S0700000_I1.A00(i2);
            IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = (IndiaUpiSendPaymentToVpaDialogFragment) viewOnClickEBaseShape0S0700000_I1.A00;
            indiaUpiSendPaymentToVpaDialogFragment.A09.A01(indiaUpiSendPaymentToVpaDialogFragment.A0A(), userJid, str3, false, false, new AnonymousClass3G5(viewOnClickEBaseShape0S0700000_I1, str3, str2, str));
        } else {
            viewOnClickEBaseShape0S0700000_I1.A02(str3, str2, str);
        }
    }
}
