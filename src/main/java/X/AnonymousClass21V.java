package X;

import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: X.21V  reason: invalid class name */
public class AnonymousClass21V implements AbstractC28621Va {
    public final Boolean A00;
    public final HttpURLConnection A01;

    public AnonymousClass21V(HttpURLConnection httpURLConnection) {
        this.A01 = httpURLConnection;
        this.A00 = null;
    }

    public AnonymousClass21V(HttpURLConnection httpURLConnection, Boolean bool) {
        this.A01 = httpURLConnection;
        this.A00 = bool;
    }

    @Override // X.AbstractC28621Va
    public int A2o() {
        return this.A01.getResponseCode();
    }

    @Override // X.AbstractC28621Va
    public InputStream A6r() {
        return this.A01.getInputStream();
    }

    @Override // X.AbstractC28621Va
    public String AAP(String str) {
        return this.A01.getHeaderField(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.disconnect();
    }

    @Override // X.AbstractC28621Va
    public long getContentLength() {
        return (long) this.A01.getContentLength();
    }
}
