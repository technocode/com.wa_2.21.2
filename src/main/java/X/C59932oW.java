package X;

import java.util.Collection;

/* renamed from: X.2oW  reason: invalid class name and case insensitive filesystem */
public class C59932oW extends AbstractC54542f5 {
    public final /* synthetic */ C54662fI A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59932oW(C54662fI r2, CharSequence charSequence, String str) {
        super(r2.A00, charSequence, str);
        this.A00 = r2;
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
