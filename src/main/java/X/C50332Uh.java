package X;

import android.content.Context;
import java.util.regex.Pattern;

/* renamed from: X.2Uh  reason: invalid class name and case insensitive filesystem */
public class C50332Uh {
    public static final Pattern A01 = Pattern.compile("dump\\.hprof.*");
    public final Context A00;

    public C50332Uh(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
