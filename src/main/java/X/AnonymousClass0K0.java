package X;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.LocaleList;
import android.os.Message;
import android.text.format.DateFormat;
import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0K0  reason: invalid class name */
public class AnonymousClass0K0 {
    public static volatile AnonymousClass0K0 A0K;
    public final AnonymousClass01I A00;
    public final AnonymousClass09G A01;
    public final C000300f A02;
    public final AnonymousClass01X A03;
    public final AnonymousClass01Q A04;
    public final AnonymousClass0AP A05;
    public final C03120Ew A06;
    public final AnonymousClass09E A07;
    public final AnonymousClass0CF A08;
    public final AnonymousClass0AR A09;
    public final AnonymousClass0IA A0A;
    public final AnonymousClass0K1 A0B;
    public final C02760Di A0C;
    public final C02800Dm A0D;
    public final C02360Br A0E;
    public final C03110Ev A0F;
    public final AnonymousClass0BB A0G;
    public final AnonymousClass00T A0H;
    public final C02400Bv A0I;
    public final AnonymousClass0C4 A0J;

    public AnonymousClass0K0(AnonymousClass01I r2, AnonymousClass00T r3, C02400Bv r4, AnonymousClass0C4 r5, AnonymousClass0AR r6, C000300f r7, AnonymousClass09E r8, AnonymousClass09G r9, C02360Br r10, AnonymousClass01X r11, AnonymousClass0CF r12, C02760Di r13, AnonymousClass0AP r14, AnonymousClass0BB r15, C03110Ev r16, C02800Dm r17, C03120Ew r18, AnonymousClass01Q r19, AnonymousClass0IA r20, AnonymousClass0K1 r21) {
        this.A00 = r2;
        this.A0H = r3;
        this.A0I = r4;
        this.A0J = r5;
        this.A09 = r6;
        this.A02 = r7;
        this.A07 = r8;
        this.A01 = r9;
        this.A0E = r10;
        this.A03 = r11;
        this.A08 = r12;
        this.A0C = r13;
        this.A05 = r14;
        this.A0G = r15;
        this.A0F = r16;
        this.A0D = r17;
        this.A06 = r18;
        this.A04 = r19;
        this.A0A = r20;
        this.A0B = r21;
    }

    public static AnonymousClass0K0 A00() {
        if (A0K == null) {
            synchronized (AnonymousClass0K0.class) {
                if (A0K == null) {
                    A0K = new AnonymousClass0K0(AnonymousClass01I.A00(), C002101e.A00(), C02400Bv.A00(), AnonymousClass0C4.A00(), AnonymousClass0AR.A00(), C000300f.A00(), AnonymousClass09E.A00(), AnonymousClass09G.A00(), C02360Br.A00(), AnonymousClass01X.A00(), AnonymousClass0CF.A00(), C02760Di.A00(), AnonymousClass0AP.A00(), AnonymousClass0BB.A00(), C03110Ev.A00(), C02800Dm.A00(), C03120Ew.A00(), AnonymousClass01Q.A00(), AnonymousClass0IA.A00(), AnonymousClass0K1.A00());
                }
            }
        }
        return A0K;
    }

