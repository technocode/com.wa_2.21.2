package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.378  reason: invalid class name */
public class AnonymousClass378 extends WebViewClient {
    public final /* synthetic */ C72463Sy A00;

    public AnonymousClass378(C72463Sy r1) {
        this.A00 = r1;
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.A00.A0E("WebViewClient error", true);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("y://error")) {
            this.A00.A0E("iFrame api script error", true);
        }
        return true;
    }
}
