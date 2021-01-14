package X;

import java.util.ArrayList;

/* renamed from: X.1xm  reason: invalid class name and case insensitive filesystem */
public class C43091xm implements AbstractC26321Kk {
    public final /* synthetic */ AnonymousClass05q A00;
    public final /* synthetic */ C46482Aq A01;

    public C43091xm(C46482Aq r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC26321Kk
    public void AEJ(String str) {
        C46482Aq r0 = this.A01;
        r0.A07 = str;
        AbstractC009505y r3 = r0.A01;
        if (r3 != null && str.length() == r0.A04.intValue()) {
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(str));
                C008805h.A0P(r3, new C010106g(arrayList), this.A00);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }

    @Override // X.AbstractC26321Kk
    public void AI2(String str) {
        C46482Aq r0 = this.A01;
        r0.A07 = str;
        AbstractC009505y r3 = r0.A01;
        if (r3 != null) {
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(str));
                C008805h.A0P(r3, new C010106g(arrayList), this.A00);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