    public void A01(int i, List list, boolean z, boolean z2, ConditionVariable conditionVariable, ConditionVariable conditionVariable2, C007303n r20) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0F.A01((AbstractC007503q) it.next());
        }
        AnonymousClass0K1 r2 = this.A0B;
        if (r2 != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!AnonymousClass0FI.A0V((AbstractC007503q) it2.next())) {
                    throw new IllegalArgumentException("message thumb not loaded");
                }
            }
            if (r2.A04()) {
                r2.A03(null, list, i, z, z2, conditionVariable, conditionVariable2, 4, r20, null);
                return;
            }
            return;
        }
        throw null;
    }

    public void A02(AbstractC007503q r13) {
        this.A0F.A01(r13);
        AnonymousClass0K1 r1 = this.A0B;
        if (r1 == null) {
            throw null;
        } else if (!AnonymousClass0FI.A0V(r13)) {
            throw new IllegalArgumentException("message thumb not loaded");
        } else if (r1.A03.A03() && r1.A04()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(r13);
            r1.A03(null, arrayList, 3, false, false, null, null, 4, null, null);
        }
    }

    public void A03(String str) {
        int i = 0;
        boolean z = false;
        if (str == null) {
            z = true;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        ConditionVariable conditionVariable2 = new ConditionVariable();
        HashMap hashMap = new HashMap();
        AnonymousClass01Q r2 = this.A04;
        AnonymousClass0BB r1 = this.A0G;
        r2.A00.A0A();
        ArrayList A082 = r2.A08(r1);
        ArrayList arrayList = new ArrayList();
        Iterator it = A082.iterator();
        while (it.hasNext()) {
            Jid jid = (Jid) it.next();
            if (!AnonymousClass1VY.A0d(jid)) {
                arrayList.add(jid);
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("web-message-send-methods/send-web-response-conversations: conversation list size is ");
        A0S.append(arrayList.size());
        Log.i(A0S.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AnonymousClass02N r22 = (AnonymousClass02N) it2.next();
            AbstractC007503q r12 = null;
            if (i < 1000 || AnonymousClass1VY.A0T(r22) || !z) {
                r12 = this.A05.A01(r22);
                i++;
            }
            hashMap.put(r22, r12);
        }
        try {
            this.A0H.ANF(new RunnableEBaseShape0S0410000_I0(this, hashMap, conditionVariable, z, conditionVariable2, 2));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("app/xmpp/send/qr_send_conv preempt:");
            sb.append(z);
            sb.append(" recents dispatch error ");
            Log.e(sb.toString(), e);
            conditionVariable2.open();
        }
        try {
            this.A0H.ANF(new RunnableC50462Uu(this, hashMap, str, z, conditionVariable, conditionVariable2));
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("app/xmpp/send/qr_send_conv preempt:");
            sb2.append(z);
            sb2.append(" chats/before dispatch error ");
            Log.e(sb2.toString(), e2);
            conditionVariable.open();
        }
    }

    public void A04(String str, String str2, String str3, String str4, int i) {
        String A052;
        int i2;
        C02400Bv r3 = this.A0I;
        if (!r3.A03() && str != null) {
            AnonymousClass01X r0 = this.A03;
            String A032 = r0.A03();
            String A042 = r0.A04();
            AnonymousClass0C4 r4 = this.A0J;
            byte[] bArr = new byte[32];
            r4.A0Q.nextBytes(bArr);
            String encodeToString = Base64.encodeToString(bArr, 2);
            if (Build.VERSION.SDK_INT >= 24) {
                A052 = LocaleList.getDefault().toLanguageTags();
            } else {
                A052 = AbstractC002201f.A05(Locale.getDefault());
            }
            byte[] A043 = r3.A04(r4.A02(str3));
            AnonymousClass0AR r02 = this.A09;
            if (r02.A04.A06) {
                boolean is24HourFormat = DateFormat.is24HourFormat(r02.A06.A00);
                AnonymousClass0AW r42 = r02.A00.A00;
                double A002 = r42.A00();
                if (Double.isNaN(A002)) {
                    i2 = 0;
                } else {
                    i2 = (int) A002;
                }
                r02.A08.A09(Message.obtain(null, 0, 43, 0, new AnonymousClass0K5(str, str2, str4, str3, encodeToString, i, A043, i2, r42.A01(), r02.A05.A00, A032, A042, A052, is24HourFormat)));
            }
        }
        AnonymousClass0C4 r6 = this.A0J;
        r6.A0L.A02(str2, false);
        if (i == 0 || i == 1) {
            A03(null);
            AnonymousClass0IA r43 = this.A0A;
            boolean z = false;
            if (0 == 0) {
                z = true;
            }
            r43.A0A.ANF(new RunnableC50442Us(r43, null, z));
        }
        C02360Br r44 = this.A0E;
        r44.A0C.ANF(new RunnableEBaseShape0S1100000_I0(r44, r6.A03(), 5));
    }

    public void A05(String str, List list, int i, HashMap hashMap) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0F.A01((AbstractC007503q) it.next());
        }
        AnonymousClass0K1 r2 = this.A0B;
        if (r2 != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!AnonymousClass0FI.A0V((AbstractC007503q) it2.next())) {
                    throw new IllegalArgumentException("message thumb not loaded");
                }
            }
            r2.A03(str, list, -1, true, false, null, null, i, null, hashMap);
            return;
        }
        throw null;
    }
}
