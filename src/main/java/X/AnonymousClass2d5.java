package X;

import android.text.Editable;
import android.widget.Button;

/* renamed from: X.2d5  reason: invalid class name */
public class AnonymousClass2d5 extends C07860Zy {
    public final /* synthetic */ Button A00;

    public AnonymousClass2d5(Button button) {
        this.A00 = button;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        if (C003701u.A0E(editable.toString())) {
            this.A00.setEnabled(false);
        } else {
            this.A00.setEnabled(true);
        }
    }
}
