package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S1100000_I1;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Z5  reason: invalid class name */
public class AnonymousClass2Z5 extends AnonymousClass2HI {
    public View A00;
    public C007003k A01;
    public UserJid A02;
    public UserJid A03;
    public final ViewGroup A04;
    public final AnonymousClass01A A05;
    public final C014308b A06;
    public final AnonymousClass01X A07;
    public final AnonymousClass0EH A08;
    public final UserJid A09;
    public final C02360Br A0A;
    public final AnonymousClass00T A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AnonymousClass2Z5(Conversation conversation, AnonymousClass00T r3, AnonymousClass01A r4, C014308b r5, C02360Br r6, AnonymousClass01X r7, AnonymousClass0EH r8, UserJid userJid, C007003k r10, ViewGroup viewGroup, boolean z, boolean z2) {
        super(conversation, 30);
        this.A0B = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A0A = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A09 = userJid;
        this.A04 = viewGroup;
        this.A0C = z;
        this.A0D = z2;
        this.A01 = r10;
    }

    public final void A05() {
        View view = this.A00;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.change_number_text);
            boolean equals = this.A09.equals(this.A03);
            int i = R.string.change_number_notification_alert_new;
            if (equals) {
                i = R.string.change_number_notification_alert_old;
            }
            AnonymousClass01A r1 = this.A05;
            UserJid userJid = this.A03;
            if (userJid != null) {
                String A082 = this.A06.A08(r1.A0A(userJid), false);
                textView.setText(this.A07.A0D(i, A082));
                this.A00.setOnClickListener(new ViewOnClickEBaseShape1S1100000_I1(this, A082, 7));
                this.A00.findViewById(R.id.change_number_dismiss).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 10));
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A06(C51472Yw r3) {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
            this.A04.removeView(this.A00);
            this.A00 = null;
            r3.A00.A01 = null;
            return;
        }
        throw null;
    }

    public void A07(C007003k r7) {
        this.A01 = r7;
        AnonymousClass0EH r5 = this.A08;
        Jid A022 = r7.A02(UserJid.class);
        if (A022 != null) {
            C08560bL A052 = r5.A03.A05((AnonymousClass02N) A022);
            if (A052 != null && A052.A08 != -1) {
                this.A0B.ANC(new C10860fK(r7, r5, this), new Void[0]);
            } else if (A04()) {
                A02(true);
            }
        } else {
            throw null;
        }
    }
}
