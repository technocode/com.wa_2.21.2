package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.AbstractC43781yw;
import X.AbstractC460627w;
import X.AbstractC62972ve;
import X.ActivityC004702f;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass04j;
import X.AnonymousClass0GP;
import X.AnonymousClass0Q7;
import X.AnonymousClass0RK;
import X.AnonymousClass0RM;
import X.AnonymousClass1VM;
import X.AnonymousClass2C0;
import X.AnonymousClass2bX;
import X.AnonymousClass3E2;
import X.AnonymousClass3FS;
import X.AnonymousClass3GY;
import X.AnonymousClass3GZ;
import X.AnonymousClass3YC;
import X.C01970Ad;
import X.C02040Ak;
import X.C03340Fu;
import X.C05880Qw;
import X.C05900Qy;
import X.C41191ud;
import X.C61202sf;
import X.C61282sv;
import X.C61762th;
import X.C61902tv;
import X.C61942tz;
import X.C63842x6;
import X.C69173Ga;
import X.C69203Gd;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public class ConfirmPaymentFragment extends WaFragment implements AbstractC62972ve {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public Button A05;
    public FrameLayout A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextEmojiLabel A0B;
    public WaImageView A0C;
    public AnonymousClass0RK A0D;
    public AnonymousClass1VM A0E;
    public AnonymousClass3GY A0F;
    public AnonymousClass3GZ A0G;
    public PaymentMethodRow A0H;
    public String A0I;
    public String A0J;
    public final AnonymousClass01X A0K = AnonymousClass01X.A00();
    public final C02040Ak A0L = C02040Ak.A00();
    public final C01970Ad A0M = C01970Ad.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.confirm_payment_fragment, viewGroup, false);
        this.A06 = (FrameLayout) inflate.findViewById(R.id.title_view);
        this.A0H = (PaymentMethodRow) inflate.findViewById(R.id.payment_method_row);
        this.A05 = (Button) inflate.findViewById(R.id.confirm_payment);
        this.A0B = (TextEmojiLabel) inflate.findViewById(R.id.footer);
        this.A08 = (TextView) inflate.findViewById(R.id.education);
        this.A07 = (ProgressBar) inflate.findViewById(R.id.confirm_payment_progressbar);
        this.A02 = AnonymousClass0Q7.A0D(inflate, R.id.education_divider);
        inflate.findViewById(R.id.account_number_divider).setVisibility(8);
        inflate.findViewById(R.id.payment_method_account_id).setVisibility(8);
        AIN(this.A0E);
        this.A04 = inflate.findViewById(R.id.payment_to_merchant_options_container);
        this.A0A = (TextView) inflate.findViewById(R.id.payment_to_merchant_options);
        this.A0C = (WaImageView) inflate.findViewById(R.id.payment_to_merchant_options_icon);
        this.A03 = inflate.findViewById(R.id.payment_rails_container);
        this.A09 = (TextView) inflate.findViewById(R.id.payment_rails_label);
        AnonymousClass037 r5 = super.A0D;
        inflate.findViewById(R.id.payment_method_container).setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r5, 4));
        inflate.findViewById(R.id.payment_to_merchant_options_container).setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r5, 6));
        inflate.findViewById(R.id.payment_rails_container).setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r5, 7));
        if (this.A0G != null) {
            if (inflate.findViewById(R.id.contact_info_view) == null || this.A0G != null) {
                View findViewById = inflate.findViewById(R.id.transaction_amount_info_view);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, r5, 8));
                    if (this.A0G == null) {
                        throw null;
                    }
                }
                if (inflate.findViewById(R.id.extra_info_view) != null && this.A0G == null) {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        AnonymousClass0RK r0;
        AnonymousClass0RK r1;
        boolean z;
        this.A0U = true;
        Bundle bundle = super.A06;
        if (bundle != null) {
            UserJid nullable = UserJid.getNullable(bundle.getString("arg_jid"));
            if (nullable != null) {
                C01970Ad r02 = this.A0M;
                r02.A04();
                r0 = r02.A06.A05(nullable);
            } else {
                r0 = null;
            }
            this.A0D = r0;
            if (this.A0L.A05() && (r1 = this.A0D) != null) {
                if (!(r1 instanceof AnonymousClass0RM)) {
                    z = r1.A04;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.A0E.A04() == 6 && this.A01 == 0) {
                        this.A03.setVisibility(0);
                        if (this.A0E.A06 != null) {
                            if (this.A00 == 0) {
                                this.A09.setText(this.A0K.A06(R.string.confirm_payment_bottom_sheet_payment_rails_credit_label));
                            } else {
                                this.A09.setText(this.A0K.A06(R.string.confirm_payment_bottom_sheet_payment_rails_debit_label));
                            }
                        }
                    } else {
                        this.A03.setVisibility(8);
                    }
                    A0n(this.A01);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A0E = (AnonymousClass1VM) super.A06.getParcelable("arg_payment_method");
        String string = super.A06.getString("arg_currency");
        if (string != null) {
            this.A0J = string;
            String string2 = super.A06.getString("arg_amount");
            if (string2 != null) {
                this.A0I = string2;
                Integer valueOf = Integer.valueOf(super.A06.getInt("arg_payment_type"));
                if (valueOf != null) {
                    this.A01 = valueOf.intValue();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A0n(int i) {
        this.A01 = i;
        this.A04.setVisibility(0);
        if (i == 0) {
            this.A0A.setText(this.A0K.A06(R.string.buying_goods_and_services));
            this.A0C.setImageResource(R.drawable.cart);
            return;
        }
        this.A0A.setText(this.A0K.A06(R.string.sending_to_friends_and_family));
        this.A0C.setImageResource(R.drawable.ic_contacts_storage_usage);
    }

    public void A0o(AnonymousClass1VM r40) {
        boolean z;
        int i;
        String str;
        boolean z2;
        int i2;
        int i3;
        AnonymousClass3GY r4 = this.A0F;
        if (r4 != null) {
            AnonymousClass0RK r3 = this.A0D;
            if (r3 != null) {
                int i4 = this.A01;
                if (!(r3 instanceof AnonymousClass0RM)) {
                    r3.A00 = i4;
                }
            }
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) super.A0D;
            if (r4 != null) {
                if (r3 != null) {
                    BrazilPaymentActivity brazilPaymentActivity = r4.A01;
                    if (!(r3 instanceof AnonymousClass0RM)) {
                        i3 = r3.A00;
                    } else {
                        i3 = 1;
                    }
                    if (!BrazilPaymentActivity.A09(brazilPaymentActivity, r40, i3)) {
                        brazilPaymentActivity.A0Q.ANF(new RunnableEBaseShape8S0200000_I1_3(r4, r3, 39));
                    } else if (paymentBottomSheet != null) {
                        C41191ud r2 = brazilPaymentActivity.A01;
                        r2.A01.A03(new AnonymousClass3FS(r4, r4.A02, i3, paymentBottomSheet), null);
                        return;
                    } else {
                        return;
                    }
                }
                AbstractC43781yw r0 = r40.A06;
                if (r0 == null) {
                    throw null;
                } else if (((AbstractC460627w) r0).A0X) {
                    BrazilPaymentActivity brazilPaymentActivity2 = r4.A01;
                    C01970Ad r02 = ((AbstractActivityC34761jB) brazilPaymentActivity2).A0M;
                    r02.A01().A01(r40, null);
                    boolean z3 = false;
                    r4.A03.A0w(false, false);
                    if (Build.VERSION.SDK_INT >= 23) {
                        C61902tv r03 = brazilPaymentActivity2.A0G;
                        if (r03.A05() && r03.A01() == 1) {
                            C05900Qy r42 = r4.A00;
                            String obj = r42.toString();
                            if (r3 != null) {
                                if (!(r3 instanceof AnonymousClass0RM)) {
                                    z2 = r3.A04;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    if (!(r3 instanceof AnonymousClass0RM)) {
                                        i2 = r3.A00;
                                    } else {
                                        i2 = 1;
                                    }
                                    if (i2 == 0) {
                                        z3 = true;
                                    }
                                }
                            }
                            FingerprintBottomSheet A002 = FingerprintBottomSheet.A00(R.string.payment_bio_bottom_sheet_title, R.string.cancel, R.string.use_payments_pin, R.layout.pay_header);
                            AnonymousClass2bX r8 = new AnonymousClass2bX((long) r42.A00.scaleByPowerOfTen(3).intValue(), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, C05880Qw.A00);
                            AnonymousClass00S r04 = ((AbstractActivityC34761jB) brazilPaymentActivity2).A0F;
                            AnonymousClass02M r05 = ((ActivityC004702f) brazilPaymentActivity2).A0F;
                            AnonymousClass01I r15 = ((AbstractActivityC34761jB) brazilPaymentActivity2).A0C;
                            AnonymousClass00T r14 = brazilPaymentActivity2.A0Q;
                            C61202sf r13 = ((AbstractActivityC34761jB) brazilPaymentActivity2).A0N;
                            C63842x6 r12 = brazilPaymentActivity2.A0L;
                            AnonymousClass04j r11 = ((ActivityC004702f) brazilPaymentActivity2).A0H;
                            C61942tz r06 = brazilPaymentActivity2.A0H;
                            C03340Fu r10 = ((AbstractActivityC34761jB) brazilPaymentActivity2).A0J;
                            AnonymousClass0GP r9 = brazilPaymentActivity2.A0C;
                            C61762th r22 = brazilPaymentActivity2.A0F;
                            String str2 = r40.A07;
                            UserJid userJid = ((AbstractActivityC34761jB) brazilPaymentActivity2).A03;
                            if (userJid != null) {
                                String obj2 = r42.toString();
                                if (z3) {
                                    str = "p2m";
                                } else {
                                    str = "p2p";
                                }
                                A002.A04 = new AnonymousClass3YC(r04, ((AnonymousClass2C0) brazilPaymentActivity2).A01, r06, brazilPaymentActivity2, new AnonymousClass3E2(r04, brazilPaymentActivity2, r05, r15, r14, r13, r02, r12, r11, r06, r10, r9, r03, r22, str2, userJid, obj2, obj, r8, r8, str, BrazilPaymentActivity.A04(z3, r40)), A002, new C69203Gd(brazilPaymentActivity2, r40, r42, obj, z3, A002));
                                brazilPaymentActivity2.APm(A002);
                                return;
                            }
                            throw null;
                        }
                    }
                    C05900Qy r23 = r4.A00;
                    String obj3 = r23.toString();
                    if (r3 != null) {
                        if (!(r3 instanceof AnonymousClass0RM)) {
                            z = r3.A04;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (!(r3 instanceof AnonymousClass0RM)) {
                                i = r3.A00;
                            } else {
                                i = 1;
                            }
                            if (i == 0) {
                                z3 = true;
                            }
                        }
                    }
                    BrazilPaymentActivity.A06(brazilPaymentActivity2, r40, r23, obj3, z3);
                } else {
                    BrazilPaymentActivity brazilPaymentActivity3 = r4.A01;
                    String str3 = r40.A07;
                    brazilPaymentActivity3.A0G(R.string.payment_get_verify_card_data);
                    new C61282sv(((AbstractActivityC34761jB) brazilPaymentActivity3).A0F, brazilPaymentActivity3, ((ActivityC004702f) brazilPaymentActivity3).A0F, ((AbstractActivityC34761jB) brazilPaymentActivity3).A0C, brazilPaymentActivity3.A0L, ((AbstractActivityC34761jB) brazilPaymentActivity3).A0M, ((ActivityC004702f) brazilPaymentActivity3).A0H, ((AbstractActivityC34761jB) brazilPaymentActivity3).A0J, brazilPaymentActivity3.A09, brazilPaymentActivity3.A0C, str3).A00(new C69173Ga(brazilPaymentActivity3, str3));
                }
            } else {
                throw null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0214  */
    @Override // X.AbstractC62972ve
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AIN(X.AnonymousClass1VM r12) {
        /*
        // Method dump skipped, instructions count: 538
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.ConfirmPaymentFragment.AIN(X.1VM):void");
    }
}
