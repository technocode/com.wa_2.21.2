package X;

import android.content.Context;
import android.icu.text.DateTimePatternGenerator;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.text.format.Time;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.0OY  reason: invalid class name */
public final class AnonymousClass0OY {
    public static final AbstractC09630dH A00 = new C09660dK();
    public static final AbstractC09630dH A01 = new C09620dG();
    public static final AbstractC09630dH A02 = new C09670dL();
    public static final AbstractC09630dH A03 = new C09650dJ();
    public static final AbstractC09630dH A04 = new C09640dI();

    public static int A00(long j, long j2) {
        Time time = new Time();
        time.set(j);
        time.set(j2);
        return ((int) (((time.gmtoff * 1000) + j) / 86400000)) - ((int) (((time.gmtoff * 1000) + j2) / 86400000));
    }

    public static long A01(long j) {
        long j2;
        long j3;
        long timeInMillis;
        long currentTimeMillis = System.currentTimeMillis() - j;
        long j4 = 3600000;
        if (currentTimeMillis < 3600000) {
            j4 = 60000;
            j3 = currentTimeMillis / 60000;
        } else if (currentTimeMillis < 86400000) {
            j3 = currentTimeMillis / 3600000;
        } else {
            j2 = 0;
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(5, 1);
            gregorianCalendar.set(11, 0);
            gregorianCalendar.set(12, 0);
            gregorianCalendar.set(13, 0);
            timeInMillis = gregorianCalendar.getTimeInMillis();
            if (j2 != 0 || j2 > timeInMillis) {
                return timeInMillis;
            }
            return j2;
        }
        j2 = (j3 * j4) + j + j4;
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.add(5, 1);
        gregorianCalendar2.set(11, 0);
        gregorianCalendar2.set(12, 0);
        gregorianCalendar2.set(13, 0);
        timeInMillis = gregorianCalendar2.getTimeInMillis();
        if (j2 != 0) {
        }
        return timeInMillis;
    }

    public static String A02(long j) {
        return ((DateFormat) A01.A01()).format(new Date(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e5, code lost:
        if (r11.equals("yyyyMMMMdEEEE") == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f0, code lost:
        if (r11.equals("MMMMdEEEE") == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fb, code lost:
        if (r11.equals("MMMMd") == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0107, code lost:
        if (r11.equals("yyyyMMMMd") == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0112, code lost:
        if (r11.equals("yyyy") != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011b, code lost:
        if (r11.equals("MMMM") != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0122, code lost:
        if (r11.equals("EEEE") != false) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r10, java.lang.String r11, boolean r12, java.util.Date r13, java.util.Locale r14) {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OY.A03(android.content.Context, java.lang.String, boolean, java.util.Date, java.util.Locale):java.lang.String");
    }

    public static String A04(Context context, Date date, Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return new SimpleDateFormat(DateTimePatternGenerator.getInstance(locale).getBestPattern("yyyyMMMMdEEEEjjmmz"), locale).format(date);
        }
        if (i >= 18) {
            return new java.text.SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, "yyyyMMMMdEEEEjjmmz"), locale).format(date);
        }
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 3, locale);
        TimeZone timeZone = dateTimeInstance.getTimeZone();
        String format = dateTimeInstance.format(date);
        String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(date), 0, locale);
        return MessageFormat.format(AnonymousClass0O0.A01(context, locale, 0), format, displayName);
    }

    public static String A05(AnonymousClass01X r2, String str, String str2) {
        return MessageFormat.format(r2.A05(179), str2, str);
    }

    public static boolean A06(long j, long j2) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
            return true;
        }
        return false;
    }

    public static boolean A07(long j, long j2) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) != calendar2.get(1)) {
            return false;
        }
        return true;
    }
}
