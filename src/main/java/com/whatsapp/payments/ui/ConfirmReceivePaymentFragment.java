package com.whatsapp.payments.ui;

import X.AbstractC43781yw;
import X.AbstractC60972sI;
import X.AbstractC62972ve;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass1VM;
import X.C01970Ad;
import X.C28051Sr;
import X.C41191ud;
import X.C68433De;
import X.C69233Gg;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.AbstractList;

public abstract class ConfirmReceivePaymentFragment extends WaFragment implements AbstractC62972ve {
    public Button A00;
    public C41191ud A01;
    public AnonymousClass1VM A02;
    public PaymentMethodRow A03;
    public final AbstractC60972sI A04 = new C69233Gg(this);
    public final C68433De A05 = C68433De.A00;
    public final C01970Ad A06 = C01970Ad.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.confirm_receive_payment_fragment, viewGroup, false);
        this.A03 = (PaymentMethodRow) inflate.findViewById(R.id.payment_method_row);
        this.A00 = (Button) inflate.findViewById(R.id.confirm_payment);
        View findViewById = inflate.findViewById(R.id.add_another_method);
        inflate.findViewById(R.id.account_number_divider).setVisibility(8);
        inflate.findViewById(R.id.payment_method_account_id).setVisibility(8);
        if (this.A02 == null) {
            C01970Ad r0 = this.A06;
            r0.A04();
            AbstractList abstractList = (AbstractList) r0.A06.A0A();
            if (abstractList.size() > 0) {
                this.A02 = (AnonymousClass1VM) abstractList.get(0);
            }
        }
        AIN(this.A02);
        AnonymousClass037 r3 = this.A0D;
        if (r3 != null) {
            inflate.findViewById(R.id.payment_method_container).setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r3, 9));
            findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r3, 10));
        }
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        this.A0U = true;
        this.A05.A00(this.A04);
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        C41191ud r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        this.A01 = this.A06.A01().A00();
        this.A05.A01(this.A04);
    }

    @Override // X.AbstractC62972ve
    public void AIN(AnonymousClass1VM r6) {
        this.A02 = r6;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
        ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A03.A01.setVisibility(0);
        PaymentMethodRow paymentMethodRow = ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A03;
        C01970Ad r0 = brazilConfirmReceivePaymentFragment.A0B;
        AnonymousClass01X r2 = brazilConfirmReceivePaymentFragment.A05;
        paymentMethodRow.A04.setText(C28051Sr.A0y(r0, r2, r6));
        AbstractC43781yw r02 = r6.A06;
        if (r02 != null) {
            if (!r02.A06()) {
                ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A03.A01(r2.A06(R.string.payment_method_unverified));
            }
            PaymentMethodRow paymentMethodRow2 = ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A03;
            if (C28051Sr.A1s(r6)) {
                brazilConfirmReceivePaymentFragment.A0C.A03(r6, paymentMethodRow2);
            }
            ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A03.A02(true);
            this.A00.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r6, 11));
            return;
        }
        throw null;
    }
}
