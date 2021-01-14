package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.1Wv  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC29051Wv {
    public final C02150Av A00;

    public AbstractC29051Wv(C02150Av r1) {
        this.A00 = r1;
    }

    public String A00(AnonymousClass0MH r24) {
        int intValue;
        String A09;
        int i;
        C02150Av r11 = this.A00;
        C018809u r2 = r11.A06;
        StringBuilder A0S = AnonymousClass008.A0S("getStatusChangeNotifStringWithoutMessage status:");
        A0S.append(r24.A01);
        A0S.append(" type:");
        AnonymousClass008.A1N(A0S, r24.A02, r2);
        C05900Qy r0 = r24.A06;
        if (r0 == null) {
            intValue = 1;
        } else {
            intValue = r0.A00.intValue();
        }
        if (r24.A06 == null) {
            A09 = r11.A04.A06(R.string.unknown_amount_payment);
        } else {
            A09 = r11.A09(r24);
        }
        int i2 = r24.A02;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 10) {
                    int i3 = r24.A01;
                    if (i3 == 13 || i3 == 14) {
                        return r11.A04.A0D(R.string.payments_request_message_from_me_failed, r11.A0H(r24));
                    } else if (i3 == 16) {
                        return r11.A04.A0D(R.string.payments_request_message_from_me_expired, r11.A0H(r24));
                    } else if (i3 != 15) {
                        return "";
                    } else {
                        return r11.A04.A0D(R.string.payments_request_message_from_me_rejected, r11.A0H(r24));
                    }
                } else if (i2 != 20) {
                    if (i2 != 100) {
                        if (i2 != 200) {
                            return "";
                        }
                    }
                } else if (r24.A01 != 12) {
                    return "";
                } else {
                    return r11.A04.A0D(R.string.payments_request_message_to_me_success, r11.A0E(r24), A09);
                }
            }
            return r11.A04.A0A(R.plurals.payments_transaction_message_generic_success, (long) intValue, r11.A0H(r24), A09, r11.A0E(r24));
        }
        String A0E = r11.A0E(r24);
        String A0H = r11.A0H(r24);
        int i4 = r24.A01;
        AbstractC43791yx r1 = r24.A07;
        if (r1 == null) {
            i = 0;
        } else if (!(r1 instanceof AnonymousClass3Y3)) {
            i = ((AnonymousClass3XM) r1).A01;
        } else {
            i = 0;
        }
        return r11.A0N(true, A0E, A0H, i4, i, 0, r24.A05, r11.A09(r24), intValue);
    }
}
