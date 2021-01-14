package X;

import android.net.Uri;

/* renamed from: X.22s  reason: invalid class name */
public class AnonymousClass22s implements AbstractC29161Xi {
    public final Uri.Builder A00;
    public final String A01;
    public final String A02 = "image";

    public AnonymousClass22s(String str) {
        Uri parse = Uri.parse(str);
        this.A00 = parse.buildUpon();
        this.A01 = parse.getAuthority();
    }

    @Override // X.AbstractC29161Xi
    public String A4Z(AnonymousClass0J5 r3, C000300f r4) {
        return this.A00.encodedAuthority(r3.A02).build().toString();
    }
}
