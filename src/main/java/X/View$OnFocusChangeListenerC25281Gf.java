package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.1Gf  reason: invalid class name and case insensitive filesystem */
public class View$OnFocusChangeListenerC25281Gf implements View.OnFocusChangeListener {
    public final AnonymousClass05q A00;
    public final C46422Aa A01;

    public View$OnFocusChangeListenerC25281Gf(C46422Aa r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            C46422Aa r1 = this.A01;
            AbstractC009505y r3 = r1.A04;
            if (r3 != null) {
                ArrayList arrayList = new ArrayList();
                if (arrayList.size() == 0) {
                    arrayList.add(C008805h.A0T(r1));
                    C008805h.A0P(r3, new C010106g(arrayList), this.A00);
                    return;
                }
                throw new IllegalArgumentException("arguments have to be continuous");
            }
            return;
        }
        C46422Aa r12 = this.A01;
        AbstractC009505y r32 = r12.A05;
        if (r32 != null) {
            ArrayList arrayList2 = new ArrayList();
            if (arrayList2.size() == 0) {
                arrayList2.add(C008805h.A0T(r12));
                C008805h.A0P(r32, new C010106g(arrayList2), this.A00);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
