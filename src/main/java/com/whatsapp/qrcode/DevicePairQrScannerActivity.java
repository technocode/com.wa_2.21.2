package com.whatsapp.qrcode;

import X.AbstractActivityC29861aJ;
import X.ActivityC004702f;
import X.AnonymousClass009;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass09H;
import X.AnonymousClass0By;
import X.AnonymousClass0C3;
import X.AnonymousClass0C4;
import X.AnonymousClass0K0;
import X.AnonymousClass3MA;
import X.AnonymousClass3MB;
import X.AnonymousClass3WV;
import X.C001000o;
import X.C001400w;
import X.C002101e;
import X.C02360Br;
import X.C02400Bv;
import X.C02420Bx;
import X.C02430Bz;
import X.C64742yg;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.concurrent.TimeUnit;

public class DevicePairQrScannerActivity extends AbstractActivityC29861aJ {
    public static final long A0M = TimeUnit.SECONDS.toMillis(2);
    public C64742yg A00;
    public Runnable A01;
    public final AnonymousClass009 A02 = AnonymousClass009.A00();
    public final AnonymousClass02M A03 = AnonymousClass02M.A00();
    public final C02420Bx A04 = C02420Bx.A00();
    public final AnonymousClass0C3 A05 = AnonymousClass0C3.A00();
    public final AnonymousClass00S A06 = AnonymousClass00S.A00();
    public final AnonymousClass00G A07 = AnonymousClass00G.A01;
    public final AnonymousClass00D A08 = AnonymousClass00D.A00();
    public final AnonymousClass01X A09 = AnonymousClass01X.A00();
    public final C001000o A0A = C001000o.A00();
    public final C001400w A0B = C001400w.A02;
    public final AnonymousClass0By A0C = new AnonymousClass3MB(this);
    public final C02430Bz A0D = C02430Bz.A00();
    public final AnonymousClass09H A0E = AnonymousClass09H.A01();
    public final AnonymousClass0K0 A0F = AnonymousClass0K0.A00();
    public final C02360Br A0G = C02360Br.A00();
    public final AnonymousClass3MA A0H = new AnonymousClass3MA(this);
    public final AnonymousClass00T A0I = C002101e.A00();
    public final C02400Bv A0J = C02400Bv.A00();
    public final AnonymousClass0C4 A0K = AnonymousClass0C4.A00();
    public final Runnable A0L = new RunnableEBaseShape12S0100000_I1_7(this, 13);

    public final void A0V() {
        Runnable runnable = this.A01;
        if (runnable != null) {
            ((ActivityC004702f) this).A04.removeCallbacks(runnable);
        }
        if (this.A0D.A0F.A01()) {
            super.A0K.A00();
        } else {
            A0O(false);
        }
    }

    @Override // X.AnonymousClass2C0, X.AbstractActivityC29861aJ, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass00G r0 = this.A07;
        AnonymousClass00S r02 = this.A06;
        AnonymousClass02M r03 = this.A03;
        AnonymousClass009 r15 = this.A02;
        AnonymousClass00T r14 = this.A0I;
        C02400Bv r13 = this.A0J;
        AnonymousClass0C4 r12 = this.A0K;
        AnonymousClass09H r11 = this.A0E;
        C001400w r10 = this.A0B;
        C02360Br r9 = this.A0G;
        C001000o r8 = this.A0A;
        AnonymousClass00D r5 = this.A08;
        AnonymousClass0K0 r4 = this.A0F;
        C02430Bz r7 = this.A0D;
        this.A00 = new C64742yg(r0, r02, r03, r15, r14, r13, r12, r11, r10, r9, r8, r5, r4, r7, this.A04, this.A05, this.A0H);
        TextView textView = (TextView) findViewById(R.id.hint);
        textView.setVisibility(0);
        textView.setText(Html.fromHtml(this.A09.A0D(R.string.qr_code_hint, "web.whatsapp.com")));
        r7.A00(this.A0C);
    }

    @Override // X.AbstractActivityC29861aJ, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        this.A0D.A01(this.A0C);
        AnonymousClass3WV r1 = this.A00.A01;
        if (r1 != null) {
            AnonymousClass0C4 r0 = r1.A08;
            r0.A0S.remove(r1.A07);
        }
        super.onDestroy();
    }
}
