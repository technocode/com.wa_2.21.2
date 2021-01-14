package java.lang;

public class RunnableEBaseShape0S1300000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableEBaseShape0S1300000_I0(Object obj, Object obj2, String str, Object obj3, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:899:0x17c3 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r0v491, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v492 */
    /* JADX WARN: Type inference failed for: r0v495 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v83, types: [byte[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0306, code lost:
        if (r7 == null) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1067:0x1d37, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1069:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1070:0x1d3b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1075:0x1d3e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1077:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1078:0x1d42, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0810, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0814, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x085f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0863, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0879, code lost:
        if (r9 == null) goto L_0x087b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x087b, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0883, code lost:
        if (((android.database.CursorWrapper) r10).moveToNext() == false) goto L_0x08a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0885, code lost:
        if (r11 >= r6) goto L_0x08a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0887, code lost:
        r0 = r8.A00.A02(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x088d, code lost:
        if (r0 == null) goto L_0x087c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x088f, code lost:
        if (r12 == false) goto L_0x0897;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0891, code lost:
        r2.add(r0);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x089d, code lost:
        if (r0.A0n.equals(r9) == false) goto L_0x087c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x08a0, code lost:
        ((android.database.CursorWrapper) r1).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x08a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        ((android.database.CursorWrapper) r1).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08ae, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08b7, code lost:
        r5.A10.A05(r3, r2, 20, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x09ad, code lost:
        if (r1 != null) goto L_0x09af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a98, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0a9c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0d0f, code lost:
        if (r0.A0b.A04((com.whatsapp.jid.GroupJid) r12) != false) goto L_0x0d11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0d23, code lost:
        if (r4 == -2) goto L_0x0d25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0d57, code lost:
        if (X.C006803i.A0q(r6, r0) == false) goto L_0x0d59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0dbe, code lost:
        if (X.C006803i.A0q(r6, r12) != false) goto L_0x0dc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0ebe, code lost:
        if (r1 != false) goto L_0x0ec0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x1127, code lost:
        if (X.AnonymousClass1VY.A0T(r4) != false) goto L_0x1129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01dd, code lost:
        if (r7 == null) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:0x15c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:819:0x15ca, code lost:
        if (r1 != null) goto L_0x15cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:821:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:822:0x15cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:827:0x15d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:829:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:830:0x15d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:899:0x17c3, code lost:
        if (r2 != null) goto L_0x17ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:915:0x17f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:916:0x17fa, code lost:
        if (r9 != null) goto L_0x17fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:918:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:919:0x17ff, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:924:0x1802, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:926:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:927:0x1806, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1003:0x1aa2 A[Catch:{ Exception -> 0x1b2c }] */
    /* JADX WARNING: Removed duplicated region for block: B:1028:0x1b5c  */
    /* JADX WARNING: Removed duplicated region for block: B:1100:0x036a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:715:0x126e A[Catch:{ NoSuchAlgorithmException -> 0x12a0, IOException -> 0x12a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:716:0x1270 A[Catch:{ NoSuchAlgorithmException -> 0x12a0, IOException -> 0x12a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:719:0x127a A[Catch:{ NoSuchAlgorithmException -> 0x12a0, IOException -> 0x12a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:721:0x129c A[Catch:{ NoSuchAlgorithmException -> 0x12a0, IOException -> 0x12a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:984:0x1a07  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 7720
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape0S1300000_I0.run():void");
    }
}
