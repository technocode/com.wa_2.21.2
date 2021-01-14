package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;

/* renamed from: X.2vS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62852vS implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractView$OnClickListenerC32271ec A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ DialogInterface$OnClickListenerC62852vS(AbstractView$OnClickListenerC32271ec r1, int i, boolean z) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractView$OnClickListenerC32271ec r5 = this.A01;
        int i2 = this.A00;
        boolean z = this.A02;
        C002001d.A2N(r5, i2);
        if (!(r5 instanceof AnonymousClass1PS)) {
            ((IndiaUpiBankAccountDetailsActivity) r5).A0W(z);
            return;
        }
        AnonymousClass1PS r52 = (AnonymousClass1PS) r5;
        r52.A0G(R.string.register_wait_message);
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) r52;
        C69223Gf r2 = new C69223Gf(brazilPaymentCardDetailsActivity, new AnonymousClass3HA(brazilPaymentCardDetailsActivity, null, 0));
        if (z) {
            new C61482tF(r52, ((ActivityC004702f) r52).A0F, r52.A0C, r52.A0B, r52.A0A, r52.A04, r52.A07, ((ActivityC004702f) r52).A0H, r52.A08, r52.A09, r52.A05).A00(r2);
        } else {
            r52.A08.A08(((AbstractView$OnClickListenerC32271ec) r52).A07.A07, r2);
        }
    }
}
