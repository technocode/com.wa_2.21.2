package X;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaInAppBrowsingActivity;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;

/* renamed from: X.1Oj  reason: invalid class name and case insensitive filesystem */
public class C27161Oj extends WebViewClient {
    public final /* synthetic */ WaInAppBrowsingActivity A00;

    public C27161Oj(WaInAppBrowsingActivity waInAppBrowsingActivity) {
        this.A00 = waInAppBrowsingActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView != null) {
            WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
            WaInAppBrowsingActivity.A04(waInAppBrowsingActivity, webView.getUrl());
            if (!"about:blank".equals(webView.getTitle())) {
                waInAppBrowsingActivity.A0T(webView.getTitle());
            }
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("WaInappBrowsingActivity/onReceivedError: Error loading the page ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e(sb.toString());
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        waInAppBrowsingActivity.A00.loadUrl("about:blank");
        waInAppBrowsingActivity.A0U(((AnonymousClass2C0) waInAppBrowsingActivity).A01.A06(R.string.webview_error_not_available), true);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        StringBuilder A0S = AnonymousClass008.A0S("WaInappBrowsingActivity/onReceivedSslError: SSL Error while loading the page: ");
        A0S.append(sslError.getUrl());
        A0S.append(": Code ");
        A0S.append(sslError.getPrimaryError());
        Log.e(A0S.toString());
        sslErrorHandler.cancel();
        webView.stopLoading();
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        waInAppBrowsingActivity.A0U(((AnonymousClass2C0) waInAppBrowsingActivity).A01.A06(R.string.webview_error_not_trusted), true);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        StringBuilder A0S = AnonymousClass008.A0S("WaInappBrowsingActivity/onSafeBrowsingHit: Unsafe page hit: ");
        A0S.append(webView.getUrl());
        Log.e(A0S.toString());
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        waInAppBrowsingActivity.setResult(0, waInAppBrowsingActivity.getIntent());
        waInAppBrowsingActivity.finish();
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (URLUtil.isHttpsUrl(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        StringBuilder sb = new StringBuilder("WaInappBrowsingActivity/shouldInterceptRequest: Cannot open resource trough a not encrypted channel: ");
        sb.append(str);
        Log.e(sb.toString());
        return new WebResourceResponse("application/octet-stream", "utf-8", new ByteArrayInputStream("".getBytes()));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WaInAppBrowsingActivity waInAppBrowsingActivity = this.A00;
        if (waInAppBrowsingActivity.A0V(str)) {
            return true;
        }
        try {
            if (URLUtil.isHttpsUrl(str)) {
                Uri parse = Uri.parse(waInAppBrowsingActivity.A00.getUrl());
                Uri parse2 = Uri.parse(str);
                boolean booleanExtra = waInAppBrowsingActivity.getIntent().getBooleanExtra("webview_avoid_external", false);
                if (parse != null && booleanExtra) {
                    StringBuilder sb = new StringBuilder("WaInappBrowsingActivity/checkUrl: Tried to open external link when blocked: ");
                    sb.append(str);
                    Log.e(sb.toString());
                    AnonymousClass00E.A0A(parse.getHost().equals(parse2.getHost()), ((AnonymousClass2C0) waInAppBrowsingActivity).A01.A06(R.string.webview_error_external_browsing_blocked));
                }
                waInAppBrowsingActivity.A0T(((AnonymousClass2C0) waInAppBrowsingActivity).A01.A06(R.string.webview_loading));
                WaInAppBrowsingActivity.A04(waInAppBrowsingActivity, "");
                return false;
            }
            StringBuilder sb2 = new StringBuilder("WaInappBrowsingActivity/checkUrl: Tried to open non-HTTPS content on ");
            sb2.append(str);
            Log.e(sb2.toString());
            throw new IllegalArgumentException(((AnonymousClass2C0) waInAppBrowsingActivity).A01.A06(R.string.webview_error_not_https));
        } catch (IllegalArgumentException | IllegalStateException e) {
            waInAppBrowsingActivity.A0U(e.getMessage(), false);
            return true;
        }
    }
}
