package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2yU  reason: invalid class name and case insensitive filesystem */
public class C64622yU {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final AnonymousClass02N A06;
    public final UserJid A07;
    public final UserJid A08;
    public final C007303n A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C64622yU(C007303n r4, AnonymousClass02N r5, UserJid userJid, UserJid userJid2, boolean z, boolean z2, long j, boolean z3, int i, int i2, boolean z4, long j2, int i3, long j3) {
        this.A09 = r4;
        if (r4 != null) {
            AnonymousClass02N r0 = r4.A00;
            if (r0 != null) {
                boolean equals = r5.equals(r0);
                StringBuilder sb = new StringBuilder("key=");
                sb.append(r4);
                sb.append("; jid=");
                sb.append(r5);
                AnonymousClass00E.A0A(equals, sb.toString());
            } else {
                throw null;
            }
        }
        this.A06 = r5;
        this.A08 = userJid;
        this.A07 = userJid2;
        this.A0B = z;
        this.A04 = j;
        this.A0A = z2;
        this.A0D = z3;
        this.A02 = i;
        this.A00 = i2;
        this.A0C = z4;
        this.A05 = j2;
        this.A01 = i3;
        this.A03 = j3;
    }
}
