package com.whatsapp;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02U;
import X.AnonymousClass0A8;
import X.AnonymousClass0AR;
import X.AnonymousClass0BR;
import X.AnonymousClass0L2;
import X.AnonymousClass0YX;
import X.C002101e;
import X.C004302a;
import X.C006903j;
import X.C014308b;
import X.C08820bm;
import X.C08840bo;
import X.C08850bp;
import X.ViewTreeObserver$OnGlobalLayoutListenerC08830bn;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0;
import java.nio.charset.Charset;

public class AcceptInviteLinkActivity extends ActivityC004602e {
    public AnonymousClass0YX A00;
    public C08840bo A01;
    public AnonymousClass02U A02;
    public Runnable A03;
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final C014308b A05 = C014308b.A00();
    public final AnonymousClass0L2 A06 = AnonymousClass0L2.A01();
    public final AnonymousClass00S A07 = AnonymousClass00S.A00();
    public final AnonymousClass01X A08 = AnonymousClass01X.A00();
    public final C006903j A09 = C006903j.A00();
    public final AnonymousClass0BR A0A = new C08820bm(this);
    public final AnonymousClass0A8 A0B = AnonymousClass0A8.A00;
    public final AnonymousClass01T A0C = AnonymousClass01T.A00();
    public final AnonymousClass0AR A0D = AnonymousClass0AR.A00();
    public final AnonymousClass00T A0E = C002101e.A00();

    public static String A04(Uri uri) {
        if (uri == null) {
            return null;
        }
        if ("whatsapp".equals(uri.getScheme())) {
            if (!"chat".equals(uri.getHost())) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("code");
            if (queryParameter == null) {
                return uri.getLastPathSegment();
            }
            return queryParameter;
        } else if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
            return null;
        } else {
            if ("chat.whatsapp.com".equals(uri.getHost())) {
                return uri.getLastPathSegment();
            }
            if (!"whatsapp.com".equals(uri.getHost()) || !"chat".equals(uri.getLastPathSegment())) {
                return null;
            }
            return uri.getQueryParameter("code");
        }
    }

    public static void A05(Activity activity, Intent intent) {
        String A042;
        Uri data = intent.getData();
        String action = intent.getAction();
        if ("android.nfc.action.NDEF_DISCOVERED".equals(action)) {
            NdefMessage ndefMessage = (NdefMessage) intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
            if ("application/com.whatsapp.join".equals(new String(ndefMessage.getRecords()[0].getType(), Charset.forName("US-ASCII")))) {
                A042 = new String(ndefMessage.getRecords()[0].getPayload(), Charset.forName("US-ASCII"));
                if (TextUtils.isEmpty(A042)) {
                    Log.e("acceptlink/nfc/no-code");
                } else {
                    AnonymousClass008.A18("acceptlink/nfc/code/", A042);
                }
            } else {
                return;
            }
        } else if (!"android.intent.action.VIEW".equals(action) || (A042 = A04(data)) == null) {
            return;
        }
        intent.setData(null);
        Intent intent2 = new Intent(activity, AcceptInviteLinkActivity.class);
        intent2.putExtra("code", A042);
        activity.startActivity(intent2);
    }

    public final void A0T(int i) {
        findViewById(R.id.progress).setVisibility(4);
        findViewById(R.id.group_info).setVisibility(4);
        findViewById(R.id.error).setVisibility(0);
        ((TextView) findViewById(R.id.error_text)).setText(this.A08.A06(i));
        findViewById(R.id.ok).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0(this, 0));
    }

    public /* synthetic */ void lambda$displayGroupInfo$848$AcceptInviteLinkActivity(View view) {
        Log.i("acceptlink/confirmation/ok");
        finish();
    }

    public /* synthetic */ void lambda$onCreate$844$AcceptInviteLinkActivity(View view) {
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r11 = this.A08;
        setTitle(r11.A06(R.string.app_name));
        setContentView(R.layout.view_group_invite);
        View findViewById = findViewById(R.id.invite_container);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC08830bn(findViewById, findViewById(R.id.background)));
        this.A00 = this.A06.A03(this);
        findViewById(R.id.filler).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 4));
        String stringExtra = getIntent().getStringExtra("code");
        if (TextUtils.isEmpty(stringExtra)) {
            ((ActivityC004702f) this).A0F.A0C(r11.A06(R.string.failed_accept_bad_invite_link), 1);
            finish();
        } else {
            AnonymousClass008.A18("acceptlink/processcode/", stringExtra);
            this.A0E.ANC(new C08850bp(this, stringExtra), new Void[0]);
        }
        C08840bo r5 = new C08840bo(this, this.A07, this.A09, this.A04, this.A05, r11, this.A00, (ViewGroup) findViewById(R.id.invite_root));
        this.A01 = r5;
        r5.A0G = true;
        this.A0B.A00(this.A0A);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(C004302a.A00(this, R.color.black));
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0B.A01(this.A0A);
        Runnable runnable = this.A03;
        if (runnable != null) {
            ((ActivityC004702f) this).A0F.A02.removeCallbacks(runnable);
        }
        this.A00.A00();
    }
}
