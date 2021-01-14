package X;

/* renamed from: X.3I8  reason: invalid class name */
public class AnonymousClass3I8 implements AbstractC29091Wz {
    public final /* synthetic */ C73773Yq A00;

    public AnonymousClass3I8(C73773Yq r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC29091Wz
    public void AIP(AnonymousClass0MH r2) {
        this.A00.A05();
    }

    @Override // X.AbstractC29091Wz
    public void AIQ(AnonymousClass0MH r6) {
        String str;
        String str2;
        C73773Yq r4 = this.A00;
        if (!r4.A00 || r6 == null || !r6.A0G()) {
            r4.A05();
            return;
        }
        AnonymousClass3I9 r3 = new AnonymousClass3I9(101);
        r3.A00 = r6.A0H;
        r3.A02 = r4.A09;
        if (r6.A0L()) {
            str = "SUCCESS";
        } else {
            str = "FAILURE";
        }
        r3.A01 = str;
        C69293Gm r2 = r4.A07;
        int A02 = C006803i.A02(r6.A0F, 0);
        if (r2 != null) {
            if (A02 == 0) {
                str2 = "00";
            } else {
                str2 = "U13";
            }
            r3.A01 = str2;
            ((AnonymousClass3IE) r4).A06.A07(r3);
            return;
        }
        throw null;
    }
}
