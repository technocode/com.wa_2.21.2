package com.whatsapp.payments.ui;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0Q7;
import X.C018809u;
import X.C03340Fu;
import X.C05710Pt;
import X.C05720Pu;
import X.C06210Sf;
import X.RunnableC62182uN;
import X.RunnableC62192uO;
import X.RunnableC62202uP;
import X.RunnableC62212uQ;
import X.RunnableC62222uR;
import X.RunnableC62232uS;
import X.RunnableC62242uT;
import X.RunnableC62252uU;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;

public abstract class ReTosFragment extends RoundedBottomSheetDialogFragment {
    public Button A00;
    public ProgressBar A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final C03340Fu A03 = C03340Fu.A00();
    public final C018809u A04 = C018809u.A00("ReTosFragment", "onboarding", "COMMON");

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SpannableString A012;
        View inflate = layoutInflater.inflate(R.layout.retos_bottom_sheet, viewGroup, false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass0Q7.A0D(inflate, R.id.retos_bottom_sheet_desc);
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        textEmojiLabel.A07 = new C05710Pt();
        Context context = textEmojiLabel.getContext();
        BrazilReTosFragment brazilReTosFragment = (BrazilReTosFragment) this;
        Bundle bundle2 = ((AnonymousClass037) brazilReTosFragment).A06;
        if (bundle2 != null) {
            if (bundle2.getBoolean("is_merchant")) {
                C06210Sf r5 = brazilReTosFragment.A00;
                A012 = brazilReTosFragment.A01.A01(context, ((ReTosFragment) brazilReTosFragment).A02.A06(R.string.br_p2m_retos_bottom_sheet_desc), new String[]{"wa-merchant-terms", "fb-merchant-agreement", "cielo-merchant-agreement"}, new String[]{r5.A01("https://www.whatsapp.com/legal/merchant-terms/").toString(), r5.A01("https://www.facebook.com/legal/commerce_product_merchant_agreement").toString(), r5.A01("https://www.cielo.com.br/contrato-de-credenciamento-consolidado/").toString()}, new Runnable[]{RunnableC62202uP.A00, RunnableC62212uQ.A00, RunnableC62222uR.A00});
            } else {
                C06210Sf r52 = brazilReTosFragment.A00;
                A012 = brazilReTosFragment.A01.A01(context, ((ReTosFragment) brazilReTosFragment).A02.A06(R.string.br_p2p_retos_bottom_sheet_desc), new String[]{"wa-terms", "wa-privacy-policy", "fb-payments-terms", "fb-privacy-policy", "cielo-terms-and-privacy-policy"}, new String[]{r52.A01("https://www.whatsapp.com/legal/payments-terms-of-service-br#payments").toString(), r52.A01("https://www.whatsapp.com/legal/payments-terms-of-service-br#payments-privacy-policy").toString(), r52.A01("https://www.facebook.com/payments_terms").toString(), r52.A01("https://www.facebook.com/policy.php").toString(), r52.A01("https://www.cielo.com.br/termos-fb-pay").toString()}, new Runnable[]{RunnableC62232uS.A00, RunnableC62182uN.A00, RunnableC62192uO.A00, RunnableC62242uT.A00, RunnableC62252uU.A00});
            }
            textEmojiLabel.setText(A012);
            this.A01 = (ProgressBar) AnonymousClass0Q7.A0D(inflate, R.id.progress_bar);
            Button button = (Button) AnonymousClass0Q7.A0D(inflate, R.id.retos_bottom_sheet_button);
            this.A00 = button;
            button.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 37));
            return inflate;
        }
        throw null;
    }
}
