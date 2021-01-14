package com.whatsapp.contact.picker;

import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02U;
import X.AnonymousClass0QH;
import X.AnonymousClass2C0;
import X.AnonymousClass2GY;
import X.C002001d;
import X.C004302a;
import X.C007003k;
import X.C11930hF;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Set;

public class AddGroupParticipantsSelector extends AnonymousClass0QH {
    public final AnonymousClass01T A00 = AnonymousClass01T.A00();
    public final Set A01 = new HashSet();

    @Override // X.AnonymousClass0QH
    public void A0g(int i) {
    }

    @Override // X.AnonymousClass0QH
    public void A0h(AnonymousClass2GY r8, C007003k r9) {
        super.A0h(r8, r9);
        boolean contains = this.A01.contains(r9.A02(UserJid.class));
        boolean A0H = ((AnonymousClass0QH) this).A0O.A0H((UserJid) r9.A02(UserJid.class));
        View view = r8.A00;
        C002001d.A2j(view);
        if (contains || A0H) {
            TextEmojiLabel textEmojiLabel = r8.A03;
            AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
            int i = R.string.tap_unblock;
            if (contains) {
                i = R.string.contact_already_in_group;
            }
            textEmojiLabel.setText(r1.A06(i));
            r8.A01.setEnabled(false);
            textEmojiLabel.setTypeface(null, 2);
            textEmojiLabel.setVisibility(0);
            C11930hF r2 = r8.A04;
            r2.A00.setTextColor(C004302a.A00(this, R.color.list_item_disabled));
            if (contains) {
                view.setOnClickListener(null);
                view.setClickable(false);
                view.setFocusable(true);
                return;
            }
            return;
        }
        r8.A03.setTypeface(null, 0);
        C11930hF r22 = r8.A04;
        r22.A00.setTextColor(C004302a.A00(this, R.color.list_item_title));
    }

    @Override // X.AnonymousClass0QH
    public void A0i(C007003k r3) {
        if (!this.A01.contains(r3.A02(UserJid.class))) {
            super.A0i(r3);
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0QH, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass02U A03 = AnonymousClass02U.A03(getIntent().getStringExtra("gid"));
        if (A03 != null) {
            this.A01.addAll(this.A00.A01(A03).A03().A02());
        }
    }
}
