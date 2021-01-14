package com.whatsapp.payments.ui;

import X.AbstractC460627w;
import X.AbstractView$OnClickListenerC32271ec;
import X.AnonymousClass00S;
import X.AnonymousClass01I;
import X.AnonymousClass0GP;
import X.AnonymousClass0OY;
import X.AnonymousClass1PS;
import X.AnonymousClass1VM;
import X.AnonymousClass2C0;
import X.AnonymousClass3DQ;
import X.C01970Ad;
import X.C02040Ak;
import X.C03340Fu;
import X.C43761yu;
import X.C60842s5;
import X.C60862s7;
import X.C62942vb;
import X.C62952vc;
import X.C63612wi;
import X.C63622wj;
import X.C63632wk;
import X.C63842x6;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S1100000_I1;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class BrazilPaymentCardDetailsActivity extends AnonymousClass1PS {
    public AnonymousClass3DQ A00;
    public final AnonymousClass01I A01 = AnonymousClass01I.A00();
    public final AnonymousClass00S A02 = AnonymousClass00S.A00();
    public final C60842s5 A03 = C60842s5.A00();
    public final C60862s7 A04 = C60862s7.A00();
    public final AnonymousClass0GP A05 = AnonymousClass0GP.A00();
    public final C03340Fu A06 = C03340Fu.A00();
    public final C02040Ak A07 = C02040Ak.A00();
    public final C01970Ad A08 = C01970Ad.A00();
    public final C62942vb A09 = C62942vb.A00();
    public final C62952vc A0A = C62952vc.A00();
    public final C63842x6 A0B = C63842x6.A00();

    @Override // X.AbstractView$OnClickListenerC32271ec, X.AnonymousClass1PS
    public void A0V(AnonymousClass1VM r13, boolean z) {
        super.A0V(r13, z);
        if (z) {
            findViewById(R.id.payment_method_details_container).setVisibility(8);
            C63632wk r1 = new C63632wk(this);
            ((AnonymousClass1PS) this).A03 = r1;
            r1.setCard((C43761yu) ((AbstractView$OnClickListenerC32271ec) this).A07);
            ((ViewGroup) findViewById(R.id.payment_method_container)).addView(((AnonymousClass1PS) this).A03, 0);
        }
        AbstractC460627w r7 = (AbstractC460627w) r13.A06;
        if (r7 != null) {
            if (((AnonymousClass1PS) this).A03 != null) {
                this.A09.A02(((AbstractView$OnClickListenerC32271ec) this).A07, (ImageView) findViewById(R.id.card_view_background), new C63612wi(getBaseContext()), true);
                ((AnonymousClass1PS) this).A03.setCardNameTextViewVisibility(8);
                ((AnonymousClass1PS) this).A03.setCardNetworkIconVisibility(8);
                ((AnonymousClass1PS) this).A03.setCardNumberTextColor(getResources().getColor(R.color.card_art_default_label_color));
                String str = r7.A0D;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        C63632wk r11 = ((AnonymousClass1PS) this).A03;
                        if (str.charAt(0) == '0' && (str.charAt(1) == 'x' || str.charAt(1) == 'X')) {
                            long parseLong = Long.parseLong(str.substring(2), 16);
                            int length = str.length();
                            if (length == 8) {
                                parseLong |= -16777216;
                            } else if (length != 10) {
                                throw new IllegalArgumentException("Unknown color");
                            }
                            r11.setCardNumberTextColor((int) parseLong);
                        } else {
                            throw new IllegalArgumentException("Unknown color");
                        }
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("PAY: Could not apply label color: ");
                        sb.append(str);
                        Log.w(sb.toString(), e);
                    }
                }
            }
            if (!r7.A0R) {
                ((AbstractView$OnClickListenerC32271ec) this).A01.setVisibility(8);
            }
            String str2 = r7.A0I;
            switch (str2.hashCode()) {
                case -1757659853:
                    if (!str2.equals("VOIDED")) {
                        return;
                    }
                    break;
                case -591252731:
                    if (!str2.equals("EXPIRED")) {
                        return;
                    }
                    break;
                case 1124965819:
                    if (str2.equals("SUSPENDED")) {
                        A0X(3);
                        C63622wj r2 = ((AnonymousClass1PS) this).A02;
                        if (r2 != null) {
                            r2.setAlertButtonClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 24));
                            return;
                        }
                        return;
                    }
                    return;
                case 1925346054:
                    if (!str2.equals("ACTIVE")) {
                        return;
                    }
                    if ("REQUIRES_VERIFICATION".equals(r7.A0M)) {
                        A0X(4);
                        C63622wj r3 = ((AnonymousClass1PS) this).A02;
                        if (r3 != null) {
                            r3.setAlertButtonClickListener(new ViewOnClickEBaseShape1S1100000_I1(this, ((AbstractView$OnClickListenerC32271ec) this).A07.A07, 8));
                            return;
                        }
                        return;
                    } else if (!r7.A0X && r7.A0W) {
                        A0X(1);
                        C63622wj r32 = ((AnonymousClass1PS) this).A02;
                        if (r32 != null) {
                            r32.setAlertButtonClickListener(new ViewOnClickEBaseShape1S1100000_I1(this, ((AbstractView$OnClickListenerC32271ec) this).A07.A07, 8));
                            return;
                        }
                        return;
                    } else if (r7.A07 != null && AnonymousClass0OY.A00(this.A02.A05(), r7.A07.longValue()) <= 30) {
                        A0X(2);
                        r7.A07 = 0L;
                        this.A08.A01().A01(((AbstractView$OnClickListenerC32271ec) this).A07, null);
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            A0X(0);
            C63622wj r22 = ((AnonymousClass1PS) this).A02;
            if (r22 != null) {
                r22.setAlertButtonClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 25));
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.AbstractView$OnClickListenerC32271ec, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1PS, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = new AnonymousClass3DQ(((AnonymousClass2C0) this).A01, this.A07);
    }
}
