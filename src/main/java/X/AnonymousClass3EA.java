package X;

import android.text.TextUtils;

/* renamed from: X.3EA  reason: invalid class name */
public class AnonymousClass3EA implements AbstractC61382t5 {
    public final /* synthetic */ AbstractC61382t5 A00;
    public final /* synthetic */ AnonymousClass3EB A01;

    public AnonymousClass3EA(AnonymousClass3EB r1, AbstractC61382t5 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC61382t5
    public void AEc(AnonymousClass0RM r4) {
        if (!TextUtils.isEmpty(r4.A01)) {
            this.A01.A04.A0E(r4.A01, r4.A02);
            AbstractC61382t5 r0 = this.A00;
            if (r0 != null) {
                r0.AEc(r4);
                return;
            }
            return;
        }
        AbstractC61382t5 r1 = this.A00;
        if (r1 != null) {
            r1.AFb(new C61072sS());
        }
    }

    @Override // X.AbstractC61382t5
    public void AFb(C61072sS r2) {
        AbstractC61382t5 r0 = this.A00;
        if (r0 != null) {
            r0.AFb(r2);
        }
    }
}
