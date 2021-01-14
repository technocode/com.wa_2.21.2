package com.whatsapp.inappsupport.ui;

import X.ActivityC004602e;
import X.AnonymousClass0TX;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C06470Tj;
import X.C48802Nt;
import X.C49532Qv;
import X.ViewTreeObserver$OnPreDrawListenerC49522Qu;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;

public class FaqItemActivityV2 extends ActivityC004602e {
    public C48802Nt A00;
    public String A01;

    public /* synthetic */ void lambda$onCreate$2202$FaqItemActivityV2(View view) {
        onBackPressed();
    }

    public /* synthetic */ void lambda$onCreate$2203$FaqItemActivityV2(View view) {
        setResult(-1);
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C48802Nt r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(R.string.settings_help);
        setTitle(string);
        setContentView(R.layout.faq_item_v2);
        Toolbar toolbar = (Toolbar) AnonymousClass0TX.A0A(this, R.id.toolbar);
        toolbar.setNavigationIcon(new C06470Tj(((AnonymousClass2C0) this).A01, C002001d.A0e(getResources().getDrawable(R.drawable.ic_back_teal), getResources().getColor(R.color.lightActionBarItemDrawableTint))));
        toolbar.setTitle(string);
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 27));
        A0C(toolbar);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content");
        String stringExtra2 = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        WebView webView = (WebView) findViewById(R.id.faq_item_web_view);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", "UTF-8", null);
        View findViewById = findViewById(R.id.not_helpful_button_container);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC49522Qu(this, findViewById));
        this.A00 = new C48802Nt(webView, findViewById, getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
        webView.setWebViewClient(new C49532Qv(this));
        this.A00.A01.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 28));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url"))) {
            return super.onCreateOptionsMenu(menu);
        }
        this.A01 = getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        menu.add(0, R.id.menuitem_open_in_browser, 0, getString(R.string.faq_open_in_browser)).setShowAsAction(0);
        return true;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.menuitem_open_in_browser) {
            return false;
        } else {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.A01)));
            return true;
        }
    }
}
