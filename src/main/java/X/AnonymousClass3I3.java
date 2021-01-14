package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3I3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I3 implements AbstractC61032sO {
    public final /* synthetic */ C69603Hr A00;
    public final /* synthetic */ AnonymousClass3IE A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass3I3(AnonymousClass3IE r1, C69603Hr r2, String str) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = str;
    }

    @Override // X.AbstractC61032sO
    public final void AJh(boolean z, boolean z2, String str, String str2, UserJid userJid, boolean z3, C61072sS r12) {
        AnonymousClass3IE r2 = this.A01;
        C69603Hr r1 = this.A00;
        String str3 = this.A02;
        r1.A00 = 0;
        r1.A01 = 8;
        C02270Bi r13 = r2.A01;
        r13.A07(r13.A01());
        if (r12 != null || !z) {
            C018809u r3 = r2.A0R;
            StringBuilder sb = new StringBuilder("viewContactInfo error: ");
            sb.append(r12);
            r3.A04(sb.toString());
            r2.A06.A07(new C63372wJ(6));
        } else if (userJid != null) {
            C018809u r4 = r2.A0R;
            StringBuilder sb2 = new StringBuilder("viewContactInfo jid: ");
            sb2.append(userJid);
            sb2.append(" blocked: ");
            sb2.append(z3);
            r4.A07(null, sb2.toString(), null);
            AnonymousClass0GG r14 = r2.A0B;
            UserJid of = UserJid.of(userJid);
            if (of != null) {
                if (z3 != r14.A0H(of)) {
                    r14.A0D(null);
                }
                C63372wJ r15 = new C63372wJ(4);
                r15.A02 = r2.A0E.A0A(userJid);
                r2.A06.A07(r15);
                return;
            }
            throw null;
        } else {
            C63372wJ r16 = new C63372wJ(5);
            r16.A0A = str3;
            r16.A09 = str2;
            r16.A08 = str;
            r2.A06.A07(r16);
        }
    }
}
