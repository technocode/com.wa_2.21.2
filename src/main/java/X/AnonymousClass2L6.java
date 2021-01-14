package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2L6  reason: invalid class name */
public class AnonymousClass2L6 {
    public static volatile AnonymousClass2L6 A08;
    public final AnonymousClass01A A00;
    public final AnonymousClass01B A01;
    public final AnonymousClass00D A02;
    public final C006903j A03;
    public final AnonymousClass09Z A04;
    public final AnonymousClass2L7 A05;
    public final AnonymousClass348 A06;
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();

    public AnonymousClass2L6(AnonymousClass00S r2, C006903j r3, C73193Vv r4, AnonymousClass01A r5, AnonymousClass00D r6, AnonymousClass09Z r7, AnonymousClass01B r8, AnonymousClass2L7 r9) {
        this.A03 = r3;
        this.A00 = r5;
        this.A02 = r6;
        this.A04 = r7;
        this.A01 = r8;
        this.A05 = r9;
        this.A06 = new AnonymousClass348(r2, r4);
    }

    public static AnonymousClass2L6 A00() {
        if (A08 == null) {
            synchronized (AnonymousClass2L6.class) {
                if (A08 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C006903j A003 = C006903j.A00();
                    C73193Vv A004 = C73193Vv.A00();
                    AnonymousClass01A A005 = AnonymousClass01A.A00();
                    AnonymousClass00D A006 = AnonymousClass00D.A00();
                    AnonymousClass09Z A012 = AnonymousClass09Z.A01();
                    AnonymousClass01B A007 = AnonymousClass01B.A00();
                    if (AnonymousClass2L7.A04 == null) {
                        synchronized (AnonymousClass2L7.class) {
                            if (AnonymousClass2L7.A04 == null) {
                                AnonymousClass2L7.A04 = new AnonymousClass2L7(AnonymousClass01K.A00(), C02100Aq.A00(), C017809k.A00(), C014508d.A00());
                            }
                        }
                    }
                    A08 = new AnonymousClass2L6(A002, A003, A004, A005, A006, A012, A007, AnonymousClass2L7.A04);
                }
            }
        }
        return A08;
    }

    public static final boolean A01(AnonymousClass1VD r5) {
        C28481Um r52 = r5.A00;
        return r52.A0G == 0 && r52.A06 == 0;
    }

    public final List A02(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass02N r2 = (AnonymousClass02N) it.next();
            if (this.A00.A09(r2) != null) {
                arrayList.add(new AnonymousClass1VD(r2, this.A04.A06(r2)));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0266, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0267, code lost:
        if (r3 != null) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x026f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0273, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0276, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x027a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x027d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x027e, code lost:
        if (r3 != null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0283, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02da, code lost:
        if (r3 != null) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02e6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02ed, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0368, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0369, code lost:
        if (r3 != null) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x036e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0371, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0372, code lost:
        if (r3 != null) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0377, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.util.concurrent.atomic.AtomicBoolean r27) {
        /*
        // Method dump skipped, instructions count: 888
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2L6.A03(java.util.concurrent.atomic.AtomicBoolean):void");
    }
}
