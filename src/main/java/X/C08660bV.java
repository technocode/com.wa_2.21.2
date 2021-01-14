package X;

import com.google.android.search.verification.client.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.0bV  reason: invalid class name and case insensitive filesystem */
public class C08660bV extends GregorianCalendar {
    public int count;
    public final int id;
    public final AnonymousClass01X whatsAppLocale;

    public C08660bV(AnonymousClass01X r2, int i, Calendar calendar) {
        this.id = i;
        setTime(calendar.getTime());
        this.whatsAppLocale = r2;
    }

    public C08660bV(AnonymousClass01X r2, C08660bV r3) {
        this.id = r3.id;
        this.count = r3.count;
        setTime(r3.getTime());
        this.whatsAppLocale = r2;
    }

    public String toString() {
        int i = this.id;
        if (i == 1) {
            return this.whatsAppLocale.A06(R.string.recent);
        }
        if (i == 2) {
            AnonymousClass01X r2 = this.whatsAppLocale;
            return C001801b.A19(r2.A0I(), r2.A05(232));
        } else if (i == 3) {
            AnonymousClass01X r22 = this.whatsAppLocale;
            return C001801b.A19(r22.A0I(), r22.A05(231));
        } else if (i != 4) {
            AnonymousClass01X r1 = this.whatsAppLocale;
            return new SimpleDateFormat(r1.A05(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH), r1.A0I()).format(new Date(getTimeInMillis()));
        } else {
            AnonymousClass01X r3 = this.whatsAppLocale;
            long timeInMillis = getTimeInMillis();
            Calendar instance = Calendar.getInstance(r3.A0I());
            instance.setTimeInMillis(timeInMillis);
            return AbstractC12580iK.A00(r3)[instance.get(2)];
        }
    }
}
