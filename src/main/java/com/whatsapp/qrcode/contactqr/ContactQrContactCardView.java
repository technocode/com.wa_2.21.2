package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass01X;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0J9;
import X.AnonymousClass0Q7;
import X.AnonymousClass1G3;
import X.AnonymousClass1GH;
import X.AnonymousClass31y;
import X.C002301g;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C11930hF;
import X.C25191Fl;
import X.EnumC25131Fe;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.QrImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ContactQrContactCardView extends LinearLayout {
    public View A00;
    public View A01;
    public QrImageView A02;
    public C11930hF A03;
    public C11930hF A04;
    public WaTextView A05;
    public ThumbnailButton A06;
    public final AnonymousClass01I A07 = AnonymousClass01I.A00();
    public final AnonymousClass0HJ A08 = AnonymousClass0HJ.A02();
    public final C014308b A09 = C014308b.A00();
    public final AnonymousClass0HK A0A = AnonymousClass0HK.A00();
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();
    public final AnonymousClass01P A0C = AnonymousClass01P.A00();
    public final AnonymousClass31y A0D = AnonymousClass31y.A00();

    public ContactQrContactCardView(Context context) {
        super(context);
        A00(context);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public final void A00(Context context) {
        LinearLayout.inflate(context, R.layout.contact_qr_contact_card, this);
        this.A06 = (ThumbnailButton) AnonymousClass0Q7.A0D(this, R.id.profile_picture);
        C014308b r3 = this.A09;
        AnonymousClass01X r4 = this.A0B;
        AnonymousClass31y r5 = this.A0D;
        this.A04 = new C11930hF(this, R.id.title, r3, r4, r5);
        this.A03 = new C11930hF(this, R.id.subtitle, r3, r4, r5);
        this.A00 = AnonymousClass0Q7.A0D(this, R.id.qr_code_container);
        this.A02 = (QrImageView) AnonymousClass0Q7.A0D(this, R.id.qr_code);
        this.A05 = (WaTextView) AnonymousClass0Q7.A0D(this, R.id.prompt);
        this.A01 = AnonymousClass0Q7.A0D(this, R.id.qr_shadow);
    }

    public void A01(C007003k r6, boolean z) {
        if (!r6.A0R || !z) {
            this.A08.A06(this.A06, r6);
        } else {
            this.A06.setImageBitmap(this.A0A.A02(r6, getResources().getDimensionPixelSize(R.dimen.contact_qr_avatar_size), (float) getResources().getDimensionPixelSize(R.dimen.contact_qr_avatar_radius), false));
        }
        if (r6.A09()) {
            C11930hF r2 = this.A04;
            r2.A00.setText(this.A09.A08(r6, false));
            C11930hF r22 = this.A03;
            r22.A00.setText(this.A0B.A06(R.string.group_qr_share_subtitle));
        } else if (!r6.A08()) {
            C11930hF r0 = this.A04;
            r0.A00.setText(r6.A0O);
            C11930hF r23 = this.A03;
            r23.A00.setText(this.A0B.A06(R.string.contact_qr_share_subtitle));
        } else {
            AnonymousClass0J9 A0C2 = this.A0C.A02.A0C((UserJid) r6.A02(UserJid.class));
            if (r6.A0A() || (A0C2 != null && A0C2.A03 == 3)) {
                C11930hF r02 = this.A04;
                r02.A00.setText(r6.A0O);
                this.A04.A01(1);
                C11930hF r24 = this.A03;
                r24.A00.setText(this.A0B.A06(R.string.business_info_official_business_account));
                return;
            }
            C11930hF r03 = this.A04;
            r03.A00.setText(r6.A0O);
            C11930hF r25 = this.A03;
            r25.A00.setText(this.A0B.A06(R.string.message_qr_whatsapp_business_account));
        }
    }

    public void setPrompt(String str) {
        this.A05.setText(str);
    }

    public void setQrCode(String str) {
        try {
            this.A02.setQrCode(AnonymousClass1GH.A01(str, AnonymousClass1G3.M, new EnumMap(EnumC25131Fe.class)), null);
            this.A02.invalidate();
        } catch (C25191Fl e) {
            Log.e("ContactQrContactCardView/failed to set QR code", e);
        }
    }

    public void setStyle(int i) {
        C002301g.A03(this.A04.A00);
        if (i == 1) {
            setBackgroundColor(C004302a.A00(getContext(), R.color.contact_qr_share_card_background_color));
            setPadding(0, getResources().getDimensionPixelOffset(R.dimen.contact_qr_share_card_padding_top), 0, getPaddingBottom());
            ((ViewGroup.MarginLayoutParams) this.A05.getLayoutParams()).setMargins(0, this.A05.getResources().getDimensionPixelSize(R.dimen.contact_qr_share_card_prompt_margin_top), 0, 0);
            WaTextView waTextView = this.A05;
            waTextView.setTextSize(0, (float) waTextView.getResources().getDimensionPixelSize(R.dimen.contact_qr_share_card_prompt_text_size));
            this.A05.setTextColor(C004302a.A00(getContext(), R.color.white_alpha_54));
            this.A01.setVisibility(0);
            return;
        }
        this.A00.setContentDescription(getContext().getString(R.string.accessibility_my_qr_code));
    }
}
