package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0RD  reason: invalid class name */
public class AnonymousClass0RD extends RunnableEmptyBase implements Runnable {
    public final AnonymousClass0I0 A00;
    public final /* synthetic */ AnonymousClass0I7 A01;

    public AnonymousClass0RD(AnonymousClass0I7 r1, AnonymousClass0I0 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void A00(AnonymousClass0QK r7) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass0I0 r4 = this.A00;
        List<AnonymousClass0RC> list = r4.A03;
        for (AnonymousClass0RC r1 : list) {
            if (!r1.A00) {
                arrayList.add(r1);
                r1.A01 = r7;
                r1.A02 = true;
                r1.A03.countDown();
            }
        }
        list.removeAll(arrayList);
        if (!list.isEmpty()) {
            r4.A01 = false;
            this.A01.A03(r4);
        }
    }

    public final void A01(AnonymousClass0QK r4) {
        for (AnonymousClass0I1 r1 : this.A00.A03) {
            r1.A01 = r4;
            r1.A02 = true;
            r1.A03.countDown();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v55, resolved type: X.00Y */
    /* JADX DEBUG: Multi-variable search result rejected for r1v20, resolved type: X.00Y */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: android.content.SharedPreferences */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0790, code lost:
        if (r9 == X.AnonymousClass0R7.PHONEBOOK_AND_SIDELIST) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x079a, code lost:
        if (r9 == X.AnonymousClass0R7.PHONEBOOK_AND_SIDELIST) goto L_0x079c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07ab, code lost:
        if (r14 == false) goto L_0x07ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0aea, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0aeb, code lost:
        if (r7 != 0) goto L_0x0aed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0af0, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0b5b, code lost:
        if (r1 != null) goto L_0x0b5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0c70, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0c74, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0c77, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0c7b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0cc7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0cc8, code lost:
        if (r10 != null) goto L_0x0cca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0ccd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0cd2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0cd3, code lost:
        if (r10 != null) goto L_0x0cd5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0cd8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0ce7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0ceb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0d0c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0d10, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0210, code lost:
        if (r6 != false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x021c, code lost:
        if (r0.A0O.A03() == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x027b, code lost:
        if (r0.A0N.A05.A03() == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02f9, code lost:
        if (r4 == X.AnonymousClass0R7.PHONEBOOK_AND_SIDELIST) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0306, code lost:
        if (r4 == X.AnonymousClass0R7.PHONEBOOK_AND_SIDELIST) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0329, code lost:
        if (r3 == null) goto L_0x032b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x035d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0c98  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 3358
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RD.run():void");
    }
}
