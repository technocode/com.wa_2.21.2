package com.whatsapp.biz.catalog;

import X.AbstractC03680Hf;
import X.AbstractView$OnClickListenerC08330av;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01J;
import X.AnonymousClass01P;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass08B;
import X.AnonymousClass09H;
import X.AnonymousClass0HK;
import X.AnonymousClass0J9;
import X.AnonymousClass0SE;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C003701u;
import X.C004302a;
import X.C007003k;
import X.C008805h;
import X.C014308b;
import X.C017009c;
import X.C017109d;
import X.C11020fa;
import X.C41761vb;
import X.C42031w2;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;

public class CatalogHeader extends AspectRatioFrameLayout implements AbstractC03680Hf {
    public ImageView A00;
    public TextView A01;
    public TextEmojiLabel A02;
    public GetVNameCertificateJob A03;
    public boolean A04;
    public final AnonymousClass02M A05 = AnonymousClass02M.A00();
    public final AnonymousClass01I A06 = AnonymousClass01I.A00();
    public final C000300f A07 = C000300f.A00();
    public final AnonymousClass01J A08 = AnonymousClass01J.A00();
    public final C017009c A09 = C017009c.A00();
    public final C017109d A0A = C017109d.A00();
    public final AnonymousClass01A A0B = AnonymousClass01A.A00();
    public final AnonymousClass08B A0C = AnonymousClass08B.A00;
    public final C014308b A0D = C014308b.A00();
    public final AnonymousClass0HK A0E = AnonymousClass0HK.A00();
    public final AnonymousClass01X A0F = AnonymousClass01X.A00();
    public final AnonymousClass01P A0G = AnonymousClass01P.A00();
    public final AnonymousClass09H A0H = AnonymousClass09H.A01();
    public final AnonymousClass00T A0I = C002101e.A00();

    @Override // X.AbstractC03680Hf
    public void AGV() {
    }

    @Override // X.AbstractC03680Hf
    public void AGW() {
    }

    public CatalogHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.A00(context, attributeSet);
    }

    public float getAspectRatio() {
        return super.A00;
    }

    public void setOnTextClickListener(AbstractView$OnClickListenerC08330av r2) {
        TextView textView = this.A01;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            this.A01.setOnClickListener(r2);
        }
        TextEmojiLabel textEmojiLabel = this.A02;
        if (textEmojiLabel != null && !TextUtils.isEmpty(textEmojiLabel.getText())) {
            this.A02.setOnClickListener(r2);
        }
    }

    public void setUp(UserJid userJid) {
        this.A00 = (ImageView) findViewById(R.id.catalog_list_header_image);
        this.A01 = (TextView) findViewById(R.id.catalog_list_header_business_name);
        if (!this.A06.A09(userJid)) {
            C002001d.A0e(C004302a.A03(getContext(), R.drawable.chevron_right), -1);
            AnonymousClass0SE.A0C(this.A0F, this.A01);
            TextView textView = this.A01;
            if (textView != null) {
                textView.setCompoundDrawablePadding(C008805h.A02(getContext(), 8.0f));
            }
        }
        this.A02 = (TextEmojiLabel) findViewById(R.id.catalog_list_header_business_description);
        AnonymousClass0J9 A0C2 = this.A0G.A02.A0C(userJid);
        if (A0C2 == null && this.A03 == null) {
            GetVNameCertificateJob getVNameCertificateJob = new GetVNameCertificateJob(userJid);
            this.A03 = getVNameCertificateJob;
            this.A08.A00.A01(getVNameCertificateJob);
        }
        String str = null;
        if (A0C2 != null) {
            str = A0C2.A08;
        }
        C007003k A0A2 = this.A0B.A0A(userJid);
        TextView textView2 = this.A01;
        if (textView2 != null) {
            if (C003701u.A0E(str)) {
                str = this.A0D.A08(A0A2, false);
            }
            textView2.setText(str);
        }
        C017009c r3 = this.A09;
        r3.A08.ANC(new C41761vb(r3, userJid, new C42031w2(this, userJid)), new Void[0]);
        this.A0I.ANC(new C11020fa(A0A2, this.A0E, this), new Void[0]);
    }
}
