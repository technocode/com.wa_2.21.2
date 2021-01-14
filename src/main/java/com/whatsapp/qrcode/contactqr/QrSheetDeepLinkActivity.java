package com.whatsapp.qrcode.contactqr;

import X.AbstractC000400g;
import X.AbstractC07290Ww;
import X.AbstractC07560Ye;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass01Q;
import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass09H;
import X.AnonymousClass0AI;
import X.AnonymousClass0EW;
import X.AnonymousClass0IA;
import X.AnonymousClass0XN;
import X.C000300f;
import X.C002101e;
import X.C01970Ad;
import X.C02040Ak;
import X.C07550Yd;
import android.os.Bundle;

public class QrSheetDeepLinkActivity extends ActivityC004602e implements AbstractC07290Ww {
    public C07550Yd A00;
    public String A01;
    public final AnonymousClass0EW A02 = AnonymousClass0EW.A01;
    public final AnonymousClass01I A03 = AnonymousClass01I.A00();
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final AnonymousClass0AI A05 = AnonymousClass0AI.A00();
    public final AnonymousClass0XN A06 = AnonymousClass0XN.A00();
    public final AnonymousClass04j A07 = AnonymousClass04j.A00();
    public final AnonymousClass01Q A08 = AnonymousClass01Q.A00();
    public final AnonymousClass01P A09 = AnonymousClass01P.A00();
    public final AnonymousClass00Y A0A = AnonymousClass00Y.A00();
    public final AnonymousClass09H A0B = AnonymousClass09H.A01();
    public final AnonymousClass0IA A0C = AnonymousClass0IA.A00();
    public final C02040Ak A0D = C02040Ak.A00();
    public final C01970Ad A0E = C01970Ad.A00();
    public final AnonymousClass00T A0F = C002101e.A00();

    @Override // X.AbstractC07290Ww
    public void AIx() {
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
        AnonymousClass01I r02 = this.A03;
        AnonymousClass00T r03 = this.A0F;
        AnonymousClass00Y r04 = this.A0A;
        C000300f r11 = ((ActivityC004702f) this).A0G;
        C07550Yd r05 = new C07550Yd(r0, r02, r03, r04, r11, ((ActivityC004602e) this).A05, this.A0B, this.A04, this.A0I, this.A02, this.A0E, this.A06, this.A07, this.A09, this.A08, this.A0D, this.A0C, this.A05, this, r11.A0D(AbstractC000400g.A0N), r11.A0D(AbstractC000400g.A1X), false, false, null);
        this.A00 = r05;
        r05.A00 = true;
        String stringExtra = getIntent().getStringExtra("qrcode");
        this.A01 = stringExtra;
        if (stringExtra != null && !((AbstractC07560Ye) this.A00).A0D) {
            this.A01 = stringExtra;
            this.A00.A02(stringExtra, false, 5);
        }
    }
}
