package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1qg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38931qg implements AbstractC27251Ot {
    public final /* synthetic */ AnonymousClass0XK A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C38931qg(AnonymousClass0XK r1, String str, String str2, Jid jid) {
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = jid;
    }

    @Override // X.AbstractC27251Ot
    public final void AIE(C27241Os r14, boolean z) {
        String str;
        AnonymousClass0XK r5 = this.A00;
        String str2 = this.A02;
        String str3 = this.A03;
        Jid jid = this.A01;
        if (!z) {
            return;
        }
        if (r14 == null || !r14.A0A()) {
            r5.A13.A0E(str3, 404);
            r5.A0B.A09(str3, jid, "web");
            return;
        }
        String str4 = r14.A0C;
        String str5 = r14.A0A;
        byte[] bArr = r14.A0E;
        String str6 = r14.A09;
        if (r14.A02 == 1) {
            str = "video";
        } else {
            str = null;
        }
        r5.A12.A01(str3, new C70463Ld(str4, str5, bArr, str6, str2, str), 22);
        r5.A0B.A09(str3, jid, "web");
    }
}
