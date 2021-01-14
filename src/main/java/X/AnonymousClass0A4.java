package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0A4  reason: invalid class name */
public class AnonymousClass0A4 {
    public static volatile AnonymousClass0A4 A05;
    public final AnonymousClass01I A00;
    public final C000300f A01;
    public final AnonymousClass0A5 A02;
    public final C006903j A03;
    public final AnonymousClass095 A04;

    public AnonymousClass0A4(AnonymousClass01I r1, C006903j r2, AnonymousClass095 r3, C000300f r4, AnonymousClass0A5 r5) {
        this.A00 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public static AnonymousClass0A4 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0A4.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0A4(AnonymousClass01I.A00(), C006903j.A00(), AnonymousClass095.A00(), C000300f.A00(), AnonymousClass0A5.A00());
                }
            }
        }
        return A05;
    }

    public final boolean A01(AnonymousClass02N r5, long j, int i, long j2, C007103l r11) {
        if (!this.A01.A0D(AbstractC000400g.A0t) || !AnonymousClass1VY.A0e(r5)) {
            return false;
        }
        if (r11 == null) {
            return true;
        }
        if (i == r11.expiration || j2 > j) {
            return false;
        }
        long j3 = r11.ephemeralSettingTimestamp;
        if (j2 == j3) {
            UserJid of = UserJid.of(r5);
            if (of != null) {
                AnonymousClass01I r0 = this.A00;
                r0.A04();
                UserJid userJid = r0.A03;
                return userJid != null && of.getRawString().compareTo(userJid.getRawString()) < 0;
            }
            throw null;
        } else if (j2 > j3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean A02(AbstractC007503q r7) {
        C08560bL A052 = this.A03.A05(r7.A0n.A00);
        return A052 != null && r7.A0p <= A052.A0G;
    }
}
