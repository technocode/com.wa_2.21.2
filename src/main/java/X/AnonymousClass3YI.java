package X;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;

/* renamed from: X.3YI  reason: invalid class name */
public class AnonymousClass3YI extends C30271b3 {
    public final /* synthetic */ IndiaUpiQrCodeScannedDialogFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3YI(IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment, String str, String str2) {
        this.A00 = indiaUpiQrCodeScannedDialogFragment;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        String A0D;
        String obj;
        int i;
        C61992u4 A002;
        if (cls.isAssignableFrom(AnonymousClass3IY.class)) {
            IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = this.A00;
            AnonymousClass3IY r12 = new AnonymousClass3IY(indiaUpiQrCodeScannedDialogFragment.A0B, indiaUpiQrCodeScannedDialogFragment.A0C, indiaUpiQrCodeScannedDialogFragment.A0E, indiaUpiQrCodeScannedDialogFragment.A0F, indiaUpiQrCodeScannedDialogFragment.A0D);
            C69053Fo r11 = new C69053Fo(this);
            C69123Fv r10 = new C69123Fv(this);
            C69103Ft r9 = new C69103Ft(this);
            C69133Fw r8 = new C69133Fw(this);
            C69093Fs r7 = new C69093Fs(this);
            C69113Fu r6 = new C69113Fu(this);
            C69083Fr r5 = new C69083Fr(this);
            C69063Fp r4 = new C69063Fp(this);
            C69143Fx r1 = new C69143Fx(this);
            r12.A02.A03(indiaUpiQrCodeScannedDialogFragment, r11);
            r12.A05.A03(indiaUpiQrCodeScannedDialogFragment, r10);
            r12.A09.A03(indiaUpiQrCodeScannedDialogFragment, r9);
            r12.A08.A03(indiaUpiQrCodeScannedDialogFragment, r8);
            r12.A01.A03(indiaUpiQrCodeScannedDialogFragment, r7);
            r12.A00.A03(indiaUpiQrCodeScannedDialogFragment, r6);
            r12.A03.A03(indiaUpiQrCodeScannedDialogFragment, r5);
            r12.A07.A03(indiaUpiQrCodeScannedDialogFragment, r4);
            r12.A04.A03(indiaUpiQrCodeScannedDialogFragment, r1);
            r12.A0A.A03(indiaUpiQrCodeScannedDialogFragment, new C69073Fq(this));
            String str = this.A02;
            String str2 = this.A01;
            C61992u4 r3 = null;
            if (!(str == null || (A002 = C61992u4.A00(Uri.parse(str))) == null)) {
                A002.A01 = str;
                r3 = A002;
            }
            String A05 = r12.A0E.A05();
            if (r3 != null && !TextUtils.isEmpty(str)) {
                String str3 = r3.A09;
                String str4 = r3.A02;
                String str5 = r3.A04;
                String str6 = r3.A03;
                boolean z = true;
                if (C63832x5.A00(str3) && !str3.equalsIgnoreCase(A05) && !TextUtils.isEmpty(str4) && (str5 == null || str6 == null || C006803i.A02(str5, 0) <= C006803i.A02(str6, 0))) {
                    z = false;
                }
                if (!z) {
                    r12.A0B = str2;
                    r12.A06.A07(r3);
                    AbstractC05890Qx A012 = r12.A0G.A01();
                    AnonymousClass01X r42 = r12.A0D;
                    if (TextUtils.isEmpty(r3.A03)) {
                        obj = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (!TextUtils.isEmpty(r3.A04)) {
                            String str7 = r3.A03;
                            String str8 = r3.A04;
                            if (!str7.equals(str8)) {
                                sb.append(A012.A4R(r42, C05900Qy.A00(str8, A012.A5z())));
                                sb.append(" - ");
                            }
                        }
                        sb.append(A012.A4R(r42, C05900Qy.A00(r3.A03, A012.A5z())));
                        obj = sb.toString();
                    }
                    r12.A01.A07(r3.A02);
                    r12.A00.A07(r3.A09);
                    C02270Bi r2 = r12.A03;
                    if (!r12.A0F.A08()) {
                        i = R.string.payment_qr_new_payment_cta_for_onboarding;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(obj);
                        i = R.string.payment_qr_send_payment_cta;
                        if (isEmpty) {
                            i = R.string.payment_qr_new_payment_cta;
                        }
                    }
                    r2.A07(Integer.valueOf(i));
                    if (!TextUtils.isEmpty(obj)) {
                        r12.A07.A07(new C63902xC(obj));
                    }
                    r12.A02.A07(1);
                    if (r12.A0C.A0D(AbstractC000400g.A20) && TextUtils.isEmpty(r3.A06)) {
                        r12.A09.A07(Boolean.TRUE);
                        r12.A08.A07(Boolean.valueOf(TextUtils.isEmpty(r3.A03)));
                    }
                    return r12;
                }
            }
            r12.A0A.A07(new C63862x8(10));
            C02270Bi r43 = r12.A04;
            if (r3 == null || TextUtils.isEmpty(r3.A09) || !r3.A09.equals(A05)) {
                AnonymousClass01X r32 = r12.A0D;
                A0D = r32.A0D(R.string.payments_deeplink_invalid_param, r32.A06(R.string.india_upi_payment_id_name));
            } else {
                A0D = r12.A0D.A06(R.string.payments_deeplink_cannot_send_self);
            }
            r43.A07(A0D);
            r12.A02.A07(3);
            return r12;
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
