package com.whatsapp.payments.ui;

import X.AnonymousClass00Y;
import X.AnonymousClass0Q7;
import X.AnonymousClass21S;
import X.AnonymousClass3GP;
import X.C018809u;
import X.C02020Ai;
import X.C05710Pt;
import X.C05720Pu;
import X.C05870Qv;
import X.C444920i;
import X.C61772ti;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;

public class AddPaymentMethodBottomSheet extends RoundedBottomSheetDialogFragment {
    public AnonymousClass3GP A00;
    public Runnable A01;
    public final AnonymousClass00Y A02 = AnonymousClass00Y.A00();
    public final C02020Ai A03 = C02020Ai.A00();
    public final C61772ti A04 = C61772ti.A00();
    public final C018809u A05 = C018809u.A00("AddPaymentMethodBottomSheet", "payment-settings", "COMMON");

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        TextEmojiLabel textEmojiLabel;
        TextView textView2;
        View inflate = layoutInflater.inflate(R.layout.add_payment_method_bottom_sheet, viewGroup, false);
        AnonymousClass3GP r0 = this.A00;
        if (r0 != null) {
            String str = r0.A03;
            if (!TextUtils.isEmpty(str) && (textView2 = (TextView) inflate.findViewById(R.id.add_payment_method_bottom_sheet_title)) != null) {
                textView2.setText(str);
            }
            String str2 = this.A00.A02;
            if (!TextUtils.isEmpty(str2) && (textEmojiLabel = (TextEmojiLabel) inflate.findViewById(R.id.add_payment_method_bottom_sheet_desc)) != null) {
                textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
                textEmojiLabel.A07 = new C05710Pt();
                textEmojiLabel.setText(str2);
            }
            String str3 = this.A00.A01;
            if (!TextUtils.isEmpty(str3) && (textView = (TextView) inflate.findViewById(R.id.add_payment_method)) != null) {
                textView.setText(str3);
            }
            if (!TextUtils.isEmpty(null)) {
                View A0D = AnonymousClass0Q7.A0D(inflate, R.id.extra_info_education_divider);
                View A0D2 = AnonymousClass0Q7.A0D(inflate, R.id.extra_info_education_container);
                A0D.setVisibility(0);
                A0D2.setVisibility(0);
                ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.extra_info_education_text)).setText((CharSequence) null);
            }
        }
        AnonymousClass21S A10 = A10(true);
        if (A10 != null) {
            this.A02.A0B(A10, null, false);
        }
        C444920i A0z = A0z(true);
        if (A0z != null) {
            A0z.A01 = 0;
            this.A02.A0B(A0z, null, false);
        }
        inflate.findViewById(R.id.add_payment_method).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 3));
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i != 10) {
            return;
        }
        if (i2 == -1) {
            Runnable runnable = this.A01;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        A0w(false, false);
    }

    public final C444920i A0z(boolean z) {
        String str;
        C05870Qv A022 = this.A03.A02();
        if (A022 == null) {
            this.A05.A04("createUserActionEvent/null country");
            return null;
        }
        C444920i r2 = new C444920i();
        if (z) {
            str = this.A04.A02();
        } else {
            C61772ti r1 = this.A04;
            str = r1.A02;
            if (str == null) {
                str = r1.A02();
            }
        }
        r2.A03 = str;
        r2.A02 = A022.A02;
        r2.A04 = "get_started";
        return r2;
    }

    public AnonymousClass21S A10(boolean z) {
        String str;
        C05870Qv A022 = this.A03.A02();
        if (A022 == null) {
            this.A05.A04("createEvent/null country");
            return null;
        }
        AnonymousClass21S r2 = new AnonymousClass21S();
        if (z) {
            str = this.A04.A02();
        } else {
            C61772ti r1 = this.A04;
            str = r1.A02;
            if (str == null) {
                str = r1.A02();
            }
        }
        r2.A02 = str;
        r2.A01 = A022.A02;
        return r2;
    }
}
