package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;

/* renamed from: X.0AH  reason: invalid class name */
public class AnonymousClass0AH {
    public static volatile AnonymousClass0AH A09;
    public final AnonymousClass01I A00;
    public final C000300f A01;
    public final AnonymousClass0AI A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01P A04;
    public final AnonymousClass00Y A05;
    public final C015808q A06;
    public final AnonymousClass0AK A07;
    public final WebpUtils A08;

    public AnonymousClass0AH(AnonymousClass00S r1, AnonymousClass01I r2, WebpUtils webpUtils, AnonymousClass00Y r4, C000300f r5, C015808q r6, AnonymousClass01P r7, AnonymousClass0AI r8, AnonymousClass0AK r9) {
        this.A03 = r1;
        this.A00 = r2;
        this.A08 = webpUtils;
        this.A05 = r4;
        this.A01 = r5;
        this.A06 = r6;
        this.A04 = r7;
        this.A02 = r8;
        this.A07 = r9;
    }

    public static int A00(AbstractC007503q r1) {
        AnonymousClass02N r12 = r1.A0n.A00;
        boolean A0b = AnonymousClass1VY.A0b(r12);
        boolean A0Y = AnonymousClass1VY.A0Y(r12);
        if (A0b) {
            return 3;
        }
        return A0Y ? 2 : 1;
    }

    public static int A01(AbstractC007503q r5) {
        int A002 = C002001d.A00(r5.A0m, r5.A04, AnonymousClass0FI.A0f(r5));
        if (A002 != 9 || !r5.A0p()) {
            return A002;
        }
        C06190Sd A003 = C06190Sd.A00();
        if (A003.A04(AnonymousClass1Y8.A01(r5.A0D()))) {
            return 22;
        }
        String A012 = AnonymousClass1Y8.A01(r5.A0D());
        if (A003 != null) {
            boolean z = false;
            if (!TextUtils.isEmpty(A012) && 5 == A003.A03(Uri.parse(A012))) {
                z = true;
            }
            if (z) {
                return 23;
            }
            return A002;
        }
        throw null;
    }

    public static int A02(AbstractC007503q r1) {
        AnonymousClass02N r12 = r1.A0n.A00;
        if (AnonymousClass1VY.A0Y(r12)) {
            return 2;
        }
        if (AnonymousClass1VY.A0b(r12)) {
            return 4;
        }
        return AnonymousClass1VY.A0T(r12) ? 3 : 1;
    }

