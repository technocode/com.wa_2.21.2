package X;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: X.0Kv  reason: invalid class name and case insensitive filesystem */
public class C04560Kv {
    public static volatile C04560Kv A0B;
    public final AnonymousClass00G A00;
    public final AnonymousClass03C A01;
    public final AnonymousClass01X A02;
    public final C014508d A03;
    public final C015408m A04;
    public final C018709t A05;
    public final C02040Ak A06;
    public final C01970Ad A07;
    public final C018809u A08 = C018809u.A00("PaymentMethodUpdateNotification", "notification", "COMMON");
    public final AnonymousClass0BB A09;
    public final AnonymousClass00T A0A;

    public C04560Kv(AnonymousClass00G r4, AnonymousClass00T r5, C018709t r6, AnonymousClass01X r7, C01970Ad r8, AnonymousClass0BB r9, C015408m r10, C014508d r11, C02040Ak r12, AnonymousClass03C r13) {
        this.A00 = r4;
        this.A0A = r5;
        this.A05 = r6;
        this.A02 = r7;
        this.A07 = r8;
        this.A09 = r9;
        this.A04 = r10;
        this.A03 = r11;
        this.A06 = r12;
        this.A01 = r13;
    }

    public static C04560Kv A00() {
        if (A0B == null) {
            synchronized (C04560Kv.class) {
                if (A0B == null) {
                    A0B = new C04560Kv(AnonymousClass00G.A01, C002101e.A00(), C018709t.A01(), AnonymousClass01X.A00(), C01970Ad.A00(), AnonymousClass0BB.A00(), C015408m.A00(), C014508d.A00(), C02040Ak.A00(), AnonymousClass03C.A00());
                }
            }
        }
        return A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
        // Method dump skipped, instructions count: 892
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04560Kv.A01():void");
    }

    public final synchronized void A02(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A08.A04("removeUnreadPaymentMethodUpdate empty credentialId");
            return;
        }
        C015408m r8 = this.A04;
        String A012 = r8.A01("unread_payment_method_credential_ids");
        if (A012 == null) {
            A012 = "";
        }
        String[] split = TextUtils.split(A012, ";");
        HashSet hashSet = new HashSet();
        for (String str2 : split) {
            if (!TextUtils.equals(TextUtils.split(str2, ":")[0], str)) {
                hashSet.add(str2);
            } else {
                C018809u r2 = this.A08;
                StringBuilder sb = new StringBuilder();
                sb.append("removeUnreadPaymentMethodUpdate/removed credentialId:");
                sb.append(str);
                r2.A07(null, sb.toString(), null);
            }
        }
        r8.A05("unread_payment_method_credential_ids", TextUtils.join(";", hashSet));
    }
}
