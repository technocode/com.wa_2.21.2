package X;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;

/* renamed from: X.1pu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38461pu implements AbstractC26331Kl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CodeInputField A01;

    public /* synthetic */ C38461pu(CodeInputField codeInputField, int i) {
        this.A01 = codeInputField;
        this.A00 = i;
    }

    @Override // X.AbstractC26331Kl
    public final SpannableStringBuilder A99(String str) {
        int A002;
        int A003;
        CodeInputField codeInputField = this.A01;
        int i = this.A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
            if (spannableStringBuilder.charAt(i2) == ')') {
                int i3 = i2 + 1;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i2, i3, 33);
                if (i != 0) {
                    A003 = i;
                } else {
                    A003 = C004302a.A00(codeInputField.getContext(), R.color.accent_dark);
                }
                spannableStringBuilder.setSpan(new C26371Kp(A003), i2, i3, 33);
            } else if (spannableStringBuilder.charAt(i2) != 160) {
                if (i != 0) {
                    A002 = i;
                } else {
                    A002 = C004302a.A00(codeInputField.getContext(), R.color.accent_dark);
                }
                spannableStringBuilder.setSpan(new C26371Kp(A002), i2, i2 + 1, 33);
            }
        }
        return spannableStringBuilder;
    }
}
