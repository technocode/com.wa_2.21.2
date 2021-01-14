package X;

import com.google.android.search.verification.client.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.3HZ  reason: invalid class name */
public class AnonymousClass3HZ extends C63222w4 {
    public AnonymousClass3HZ(AnonymousClass01X r1, int i, Calendar calendar) {
        super(r1, i, calendar);
    }

    @Override // X.C63222w4
    public String toString() {
        long timeInMillis = getTimeInMillis();
        if (timeInMillis <= 0) {
            return this.whatsAppLocale.A06(R.string.unknown);
        }
        AnonymousClass01X r1 = this.whatsAppLocale;
        return new SimpleDateFormat(r1.A05(177), r1.A0I()).format(new Date(timeInMillis));
    }
}
