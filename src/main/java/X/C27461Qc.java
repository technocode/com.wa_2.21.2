package X;

import com.whatsapp.util.Log;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.1Qc  reason: invalid class name and case insensitive filesystem */
public class C27461Qc implements HttpRequestInterceptor {
    public int A00;
    public final int A01 = 3;
    public final AnonymousClass0CL A02;

    public C27461Qc(AnonymousClass0CL r2) {
        this.A02 = r2;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        this.A00++;
        if (httpRequest instanceof EntityEnclosingRequestWrapper) {
            EntityEnclosingRequestWrapper entityEnclosingRequestWrapper = (EntityEnclosingRequestWrapper) httpRequest;
            HttpEntity entity = entityEnclosingRequestWrapper.getEntity();
            if (entity == null) {
                httpRequest.getRequestLine();
                return;
            }
            long contentLength = entity.getContentLength();
            if (contentLength <= 0) {
                StringBuilder sb = new StringBuilder("gdrive-api/request-interceptor/process/length/");
                sb.append(contentLength);
                Log.e(sb.toString());
                return;
            }
            entityEnclosingRequestWrapper.setEntity(new C27441Qa(this, entity));
        } else if (!(httpRequest instanceof RequestWrapper)) {
            StringBuilder sb2 = new StringBuilder("gdrive-request-interceptor/process/request-is-not-a-wrapper ");
            sb2.append(httpRequest);
            Log.e(sb2.toString());
        }
    }
}
