package com.whatsapp.biz.catalog;

import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass2C0;
import X.AnonymousClass2Cp;
import X.C26931Nf;
import X.C27831Rq;
import X.C40711ti;
import X.C40721tj;
import X.C40731tk;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

public class ShareProductLinkActivity extends AnonymousClass2Cp {
    public final AnonymousClass01I A00 = AnonymousClass01I.A00();
    public final C27831Rq A01 = C27831Rq.A00();

    public static void A04(Activity activity, UserJid userJid, String str) {
        Intent intent = new Intent(activity, ShareProductLinkActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("jid", userJid.getRawString());
        intent.putExtra("product_id", str);
        activity.startActivity(intent);
    }

    @Override // X.AnonymousClass2Cp, X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            String stringExtra = getIntent().getStringExtra("product_id");
            if (stringExtra != null) {
                String format = String.format("%s/p/%s/%s", "https://wa.me", stringExtra, nullable.user);
                AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
                setTitle(r6.A06(R.string.product_share_title));
                TextView textView = ((AnonymousClass2Cp) this).A01;
                if (textView != null) {
                    textView.setText(format);
                }
                ((TextView) findViewById(R.id.share_link_description)).setText(r6.A06(R.string.product_share_description));
                if (this.A00.A09(nullable)) {
                    str = r6.A0D(R.string.product_share_text_template, format);
                } else {
                    str = format;
                }
                C40731tk A0W = A0W();
                A0W.A00 = str;
                A0W.A01 = new RunnableEBaseShape1S1200000_I1(this, nullable, stringExtra, 15);
                C40711ti A0U = A0U();
                A0U.A00 = format;
                A0U.A01 = new RunnableEBaseShape1S1200000_I1(this, nullable, stringExtra, 16);
                C40721tj A0V = A0V();
                A0V.A02 = str;
                A0V.A00 = r6.A06(R.string.share);
                A0V.A01 = r6.A06(R.string.product_share_email_subject);
                ((C26931Nf) A0V).A01 = new RunnableEBaseShape1S1200000_I1(this, nullable, stringExtra, 17);
                return;
            }
            throw null;
        }
        throw null;
    }
}
