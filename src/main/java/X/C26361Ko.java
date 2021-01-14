package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;

/* renamed from: X.1Ko  reason: invalid class name and case insensitive filesystem */
public final class C26361Ko implements TextWatcher {
    public String A00 = "";
    public boolean A01;
    public boolean A02;
    public final AbstractC26321Kk A03;
    public final AbstractC26331Kl A04;
    public final CodeInputField A05;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C26361Ko(AbstractC26321Kk r2, CodeInputField codeInputField, AbstractC26331Kl r4) {
        this.A03 = r2;
        this.A05 = codeInputField;
        this.A04 = r4;
    }

    public void afterTextChanged(Editable editable) {
        int length;
        int length2;
        SpannableStringBuilder spannableStringBuilder;
        AbstractC26321Kk r3;
        CodeInputField codeInputField = this.A05;
        int selectionStart = codeInputField.getSelectionStart();
        String replace = editable.toString().replace(Character.toString(codeInputField.A01), "");
        if (!replace.isEmpty() && replace.charAt(0) != 160) {
            codeInputField.A05 = false;
        }
        int i = codeInputField.A02 >> 1;
        int length3 = replace.length();
        if (length3 > 0 && this.A00.startsWith(replace.substring(0, 1)) && this.A00.indexOf(160) >= 0 && replace.indexOf(160) < 0 && selectionStart == i) {
            StringBuilder sb = new StringBuilder();
            sb.append(replace.substring(0, i - 1));
            sb.append(replace.substring(i));
            replace = sb.toString();
            selectionStart--;
        } else if (length3 > selectionStart && replace.indexOf(160) == selectionStart && selectionStart == i + 1) {
            selectionStart++;
        }
        String replace2 = replace.replace(Character.toString(160), "");
        int length4 = replace2.length();
        if (length4 > i) {
            length4++;
        }
        while (true) {
            length = replace2.length();
            if (length >= i) {
                break;
            }
            StringBuilder A0S = AnonymousClass008.A0S(replace2);
            A0S.append(codeInputField.A01);
            replace2 = A0S.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(replace2.substring(0, i));
        sb2.append((char) 160);
        sb2.append(replace2.substring(i, Math.min(codeInputField.A02, length)));
        String obj = sb2.toString();
        while (true) {
            length2 = obj.length();
            if (length2 >= codeInputField.A02 + 1) {
                break;
            }
            StringBuilder A0S2 = AnonymousClass008.A0S(obj);
            A0S2.append(codeInputField.A01);
            obj = A0S2.toString();
        }
        if (codeInputField.A05) {
            spannableStringBuilder = new SpannableStringBuilder(obj);
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == codeInputField.A01) {
                    int i3 = i2 + 1;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i2, i3, 33);
                    spannableStringBuilder.setSpan(new C26371Kp(C004302a.A00(codeInputField.getContext(), R.color.code_input_error)), i2, i3, 33);
                } else if (spannableStringBuilder.charAt(i2) != 160) {
                    spannableStringBuilder.setSpan(new C26371Kp(C004302a.A00(codeInputField.getContext(), R.color.code_input_text)), i2, i2 + 1, 33);
                }
            }
        } else {
            spannableStringBuilder = this.A04.A99(obj);
        }
        if (spannableStringBuilder.length() > 0) {
            InputFilter[] filters = editable.getFilters();
            codeInputField.removeTextChangedListener(this);
            editable.setFilters(new InputFilter[0]);
            for (Object obj2 : editable.getSpans(0, editable.length(), CharacterStyle.class)) {
                editable.removeSpan(obj2);
            }
            editable.replace(0, editable.length(), spannableStringBuilder.toString());
            Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class);
            for (Object obj3 : spans) {
                editable.setSpan(obj3, spannableStringBuilder.getSpanStart(obj3), spannableStringBuilder.getSpanEnd(obj3), 18);
            }
            editable.setFilters(filters);
            codeInputField.addTextChangedListener(this);
        }
        codeInputField.setSelection(Math.min(selectionStart, Math.min(length4, length2)));
        if (!this.A01 && (r3 = this.A03) != null) {
            String replaceAll = obj.toString().replaceAll("[^0-9]", "");
            if (replaceAll.length() != codeInputField.A02) {
                this.A02 = false;
                r3.AI2(replaceAll);
            } else if (!this.A02) {
                this.A02 = true;
                r3.AEJ(replaceAll);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.A00 = charSequence.toString();
        }
    }
}
