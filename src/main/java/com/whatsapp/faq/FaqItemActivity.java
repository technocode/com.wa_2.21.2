package com.whatsapp.faq;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass2C0;
import X.AnonymousClass2Nv;
import X.AnonymousClass2OC;
import X.C000300f;
import X.C28051Sr;
import X.C48802Nt;
import X.C48812Nu;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class FaqItemActivity extends ActivityC004602e {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C48802Nt A04;
    public final C000300f A05 = C000300f.A00();
    public final AnonymousClass2OC A06 = AnonymousClass2OC.A00();

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A01 = currentTimeMillis;
        long j = (currentTimeMillis - this.A02) + this.A03;
        this.A03 = j;
        this.A02 = System.currentTimeMillis();
        StringBuilder A0S = AnonymousClass008.A0S("faq-item/back-pressed has been called with ");
        A0S.append(j / 1000);
        A0S.append(" seconds.");
        Log.d(A0S.toString());
        setResult(-1, new Intent().putExtra("article_id", this.A00).putExtra("total_time_spent", this.A03));
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C48802Nt r0 = this.A04;
        if (r0 != null) {
            r0.A00();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
        setTitle(r1.A06(R.string.search_help_center));
        A09().A0A(true);
        setContentView(R.layout.faq_item);
        A09().A08(getIntent().getStringExtra("title"));
        String stringExtra = getIntent().getStringExtra("content");
        String stringExtra2 = getIntent().getStringExtra("url");
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", "UTF-8", null);
        this.A00 = getIntent().getLongExtra("article_id", -1);
        this.A03 = 0;
        String stringExtra3 = getIntent().getStringExtra("contact_us_context");
        if (!getIntent().getBooleanExtra("show_contact_support_button", false)) {
            return;
        }
        if (!C28051Sr.A1x(stringExtra3) || !this.A05.A0D(AbstractC000400g.A1t)) {
            String stringExtra4 = getIntent().getStringExtra("contact_us_context");
            View findViewById = findViewById(R.id.bottom_button_container);
            RunnableEBaseShape1S1100000_I1 runnableEBaseShape1S1100000_I1 = new RunnableEBaseShape1S1100000_I1(this, stringExtra4, 21);
            C48802Nt r11 = new C48802Nt(webView, findViewById, getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
            this.A04 = r11;
            r11.A02(this, (TextView) findViewById(R.id.does_not_match_button), r1.A06(R.string.does_not_match_button), new C48812Nu(runnableEBaseShape1S1100000_I1), R.style.FaqInlineLink);
            this.A04.A01.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(runnableEBaseShape1S1100000_I1, 1));
            webView.setWebViewClient(new AnonymousClass2Nv(this));
            findViewById.setVisibility(0);
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        long currentTimeMillis = System.currentTimeMillis();
        this.A01 = currentTimeMillis;
        this.A03 = (currentTimeMillis - this.A02) + this.A03;
        this.A02 = System.currentTimeMillis();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A02 = System.currentTimeMillis();
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        long currentTimeMillis = System.currentTimeMillis();
        this.A01 = currentTimeMillis;
        long j = (currentTimeMillis - this.A02) + this.A03;
        this.A03 = j;
        this.A02 = System.currentTimeMillis();
        StringBuilder A0S = AnonymousClass008.A0S("faq-item/stop has been called with ");
        A0S.append(j / 1000);
        A0S.append(" seconds.");
        Log.d(A0S.toString());
        setResult(-1, new Intent().putExtra("article_id", this.A00).putExtra("total_time_spent", this.A03));
    }
}
