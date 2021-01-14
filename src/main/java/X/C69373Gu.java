package X;

import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;

/* renamed from: X.3Gu  reason: invalid class name and case insensitive filesystem */
public class C69373Gu extends C07860Zy {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ Button A02;
    public final /* synthetic */ IndiaUpiSendPaymentToVpaDialogFragment A03;

    public C69373Gu(IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment, TextView textView, Button button, EditText editText) {
        this.A03 = indiaUpiSendPaymentToVpaDialogFragment;
        this.A01 = textView;
        this.A02 = button;
        this.A00 = editText;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        this.A01.setVisibility(4);
        Button button = this.A02;
        boolean z = false;
        if (editable.toString().length() > 0) {
            z = true;
        }
        button.setEnabled(z);
        ActivityC004902h A0A = this.A03.A0A();
        if (A0A != null) {
            AnonymousClass0Q7.A0a(this.A00, C004302a.A02(A0A, R.color.primary));
        }
    }
}
