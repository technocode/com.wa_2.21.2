package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0DF  reason: invalid class name */
public class AnonymousClass0DF {
    public static volatile AnonymousClass0DF A0J;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass0AH A02;
    public final AnonymousClass09T A03;
    public final AnonymousClass09G A04;
    public final AnonymousClass00S A05;
    public final AnonymousClass09A A06;
    public final AnonymousClass09V A07;
    public final AnonymousClass0DG A08;
    public final C006903j A09;
    public final AnonymousClass01K A0A;
    public final AnonymousClass0AB A0B;
    public final C014508d A0C;
    public final AnonymousClass0FL A0D;
    public final AnonymousClass01N A0E;
    public final C02330Bo A0F;
    public final C015808q A0G;
    public final AnonymousClass0FE A0H;
    public final Map A0I;

    public AnonymousClass0DF(AnonymousClass00S r2, AnonymousClass009 r3, AnonymousClass01I r4, C006903j r5, AnonymousClass0DG r6, AnonymousClass09G r7, AnonymousClass0AB r8, AnonymousClass0AH r9, C02330Bo r10, AnonymousClass01K r11, AnonymousClass09T r12, C015808q r13, AnonymousClass09A r14, AnonymousClass09V r15, AnonymousClass01N r16, C017809k r17, AnonymousClass0FE r18, C014508d r19, AnonymousClass0FL r20) {
        this.A05 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A09 = r5;
        this.A08 = r6;
        this.A04 = r7;
        this.A0B = r8;
        this.A02 = r9;
        this.A0F = r10;
        this.A0A = r11;
        this.A03 = r12;
        this.A0G = r13;
        this.A06 = r14;
        this.A07 = r15;
        this.A0E = r16;
        this.A0C = r19;
        this.A0H = r18;
        this.A0D = r20;
        this.A0I = r17.A02;
        r11.A00 = this;
    }

    public static AnonymousClass0DF A00() {
        if (A0J == null) {
            synchronized (AnonymousClass0DF.class) {
                if (A0J == null) {
                    A0J = new AnonymousClass0DF(AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), C006903j.A00(), AnonymousClass0DG.A00(), AnonymousClass09G.A00(), AnonymousClass0AB.A00(), AnonymousClass0AH.A03(), C02330Bo.A00(), AnonymousClass01K.A00(), AnonymousClass09T.A00(), C015808q.A00(), AnonymousClass09A.A02, AnonymousClass09V.A00(), AnonymousClass01N.A00(), C017809k.A00(), AnonymousClass0FE.A00(), C014508d.A00(), AnonymousClass0FL.A00());
                }
            }
        }
        return A0J;
    }

    public static boolean A01(C007303n r0, int i) {
        if (!r0.A02) {
            return i == 13 || i == 16 || i == 17;
        }
        return false;
    }

    public void A02(C007303n r9, int i, AbstractC667835x r11) {
        this.A06.A01(new RunnableEBaseShape0S0301000_I0(this, r9, i, r11, 1), 36);
    }

    public void A03(List list) {
        this.A06.A00();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C007303n r1 = (C007303n) it.next();
            AnonymousClass02N r2 = r1.A00;
            if (r2 != null) {
                AbstractC007503q A052 = this.A07.A05(r1);
                List list2 = (List) hashMap.get(r2);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(r2, list2);
                }
                list2.add(A052);
            } else {
                throw null;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            AnonymousClass02N r5 = (AnonymousClass02N) entry.getKey();
            List list3 = (List) entry.getValue();
            Collections.sort(list3, AnonymousClass2KS.A00);
            AbstractC007503q r12 = (AbstractC007503q) list3.get(list3.size() - 1);
            this.A0H.A07(r5, r12);
            AnonymousClass0DG r4 = this.A08;
            long j = r12.A0p;
            r4.A03.A00();
            C08560bL A053 = r4.A05.A05(r5);
            if (A053 == null) {
                AnonymousClass008.A12("msgstore/setchatseenonasynccommitthread/nochat/", r5);
            } else {
                StringBuilder A0W = AnonymousClass008.A0W("msgstore/setchatseenonasynccommitthread/", r5, "/");
                A0W.append(A053.A0H());
                Log.i(A0W.toString());
                AnonymousClass095 r22 = r4.A09;
                int A012 = r22.A01(r5, j);
                int A022 = r22.A02(r5, j);
                int i = A012 - A022;
                StringBuilder A0S = AnonymousClass008.A0S("msgstore/setchatseenonasynccommitthread/original unseen count=");
                A0S.append(A053.A03);
                A0S.append(" new unseen count=");
                A0S.append(i);
                Log.d(A0S.toString());
                if (i != A053.A03) {
                    A053.A0J(i, A022, A012);
                    r4.A04.A0D(A053);
                    r4.A06.A02.post(new RunnableEBaseShape2S0200000_I0_1(r4, r5, 22));
                }
            }
        }
        if (!list.isEmpty()) {
            this.A0H.A04();
        }
    }

    public boolean A04(C007303n r7, int i, AbstractC667835x r9) {
        byte b;
        this.A06.A00();
        AbstractC007503q A052 = this.A07.A05(r7);
        if (A052 == null) {
            StringBuilder sb = new StringBuilder("msgstore/update/nosuchmessage: ");
            sb.append(r7);
            Log.w(sb.toString());
            return false;
        } else if (C12080hW.A00(A052.A08, i) >= 0) {
            StringBuilder sb2 = new StringBuilder("msgstore/update/statusdowngrade: ");
            sb2.append(r7);
            sb2.append(" current:");
            sb2.append(A052.A08);
            sb2.append(" new:");
            sb2.append(i);
            Log.w(sb2.toString());
            return false;
        } else if ((i == 9 || i == 10 || i == 8) && !((b = A052.A0m) == 2 && A052.A04 == 1)) {
            StringBuilder sb3 = new StringBuilder("msgstore/update/status-played-non-ptt: ");
            sb3.append(r7);
            sb3.append(" type=");
            sb3.append(AnonymousClass0FI.A08(b));
            Log.w(sb3.toString());
            return false;
        } else {
            A052.A0T(i);
            if (i == 4) {
                AnonymousClass008.A10("msgstore/update/receipt/server/delay ", System.currentTimeMillis() - A052.A0E);
            }
            if (!(i == 11 || i == 12 || i == 16 || i == 17)) {
                this.A0B.A01(A052, -1);
            }
            if (this.A0A.A0g(A052, -1) && r9 != null) {
                r9.ANE(A052);
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r4 != 17) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x040c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0410, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0413, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0419, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0492, code lost:
        if (r29 != false) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r1.A03(r0) < r42.A0p) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        if (r30 == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01c7, code lost:
        if (r4 == 13) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x024f, code lost:
        if (r30 != false) goto L_0x0251;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020e A[Catch:{ all -> 0x05bc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.AbstractC007503q r42, com.whatsapp.jid.DeviceJid r43, int r44, long r45, X.AbstractC667835x r47) {
        /*
        // Method dump skipped, instructions count: 1482
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DF.A05(X.03q, com.whatsapp.jid.DeviceJid, int, long, X.35x):boolean");
    }
}
