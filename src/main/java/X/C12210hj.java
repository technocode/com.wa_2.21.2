package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0hj  reason: invalid class name and case insensitive filesystem */
public class C12210hj extends AnonymousClass0MI implements AbstractC02870Du, AbstractC02880Dv {
    public UserJid A00;
    public String A01;
    public String A02;

    public C12210hj(C007303n r2, long j) {
        super(r2, j, (byte) 37);
    }

    public C12210hj(C007303n r3, long j, C76393eT r6, boolean z, boolean z2) {
        super(r3, j, (byte) 37);
        try {
            this.A00 = UserJid.get(r6.A04);
        } catch (AnonymousClass02Y unused) {
        }
        C76363eQ r1 = r6.A02;
        r1 = r1 == null ? C76363eQ.A04 : r1;
        this.A02 = r1.A03;
        this.A01 = r1.A02;
        C76143e4 r0 = r1.A01;
        A13(r0 == null ? C76143e4.A0N : r0, z, z2);
    }

    public C12210hj(C12210hj r2, C007303n r3, long j, AnonymousClass0M4 r6, boolean z) {
        super(r2, r3, j, r6, z);
        this.A00 = r2.A00;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
    }
}
