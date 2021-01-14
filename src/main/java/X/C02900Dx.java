package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0Dx  reason: invalid class name and case insensitive filesystem */
public class C02900Dx {
    public double A00;
    public double A01;
    public float A02 = -1.0f;
    public int A03 = -1;
    public int A04 = -1;
    public long A05;
    public final UserJid A06;

    public C02900Dx(UserJid userJid) {
        this.A06 = userJid;
    }

    public void A00(C02900Dx r3) {
        AnonymousClass00E.A07(r3.A06.equals(this.A06));
        this.A05 = r3.A05;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A02 = r3.A02;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C02900Dx) {
            C02900Dx r7 = (C02900Dx) obj;
            return r7.A06.equals(this.A06) && r7.A05 == this.A05;
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[UserLocation jid=");
        A0S.append(this.A06);
        A0S.append(" latitude=");
        A0S.append(this.A00);
        A0S.append(" longitude=");
        A0S.append(this.A01);
        A0S.append(" accuracy=");
        A0S.append(this.A03);
        A0S.append(" speed=");
        A0S.append(this.A02);
        A0S.append(" bearing=");
        A0S.append(this.A04);
        A0S.append(" timestamp=");
        A0S.append(this.A05);
        A0S.append("]");
        return A0S.toString();
    }
}
