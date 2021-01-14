package X;

import java.util.List;

/* renamed from: X.3QT  reason: invalid class name */
public class AnonymousClass3QT extends AnonymousClass0JW {
    public final AnonymousClass33R A00;
    public final C03570Gt A01;

    public AnonymousClass3QT(C03570Gt r1, AnonymousClass33R r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        if (this.A00 == null) {
            throw null;
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        if (list != null) {
            this.A00.A00(list);
            return;
        }
        throw null;
    }
}
