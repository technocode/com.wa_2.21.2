package X;

import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0L1  reason: invalid class name */
public class AnonymousClass0L1 {
    public static volatile AnonymousClass0L1 A0M;
    public List A00;
    public final AnonymousClass02M A01;
    public final C03170Fb A02;
    public final C27331Pi A03;
    public final AnonymousClass01A A04;
    public final C014308b A05;
    public final AnonymousClass0L2 A06;
    public final AnonymousClass03P A07;
    public final AnonymousClass00G A08;
    public final AnonymousClass03C A09;
    public final AnonymousClass00D A0A;
    public final AnonymousClass01X A0B;
    public final AnonymousClass0FS A0C;
    public final AnonymousClass0A8 A0D;
    public final AnonymousClass01T A0E;
    public final C014508d A0F;
    public final C04270Js A0G;
    public final AnonymousClass0BB A0H;
    public final C04260Jr A0I;
    public final AnonymousClass00T A0J;
    public final AnonymousClass0JO A0K;
    public final AnonymousClass0Fh A0L;

    public AnonymousClass0L1(AnonymousClass00G r2, AnonymousClass02M r3, C03170Fb r4, AnonymousClass00T r5, AnonymousClass0JO r6, AnonymousClass0L2 r7, AnonymousClass0Fh r8, C27331Pi r9, AnonymousClass01A r10, AnonymousClass03P r11, C014308b r12, AnonymousClass01X r13, C04260Jr r14, AnonymousClass0FS r15, AnonymousClass0BB r16, C04270Js r17, C014508d r18, AnonymousClass00D r19, AnonymousClass0A8 r20, AnonymousClass03C r21, AnonymousClass01T r22) {
        this.A08 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A0J = r5;
        this.A0K = r6;
        this.A06 = r7;
        this.A0L = r8;
        this.A03 = r9;
        this.A04 = r10;
        this.A07 = r11;
        this.A05 = r12;
        this.A0B = r13;
        this.A0I = r14;
        this.A0C = r15;
        this.A0H = r16;
        this.A0G = r17;
        this.A0F = r18;
        this.A0A = r19;
        this.A0D = r20;
        this.A09 = r21;
        this.A0E = r22;
    }

    public static AnonymousClass0L1 A00() {
        if (A0M == null) {
            synchronized (AnonymousClass0L1.class) {
                if (A0M == null) {
                    A0M = new AnonymousClass0L1(AnonymousClass00G.A01, AnonymousClass02M.A00(), C03170Fb.A00(), C002101e.A00(), AnonymousClass0JO.A00, AnonymousClass0L2.A01(), AnonymousClass0Fh.A00(), C27331Pi.A00(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass01X.A00(), C04260Jr.A00(), AnonymousClass0FS.A00(), AnonymousClass0BB.A00(), C04270Js.A00(), C014508d.A00(), AnonymousClass00D.A00(), AnonymousClass0A8.A00, AnonymousClass03C.A00(), AnonymousClass01T.A00());
                }
            }
        }
        return A0M;
    }

    public final String A01(AnonymousClass0QM r6) {
        ArrayList arrayList = new ArrayList();
        if (r6.A05 == null) {
            return null;
        }
        Iterator it = ((AbstractCollection) r6.A04()).iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass0QP) it.next()).A02);
        }
        return C002001d.A1h(r6.A05, arrayList, this.A04, this.A0E, this.A05);
    }

    public void A02() {
        A04();
        if (!this.A00.isEmpty()) {
            StringBuilder A0S = AnonymousClass008.A0S("missedcallnotification/clear ");
            A0S.append(this.A00.size());
            Log.i(A0S.toString());
            AnonymousClass008.A0j(this.A0A, "first_missed_call");
            this.A00.clear();
            A03();
            AnonymousClass02M r3 = this.A01;
            r3.A02.post(new RunnableEBaseShape3S0100000_I0_3(this.A0D, 28));
            this.A03.A02();
        }
    }

    public void A03() {
        AnonymousClass008.A1H("missedcallnotification/clearNotification updateHash=", true);
        this.A09.A04(null, 4, "MissedCallNotification1");
        AnonymousClass00D r2 = this.A0A;
        AnonymousClass008.A0m(r2, "dismissed_call_notification_hash", r2.A00.getString("last_call_notification_hash", null));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0221, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0225, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x022f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0233, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (r1 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0122, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A04() {
        /*
        // Method dump skipped, instructions count: 624
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0L1.A04():void");
    }

    public void A05(boolean z) {
        C014508d r0 = this.A0F;
        r0.A05();
        if (r0.A01) {
            this.A0J.ANF(new RunnableEBaseShape0S0110000_I0(this, z, 5));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r1.A0E == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r1.A0E != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r1.A0D() == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        if (r9 != false) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0419  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A06(boolean r27) {
        /*
        // Method dump skipped, instructions count: 1222
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0L1.A06(boolean):void");
    }
}
