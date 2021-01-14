package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.1Gg  reason: invalid class name and case insensitive filesystem */
public class C25291Gg implements TextWatcher {
    public final AnonymousClass05q A00;
    public final C46422Aa A01;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C25291Gg(C46422Aa r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int lineCount;
        String charSequence2 = charSequence.toString();
        C46422Aa r4 = this.A01;
        C25301Gh r1 = r4.A00;
        r1.A0C = charSequence2;
        r1.A0D = false;
        if (r4.A0L && (lineCount = ((TextView) ((AbstractC008905s) r4).A00.A07).getLineCount()) >= 1) {
            C25301Gh r12 = r4.A00;
            if (r12.A02 != lineCount) {
                r12.A02 = ((TextView) ((AbstractC008905s) r4).A00.A07).getLineCount();
                C010206h r3 = this.A00.A01;
                r3.A03((long) ((AbstractC008905s) r4).A07, new C37841os(charSequence2));
                r3.A02();
            }
        }
        AbstractC009505y r32 = r4.A07;
        if (r32 != null) {
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(r4));
                C008805h.A0P(r32, new C010106g(arrayList), this.A00);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
