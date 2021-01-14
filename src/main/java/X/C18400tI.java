package X;

import android.widget.CompoundButton;
import java.util.ArrayList;

/* renamed from: X.0tI  reason: invalid class name and case insensitive filesystem */
public class C18400tI implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass2AB A00;
    public final /* synthetic */ AnonymousClass05q A01;

    public C18400tI(AnonymousClass2AB r1, AnonymousClass05q r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AnonymousClass2AB r1 = this.A00;
        AbstractC009505y r5 = r1.A02;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() == 0) {
            arrayList.add(C008805h.A0T(r1));
            C463229b r2 = new C463229b(z ? 1.0d : 0.0d);
            if (arrayList.size() == 1) {
                arrayList.add(r2);
                C008805h.A0P(r5, new C010106g(arrayList), this.A01);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}
