package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.2pN  reason: invalid class name and case insensitive filesystem */
public class C60402pN extends C59082n1 {
    public final TextView A00 = ((TextView) findViewById(R.id.setup_payment_account_button));
    public final AnonymousClass009 A01 = AnonymousClass009.A00();
    public final C01980Ae A02 = C01980Ae.A00();
    public final C02040Ak A03 = C02040Ak.A00();
    public final C01970Ad A04 = C01970Ad.A00();

    @Override // X.C59082n1
    public int getBackgroundResource() {
        return 0;
    }

    public C60402pN(Context context, C05390Oi r3) {
        super(context, r3);
        A05();
    }

    private void A05() {
        if (!this.A03.A04()) {
            Log.i("PAY: Cannot render payment invite system messages because payment is not enabled");
            findViewById(R.id.divider).setVisibility(8);
            this.A00.setVisibility(8);
            this.A01.A03("Cannot render payment invite message because payment is disabled", -1);
            return;
        }
        C05390Oi fMessage = getFMessage();
        int i = fMessage.A00;
        if (i == 40) {
            if (this.A02.A09()) {
                this.A00.setVisibility(8);
                findViewById(R.id.divider).setVisibility(8);
                return;
            }
            findViewById(R.id.divider).setVisibility(0);
            TextView textView = this.A00;
            textView.setVisibility(0);
            textView.setText(this.A0n.A06(R.string.payments_setup_account_reminder_button_text));
            textView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 19));
        } else if (i == 41) {
            findViewById(R.id.divider).setVisibility(0);
            TextView textView2 = this.A00;
            textView2.setVisibility(0);
            textView2.setText(this.A0n.A06(R.string.payments_send_payment_text));
            if (!this.A02.A09()) {
                textView2.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, fMessage, 36));
            } else {
                textView2.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, fMessage, 37));
            }
        } else if (i == 42) {
            findViewById(R.id.divider).setVisibility(8);
            this.A00.setVisibility(8);
        }
    }

    @Override // X.C59082n1, X.AbstractC51572Zg
    public void A0K() {
        A05();
        super.A0K();
    }

    @Override // X.C59082n1, X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A05();
        }
    }

    @Override // X.C59082n1, X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_payment_invite_system_message;
    }

    @Override // X.C59082n1, X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_payment_invite_system_message;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        return (((int) getResources().getDimension(R.dimen.payment_bubble_margin_width)) << 1) + ((int) getResources().getDimension(R.dimen.payment_bubble_amount_width));
    }

    @Override // X.C59082n1, X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_payment_invite_system_message;
    }
}
