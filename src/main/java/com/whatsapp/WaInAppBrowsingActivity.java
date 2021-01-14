package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass0S2;
import X.AnonymousClass1KA;
import X.AnonymousClass1KB;
import X.AnonymousClass2C0;
import X.C004302a;
import X.C06470Tj;
import X.C27151Oi;
import X.C27161Oj;
import X.C28051Sr;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;

public class WaInAppBrowsingActivity extends ActivityC004602e {
    public WebView A00;
    public ProgressBar A01;
    public AnonymousClass0MD A02;
    public String A03;

    public static void A04(WaInAppBrowsingActivity waInAppBrowsingActivity, String str) {
        if (waInAppBrowsingActivity.A09() != null && str != null && !"about:blank".equals(str) && !waInAppBrowsingActivity.getIntent().getBooleanExtra("webview_hide_url", false)) {
            TextView textView = (TextView) waInAppBrowsingActivity.findViewById(R.id.website_url);
            textView.setText(str);
            TextView textView2 = (TextView) waInAppBrowsingActivity.findViewById(R.id.website_title);
            if (TextUtils.isEmpty(str)) {
                textView2.setTextColor(C004302a.A00(waInAppBrowsingActivity, R.color.secondary_text));
                textView2.setTypeface(null, 0);
                textView.setVisibility(8);
                return;
            }
            textView2.setTextColor(C004302a.A00(waInAppBrowsingActivity, R.color.primary_text));
            textView2.setTypeface(null, 1);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            textView.setVisibility(0);
            alphaAnimation.setDuration(300);
            textView.startAnimation(alphaAnimation);
        }
    }

    public final void A0T(String str) {
        if (A09() != null) {
            String stringExtra = getIntent().getStringExtra("webview_title");
            TextView textView = (TextView) findViewById(R.id.website_title);
            if (!TextUtils.isEmpty(stringExtra)) {
                textView.setText(stringExtra);
            } else if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
            }
        }
    }

    public void A0U(String str, boolean z) {
        if (this.A02 == null) {
            AnonymousClass0MB r2 = new AnonymousClass0MB(this);
            AnonymousClass0MC r1 = r2.A01;
            r1.A0E = str;
            r1.A0J = false;
            r2.A07(((AnonymousClass2C0) this).A01.A06(R.string.ok), new AnonymousClass1KA(this, z));
            AnonymousClass0MD A002 = r2.A00();
            A002.show();
            this.A02 = A002;
        }
    }

    public boolean A0V(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.A03) || !str.contains(this.A03)) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("webview_callback", str);
        setResult(-1, intent);
        finish();
        return true;
    }

    public /* synthetic */ void lambda$onCreate$1500$WaInAppBrowsingActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        setResult(0, getIntent());
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inapp_browsing);
        this.A03 = getIntent().getStringExtra("webview_callback");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            C06470Tj r2 = new C06470Tj(((AnonymousClass2C0) this).A01, C004302a.A03(this, R.drawable.ic_back));
            r2.setColorFilter(getResources().getColor(R.color.dark_gray), PorterDuff.Mode.SRC_ATOP);
            toolbar.setNavigationIcon(r2);
            toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 41));
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress_bar_page_progress);
            this.A01 = progressBar;
            C28051Sr.A1V(progressBar, R.color.webview_progress_foreground);
        }
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.A00 = webView;
        webView.getSettings().setAllowContentAccess(false);
        this.A00.getSettings().setAllowFileAccess(false);
        this.A00.getSettings().setJavaScriptEnabled(getIntent().getBooleanExtra("webview_javascript_enabled", false));
        this.A00.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        this.A00.getSettings().setGeolocationEnabled(false);
        this.A00.clearCache(true);
        this.A00.getSettings().setSaveFormData(false);
        this.A00.getSettings().setSupportMultipleWindows(false);
        CookieManager.getInstance().setAcceptCookie(false);
        if (Build.VERSION.SDK_INT < 18) {
            this.A00.getSettings().setPluginState(WebSettings.PluginState.OFF);
            this.A00.getSettings().setSavePassword(false);
        }
        this.A00.getSettings().setAllowFileAccessFromFileURLs(false);
        this.A00.getSettings().setAllowUniversalAccessFromFileURLs(false);
        this.A00.setWebViewClient(new C27161Oj(this));
        this.A00.setWebChromeClient(new C27151Oi(this));
        getWindow().setFlags(8192, 8192);
        if (Build.VERSION.SDK_INT >= 27) {
            WebView.startSafeBrowsing(this, AnonymousClass1KB.A00);
        }
        A0T(((AnonymousClass2C0) this).A01.A06(R.string.webview_loading));
        String stringExtra = getIntent().getStringExtra("webview_url");
        if (A0V(stringExtra)) {
            return;
        }
        if (getIntent().getBooleanExtra("webview_post_on_initial_request", false)) {
            String stringExtra2 = getIntent().getStringExtra("webview_initial_body_params");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.A00.postUrl(stringExtra, stringExtra2.getBytes());
            return;
        }
        this.A00.loadUrl(stringExtra);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.A00;
        if (webView != null) {
            webView.onPause();
            this.A00.loadUrl("about:blank");
            this.A00.clearHistory();
            this.A00.clearCache(true);
            this.A00.removeAllViews();
            this.A00.destroyDrawingCache();
            this.A00 = null;
        }
    }
}
