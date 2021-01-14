package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2y7  reason: invalid class name and case insensitive filesystem */
public class C64392y7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public AnonymousClass02N A09;
    public AnonymousClass02N A0A;
    public UserJid A0B;
    public UserJid A0C;
    public AbstractC007503q A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public List A0J;
    public List A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public byte[] A0Q;
    public byte[] A0R;
    public final boolean A0S;

    public C64392y7(boolean z) {
        this.A0S = z;
    }

    public static final Jid A00(Class cls, Jid jid, String str, AnonymousClass009 r5) {
        if (jid == null || cls.isInstance(jid)) {
            return jid;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("web-query/failed to cast ");
        A0S2.append(jid.getClass().getName());
        A0S2.append(" to ");
        A0S2.append(cls.getName());
        A0S2.append("(");
        A0S2.append(jid);
        A0S2.append(")@");
        A0S2.append(str);
        String obj = A0S2.toString();
        Log.e(obj);
        StringBuilder sb = new StringBuilder("web-query/downcast-failure/");
        sb.append(str);
        r5.A04(sb.toString(), obj, false);
        return null;
    }

    public static void A01(AnonymousClass009 r7, AnonymousClass01I r8, AbstractC007503q r9, AnonymousClass0N0 r10, boolean z) {
        String A0G2;
        C04970Mo A082 = C02840Dr.A08();
        if ((r9 instanceof AnonymousClass0M3) && (A0G2 = r9.A0G()) != null) {
            try {
                Base64.decode(A0G2, 0);
            } catch (IllegalArgumentException unused) {
                r7.A04("webquery/invalid hash", null, false);
                r9.A0h(null);
            }
        }
        AnonymousClass0ZG.A0F(r9, new C64552yN(r8, A082, true, z, C006803i.A07(r9), null));
        C02840Dr r0 = (C02840Dr) A082.A01();
        r10.A02();
        AnonymousClass0Ms r1 = (AnonymousClass0Ms) r10.A00;
        if (r0 != null) {
            r1.A0D = r0;
            r1.A01 |= 2;
            return;
        }
        throw null;
    }

    public static final void A02(AnonymousClass0N0 r3, AnonymousClass0NK r4, AnonymousClass02W r5, UserJid userJid, List list) {
        if (r5 != null) {
            r4.A06(r5.getRawString());
        } else {
            r4.A02();
            AnonymousClass0N3 r1 = (AnonymousClass0N3) r4.A00;
            r1.A00 &= -2;
            r1.A03 = AnonymousClass0N3.A05.A03;
        }
        if (userJid != null) {
            String rawString = userJid.getRawString();
            r3.A02();
            AnonymousClass0Ms r12 = (AnonymousClass0Ms) r3.A00;
            if (rawString != null) {
                r12.A01 |= 16;
                r12.A0H = rawString;
            } else {
                throw null;
            }
        } else {
            r3.A02();
            AnonymousClass0Ms r13 = (AnonymousClass0Ms) r3.A00;
            r13.A01 &= -17;
            r13.A0H = AnonymousClass0Ms.A0T.A0H;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null) {
                    r3.A02();
                    AnonymousClass0Ms.A0A((AnonymousClass0Ms) r3.A00, str);
                }
            }
        }
    }

    public static final void A03(AnonymousClass0N0 r2, C05390Oi r3) {
        String str;
        if ((r3 instanceof C12110hZ) && (str = ((C12110hZ) r3).A00) != null) {
            r2.A02();
            AnonymousClass0Ms.A0A((AnonymousClass0Ms) r2.A00, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r0 != 5) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0N0 A04(X.AnonymousClass009 r18, X.AnonymousClass01I r19, X.C03100Eu r20, X.C02130At r21, X.AbstractC007503q r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 3380
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64392y7.A04(X.009, X.01I, X.0Eu, X.0At, X.03q, boolean):X.0N0");
    }

    public final byte[] A05(AnonymousClass009 r8, AnonymousClass01I r9, C000300f r10, C02770Dj r11, C03100Eu r12, C02130At r13) {
        AnonymousClass0N0 A042 = A04(r8, r9, r12, r13, this.A0D, false);
        byte[] A092 = A042.A01().A09();
        long A062 = ((long) r10.A06(AbstractC000400g.A4C)) * 1024;
        if (A062 <= 0 || ((long) A092.length) <= A062) {
            return A092;
        }
        A042.A02();
        AnonymousClass0Ms r1 = (AnonymousClass0Ms) A042.A00;
        r1.A0D = null;
        r1.A01 &= -3;
        EnumC449722j r14 = EnumC449722j.OVERSIZED;
        A042.A02();
        AnonymousClass0Ms.A09((AnonymousClass0Ms) A042.A00, r14);
        return A042.A01().A09();
    }

    public String toString() {
        StringBuilder A0S2 = AnonymousClass008.A0S("[id: ");
        A0S2.append(this.A0E);
        A0S2.append(" jid: ");
        A0S2.append(this.A0A);
        A0S2.append(" relay: ");
        A0S2.append(this.A0S);
        A0S2.append("]");
        return A0S2.toString();
    }
}
