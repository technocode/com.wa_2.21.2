package X;

import android.os.Build;
import com.facebook.profilo.logger.Logger;
import java.util.Random;

/* renamed from: X.1X8  reason: invalid class name */
public class AnonymousClass1X8 {
    public static volatile AnonymousClass1X8 A03;
    public final AnonymousClass03P A00;
    public final AnonymousClass022 A01;
    public final Random A02 = new Random();

    public AnonymousClass1X8(AnonymousClass03P r2, AnonymousClass022 r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public static final void A00(String str, String str2, int i) {
        Logger.writeBytesEntry(0, 1, 57, Logger.writeBytesEntry(0, 1, 56, Logger.writeStandardEntry(0, 7, 52, 0, 0, i, 0, 0), str), str2);
    }

    public final void A01() {
        A00("os_type", "Android", 8126483);
        A00("os_sdk", Integer.toString(Build.VERSION.SDK_INT), 8126483);
        A00("device_type", Build.MODEL, 8126478);
        A00("brand", Build.BRAND, 8126479);
        A00("manufacturer", Build.MANUFACTURER, 8126480);
        A00("year_class", Integer.toString(C002001d.A0B(this.A01, this.A00)), 8126481);
    }
}
