package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0BA  reason: invalid class name */
public class AnonymousClass0BA {
    public static volatile AnonymousClass0BA A0B;
    public final AnonymousClass00G A00;
    public final AnonymousClass03C A01;
    public final AnonymousClass01X A02;
    public final C014508d A03;
    public final C018609s A04;
    public final C015408m A05;
    public final C02040Ak A06;
    public final C01970Ad A07;
    public final C018809u A08 = C018809u.A00("MessagelessPaymentNotification", "notification", "COMMON");
    public final AnonymousClass0BB A09;
    public final AnonymousClass00T A0A;

    public AnonymousClass0BA(AnonymousClass00G r4, AnonymousClass00T r5, AnonymousClass01X r6, C01970Ad r7, AnonymousClass0BB r8, C015408m r9, C014508d r10, C02040Ak r11, AnonymousClass03C r12, C018609s r13) {
        this.A00 = r4;
        this.A0A = r5;
        this.A02 = r6;
        this.A07 = r7;
        this.A09 = r8;
        this.A05 = r9;
        this.A03 = r10;
        this.A06 = r11;
        this.A01 = r12;
        this.A04 = r13;
    }

    public static AnonymousClass0BA A00() {
        if (A0B == null) {
            synchronized (AnonymousClass0BA.class) {
                if (A0B == null) {
                    AnonymousClass00G r3 = AnonymousClass00G.A01;
                    AnonymousClass00T A002 = C002101e.A00();
                    C02150Av.A02();
                    A0B = new AnonymousClass0BA(r3, A002, AnonymousClass01X.A00(), C01970Ad.A00(), AnonymousClass0BB.A00(), C015408m.A00(), C014508d.A00(), C02040Ak.A00(), AnonymousClass03C.A00(), C018609s.A04());
                }
            }
        }
        return A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
        // Method dump skipped, instructions count: 684
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BA.A01():void");
    }

    public final synchronized void A02(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A08.A04("removeUnreadMessagelessPaymentTransaction empty transaction id");
            return;
        }
        C015408m r6 = this.A05;
        String A012 = r6.A01("unread_messageless_transaction_ids");
        if (A012 == null) {
            A012 = "";
        }
        HashSet hashSet = new HashSet(Arrays.asList(TextUtils.split(A012, ";")));
        if (hashSet.remove(str)) {
            C018809u r2 = this.A08;
            StringBuilder sb = new StringBuilder();
            sb.append("removeUnreadMessagelessPaymentTransaction/removed id:");
            sb.append(str);
            r2.A07(null, sb.toString(), null);
        }
        r6.A05("unread_messageless_transaction_ids", TextUtils.join(";", hashSet));
    }

    public synchronized void A03(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A02((String) it.next());
        }
        if (TextUtils.isEmpty(this.A05.A01("unread_messageless_transaction_ids"))) {
            this.A01.A04(null, 17, "MessagelessPaymentNotification4");
        }
    }
}
