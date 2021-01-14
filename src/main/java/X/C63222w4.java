package X;

import com.google.android.search.verification.client.R;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.2w4  reason: invalid class name and case insensitive filesystem */
public class C63222w4 extends GregorianCalendar {
    public int count;
    public int id;
    public AnonymousClass01X whatsAppLocale;

    public C63222w4(AnonymousClass01X r2, int i, Calendar calendar) {
        this.whatsAppLocale = r2;
        this.id = i;
        setTime(calendar.getTime());
    }

    public String toString() {
        DateFormat A1A;
        long timeInMillis = getTimeInMillis();
        if (timeInMillis <= 0) {
            return this.whatsAppLocale.A06(R.string.unknown);
        }
        AnonymousClass01X r4 = this.whatsAppLocale;
        Locale A0I = r4.A0I();
        Calendar instance = Calendar.getInstance(A0I);
        instance.setTimeInMillis(timeInMillis);
        if (instance.get(1) == Calendar.getInstance(A0I).get(1)) {
            A1A = C001801b.A1B(r4);
        } else {
            A1A = C001801b.A1A(r4);
        }
        return A1A.format(instance.getTime());
    }
}
