package X;

import android.net.Uri;
import android.util.LogPrinter;

/* renamed from: X.16I  reason: invalid class name */
public final class AnonymousClass16I {
    public static final Uri A00;

    public AnonymousClass16I() {
        new LogPrinter(4, "GA/LogCatTransport");
    }

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        A00 = builder.build();
    }
}
