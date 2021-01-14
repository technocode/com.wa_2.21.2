package X;

import com.whatsapp.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

/* renamed from: X.1Qe  reason: invalid class name and case insensitive filesystem */
public class C27481Qe implements HttpResponseInterceptor {
    public final int A00 = 3;
    public final AnonymousClass0CL A01;

    public C27481Qe(AnonymousClass0CL r2) {
        this.A01 = r2;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse.getEntity() == null) {
            RequestWrapper requestWrapper = (RequestWrapper) httpContext.getAttribute("http.request");
            if (requestWrapper != null) {
                requestWrapper.getURI();
            } else {
                Log.e("gdrive-response-interceptor/process/response-without-entity-and-request-is-null");
            }
        } else {
            long contentLength = httpResponse.getEntity().getContentLength();
            if (contentLength <= 0) {
                RequestWrapper requestWrapper2 = (RequestWrapper) httpContext.getAttribute("http.request");
                if (requestWrapper2 != null) {
                    requestWrapper2.getURI();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-response-interceptor/process/length/");
                sb.append(contentLength);
                sb.append("/request-is-null");
                Log.e(sb.toString());
                return;
            }
            httpResponse.setEntity(new C27471Qd(this, httpResponse.getEntity()));
        }
    }
}
