package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Kw  reason: invalid class name and case insensitive filesystem */
public class C04570Kw {
    public static volatile C04570Kw A08;
    public final AnonymousClass00G A00;
    public final AnonymousClass03C A01;
    public final AnonymousClass01X A02;
    public final C02010Ah A03;
    public final C02040Ak A04;
    public final C01970Ad A05;
    public final AnonymousClass0BB A06;
    public final AnonymousClass00T A07;

    public C04570Kw(AnonymousClass00G r1, AnonymousClass00T r2, AnonymousClass01X r3, C01970Ad r4, AnonymousClass0BB r5, C02010Ah r6, C02040Ak r7, AnonymousClass03C r8) {
        this.A00 = r1;
        this.A07 = r2;
        this.A02 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A01 = r8;
    }

    public static C04570Kw A00() {
        if (A08 == null) {
            synchronized (C04570Kw.class) {
                if (A08 == null) {
                    A08 = new C04570Kw(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass01X.A00(), C01970Ad.A00(), AnonymousClass0BB.A00(), C02010Ah.A00(), C02040Ak.A00(), AnonymousClass03C.A00());
                }
            }
        }
        return A08;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04570Kw.A01():void");
    }

    public final void A02() {
        if (this.A04.A02()) {
            C02010Ah r0 = this.A03;
            AnonymousClass1X5 A022 = r0.A02();
            boolean z = r0.A01().getBoolean("payment_step_up_update_ack", true);
            if (A022 == null || z) {
                this.A01.A04(null, 28, "PAYMENTS_STEP_UP_UPDATE");
                return;
            }
            AnonymousClass01X r1 = this.A02;
            A03(r1.A06(R.string.notification_payment_step_up_required_title), r1.A06(R.string.notification_payment_step_up_required_message), "STEP_UP");
        }
    }

    public final void A03(String str, String str2, String str3) {
        AnonymousClass1X5 A022;
        Class A8J;
        AnonymousClass00G r8 = this.A00;
        AnonymousClass03E A002 = AnonymousClass0BS.A00(r8.A00);
        A002.A0I = "status";
        A002.A03 = 1;
        A002.A06(16, true);
        A002.A04(4);
        A002.A06 = 0;
        A002.A07.icon = R.drawable.notifybar;
        A002.A0A(str);
        A002.A09(str2);
        C03800Hr r0 = new C03800Hr();
        r0.A07(str2);
        A002.A08(r0);
        if (Build.VERSION.SDK_INT >= 26) {
            A002.A0J = ((AnonymousClass0BI) this.A06.A05()).A0C();
        }
        if (str3.equals("KYC")) {
            Intent intent = new Intent(r8.A00, this.A05.A03().A8J());
            intent.addFlags(335544320);
            A002.A09 = PendingIntent.getActivity(r8.A00, 0, intent, 0);
            this.A01.A03(null, 26, A002.A01());
        } else if (str3.equals("STEP_UP") && (A022 = this.A03.A02()) != null) {
            String str4 = A022.A01;
            if (str4.equals("FBPAY")) {
                Class A87 = this.A05.A03().A87();
                if (A87 != null) {
                    Intent intent2 = new Intent(r8.A00, A87);
                    intent2.addFlags(335544320);
                    intent2.putExtra("notification-type", "STEP_UP");
                    A002.A09 = PendingIntent.getActivity(r8.A00, 0, intent2, 134217728);
                    this.A01.A03(null, 28, A002.A01());
                }
            } else if (str4.equals("UPI") && (A8J = this.A05.A03().A8J()) != null) {
                Intent intent3 = new Intent(r8.A00, A8J);
                intent3.addFlags(335544320);
                intent3.putExtra("notification-type", "STEP_UP");
                A002.A09 = PendingIntent.getActivity(r8.A00, 0, intent3, 134217728);
                this.A01.A03(null, 28, A002.A01());
            }
        }
    }
}
