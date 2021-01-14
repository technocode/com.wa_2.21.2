package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.0tL  reason: invalid class name and case insensitive filesystem */
public class C18430tL implements TextWatcher {
    public boolean A00 = false;
    public final EditText A01;
    public final AnonymousClass05q A02;
    public final AbstractC009505y A03;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C18430tL(EditText editText, AnonymousClass05q r3, AbstractC009505y r4) {
        this.A01 = editText;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void afterTextChanged(Editable editable) {
        if (!this.A00) {
            this.A00 = true;
            EditText editText = this.A01;
            AbstractC009505y r3 = this.A03;
            ArrayList arrayList = new ArrayList();
            String obj = editable.toString();
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(obj));
                editText.setText((CharSequence) C008805h.A0b(C008805h.A0P(r3, new C010106g(arrayList), this.A02)));
                editText.setSelection(editText.length());
                this.A00 = false;
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
