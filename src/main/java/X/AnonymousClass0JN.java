package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0JN  reason: invalid class name */
public class AnonymousClass0JN {
    public static volatile AnonymousClass0JN A0D;
    public boolean A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass04j A02;
    public final AnonymousClass00S A03;
    public final C002701k A04;
    public final AnonymousClass0EN A05;
    public final AnonymousClass0CH A06;
    public final AnonymousClass0JP A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass0JO A09;
    public final AnonymousClass0Fh A0A;
    public final Runnable A0B;
    public final ArrayList A0C = new ArrayList();

    public AnonymousClass0JN(AnonymousClass00S r3, C002701k r4, AnonymousClass00T r5, AnonymousClass0JO r6, AnonymousClass0Fh r7, AnonymousClass0EN r8, AnonymousClass04j r9, AnonymousClass0CH r10, AnonymousClass0JP r11) {
        this.A03 = r3;
        this.A04 = r4;
        this.A08 = r5;
        this.A09 = r6;
        this.A0A = r7;
        this.A05 = r8;
        this.A02 = r9;
        this.A06 = r10;
        this.A07 = r11;
        this.A0B = new RunnableEBaseShape3S0100000_I0_3(this, 16);
    }

    public static AnonymousClass0JN A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0JN.class) {
                if (A0D == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C002701k A003 = C002701k.A00();
                    AnonymousClass00T A004 = C002101e.A00();
                    AnonymousClass0JO r10 = AnonymousClass0JO.A00;
                    AnonymousClass0Fh A005 = AnonymousClass0Fh.A00();
                    AnonymousClass0EN A006 = AnonymousClass0EN.A00();
                    AnonymousClass04j A007 = AnonymousClass04j.A00();
                    AnonymousClass0CH A008 = AnonymousClass0CH.A00();
                    if (AnonymousClass0JP.A03 == null) {
                        synchronized (AnonymousClass0JP.class) {
                            AnonymousClass0JP.A03 = new AnonymousClass0JP(C006903j.A00(), AnonymousClass0BB.A00(), AnonymousClass00D.A00());
                        }
                    }
                    A0D = new AnonymousClass0JN(A002, A003, A004, r10, A005, A006, A007, A008, AnonymousClass0JP.A03);
                }
            }
        }
        return A0D;
    }

    public void A01() {
        Log.i("mediaautodownload/updatequeue");
        this.A08.ANF(new RunnableEBaseShape3S0100000_I0_3(this, 17));
    }

    public void A02(AnonymousClass0M3 r22, int i, AnonymousClass1W7 r24, boolean z) {
        long j;
        long j2;
        long j3;
        StringBuilder A0S = AnonymousClass008.A0S("mediaautodownload/queue ");
        A0S.append(r22.A09);
        Log.i(A0S.toString());
        Log.i("mediaautodownload/getPriorityValue");
        long A052 = this.A03.A05();
        int A032 = this.A04.A03(60);
        AnonymousClass02N r5 = r22.A0n.A00;
        if (!(r5 == null || A032 == 0)) {
            Log.i("mediaautodownload/getPriorityValue/getHeuristicDownloadPriority");
            AnonymousClass0JP r2 = this.A07;
            if (r2 != null) {
                if (!AnonymousClass1VY.A0b(r5)) {
                    if (r22.A0g) {
                        byte b = r22.A0m;
                        if (b == 42) {
                            j3 = 40000;
                        } else if (b == 20) {
                            j3 = 30000;
                        } else if (b == 1) {
                            j3 = 20000;
                        }
                        A052 += j3;
                    }
                    long j4 = 0;
                    long j5 = r2.A00.A00.getLong("last_read_conversation_time", 0);
                    C08560bL r0 = (C08560bL) r2.A01.A0A().get(r5);
                    if (r0 == null) {
                        j2 = 0;
                    } else {
                        j2 = r0.A0L;
                        j4 = j2;
                    }
                    boolean z2 = false;
                    if (86400000 + j2 < j5) {
                        z2 = true;
                    }
                    boolean A092 = r2.A02.A08(r5).A09();
                    byte b2 = r22.A0m;
                    if (!(b2 == 20 || b2 == 42)) {
                        A052 = b2 == 1 ? A052 - 172800000 : A052 - 345600000;
                    }
                    if (A092) {
                        if (z2) {
                            j = 259200000;
                        } else {
                            A052 -= 86400000;
                        }
                    } else if (z2) {
                        A052 -= 172800000;
                    }
                    A052 = (A052 - j5) + j4;
                } else if (r22.A0m == 1) {
                    A052 -= 345600000;
                } else {
                    j = 518400000;
                }
                A052 -= j;
            } else {
                throw null;
            }
        }
        if (AnonymousClass0Fh.A02()) {
            Log.i("mediaautodownload/queue waiting to download because call is active");
            C49952Sv r14 = new C49952Sv(r22, i, A052, r24, z);
            ArrayList arrayList = this.A0C;
            synchronized (arrayList) {
                arrayList.add(r14);
            }
            return;
        }
        this.A06.A07(r22, i, r24, A052, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c3, code lost:
        if (X.C006803i.A0q(r3, r9.A09) == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01c9, code lost:
        if (r1.A08 == null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e5, code lost:
        if (r1.A01((X.AnonymousClass02N) r0) == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01eb, code lost:
        if (r2.A08 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r9 >= r0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        if (r7.A05(r20) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        if (r7.A05(r20) != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0122, code lost:
        if ((r7.A04.A05() - r3.getLong("status_tab_last_opened_time", 0)) > 1209600000) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0147, code lost:
        if (r0.A08 != null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x014c, code lost:
        if (r13.A08 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass0M3 r20, boolean r21, int r22) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JN.A03(X.0M3, boolean, int):void");
    }
}
