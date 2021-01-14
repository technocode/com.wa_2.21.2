package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;

/* renamed from: X.1rA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39231rA implements AbstractC26331Kl {
    public final /* synthetic */ CodeInputField A00;

    public /* synthetic */ C39231rA(CodeInputField codeInputField) {
        this.A00 = codeInputField;
    }

    @Override // X.AbstractC26331Kl
    public final SpannableStringBuilder A99(String str) {
        CodeInputField codeInputField = this.A00;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == codeInputField.A01) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C004302a.A00(codeInputField.getContext(), R.color.code_input_hint_color)), i, i + 1, 33);
            }
        }
        return spannableStringBuilder;
    }
}
