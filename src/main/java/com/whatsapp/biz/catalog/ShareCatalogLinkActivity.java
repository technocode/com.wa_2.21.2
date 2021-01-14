package com.whatsapp.biz.catalog;

import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass2C0;
import X.AnonymousClass2Cp;
import X.C002701k;
import X.C26931Nf;
import X.C27831Rq;
import X.C40711ti;
import X.C40721tj;
import X.C40731tk;
import X.C658631v;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

public class ShareCatalogLinkActivity extends AnonymousClass2Cp {
    public final AnonymousClass01I A00 = AnonymousClass01I.A00();
    public final C27831Rq A01 = C27831Rq.A00();
    public final AnonymousClass00S A02 = AnonymousClass00S.A00();
    public final C658631v A03;

    public ShareCatalogLinkActivity() {
        if (C658631v.A04 == null) {
            synchronized (C658631v.class) {
                if (C658631v.A04 == null) {
                    C658631v.A04 = new C658631v(C002701k.A00(), AnonymousClass00D.A00());
                }
            }
        }
        this.A03 = C658631v.A04;
    }

    @Override // X.AnonymousClass2Cp, X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            String format = String.format("%s/c/%s", "https://wa.me", nullable.user);
            AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
            setTitle(r5.A06(R.string.catalog_share_title));
            TextView textView = ((AnonymousClass2Cp) this).A01;
            if (textView != null) {
                textView.setText(format);
            }
            ((TextView) findViewById(R.id.share_link_description)).setText(r5.A06(R.string.catalog_share_description));
            if (this.A00.A09(nullable)) {
                str = r5.A0D(R.string.catalog_share_text_template, format);
            } else {
                str = format;
            }
            C40731tk A0W = A0W();
            A0W.A00 = str;
            A0W.A01 = new RunnableEBaseShape6S0200000_I1_1(this, nullable, 36);
            C40711ti A0U = A0U();
            A0U.A00 = format;
            A0U.A01 = new RunnableEBaseShape6S0200000_I1_1(this, nullable, 38);
            C40721tj A0V = A0V();
            A0V.A02 = str;
            A0V.A00 = r5.A06(R.string.share);
            A0V.A01 = r5.A06(R.string.catalog_share_email_subject);
            ((C26931Nf) A0V).A01 = new RunnableEBaseShape6S0200000_I1_1(this, nullable, 37);
            return;
        }
        throw null;
    }
}
