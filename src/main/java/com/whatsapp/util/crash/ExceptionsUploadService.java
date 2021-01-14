package com.whatsapp.util.crash;

import X.AnonymousClass009;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00Y;
import X.AnonymousClass04i;
import X.AnonymousClass04j;
import X.AnonymousClass0CW;
import X.AnonymousClass0PE;
import X.AnonymousClass36N;
import X.AnonymousClass36O;
import X.AnonymousClass36P;
import X.AnonymousClass36Q;
import X.AnonymousClass36R;
import X.C000300f;
import X.C001901c;

public class ExceptionsUploadService extends AnonymousClass0PE {
    public final C001901c A00;
    public final AnonymousClass36N A01;
    public final AnonymousClass36P A02;
    public final AnonymousClass36Q A03;
    public final AnonymousClass36R A04;

    public ExceptionsUploadService() {
        if (AnonymousClass36P.A04 == null) {
            synchronized (AnonymousClass36P.class) {
                if (AnonymousClass36P.A04 == null) {
                    AnonymousClass36P.A04 = new AnonymousClass36P(AnonymousClass00G.A01, AnonymousClass00Y.A00(), C001901c.A00(), AnonymousClass36O.A00());
                }
            }
        }
        this.A02 = AnonymousClass36P.A04;
        if (AnonymousClass36N.A06 == null) {
            synchronized (AnonymousClass36N.class) {
                if (AnonymousClass36N.A06 == null) {
                    AnonymousClass36N.A06 = new AnonymousClass36N(AnonymousClass00G.A01, AnonymousClass04i.A00(), C000300f.A00(), AnonymousClass00D.A00(), AnonymousClass04j.A00(), AnonymousClass36O.A00());
                }
            }
        }
        this.A01 = AnonymousClass36N.A06;
        if (AnonymousClass36R.A04 == null) {
            synchronized (AnonymousClass36P.class) {
                if (AnonymousClass36R.A04 == null) {
                    AnonymousClass36R.A04 = new AnonymousClass36R(AnonymousClass00G.A01, AnonymousClass00Y.A00(), C001901c.A00(), AnonymousClass36O.A00());
                }
            }
        }
        this.A04 = AnonymousClass36R.A04;
        if (AnonymousClass36Q.A04 == null) {
            synchronized (AnonymousClass36Q.class) {
                if (AnonymousClass36Q.A04 == null) {
                    AnonymousClass36Q.A04 = new AnonymousClass36Q(AnonymousClass00G.A01, AnonymousClass009.A00(), AnonymousClass04j.A00(), AnonymousClass0CW.A00());
                }
            }
        }
        this.A03 = AnonymousClass36Q.A04;
        this.A00 = C001901c.A00();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: X.04j */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0318, code lost:
        r13 = new java.lang.StringBuilder();
        r13.append("ANRExceptionUploadHelper/cmdline/");
        r13.append(r12.group(r3 == true ? 1 : 0));
        com.whatsapp.util.Log.d(r13.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x033a, code lost:
        if ("com.whatsapp".equals(r12.group((int) r3)) == false) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x033c, code lost:
        r3 = r11.A01.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0342, code lost:
        if (r3 == null) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0348, code lost:
        if (r3.isRoaming() != false) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x034a, code lost:
        r13 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x034e, code lost:
        monitor-enter(X.AnonymousClass04i.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x034f, code lost:
        if (r13 == null) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        monitor-enter(X.C000300f.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0367, code lost:
        if ((new java.util.Random().nextInt(100) + 1) <= r13.A06(X.AbstractC000400g.A2r)) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0369, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x036a, code lost:
        monitor-exit(X.C000300f.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x036b, code lost:
        monitor-exit(X.AnonymousClass04i.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036e, code lost:
        if (r12 == false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0370, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        r11.A05.A00.A07(true, false, false, false, new java.util.HashSet(java.util.Collections.singletonList("anr")), X.C006803i.A0A(r15.A00, r8), "android_anr");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0395, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0397, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0399, code lost:
        if (r18 == false) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x039c, code lost:
        r7.edit().putLong("anr_file_timestamp", r0).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03a8, code lost:
        r8.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ab, code lost:
        r11.A05.A01(6, 1, "anr");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03b7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03bb, code lost:
        r21 = false;
        com.whatsapp.util.Log.i("ANRExceptionUploadHelper/roamingorunknown/skip");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03c3, code lost:
        r21 = false;
        r7.edit().putLong("anr_file_timestamp", r0).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03d1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0438, code lost:
        if (r5.exists() == false) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0127, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ad, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass0PF
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r28) {
        /*
        // Method dump skipped, instructions count: 1887
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.crash.ExceptionsUploadService.A05(android.content.Intent):void");
    }
}
