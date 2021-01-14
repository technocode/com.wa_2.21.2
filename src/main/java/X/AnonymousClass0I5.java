package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0I5  reason: invalid class name */
public class AnonymousClass0I5 {
    public static volatile AnonymousClass0I5 A06;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass08B A01;
    public final AnonymousClass0AR A02;
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final Set A05 = new HashSet();

    public AnonymousClass0I5(AnonymousClass0AR r3, AnonymousClass08B r4) {
        this.A02 = r3;
        this.A01 = r4;
    }

    public static AnonymousClass0I5 A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0I5.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0I5(AnonymousClass0AR.A00(), AnonymousClass08B.A00);
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if ((r4 + 25000) <= android.os.SystemClock.elapsedRealtime()) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if ((r4 + 25000) <= android.os.SystemClock.elapsedRealtime()) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass02N r9, com.whatsapp.jid.UserJid r10) {
        /*
            r8 = this;
            java.util.HashMap r0 = r8.A04
            java.lang.Object r7 = r0.get(r9)
            X.1N6 r7 = (X.AnonymousClass1N6) r7
            r6 = -1
            if (r7 != 0) goto L_0x000c
            return r6
        L_0x000c:
            if (r10 == 0) goto L_0x003c
            boolean r0 = X.AnonymousClass1VY.A0Y(r9)
            if (r0 == 0) goto L_0x003c
            java.util.HashMap r0 = r7.A03
            if (r0 != 0) goto L_0x0019
            return r6
        L_0x0019:
            java.lang.Object r7 = r0.get(r10)
            X.1N4 r7 = (X.AnonymousClass1N4) r7
            if (r7 != 0) goto L_0x0022
            return r6
        L_0x0022:
            long r4 = r7.A01
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0036
            r0 = 25000(0x61a8, double:1.23516E-319)
            long r4 = r4 + r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x003b
            int r6 = r7.A00
        L_0x003b:
            return r6
        L_0x003c:
            long r4 = r7.A01
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0050
            r0 = 25000(0x61a8, double:1.23516E-319)
            long r4 = r4 + r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 == 0) goto L_0x0055
            int r6 = r7.A00
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0I5.A01(X.02N, com.whatsapp.jid.UserJid):int");
    }

    public long A02(AnonymousClass02N r3) {
        AnonymousClass1N6 r0 = (AnonymousClass1N6) this.A04.get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A02;
    }

    public GroupJid A03(AnonymousClass02N r7, long j) {
        HashMap hashMap;
        AnonymousClass1N4 r0;
        HashMap hashMap2 = this.A04;
        AnonymousClass1N6 r3 = (AnonymousClass1N6) hashMap2.get(r7);
        if (r3 == null) {
            r3 = new AnonymousClass1N6();
            hashMap2.put(r7, r3);
        }
        if (j == 0) {
            r3.A02 = 0;
        } else {
            r3.A02 = j;
        }
        r3.A01 = 0;
        Iterator it = hashMap2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (AnonymousClass1VY.A0Y((Jid) entry.getKey()) && (hashMap = ((AnonymousClass1N6) entry.getValue()).A03) != null && (r0 = (AnonymousClass1N4) hashMap.get(r7)) != null) {
                r0.A01 = 0;
                Jid jid = (Jid) entry.getKey();
                if (jid instanceof GroupJid) {
                    return (GroupJid) jid;
                }
            }
        }
        return null;
    }

    public void A04() {
        HashMap hashMap = this.A04;
        HashSet hashSet = new HashSet(hashMap.keySet());
        hashMap.clear();
        HashMap hashMap2 = this.A03;
        for (RunnableEBaseShape0S0300000_I0_0 runnableEBaseShape0S0300000_I0_0 : hashMap2.values()) {
            this.A00.removeCallbacks(runnableEBaseShape0S0300000_I0_0);
        }
        hashMap2.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.A01.A03((AnonymousClass02N) it.next());
        }
    }

    public void A05(AnonymousClass02N r8) {
        AnonymousClass1N6 r5;
        HashMap hashMap;
        if (!(!AnonymousClass1VY.A0Y(r8) || (r5 = (AnonymousClass1N6) this.A04.get(r8)) == null || (hashMap = r5.A03) == null)) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((AnonymousClass1N4) entry.getValue()).A01 = 0;
                StringBuilder sb = new StringBuilder();
                sb.append(r8.getRawString());
                sb.append(((Jid) entry.getKey()).getRawString());
                RunnableEBaseShape0S0300000_I0_0 runnableEBaseShape0S0300000_I0_0 = (RunnableEBaseShape0S0300000_I0_0) this.A03.get(sb.toString());
                if (runnableEBaseShape0S0300000_I0_0 != null) {
                    this.A00.removeCallbacks(runnableEBaseShape0S0300000_I0_0);
                }
            }
            r5.A01 = 0;
        }
    }

    public void A06(AnonymousClass02N r6) {
        boolean z;
        int type;
        if (!AnonymousClass1VY.A0T(r6)) {
            if (r6 == null || !((type = r6.getType()) == 8 || type == 7)) {
                z = false;
            } else {
                z = true;
            }
            if (!z && !AnonymousClass1VY.A0d(r6)) {
                AnonymousClass1N6 r0 = (AnonymousClass1N6) this.A04.get(r6);
                if (r0 == null || !r0.A04) {
                    AnonymousClass0AR r2 = this.A02;
                    AnonymousClass09K r1 = r2.A04;
                    if (!r1.A06 || !r1.A02) {
                        this.A05.add(r6);
                        return;
                    }
                    AnonymousClass008.A12("app/send-presence-subscription jid=", r6);
                    r2.A08.A09(Message.obtain(null, 0, 12, 0, r6));
                    A08(r6, true);
                    this.A05.remove(r6);
                }
            }
        }
    }

    public void A07(AnonymousClass02N r6, UserJid userJid) {
        String obj;
        HashMap hashMap = this.A04;
        AnonymousClass1N6 r4 = (AnonymousClass1N6) hashMap.get(r6);
        if (r4 == null) {
            r4 = new AnonymousClass1N6();
            hashMap.put(r6, r4);
        }
        if (userJid != null && AnonymousClass1VY.A0Y(r6)) {
            HashMap hashMap2 = r4.A03;
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                r4.A03 = hashMap2;
            }
            AnonymousClass1N4 r1 = (AnonymousClass1N4) hashMap2.get(userJid);
            if (r1 == null) {
                r1 = new AnonymousClass1N4();
                r4.A03.put(userJid, r1);
            }
            r1.A01 = 0;
        }
        r4.A01 = 0;
        if (userJid == null) {
            obj = r6.getRawString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(r6.getRawString());
            sb.append(userJid.getRawString());
            obj = sb.toString();
        }
        RunnableEBaseShape0S0300000_I0_0 runnableEBaseShape0S0300000_I0_0 = (RunnableEBaseShape0S0300000_I0_0) this.A03.get(obj);
        if (runnableEBaseShape0S0300000_I0_0 != null) {
            this.A00.removeCallbacks(runnableEBaseShape0S0300000_I0_0);
        }
    }

    public void A08(AnonymousClass02N r4, boolean z) {
        HashMap hashMap = this.A04;
        AnonymousClass1N6 r2 = (AnonymousClass1N6) hashMap.get(r4);
        if (r2 == null) {
            r2 = new AnonymousClass1N6();
            hashMap.put(r4, r2);
        }
        r2.A04 = z;
        if (!z) {
            r2.A02 = 0;
        }
    }

    public boolean A09(AnonymousClass02N r7) {
        if (AnonymousClass1VY.A0Y(r7)) {
            return true;
        }
        AnonymousClass1N6 r0 = (AnonymousClass1N6) this.A04.get(r7);
        if (r0 == null || r0.A02 != 1) {
            return false;
        }
        return true;
    }
}
