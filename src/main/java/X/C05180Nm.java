package X;

import android.content.Context;

/* renamed from: X.0Nm  reason: invalid class name and case insensitive filesystem */
public class C05180Nm {
    public static final String A04 = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s TEXT NOT NULL, %s INTEGER DEFAULT 0);", "queue", "_id", "item", "encrypted");
    public final Context A00;
    public final C05170Nl A01;
    public final C05140Ni A02;
    public final C05190Nn A03;

    public C05180Nm(Context context, String str, C05140Ni r5, C05170Nl r6) {
        this.A03 = new C05190Nn(context, AnonymousClass008.A0K("_jobqueue-", str));
        this.A00 = context;
        this.A02 = r5;
        this.A01 = r6;
    }
}
