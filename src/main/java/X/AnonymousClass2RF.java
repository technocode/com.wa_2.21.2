package X;

import android.content.UriMatcher;

/* renamed from: X.2RF  reason: invalid class name */
public class AnonymousClass2RF {
    public static volatile AnonymousClass2RF A02;
    public final UriMatcher A00;
    public final AbstractC02190Az A01 = new C02180Ay(C55242gE.A00, null);

    public AnonymousClass2RF() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.A00 = uriMatcher;
        uriMatcher.addURI("com.whatsapp.provider.instrumentation", "contacts", 1);
    }
}
