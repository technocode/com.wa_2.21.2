package X;

import com.google.android.search.verification.client.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.1X6  reason: invalid class name */
public class AnonymousClass1X6 {
    public static volatile AnonymousClass1X6 A02;
    public final AnonymousClass00S A00;
    public final AnonymousClass01X A01;

    public AnonymousClass1X6(AnonymousClass00S r1, AnonymousClass01X r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass1X6 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass1X6.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass1X6(AnonymousClass00S.A00(), AnonymousClass01X.A00());
                }
            }
        }
        return A02;
    }

    public static final String A01(long j) {
        Calendar instance = Calendar.getInstance();
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
        instance.setTimeInMillis(j);
        instance.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(instance.getTime());
    }

    public String A02(long j, long j2) {
        if (A01(j).equals(A01(j2))) {
            return AnonymousClass008.A0A(j2, this.A00, this.A01);
        }
        AnonymousClass01X r5 = this.A01;
        AnonymousClass00S r2 = this.A00;
        return r5.A0D(R.string.upi_mandate_payment_transaction_detail_date_row_description_date_range, AnonymousClass008.A0A(j, r2, r5), AnonymousClass008.A0A(j2, r2, r5));
    }

    public String A03(C05900Qy r6, String str) {
        AbstractC05890Qx r0 = C05880Qw.A01;
        AnonymousClass01X r4 = this.A01;
        String A4R = r0.A4R(r4, r6);
        if (!"MAX".equals(str)) {
            return A4R;
        }
        return r4.A0D(R.string.upi_mandate_bottom_row_item_amount_upto, A4R);
    }
}
