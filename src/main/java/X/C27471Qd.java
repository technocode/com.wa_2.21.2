package X;

import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* renamed from: X.1Qd  reason: invalid class name and case insensitive filesystem */
public class C27471Qd implements HttpEntity {
    public final /* synthetic */ C27481Qe A00;
    public final /* synthetic */ HttpEntity A01;

    public C27471Qd(C27481Qe r1, HttpEntity httpEntity) {
        this.A00 = r1;
        this.A01 = httpEntity;
    }

    public void consumeContent() {
        this.A01.consumeContent();
    }

    public InputStream getContent() {
        InputStream content = this.A01.getContent();
        C27481Qe r0 = this.A00;
        return new C11440gI(content, r0.A01, r0.A00);
    }

    public Header getContentEncoding() {
        return this.A01.getContentEncoding();
    }

    public long getContentLength() {
        return this.A01.getContentLength();
    }

    public Header getContentType() {
        return this.A01.getContentType();
    }

    public boolean isChunked() {
        return this.A01.isChunked();
    }

    public boolean isRepeatable() {
        return this.A01.isRepeatable();
    }

    public boolean isStreaming() {
        return this.A01.isStreaming();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        ((X.C11440gI) r3).A02.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeTo(java.io.OutputStream r5) {
        /*
            r4 = this;
            java.io.InputStream r3 = r4.getContent()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x001c }
        L_0x0008:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x001c }
            if (r1 >= 0) goto L_0x000f
            goto L_0x0014
        L_0x000f:
            r0 = 0
            r5.write(r2, r0, r1)     // Catch:{ all -> 0x001c }
            goto L_0x0008
        L_0x0014:
            X.0gI r3 = (X.C11440gI) r3
            java.io.InputStream r0 = r3.A02
            r0.close()
            return
        L_0x001c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r1 = move-exception
            X.0gI r3 = (X.C11440gI) r3     // Catch:{ all -> 0x0026 }
            java.io.InputStream r0 = r3.A02     // Catch:{ all -> 0x0026 }
            r0.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27471Qd.writeTo(java.io.OutputStream):void");
    }
}
