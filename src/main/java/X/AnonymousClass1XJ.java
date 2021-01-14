package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1XJ  reason: invalid class name */
public class AnonymousClass1XJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public long A04;
    public AnonymousClass0MH A05;
    public Jid A06;
    public AnonymousClass02P A07;
    public AnonymousClass02P A08;
    public C007303n A09;
    public AbstractC007503q A0A;
    public AnonymousClass0OB A0B;
    public Boolean A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public byte[] A0U;
    public byte[] A0V;
    public byte[] A0W;
    public final long A0X;
    public final Jid A0Y;
    public final UserJid A0Z;
    public final C007303n A0a;
    public final AnonymousClass0AL A0b;
    public final String A0c;

    public AnonymousClass1XJ(AnonymousClass0AL r3, Jid jid, UserJid userJid, String str, long j, boolean z) {
        this.A0b = r3;
        if (jid != null) {
            this.A0Y = jid;
            this.A0Z = userJid;
            this.A0c = str;
            this.A0X = j;
            AnonymousClass02N A092 = AnonymousClass1VY.A09(jid);
            if (str != null) {
                this.A0a = new C007303n(A092, z, str);
                if (userJid != null) {
                    this.A09 = new C007303n(userJid, true, str);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public int A00() {
        Integer num = this.A0E;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int A01() {
        Integer num = this.A0H;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public Jid A02() {
        Jid jid = this.A0Y;
        return (AnonymousClass1VY.A0Y(jid) || AnonymousClass1VY.A0T(jid)) ? this.A06 : jid;
    }

    public AbstractC007503q A03(byte b) {
        AbstractC007503q r0 = this.A0A;
        if (r0 == null) {
            AnonymousClass0AL r3 = this.A0b;
            C007303n r2 = this.A09;
            if (r2 == null) {
                r2 = this.A0a;
            }
            r0 = r3.A02(r2, this.A0X, b);
            this.A0A = r0;
        }
        A05(r0);
        return this.A0A;
    }

    public String A04() {
        C007303n r0 = this.A09;
        if (r0 == null) {
            r0 = this.A0a;
        }
        return r0.toString();
    }

    public void A05(AbstractC007503q r4) {
        int i;
        this.A0A = r4;
        Jid A022 = A02();
        if (A022 instanceof DeviceJid) {
            r4.A0u = (DeviceJid) A022;
        }
        C007303n r0 = this.A09;
        if (r0 == null) {
            r0 = this.A0a;
        }
        if (r0.A02) {
            r4.A0T(4);
            this.A0A.A0v = true;
        } else {
            Jid jid = this.A06;
            if (jid != null) {
                r4.A0Y(AnonymousClass1VY.A09(jid));
            }
        }
        Integer num = this.A0H;
        if (num != null) {
            this.A0A.A07 = num.intValue();
        }
        Integer num2 = this.A0G;
        if (num2 != null) {
            this.A0A.A06 = num2.intValue();
        }
        AbstractC007503q r2 = this.A0A;
        r2.A0E = this.A0X;
        Long l = this.A0I;
        if (l != null) {
            r2.A0C = l.longValue();
        }
        r2.A0s = this.A04;
        Integer num3 = this.A0F;
        if (num3 != null) {
            r2.A0P = num3;
        }
        String str = this.A0P;
        if (str != null) {
            r2.A0Z = str;
        }
        boolean z = this.A0Q;
        r2.A0f = z;
        Long l2 = this.A0L;
        if (l2 != null) {
            r2.A0U = l2;
        }
        r2.A0A = this.A03;
        r2.A0O = this.A0B;
        r2.A0T = this.A0K;
        r2.A0S = this.A0J;
        Integer num4 = this.A0E;
        if (num4 != null) {
            r2.A00 = num4.intValue();
        }
        int i2 = this.A02;
        if (i2 != 0) {
            r2.A0O(i2);
        }
        AnonymousClass0MH r02 = this.A05;
        if (r02 != null) {
            r2.A0F = r02;
            String str2 = r02.A0G;
            if (str2 == null) {
                r2.A0b = "UNSET";
            } else {
                r2.A0b = str2;
            }
        }
        r2.A0i = this.A0T;
        if (!z || r2.A07 != 0) {
            boolean z2 = false;
            if (r2.A02 > 0) {
                z2 = true;
            }
            if (!z2 && (i = this.A01) != 0 && AnonymousClass1VY.A0Y(r2.A0n.A00)) {
                r2.A0Q(i);
            }
        } else {
            r2.A0Q(0);
            r2.A0b(null);
        }
        this.A0A.A0h = this.A0R;
    }
}
