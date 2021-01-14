package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerifActivity;

/* renamed from: X.2vl  reason: invalid class name and case insensitive filesystem */
public class C63042vl implements TextWatcher {
    public final int A00;
    public final EditText A01;
    public final /* synthetic */ IndiaUpiDebitCardVerifActivity A02;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C63042vl(IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity, int i, EditText editText) {
        this.A02 = indiaUpiDebitCardVerifActivity;
        this.A00 = i;
        this.A01 = editText;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int parseInt;
        if (i3 != 0) {
            this.A02.A06.setVisibility(4);
        }
        if (charSequence.length() >= this.A00) {
            EditText editText = this.A01;
            if (editText != null) {
                editText.requestFocus();
                IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity = this.A02;
                if (editText == indiaUpiDebitCardVerifActivity.A05) {
                    EditText editText2 = indiaUpiDebitCardVerifActivity.A04;
                    if (!TextUtils.isEmpty(AnonymousClass008.A0B(editText2)) && (parseInt = Integer.parseInt(AnonymousClass008.A0B(editText2))) != -1) {
                        if (parseInt < 1 || parseInt > 12) {
                            indiaUpiDebitCardVerifActivity.A06.setText(((AnonymousClass2C0) indiaUpiDebitCardVerifActivity).A01.A06(R.string.debit_card_expiration_verification_month_error_text));
                            indiaUpiDebitCardVerifActivity.A0d();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity2 = this.A02;
            indiaUpiDebitCardVerifActivity2.A0f(indiaUpiDebitCardVerifActivity2.A00, indiaUpiDebitCardVerifActivity2.A01, false);
        }
    }
}