    public static AnonymousClass0AH A03() {
        if (A09 == null) {
            synchronized (AnonymousClass0AH.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0AH(AnonymousClass00S.A00(), AnonymousClass01I.A00(), WebpUtils.A00(), AnonymousClass00Y.A00(), C000300f.A00(), C015808q.A00(), AnonymousClass01P.A00(), AnonymousClass0AI.A00(), AnonymousClass0AK.A00());
                }
            }
        }
        return A09;
    }

    public static Boolean A04(AnonymousClass01I r2, C007303n r3) {
        AnonymousClass02N r0;
        r2.A04();
        Me me = r2.A00;
        if (me == null || (r0 = r3.A00) == null) {
            return null;
        }
        return Boolean.valueOf(!r0.getRawString().startsWith(me.cc));
    }

    public static Integer A05(int i) {
        if (i == -10000) {
            return 10;
        }
        if (i == -9999) {
            return 33;
        }
        if (i == -1201) {
            return 24;
        }
        if (i == -1200) {
            return 25;
        }
        if (i == -1100) {
            return 11;
        }
        if (i == -22) {
            return 26;
        }
        if (i == -12) {
            return 30;
        }
        switch (i) {
            case -1011:
                return 32;
            case -1010:
                return 5;
            case -1009:
                return 31;
            case -1008:
                return 6;
            case -1007:
                return 1;
            case -1006:
                return 2;
            case -1005:
                return 0;
            case -1004:
                return 29;
            case -1003:
                return 28;
            case -1002:
                return 27;
            case -1001:
                return 23;
            case -1000:
                return 34;
            default:
                return null;
        }
    }

    public void A06(int i, boolean z, Long l, int[] iArr, long j) {
        AnonymousClass207 r2 = new AnonymousClass207();
        r2.A02 = Integer.valueOf(i);
        r2.A00 = Boolean.valueOf(z);
        r2.A07 = l;
        if (iArr != null) {
            int length = iArr.length;
            r2.A08 = Long.valueOf((long) length);
            if (length >= 1) {
                r2.A03 = Long.valueOf((long) iArr[0]);
            }
            if (length >= 2) {
                r2.A04 = Long.valueOf((long) iArr[1]);
            }
            if (length >= 3) {
                r2.A05 = Long.valueOf((long) iArr[2]);
            }
            if (length >= 4) {
                r2.A06 = Long.valueOf((long) iArr[3]);
            }
        }
        r2.A01 = Double.valueOf((double) j);
        this.A05.A0B(r2, null, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        if (r7 == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass01K r16, X.AbstractC007503q r17, int r18, int r19, long r20, boolean r22, boolean r23) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AH.A07(X.01K, X.03q, int, int, long, boolean, boolean):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        if (r1.equals("qr_code") != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (r1.equals("message_short_link") != false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        r1 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0103, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0106, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass01K r24, X.AbstractC007503q r25, X.AnonymousClass02N r26, int r27) {
        /*
        // Method dump skipped, instructions count: 352
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AH.A08(X.01K, X.03q, X.02N, int):void");
    }

    public void A09(DeviceJid deviceJid, int i) {
        int i2;
        AnonymousClass20R r3 = new AnonymousClass20R();
        r3.A00 = Integer.valueOf(i);
        if (deviceJid != null) {
            int i3 = 2;
            if (deviceJid.isPrimary()) {
                i3 = 1;
            }
            i2 = Integer.valueOf(i3).intValue();
        } else {
            i2 = 1;
        }
        r3.A01 = Integer.valueOf(i2);
        this.A05.A0B(r3, new AnonymousClass00Z(1, 1, 1, true), true);
    }

    public void A0A(AbstractC007503q r5, int i, long j) {
        C43971zI r3 = new C43971zI();
        r3.A05 = Long.valueOf(j);
        r3.A02 = Integer.valueOf(A01(r5));
        r3.A04 = Integer.valueOf(i);
        r3.A03 = Integer.valueOf(A02(r5));
        r3.A01 = Boolean.valueOf(r5.A0s(1));
        r3.A06 = Long.valueOf((long) r5.A07);
        r3.A00 = Boolean.valueOf(AnonymousClass0FI.A0m(r5, this.A06.A03()));
        this.A05.A0B(r3, null, false);
        StringBuilder sb = new StringBuilder("MessageLogging/postAndroidMessageSendPerfEvent ");
        sb.append(r3.toString());
        Log.d(sb.toString());
    }

    public void A0B(AbstractC007503q r10, AnonymousClass1UG r11, Jid jid, DeviceJid deviceJid, int i, int i2) {
        C44291zo r3 = new C44291zo();
        r3.A06 = 2L;
        int i3 = r11.A00;
        if (i3 == 1) {
            r3.A01 = 0;
        } else if (i3 == 2) {
            r3.A01 = 1;
        } else if (i3 == 3) {
            r3.A01 = 2;
        }
        int i4 = r11.A01;
        if (i4 != 0) {
            r3.A03 = A05(i4);
            r3.A00 = Boolean.FALSE;
        } else {
            r3.A00 = Boolean.TRUE;
        }
        if (jid instanceof GroupJid) {
            r3.A02 = 1;
        } else if (jid instanceof AnonymousClass0OP) {
            r3.A02 = 2;
        } else if (jid instanceof C12060hU) {
            r3.A02 = 3;
        } else {
            r3.A02 = 0;
        }
        if (deviceJid != null) {
            int i5 = 2;
            if (deviceJid.isPrimary()) {
                i5 = 1;
            }
            r3.A04 = Integer.valueOf(i5);
        }
        r3.A08 = Long.valueOf((long) i);
        if (r10 != null) {
            r3.A05 = Integer.valueOf(A01(r10));
        }
        r3.A07 = Long.valueOf((long) i2);
        if (r3.A00.booleanValue()) {
            this.A05.A0B(r3, null, false);
        } else {
            this.A05.A0B(r3, new AnonymousClass00Z(1, 1, 1, true), true);
        }
    }
}
