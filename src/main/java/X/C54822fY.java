package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.2fY  reason: invalid class name and case insensitive filesystem */
public final class C54822fY implements AnonymousClass09O {
    public final AnonymousClass009 A00;
    public final AnonymousClass0EO A01;
    public final AnonymousClass1W0 A02;
    public final AnonymousClass09H A03;
    public final AnonymousClass1XK A04;
    public final AnonymousClass1Xa A05;
    public final AbstractC29101Xb A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
    }

    public C54822fY(AnonymousClass009 r5, AnonymousClass09H r6, AnonymousClass0EO r7, C54832fZ r8) {
        String rawString = r8.A00.getRawString();
        String str = r8.A01;
        AnonymousClass1Xa r1 = r8.A07;
        List list = r8.A02;
        this.A00 = r5;
        this.A03 = r6;
        this.A01 = r7;
        this.A04 = r8;
        this.A02 = r8;
        this.A06 = r8;
        this.A07 = rawString;
        this.A08 = str;
        this.A05 = r1;
        this.A09 = list;
    }

    public void A00(boolean z) {
        String A022;
        AnonymousClass0M5[] r4;
        AnonymousClass0M5 r5;
        AnonymousClass1Xa r8 = this.A05;
        if (r8 != null) {
            A022 = r8.A01;
        } else {
            A022 = this.A03.A02();
        }
        String str = this.A08;
        String str2 = this.A07;
        List list = this.A09;
        int i = 1;
        if (list.size() > 0) {
            int size = list.size();
            if (z) {
                size++;
            }
            r4 = new AnonymousClass0M5[size];
            int i2 = 0;
            while (i2 < list.size()) {
                AnonymousClass0OS[] r9 = new AnonymousClass0OS[i];
                r9[0] = new AnonymousClass0OS("jid", (Jid) list.get(i2));
                r4[i2] = new AnonymousClass0M5("participant", r9, null, null);
                i2++;
                i = 1;
            }
            if (z) {
                r4[list.size()] = new AnonymousClass0M5("dogfooding", null, null, null);
            }
        } else {
            r4 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(null);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        AnonymousClass0OS[] r92 = new AnonymousClass0OS[((!isEmpty ? 1 : 0) + 1 + (!isEmpty2 ? 1 : 0))];
        r92[0] = new AnonymousClass0OS("subject", str, null, (byte) 0);
        if (!isEmpty) {
            r92[1] = new AnonymousClass0OS("type", null, null, (byte) 0);
        }
        if (!isEmpty2) {
            char c = 2;
            if (isEmpty) {
                c = 1;
            }
            r92[c] = new AnonymousClass0OS("key", str2, null, (byte) 0);
        }
        if (r4 == null) {
            r5 = new AnonymousClass0M5("create", r92, null, null);
        } else {
            r5 = new AnonymousClass0M5("create", r92, r4, null);
        }
        int i3 = 5;
        if (r8 == null) {
            i3 = 4;
        }
        AnonymousClass0OS[] r42 = new AnonymousClass0OS[i3];
        r42[0] = new AnonymousClass0OS("xmlns", "w:g2", null, (byte) 0);
        r42[1] = new AnonymousClass0OS("id", A022, null, (byte) 0);
        r42[2] = new AnonymousClass0OS("type", "set", null, (byte) 0);
        r42[3] = new AnonymousClass0OS("to", C448021n.A00);
        if (r8 != null) {
            r42[4] = new AnonymousClass0OS("web", r8.A00, null, (byte) 0);
        }
        this.A03.A0B(14, A022, new AnonymousClass0M5("iq", r42, r5), this, 0);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r5) {
        Pair A0j = C002001d.A0j(r5);
        if (A0j != null) {
            int intValue = ((Number) A0j.first).intValue();
            String str2 = (String) A0j.second;
            if (intValue == 500 && str2 != null && str2.equals("internal-server-error")) {
                intValue = -500;
            }
            this.A04.AN9(intValue);
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r20) {
        AnonymousClass0M5 A0B = r20.A0B();
        AnonymousClass0M5.A01(A0B, "group");
        try {
            String A0G = A0B.A0G("id", null);
            if (A0G != null) {
                AnonymousClass02U A0A = AnonymousClass1VY.A0A(A0G);
                AnonymousClass009 r13 = this.A00;
                Jid A082 = A0B.A08(UserJid.class, "creator", r13);
                String A0G2 = A0B.A0G("subject", null);
                Jid A083 = A0B.A08(UserJid.class, "s_o", r13);
                String A0G3 = A0B.A0G("type", null);
                C64502yI r7 = new C64502yI(A0A);
                C002001d.A2q(r13, r20, r7, "group");
                StringBuilder sb = new StringBuilder("groupmgr/onGroupCreated/");
                sb.append(A0A);
                sb.append("/");
                sb.append(A082);
                sb.append("/");
                sb.append(C006803i.A04(A0B.A0G("creation", null), 0) * 1000);
                sb.append("/");
                sb.append(A0G2);
                sb.append("/");
                sb.append(A083);
                sb.append("/");
                sb.append(C006803i.A04(A0B.A0G("s_t", null), 0) * 1000);
                sb.append("/");
                sb.append(A0G3);
                sb.append("/");
                sb.append(r7.A03.keySet());
                Log.i(sb.toString());
                Map map = r7.A01;
                if (!map.isEmpty()) {
                    AnonymousClass0EO.A02(3001, map);
                }
                this.A02.ANA(A0A);
                this.A06.ANB(r7);
                return;
            }
            throw null;
        } catch (AnonymousClass02Y unused) {
            this.A04.AN9(800);
        }
    }
}
