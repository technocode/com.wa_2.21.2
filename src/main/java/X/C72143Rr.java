package X;

import android.text.SpannableStringBuilder;
import com.google.android.search.verification.client.R;
import com.whatsapp.twofactor.SetCodeFragment;

/* renamed from: X.3Rr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72143Rr implements AbstractC26331Kl {
    public final /* synthetic */ SetCodeFragment A00;

    public /* synthetic */ C72143Rr(SetCodeFragment setCodeFragment) {
        this.A00 = setCodeFragment;
    }

    @Override // X.AbstractC26331Kl
    public final SpannableStringBuilder A99(String str) {
        SetCodeFragment setCodeFragment = this.A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == '*') {
                spannableStringBuilder.setSpan(new C26371Kp(C004302a.A00(setCodeFragment.A03.getContext(), R.color.code_input_hint_color)), i, i + 1, 33);
            } else if (spannableStringBuilder.charAt(i) != 160) {
                spannableStringBuilder.setSpan(new C26371Kp(C004302a.A00(setCodeFragment.A03.getContext(), R.color.code_input_text)), i, i + 1, 33);
            }
        }
        return spannableStringBuilder;
    }
}
