package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0IA  reason: invalid class name */
public class AnonymousClass0IA {
    public static volatile AnonymousClass0IA A0D;
    public final AnonymousClass01J A00;
    public final AnonymousClass09K A01;
    public final AnonymousClass01A A02;
    public final C014308b A03;
    public final AnonymousClass0IB A04;
    public final AnonymousClass00D A05;
    public final AnonymousClass0AN A06;
    public final AnonymousClass01P A07;
    public final C02800Dm A08;
    public final AnonymousClass0BB A09;
    public final AnonymousClass00T A0A;
    public final C02400Bv A0B;
    public final AnonymousClass0C4 A0C;

    public AnonymousClass0IA(AnonymousClass00T r1, C02400Bv r2, AnonymousClass0C4 r3, AnonymousClass01J r4, AnonymousClass0AN r5, AnonymousClass01A r6, C014308b r7, AnonymousClass09K r8, AnonymousClass0BB r9, C02800Dm r10, AnonymousClass01P r11, AnonymousClass00D r12, AnonymousClass0IB r13) {
        this.A0A = r1;
        this.A0B = r2;
        this.A0C = r3;
        this.A00 = r4;
        this.A06 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A01 = r8;
        this.A09 = r9;
        this.A08 = r10;
        this.A07 = r11;
        this.A05 = r12;
        this.A04 = r13;
    }

    public static AnonymousClass0IA A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0AR.class) {
                if (A0D == null) {
                    A0D = new AnonymousClass0IA(C002101e.A00(), C02400Bv.A00(), AnonymousClass0C4.A00(), AnonymousClass01J.A00(), AnonymousClass0AN.A00(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass09K.A07, AnonymousClass0BB.A00(), C02800Dm.A00(), AnonymousClass01P.A00(), AnonymousClass00D.A00(), AnonymousClass0IB.A00());
                }
            }
        }
        return A0D;
    }

    public String A01() {
        StringBuilder sb = new StringBuilder();
        int i = this.A04.A00.getInt("contact_version", 0);
        AnonymousClass008.A0v("contact-sync-prefs/getversion=", i);
        sb.append(i);
        sb.append(this.A05.A00.getString("web_contact_checksum", "unset"));
        return sb.toString();
    }

    public List A02(List list) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C007003k r3 = (C007003k) it.next();
            if (r3 != null) {
                if (r3.A02(AnonymousClass02N.class) != null) {
                    boolean z = false;
                    String str2 = null;
                    if (!r3.A08()) {
                        str = (TextUtils.isEmpty(r3.A0H) || r3.A08 == null) ? null : r3.A0H;
                        i = -1;
                    } else if (this.A03 != null) {
                        str = r3.A04();
                        i = r3.A03;
                        AnonymousClass0J9 A0C2 = this.A07.A02.A0C((UserJid) r3.A02(UserJid.class));
                        if (A0C2 != null && A0C2.A01()) {
                            z = true;
                        }
                    } else {
                        throw null;
                    }
                    Jid A022 = r3.A02(AnonymousClass02N.class);
                    if (A022 != null) {
                        AnonymousClass02N r9 = (AnonymousClass02N) A022;
                        if (!TextUtils.isEmpty(r3.A0F)) {
                            str2 = r3.A0F;
                        }
                        arrayList.add(new AnonymousClass3LO(r9, str2, str, i, z, r3.A0X, r3.A0O, this.A09.A08(r9).A0G));
                    } else {
                        throw null;
                    }
                } else if (r3.A09 != null) {
                    StringBuilder sb = new StringBuilder("Contact with jid but not chat jid ");
                    sb.append(r3);
                    Log.w(sb.toString());
                }
            }
        }
        return arrayList;
    }

    public void A03(C007003k r3) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r3);
        A05(arrayList);
    }

    public void A04(AnonymousClass02N r2) {
        C007003k A092;
        if (this.A0B.A03() && (A092 = this.A02.A09(r2)) != null) {
            A03(A092);
        }
    }

    public void A05(List list) {
        if (this.A0B.A03() && list.size() != 0) {
            this.A0A.ANF(new RunnableEBaseShape0S1200000_I0(this, list, null, 14));
        }
    }
}
