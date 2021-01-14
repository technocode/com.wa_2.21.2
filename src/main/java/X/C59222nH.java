package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;

/* renamed from: X.2nH  reason: invalid class name and case insensitive filesystem */
public class C59222nH extends AbstractC51572Zg {
    public final TextView A00 = ((TextView) findViewById(R.id.info));
    public final C018609s A01 = C018609s.A04();
    public final C01970Ad A02 = C01970Ad.A00();
    public final C02150Av A03 = C02150Av.A02();

    public C59222nH(Context context, AbstractC007503q r3) {
        super(context, r3);
        A0j();
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0j();
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        String str;
        AnonymousClass0MH r3;
        String str2;
        TextView textView = this.A00;
        textView.setTextSize(AbstractC51572Zg.A00(getResources()));
        textView.setBackgroundResource(R.drawable.business_balloon);
        AbstractC007503q fMessage = getFMessage();
        if (fMessage instanceof AnonymousClass0ZM) {
            str = ((AnonymousClass0ZL) fMessage).A00;
        } else if (fMessage instanceof AnonymousClass0ZK) {
            str = ((AnonymousClass0ZL) fMessage).A00;
        } else {
            throw new IllegalStateException("PAY: message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled");
        }
        if (!TextUtils.isEmpty(str)) {
            r3 = this.A01.A0M(str, null);
            str2 = r3 != null ? this.A03.A0K(getFMessage(), r3) : null;
        } else {
            r3 = null;
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            textView.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r3, 38));
            textView.setText(str2);
            textView.setTextColor(C004302a.A00(getContext(), R.color.bubbleBusinessText));
            return;
        }
        textView.setOnClickListener(null);
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if ((r3 instanceof X.AnonymousClass0ZM) != false) goto L_0x0009;
     */
    @Override // X.AnonymousClass2I2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.AbstractC007503q r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.AnonymousClass0ZK
            if (r0 != 0) goto L_0x0009
            boolean r1 = r3 instanceof X.AnonymousClass0ZM
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            X.AnonymousClass00E.A07(r0)
            super.setFMessage(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59222nH.setFMessage(X.03q):void");
    }
}
