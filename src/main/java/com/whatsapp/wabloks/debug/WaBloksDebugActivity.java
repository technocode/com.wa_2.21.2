package com.whatsapp.wabloks.debug;

import X.AbstractC02170Ax;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass02M;
import X.AnonymousClass3AY;
import X.AnonymousClass3VK;
import X.C67783Af;
import X.C72833Ul;
import X.C72843Um;
import X.C72853Un;
import X.C72863Uo;
import X.C72873Up;
import X.C72883Uq;
import X.C72893Ur;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class WaBloksDebugActivity extends ActivityC004602e {
    public ViewGroup A00;
    public final AbstractC02170Ax A01 = C72893Ur.A00;

    public static final void A04(String str, String str2) {
        StringBuilder sb = new StringBuilder("BLOKS: ");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        Log.d(sb.toString());
    }

    public final void A0T(String str, String str2) {
        StringBuilder sb = new StringBuilder("BLOKS: ");
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        Log.e(sb.toString());
        ((AnonymousClass02M) this.A01.get()).A0C(AnonymousClass008.A0M("FAIL: ", str, ": ", str2), 0);
    }

    public /* synthetic */ void lambda$testHttps$50$WaBloksDebugActivity(View view) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AnonymousClass3AY r1 = new AnonymousClass3AY((AnonymousClass3VK) C67783Af.A01(AnonymousClass3VK.class).get());
            r1.A03 = new C72843Um(this);
            r1.A01 = new C72873Up(this);
            r1.A02 = new C72883Uq(this, countDownLatch);
            r1.A00();
            A04("testHttps", "Latch.await()");
            countDownLatch.await(2000, TimeUnit.MILLISECONDS);
            A04("testHttps", "Latch.released()");
        } catch (Exception e) {
            StringBuilder A0S = AnonymousClass008.A0S("");
            A0S.append(e.getMessage());
            A0T("testHttps", A0S.toString());
        }
    }

    public /* synthetic */ void lambda$testHttpsRetry$54$WaBloksDebugActivity(View view) {
        try {
            AnonymousClass3AY r1 = new AnonymousClass3AY((AnonymousClass3VK) C67783Af.A01(AnonymousClass3VK.class).get());
            r1.A00 = 1;
            r1.A03 = new C72833Ul(this);
            r1.A01 = new C72863Uo(this);
            r1.A02 = new C72853Un(this);
            r1.A00();
            A04("testHttpsRetry", "end");
        } catch (Exception e) {
            StringBuilder A0S = AnonymousClass008.A0S("");
            A0S.append(e.getMessage());
            A0T("testHttpsRetry", A0S.toString());
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blok_debug);
        this.A00 = (ViewGroup) findViewById(R.id.debug_container);
        TextView textView = (TextView) getLayoutInflater().inflate(R.layout.bk_debug_button, (ViewGroup) null, false);
        textView.setText("testHttps");
        textView.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 34));
        this.A00.addView(textView);
        TextView textView2 = (TextView) getLayoutInflater().inflate(R.layout.bk_debug_button, (ViewGroup) null, false);
        textView2.setText("testHttpsRetry");
        textView2.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 33));
        this.A00.addView(textView2);
    }
}
