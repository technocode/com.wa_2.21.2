package X;

import java.util.List;

/* renamed from: X.0dW  reason: invalid class name and case insensitive filesystem */
public class C09780dW extends AnonymousClass0JW {
    public final AnonymousClass33J A00;
    public final C03570Gt A01;

    public C09780dW(C03570Gt r1, AnonymousClass33J r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        return this.A01.A0E();
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        if (list != null) {
            this.A00.AKV(list);
            return;
        }
        throw null;
    }
}
