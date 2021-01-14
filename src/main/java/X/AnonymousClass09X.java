package X;

import android.text.TextUtils;
import com.whatsapp.TextData;

/* renamed from: X.09X  reason: invalid class name */
public class AnonymousClass09X {
    public static volatile AnonymousClass09X A05;
    public final C014408c A00;
    public final C014508d A01;
    public final C015408m A02;
    public final C015708p A03;
    public final AnonymousClass09Y A04;

    public AnonymousClass09X(C014408c r1, C015408m r2, C015708p r3, C014508d r4, AnonymousClass09Y r5) {
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r5;
        this.A01 = r4;
    }

    public static AnonymousClass09X A00() {
        if (A05 == null) {
            synchronized (AnonymousClass09X.class) {
                if (A05 == null) {
                    C014408c A002 = C014408c.A00();
                    C000300f.A00();
                    A05 = new AnonymousClass09X(A002, C015408m.A00(), C015708p.A00(), C014508d.A00(), AnonymousClass09Y.A00());
                }
            }
        }
        return A05;
    }

    public static void A01(C05490Ot r5, AnonymousClass1VB r6) {
        r6.A06(1, r5.A0p);
        if (!TextUtils.isEmpty(r5.A02)) {
            r6.A07(2, r5.A02);
        } else {
            r6.A04(2);
        }
        if (!TextUtils.isEmpty(r5.A04)) {
            r6.A07(3, r5.A04);
        } else {
            r6.A04(3);
        }
        if (!TextUtils.isEmpty(r5.A05)) {
            r6.A07(4, r5.A05);
        } else {
            r6.A04(4);
        }
        TextData textData = r5.A01;
        if (textData != null) {
            r6.A06(5, (long) textData.fontStyle);
            r6.A06(6, (long) r5.A01.textColor);
            r6.A06(7, (long) r5.A01.backgroundColor);
        } else {
            r6.A04(5);
            r6.A04(6);
            r6.A04(7);
        }
        r6.A06(8, (long) r5.A00);
    }

    public void A02(AbstractC007503q r7, long j, boolean z) {
        StringBuilder A0S = AnonymousClass008.A0S("TextMessageStore/insertOrUpdateQuotedTextMessage/message must be a text message; key=");
        C007303n r5 = r7.A0n;
        AnonymousClass008.A1R(A0S, r5, r7 instanceof C05490Ot);
        boolean z2 = false;
        if (j > 0) {
            z2 = true;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("TextMessageStore/insertOrUpdateQuotedTextMessage/message must have row_id set; key=");
        A0S2.append(r5);
        AnonymousClass00E.A09(z2, A0S2.toString());
        boolean z3 = false;
        if (r7.A09 == 2) {
            z3 = true;
        }
        AnonymousClass008.A1R(AnonymousClass008.A0S("TextMessageStore/insertOrUpdateQuotedTextMessage/message in main storage; key="), r5, z3);
        C05490Ot r72 = (C05490Ot) r7;
        if (z) {
            A03(r72, j, true);
        } else {
            A03(r72, j, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r1 == 0) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C05490Ot r8, long r9, boolean r11) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09X.A03(X.0Ot, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C05490Ot r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09X.A04(X.0Ot, boolean):void");
    }

    public boolean A05() {
        String A012;
        return this.A00.A0G() && (A012 = this.A02.A01("text_ready")) != null && Long.parseLong(A012) == 1;
    }

    public final boolean A06(C05490Ot r8) {
        boolean z = false;
        if (!A05()) {
            return false;
        }
        boolean z2 = false;
        if (r8.A0p > 0) {
            z2 = true;
        }
        StringBuilder A0S = AnonymousClass008.A0S("TextMessageStore/isValidMessage/message must have row_id set; key=");
        C007303n r1 = r8.A0n;
        AnonymousClass008.A1R(A0S, r1, z2);
        if (r8.A09 == 1) {
            z = true;
        }
        AnonymousClass008.A1R(AnonymousClass008.A0S("TextMessageStore/isValidMessage/message in main storage; key="), r1, z);
        return true;
    }
}
