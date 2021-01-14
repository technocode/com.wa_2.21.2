package X;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

/* renamed from: X.27g  reason: invalid class name and case insensitive filesystem */
public class C459727g implements AbstractC41351ut {
    public final URL A00;
    public final HttpEntity A01;
    public final HttpResponse A02;

    public C459727g(HttpResponse httpResponse, URL url) {
        this.A02 = httpResponse;
        this.A01 = httpResponse.getEntity();
        this.A00 = url;
    }

    @Override // X.AbstractC28621Va
    public int A2o() {
        return this.A02.getStatusLine().getStatusCode();
    }

    @Override // X.AbstractC41351ut
    public String A5R() {
        HttpEntity httpEntity = this.A01;
        if (httpEntity != null) {
            return EntityUtils.toString(httpEntity);
        }
        return null;
    }

    @Override // X.AbstractC41351ut
    public String A6E() {
        HttpEntity httpEntity = this.A01;
        if (httpEntity != null) {
            return EntityUtils.toString(httpEntity);
        }
        return null;
    }

    @Override // X.AbstractC28621Va
    public InputStream A6r() {
        HttpEntity httpEntity = this.A01;
        if (httpEntity != null) {
            return httpEntity.getContent();
        }
        throw new IOException("Entity is null");
    }

    @Override // X.AbstractC41351ut
    public String A8o() {
        return this.A02.getStatusLine().getReasonPhrase();
    }

    @Override // X.AbstractC28621Va
    public String AAP(String str) {
        List AAQ = AAQ(str);
        if (AAQ == null || AAQ.isEmpty()) {
            return null;
        }
        return (String) AAQ.get(0);
    }

    @Override // X.AbstractC41351ut
    public List AAQ(String str) {
        Header[] headers = this.A02.getHeaders("Location");
        if (headers == null) {
            return null;
        }
        int length = headers.length;
        ArrayList arrayList = new ArrayList(length);
        for (Header header : headers) {
            arrayList.add(header.getValue());
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C008805h.A1J(this.A01);
    }

    @Override // X.AbstractC28621Va
    public long getContentLength() {
        HttpEntity httpEntity = this.A01;
        if (httpEntity != null) {
            return httpEntity.getContentLength();
        }
        return 0;
    }
}
