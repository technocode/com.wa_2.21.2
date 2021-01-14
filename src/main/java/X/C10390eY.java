package X;

import java.util.Collection;

/* renamed from: X.0eY  reason: invalid class name and case insensitive filesystem */
public class C10390eY extends AnonymousClass0JW {
    public final /* synthetic */ C54622fE A00;
    public final /* synthetic */ String A01;

    public C10390eY(C54622fE r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass02R r5 = (AnonymousClass02R) obj;
        if (r5 == null) {
            this.A00.A00(null, null, true);
        } else {
            this.A00.A00((String) r5.A00, (Collection) r5.A01, false);
        }
    }
}
