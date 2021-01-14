package X;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.whatsapp.CodeInputField;

/* renamed from: X.1Km  reason: invalid class name and case insensitive filesystem */
public class C26341Km extends PasswordTransformationMethod {
    public int A00 = -1;
    public C26351Kn A01;
    public Runnable A02;
    public String A03 = "";
    public final CodeInputField A04;

    public C26341Km(CodeInputField codeInputField) {
        this.A04 = codeInputField;
    }

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        if (this.A02 == null) {
            this.A02 = new RunnableEBaseShape6S0100000_I1_1(this, 5);
        }
        if (!this.A03.equals(editable.toString().replaceAll("[^0-9, ]", ""))) {
            this.A03 = editable.toString().replaceAll("[^0-9, ]", "");
            this.A01.A00(editable);
            CodeInputField codeInputField = this.A04;
            if (codeInputField.getHandler() != null) {
                codeInputField.getHandler().removeCallbacks(this.A02);
                codeInputField.getHandler().postDelayed(this.A02, 1500);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.beforeTextChanged(charSequence, i, i2, i3);
        CodeInputField codeInputField = this.A04;
        if (codeInputField.getHandler() != null && this.A02 != null) {
            codeInputField.getHandler().removeCallbacks(this.A02);
        }
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        C26351Kn r0 = new C26351Kn(charSequence, this);
        this.A01 = r0;
        return r0;
    }
}
