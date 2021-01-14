package X;

import android.net.Uri;

/* renamed from: X.22v  reason: invalid class name and case insensitive filesystem */
public class C450722v implements AbstractC29161Xi {
    public final String A00;
    public final String A01;

    public C450722v(String str) {
        this.A01 = str;
        String authority = Uri.parse(str).getAuthority();
        if (authority != null) {
            this.A00 = authority;
            return;
        }
        throw null;
    }

    @Override // X.AbstractC29161Xi
    public String A4Z(AnonymousClass0J5 r2, C000300f r3) {
        return this.A01;
    }
}
