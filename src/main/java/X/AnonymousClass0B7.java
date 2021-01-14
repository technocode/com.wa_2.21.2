package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.0B7  reason: invalid class name */
public class AnonymousClass0B7 {
    public static volatile AnonymousClass0B7 A07;
    public final AnonymousClass01X A00;
    public final AnonymousClass09V A01;
    public final AnonymousClass0A9 A02;
    public final AnonymousClass0AM A03;
    public final AnonymousClass094 A04;
    public final C014508d A05;
    public final Map A06 = Collections.synchronizedMap(new AnonymousClass04h(200));

    public AnonymousClass0B7(AnonymousClass0A9 r3, AnonymousClass01X r4, AnonymousClass0AM r5, AnonymousClass09V r6, C014508d r7, AnonymousClass094 r8) {
        this.A02 = r3;
        this.A00 = r4;
        this.A03 = r5;
        this.A01 = r6;
        this.A05 = r7;
        this.A04 = r8;
        r5.A0K(new AnonymousClass0B8(this));
    }

    public static AnonymousClass0B7 A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0B7.class) {
                if (A07 == null) {
                    AnonymousClass0A9 A002 = AnonymousClass0A9.A00();
                    AnonymousClass01X A003 = AnonymousClass01X.A00();
                    AnonymousClass0AM A004 = AnonymousClass0AM.A00();
                    AnonymousClass09V A005 = AnonymousClass09V.A00();
                    C014508d A006 = C014508d.A00();
                    AnonymousClass096.A00();
                    A07 = new AnonymousClass0B7(A002, A003, A004, A005, A006, AnonymousClass094.A00());
                }
            }
        }
        return A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r2 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(long r9) {
        /*
            r8 = this;
            java.util.Map r7 = r8.A06
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            java.lang.Object r5 = r7.get(r6)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0059
            X.08d r0 = r8.A05
            X.0OQ r4 = r0.A03()
            X.0BK r5 = r4.A04     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "SELECT label_id FROM labeled_messages WHERE message_row_id = ? ORDER BY _id DESC"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            java.lang.String r0 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x004f }
            r3 = 0
            r1[r3] = r0     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "SELECT_LABEL_IDS_FOR_MESSAGE"
            android.database.Cursor r2 = r5.A07(r2, r1, r0)     // Catch:{ all -> 0x004f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0046 }
            r5.<init>()     // Catch:{ all -> 0x0046 }
        L_0x002d:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003f
            long r0 = r2.getLong(r3)     // Catch:{ all -> 0x0046 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0046 }
            r5.add(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x002d
        L_0x003f:
            r7.put(r6, r5)     // Catch:{ all -> 0x0046 }
            r2.close()
            goto L_0x0056
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        L_0x0056:
            r4.close()
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B7.A01(long):java.util.List");
    }
}
