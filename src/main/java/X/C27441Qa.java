package X;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* renamed from: X.1Qa  reason: invalid class name and case insensitive filesystem */
public class C27441Qa implements HttpEntity {
    public final /* synthetic */ C27461Qc A00;
    public final /* synthetic */ HttpEntity A01;

    public C27441Qa(C27461Qc r1, HttpEntity httpEntity) {
        this.A00 = r1;
        this.A01 = httpEntity;
    }

    public void consumeContent() {
        this.A01.consumeContent();
    }

    public InputStream getContent() {
        InputStream content = this.A01.getContent();
        C27461Qc r0 = this.A00;
        return new C27451Qb(content, r0.A01, r0.A02);
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

    public void writeTo(OutputStream outputStream) {
        HttpEntity httpEntity = this.A01;
        C27461Qc r0 = this.A00;
        httpEntity.writeTo(new C11450gJ(outputStream, r0.A02, r0.A01));
    }
}
