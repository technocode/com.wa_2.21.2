package X;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;

/* renamed from: X.1TD  reason: invalid class name */
public class AnonymousClass1TD implements TextWatcher {
    public final /* synthetic */ AnonymousClass05q A00;
    public final /* synthetic */ C46522Au A01;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass1TD(C46522Au r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C46522Au r1 = this.A01;
        AbstractC009505y r3 = r1.A02;
        if (r3 != null) {
            ArrayList arrayList = new ArrayList();
            String charSequence2 = charSequence.toString();
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(charSequence2));
                C008805h.A0P(r3, new C010106g(arrayList), this.A00);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
        AbstractC009505y r32 = r1.A01;
        if (r32 != null) {
            ArrayList arrayList2 = new ArrayList();
            if (arrayList2.size() == 0) {
                arrayList2.add(C008805h.A0T(r1));
                C008805h.A0P(r32, new C010106g(arrayList2), this.A00);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
