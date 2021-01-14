package com.whatsapp.payments.ui.widget;

import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass0AD;
import X.AnonymousClass0GP;
import X.AnonymousClass0MD;
import X.AnonymousClass0MH;
import X.AnonymousClass0Q7;
import X.AnonymousClass1VM;
import X.AnonymousClass1X6;
import X.AnonymousClass3EC;
import X.C002101e;
import X.C018809u;
import X.C01970Ad;
import X.C03340Fu;
import X.C28051Sr;
import X.C63842x6;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import java.util.ArrayList;
import java.util.List;

public class MandatePaymentBottomSheetFragment extends WaFragment {
    public Button A00;
    public Button A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public AnonymousClass0MD A0A = null;
    public AnonymousClass1VM A0B = null;
    public AnonymousClass0MH A0C;
    public AnonymousClass3EC A0D;
    public List A0E = new ArrayList();
    public final AnonymousClass02M A0F = AnonymousClass02M.A00();
    public final AnonymousClass04j A0G = AnonymousClass04j.A00();
    public final AnonymousClass01X A0H = AnonymousClass01X.A00();
    public final AnonymousClass0GP A0I = AnonymousClass0GP.A00();
    public final AnonymousClass0AD A0J = AnonymousClass0AD.A00;
    public final C03340Fu A0K = C03340Fu.A00();
    public final C01970Ad A0L = C01970Ad.A00();
    public final C018809u A0M = C018809u.A00("MandatePaymentBottomSheetFragment", "payment", "IN");
    public final AnonymousClass1X6 A0N = AnonymousClass1X6.A00();
    public final C63842x6 A0O = C63842x6.A00();
    public final AnonymousClass00T A0P = C002101e.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.india_upi_mandate_payment_bottom_sheet, viewGroup, false);
        this.A08 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.title);
        this.A03 = (LinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.accept_mandate_container);
        this.A06 = (LinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.update_mandate_container);
        this.A07 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.payment_method_title);
        this.A02 = (ImageView) AnonymousClass0Q7.A0D(inflate, R.id.payment_method_icon);
        this.A04 = (LinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.mandate_info_container);
        this.A00 = (Button) AnonymousClass0Q7.A0D(inflate, R.id.positive_button);
        this.A01 = (Button) AnonymousClass0Q7.A0D(inflate, R.id.negative_button);
        this.A09 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.to_vpa);
        this.A05 = (LinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.payment_method_container);
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        this.A0U = true;
        this.A0P.ANF(new RunnableEBaseShape11S0100000_I1_6(this, 43));
    }

    public final View A0n(LinearLayout linearLayout, CharSequence charSequence, CharSequence charSequence2) {
        View inflate = LayoutInflater.from(A0A()).inflate(R.layout.india_upi_mandate_detail_row_item, (ViewGroup) linearLayout, false);
        ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.left_text)).setText(charSequence);
        ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.right_text)).setText(charSequence2);
        return inflate;
    }

    public final void A0o() {
        this.A07.setText(C28051Sr.A0y(this.A0L, this.A0H, this.A0B));
        if (this.A0B.A05() != null) {
            this.A02.setImageBitmap(this.A0B.A05());
        }
    }

    public final void A0p(AnonymousClass1VM r6) {
        ActivityC004902h A0A2 = A0A();
        String str = this.A0C.A0G;
        Intent intent = new Intent(A0A2, IndiaUpiMandatePaymentActivity.class);
        intent.putExtra("payment_transaction_info_id", str);
        intent.putExtra("payment_method", r6);
        intent.putExtra("is_accept_mandate", true);
        A0h(intent);
        ActivityC004702f r1 = (ActivityC004702f) A0A();
        if (r1 != null) {
            r1.A0J("MandatePaymentBottomSheetFragment");
            return;
        }
        throw null;
    }
}
