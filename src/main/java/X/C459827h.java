package X;

import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: X.27h  reason: invalid class name and case insensitive filesystem */
public class C459827h extends AnonymousClass21V implements AbstractC41351ut {
    public C459827h(HttpURLConnection httpURLConnection) {
        super(httpURLConnection);
    }

    @Override // X.AbstractC41351ut
    public String A5R() {
        return C006803i.A0J(A6r());
    }

    @Override // X.AbstractC41351ut
    public String A6E() {
        return C006803i.A0J(this.A01.getErrorStream());
    }

    @Override // X.AbstractC41351ut
    public String A8o() {
        return this.A01.getResponseMessage();
    }

    @Override // X.AbstractC41351ut
    public List AAQ(String str) {
        return this.A01.getHeaderFields().get(str);
    }
}
