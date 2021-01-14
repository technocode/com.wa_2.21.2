package X;

import com.whatsapp.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.354  reason: invalid class name */
public class AnonymousClass354 {
    public final long A00;
    public final String A01;
    public final String A02;

    public AnonymousClass354(String str, String str2) {
        TimeZone timeZone;
        this.A01 = str;
        this.A02 = str2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        if ("utc".equalsIgnoreCase(this.A01)) {
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            timeZone = TimeZone.getDefault();
        }
        try {
            simpleDateFormat.setTimeZone(timeZone);
            Date parse = simpleDateFormat.parse(this.A02);
            if (parse != null) {
                this.A00 = parse.getTime();
                return;
            }
            throw null;
        } catch (ParseException e) {
            StringBuilder A0S = AnonymousClass008.A0S("UserNoticeTiming/getDate/Unable to parse date: ");
            A0S.append(this.A02);
            A0S.append(" reference: ");
            A0S.append(this.A01);
            Log.e(A0S.toString());
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Timestamp{time=");
        A0S.append(this.A00);
        A0S.append(", timeString='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", reference='");
        A0S.append(this.A01);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
