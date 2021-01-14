package X;

import java.util.List;

/* renamed from: X.0dX  reason: invalid class name and case insensitive filesystem */
public class C09790dX extends AnonymousClass0JW {
    public final AnonymousClass33R A00;
    public final C03570Gt A01;

    public C09790dX(C03570Gt r1, AnonymousClass33R r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List<AnonymousClass33N> list = (List) obj;
        if (list != null) {
            for (AnonymousClass33N r2 : list) {
                AnonymousClass0H0 r0 = this.A01.A0H;
                r2.A05 = r0.A01.containsKey(r2.A0D);
            }
            this.A00.A00(list);
            return;
        }
        throw null;
    }
}
