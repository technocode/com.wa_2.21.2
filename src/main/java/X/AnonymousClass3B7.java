package X;

import android.content.Context;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.3B7  reason: invalid class name */
public class AnonymousClass3B7 {
    public AnonymousClass3BE A00;
    public AnonymousClass3BI A01;
    public final Context A02;
    public final Properties A03;
    public final AnonymousClass3B6 A04;
    public final AnonymousClass3BL A05;

    public AnonymousClass3B7(Context context, AnonymousClass3BL r5) {
        String str;
        this.A05 = r5;
        this.A02 = context;
        this.A00 = r5.A03;
        Properties properties = new Properties();
        try {
            properties.load(this.A02.getAssets().open("version.properties"));
            this.A03 = properties;
            this.A04 = new AnonymousClass3B6(this);
            if (r5.A03 != null && (str = r5.A00) != null) {
                this.A01 = new AnonymousClass3BI(this.A00, str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
