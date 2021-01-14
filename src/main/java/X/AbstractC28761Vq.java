package X;

import android.net.Uri;

/* renamed from: X.1Vq  reason: invalid class name and case insensitive filesystem */
public interface AbstractC28761Vq {
    public static final Uri A00;
    public static final Uri A01;

    static {
        Uri build = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.instrumentation").build();
        A01 = build;
        A00 = build.buildUpon().appendPath("contacts").build();
    }
}
