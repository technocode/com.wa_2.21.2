package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.01R  reason: invalid class name */
public class AnonymousClass01R {
    public static volatile AnonymousClass01R A05;
    public final AnonymousClass01I A00;
    public final C000300f A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass01P A03;
    public final AnonymousClass0A6 A04;

    public AnonymousClass01R(AnonymousClass01I r1, C000300f r2, AnonymousClass01A r3, AnonymousClass0A6 r4, AnonymousClass01P r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public static C05390Oi A00(C007303n r2, long j, int i) {
        if (i == 6) {
            return new C12120ha(r2, j);
        }
        if (i == 28 || i == 10) {
            return new C12130hb(r2, j, i);
        }
        if (C001801b.A1k(i)) {
            if (i == 37) {
                return new AnonymousClass2A5(r2, j);
            }
            if (i == 39) {
                return new AnonymousClass2A4(r2, j);
            }
            return new C05480Os(r2, j, i);
        } else if (C001801b.A1i(i)) {
            if (i == 1) {
                return new C12100hY(r2, j);
            }
            if (i == 56) {
                return new C12230hl(r2, j);
            }
            return new C05400Oj(r2, j, i);
        } else if (C001801b.A1j(i)) {
            return new C12110hZ(r2, j, i);
        } else {
            if (i == 57) {
                return new C12140hc(r2, j);
            }
            if (i == 58) {
                return new C12160he(r2, j);
            }
            if (i == 59) {
                return new C12240hm(r2, j);
            }
            if (i == 60) {
                return new C12170hf(r2, j);
            }
            if (i == 19) {
                return new C12150hd(r2, j);
            }
            if (i == 61) {
                return new C12180hg(r2, j);
            }
            return new C05390Oi(r2, j, i);
        }
    }

    public static AnonymousClass01R A01() {
        if (A05 == null) {
            synchronized (AnonymousClass0A6.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass01R(AnonymousClass01I.A00(), C000300f.A00(), AnonymousClass01A.A00(), AnonymousClass0A6.A00(), AnonymousClass01P.A00());
                }
            }
        }
        return A05;
    }

    public C05390Oi A02(AnonymousClass02N r4, long j, UserJid userJid, int i, int i2) {
        AnonymousClass0A6 r0 = this.A04;
        C12140hc r02 = (C12140hc) A00(AnonymousClass0FI.A07(r0.A01, r0.A00, r4, true), j, 57);
        r02.A0Y(userJid);
        r02.A00 = i;
        r02.A01 = i2;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r8 == 3) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05390Oi A03(com.whatsapp.jid.GroupJid r5, long r6, int r8, java.lang.String r9, java.util.List r10) {
        /*
            r4 = this;
            r3 = 1
            r0 = 2
            if (r8 == r0) goto L_0x0008
            r0 = 3
            r2 = 0
            if (r8 != r0) goto L_0x0009
        L_0x0008:
            r2 = 1
        L_0x0009:
            java.lang.String r1 = "This method not suppose to be used for action = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00E.A08(r2, r0)
            X.0A6 r0 = r4.A04
            X.00S r1 = r0.A01
            X.01I r0 = r0.A00
            X.03n r0 = X.AnonymousClass0FI.A07(r1, r0, r5, r3)
            X.0Oi r0 = A00(r0, r6, r8)
            r0.A0d(r9)
            if (r10 == 0) goto L_0x0030
            r0.A0m(r10)
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01R.A03(com.whatsapp.jid.GroupJid, long, int, java.lang.String, java.util.List):X.0Oi");
    }

    public C05390Oi A04(AnonymousClass1XX r8, AnonymousClass02U r9, UserJid userJid, int i, long j) {
        C12230hl r0 = (C12230hl) A06(r8, r9, j, 56, null);
        r0.A0Y(userJid);
        r0.A00 = i;
        return r0;
    }

    public C05390Oi A05(AnonymousClass1XX r8, AnonymousClass02U r9, C11220fu r10) {
        C05400Oj A06 = A06(r8, r9, r10.A00 * 1000, 27, null);
        A06.A0d(r10.A02);
        A06.A0Y(r10.A01);
        return A06;
    }

    public C05400Oj A06(AnonymousClass1XX r9, AnonymousClass02X r10, long j, int i, C05340Od r14) {
        boolean A1i = C001801b.A1i(i);
        StringBuilder sb = new StringBuilder("Not supposed to be used for action = ");
        sb.append(i);
        AnonymousClass00E.A08(A1i, sb.toString());
        if (r9 == null) {
            boolean z = false;
            if (r10 != null) {
                z = true;
            }
            AnonymousClass00E.A07(z);
            AnonymousClass0A6 r0 = this.A04;
            return (C05400Oj) A00(AnonymousClass0FI.A07(r0.A01, r0.A00, r10, true), j, i);
        } else if (i == 1) {
            return new C12100hY(r9, r14, j);
        } else {
            if (i == 56) {
                return new C12230hl(r9, r14, j);
            }
            return new C05400Oj(r9, r14, j, i);
        }
    }

    public C05400Oj A07(AnonymousClass1XX r10, AnonymousClass02X r11, long j, int i, UserJid userJid) {
        StringBuilder sb = new StringBuilder("SystemMessageFactory/newParticipantStatusMessage; stanzaKey=");
        sb.append(r10);
        sb.append("; gjid=");
        sb.append(r11);
        sb.append("; action=");
        AnonymousClass008.A1L(sb, i);
        C05400Oj A06 = A06(r10, r11, j, i, null);
        A06.A0Y(userJid);
        if (i == 4 && this.A00.A09(userJid)) {
            A06.A00 = 1;
        }
        return A06;
    }

    public C05400Oj A08(AnonymousClass1XX r13, AnonymousClass02X r14, long j, int i, UserJid userJid, List list, C05340Od r20, long j2) {
        StringBuilder sb = new StringBuilder("SystemMessageFactory/newParticipantsStatusMessage; stanzaKey=");
        sb.append(r13);
        sb.append("; gjid=");
        sb.append(r14);
        sb.append("; action=");
        sb.append(i);
        sb.append("; author=");
        sb.append(userJid);
        Log.i(sb.toString());
        C05400Oj A06 = A06(r13, r14, j, i, r20);
        A06.A0Y(userJid);
        A06.A0m(list);
        A06.A03 = j2;
        if (i == 12 || i == 20) {
            AnonymousClass01I r0 = this.A00;
            r0.A04();
            if (list.contains(r0.A03)) {
                A06.A00 = 1;
            }
        }
        return A06;
    }

    public C12110hZ A09(AnonymousClass02N r4, long j, int i, String str) {
        boolean A1j = C001801b.A1j(i);
        StringBuilder sb = new StringBuilder("Not supposed to be used for action = ");
        sb.append(i);
        AnonymousClass00E.A08(A1j, sb.toString());
        AnonymousClass0A6 r0 = this.A04;
        C12110hZ r02 = (C12110hZ) A00(AnonymousClass0FI.A07(r0.A01, r0.A00, r4, true), j, i);
        r02.A00 = str;
        return r02;
    }

    public C05480Os A0A(AnonymousClass02N r4, long j, int i) {
        AnonymousClass0A6 r0 = this.A04;
        return (C05480Os) A00(AnonymousClass0FI.A07(r0.A01, r0.A00, r4, true), j, i);
    }
}
