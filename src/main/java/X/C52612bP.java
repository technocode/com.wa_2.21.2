package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2bP  reason: invalid class name and case insensitive filesystem */
public class C52612bP extends AnonymousClass0JW {
    public final long A00;
    public final C02300Bl A01;
    public final AnonymousClass0IW A02;
    public final AnonymousClass03P A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass01K A05;
    public final C03890Ie A06;
    public final AnonymousClass0HO A07;
    public final C02290Bk A08;
    public final AnonymousClass0IX A09;
    public final AnonymousClass0BB A0A;
    public final AnonymousClass02J A0B;
    public final AnonymousClass0BZ A0C;

    public C52612bP(AnonymousClass00G r1, long j, AnonymousClass0IW r4, AnonymousClass03P r5, AnonymousClass02J r6, C03890Ie r7, AnonymousClass0IX r8, AnonymousClass01K r9, C02300Bl r10, AnonymousClass0BZ r11, AnonymousClass0BB r12, AnonymousClass0HO r13, C02290Bk r14) {
        this.A04 = r1;
        this.A00 = j;
        this.A02 = r4;
        this.A03 = r5;
        this.A0B = r6;
        this.A06 = r7;
        this.A09 = r8;
        this.A05 = r9;
        this.A01 = r10;
        this.A0C = r11;
        this.A0A = r12;
        this.A07 = r13;
        this.A08 = r14;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        C03890Ie r1 = this.A06;
        int intValue = ((Integer[]) objArr)[0].intValue();
        synchronized (r1.A00) {
            Iterator it = new ArrayList(r1.A00.A01).iterator();
            while (it.hasNext()) {
                ((AbstractC47932Kg) it.next()).AIu(intValue);
            }
        }
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        C03890Ie r0 = this.A06;
        synchronized (r0.A00) {
            Iterator it = new ArrayList(r0.A00.A01).iterator();
            while (it.hasNext()) {
                ((AbstractC47932Kg) it.next()).ADW();
            }
        }
        this.A02.A01(1, true);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x027f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0283, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0286, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0291, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0385, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0386, code lost:
        if (r2 != null) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x038b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x038e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x038f, code lost:
        if (r4 != null) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0394, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0397, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x039b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x039e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03fc, code lost:
        if (r6.isHeld() != false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x043a, code lost:
        if (r6.isHeld() != false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x043c, code lost:
        r6.release();
        com.whatsapp.util.Log.i("localbackupmanager/backup/wl/release");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x017b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x017c, code lost:
        if (r9 != null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0181, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x026e, code lost:
        if (r3 != null) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0273, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0276, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0277, code lost:
        if (r4 != null) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x027c, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A02(java.lang.Object[] r48) {
        /*
        // Method dump skipped, instructions count: 1146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52612bP.A02(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x007c A[SYNTHETIC] */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52612bP.A03(java.lang.Object):void");
    }
}
