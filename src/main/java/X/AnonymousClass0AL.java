package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.List;

/* renamed from: X.0AL  reason: invalid class name */
public class AnonymousClass0AL {
    public static volatile AnonymousClass0AL A08;
    public final AnonymousClass009 A00;
    public final C017009c A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass09Y A05;
    public final C002701k A06;
    public final AnonymousClass0A6 A07;

    public AnonymousClass0AL(AnonymousClass00G r1, C002701k r2, AnonymousClass009 r3, AnonymousClass01A r4, AnonymousClass01X r5, AnonymousClass0A6 r6, AnonymousClass09Y r7, C017009c r8) {
        this.A06 = r2;
        this.A00 = r3;
        this.A03 = r1;
        this.A02 = r4;
        this.A04 = r5;
        this.A07 = r6;
        this.A05 = r7;
        this.A01 = r8;
    }

    public static AnonymousClass289 A00(GroupJid groupJid, long j) {
        AnonymousClass289 r1 = new AnonymousClass289(new C007303n(groupJid, false, ""), j);
        r1.A0G = groupJid;
        r1.A0d = null;
        r1.A0U(2);
        return r1;
    }

    public static AnonymousClass0AL A01() {
        if (A08 == null) {
            synchronized (AnonymousClass0A6.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass0AL(AnonymousClass00G.A01, C002701k.A00(), AnonymousClass009.A00(), AnonymousClass01A.A00(), AnonymousClass01X.A00(), AnonymousClass0A6.A00(), AnonymousClass09Y.A00(), C017009c.A00());
                }
            }
        }
        return A08;
    }

    public AbstractC007503q A02(C007303n r9, long j, byte b) {
        switch (b) {
            case 0:
                return new C05490Ot(r9, j);
            case 1:
                return new AnonymousClass0MI(r9, j);
            case 2:
                return new AnonymousClass0MP(r9, j);
            case 3:
                return new AnonymousClass0ZC(r9, j);
            case 4:
                return new C04830Lz(r9, j);
            case 5:
                return new C05470Or(r9, j);
            case 6:
            case 7:
            case 17:
            case 18:
            case 34:
            case 40:
            case 41:
            default:
                AnonymousClass00E.A08(false, AnonymousClass008.A0F("FMessageFactory/newFMessage/message type not handled; type=", b));
                return new C449822k(r9, j, b);
            case 8:
                return new C12220hk(r9, j);
            case 9:
                return new AnonymousClass0M2(r9, j);
            case 10:
                return new AnonymousClass0ZH(r9, j);
            case 11:
                return new AnonymousClass28B(r9, j);
            case 12:
                return new AnonymousClass0ZI(r9, j);
            case 13:
                return new AnonymousClass0ZB(r9, j);
            case 14:
                return new AnonymousClass0M1(this.A03, this.A02, this.A04, this.A01, r9, j);
            case 15:
                return new AnonymousClass0ZJ(r9, j);
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                return new C02850Ds(r9, j);
            case 19:
                return new AnonymousClass28C(r9, j);
            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
                return new AnonymousClass0ZE(r9, j);
            case 21:
                return new AnonymousClass0ZK(r9, j);
            case 22:
                return new AnonymousClass0ZM(r9, j);
            case 23:
                return new AnonymousClass0Z9(r9, j);
            case 24:
                return new AnonymousClass0ZF(r9, j);
            case 25:
                return new AnonymousClass2B4(r9, j);
            case 26:
                return new AnonymousClass2A6(r9, j);
            case 27:
                return new AnonymousClass28G(r9, j);
            case 28:
                return new AnonymousClass2CF(r9, j);
            case 29:
                return new AnonymousClass2CE(r9, j);
            case 30:
                return new AnonymousClass2A7(r9, j);
            case 31:
                return new AnonymousClass28F(r9, j);
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                return new C12200hi(r9, j);
            case 33:
                return new AnonymousClass289(r9, j);
            case 35:
                return new AnonymousClass28D(r9, j);
            case 36:
                return new C12190hh(r9, j);
            case 37:
                return new C12210hj(r9, j);
            case 38:
                return new AnonymousClass288(r9, j);
            case 39:
                return new AnonymousClass287(r9, j);
            case 42:
                return new AnonymousClass0MN(r9, j);
            case 43:
                return new AnonymousClass0MK(r9, j);
            case 44:
                return new AnonymousClass0ZA(this.A00, r9, j);
            case 45:
                return new AnonymousClass0ZN(r9, j);
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                return new AnonymousClass0ZP(r9, j);
            case 47:
                return new AnonymousClass28E(r9, j);
            case 48:
                return new C449922l(r9, j);
            case 49:
                return new AnonymousClass28A(r9, j);
        }
    }

    public final AnonymousClass0M3 A03(AnonymousClass02N r4, AnonymousClass0M4 r5, long j, int i, byte b, int i2, String str, long j2, int i3, AbstractC007503q r15) {
        AnonymousClass0A6 r0 = this.A07;
        AbstractC007503q A022 = A02(AnonymousClass0FI.A07(r0.A01, r0.A00, r4, true), j, b);
        if (A022 instanceof AnonymousClass0M3) {
            AnonymousClass0M3 r1 = (AnonymousClass0M3) A022;
            r1.A02 = r5;
            ((AbstractC007503q) r1).A01 = i;
            r1.A0T(i2);
            r1.A08 = str;
            r1.A01 = j2;
            ((AbstractC007503q) r1).A04 = i3;
            A05(r1, r15);
            return r1;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("FMessageFactory/newFMessageMedia/wrong message type; mediaWaType=", b));
    }

    public C05490Ot A04(AnonymousClass02N r8, String str, long j, C27241Os r12, List list, AbstractC007503q r14) {
        AnonymousClass0A6 r0 = this.A07;
        C05490Ot r02 = new C05490Ot(AnonymousClass0FI.A07(r0.A01, r0.A00, r8, true), j, str, r12, list);
        A05(r02, r14);
        return r02;
    }

    public void A05(AbstractC007503q r7, AbstractC007503q r8) {
        byte[] bArr;
        AbstractC007503q A09;
        if (r8 != null) {
            C05440On A0B = r8.A0B();
            AbstractC007503q r5 = null;
            if (A0B == null || !A0B.A05()) {
                bArr = null;
            } else {
                if (!A0B.A06()) {
                    byte[] A072 = A0B.A07();
                    if (A072 == null) {
                        A072 = this.A05.A0C(r8);
                    }
                    A0B.A02(A072);
                }
                bArr = A0B.A08();
            }
            if (r8 instanceof AbstractC02870Du) {
                r5 = ((AbstractC02870Du) r8).A2n(r8.A0n);
                r5.A0b = r8.A0b;
                r5.A0F = r8.A0F;
            } else {
                if (r8 instanceof AnonymousClass289) {
                    r5 = r8;
                }
                r7.A0a(r5);
                A09 = r7.A09();
                if (A09 != null && A09.A0B() != null) {
                    r7.A09().A0B().A04(bArr, true);
                    return;
                }
            }
            r5.A0P(1024);
            r5.A0U(2);
            if (r8.A0q()) {
                r5.A0A().A00 = r8.A0A().A00;
                r5.A0t |= 8;
            }
            r7.A0a(r5);
            A09 = r7.A09();
            if (A09 != null) {
            }
        }
    }
}
