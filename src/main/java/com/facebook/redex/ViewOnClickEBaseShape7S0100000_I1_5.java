package com.facebook.redex;

import X.AbstractC59432ne;
import X.AbstractC61982u3;
import X.AbstractView$OnClickListenerC32241eZ;
import X.AbstractView$OnClickListenerC32271ec;
import X.AbstractView$OnClickListenerC33371gd;
import X.ActivityC004902h;
import X.AnonymousClass037;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import X.AnonymousClass0PW;
import X.AnonymousClass1X4;
import X.AnonymousClass21S;
import X.AnonymousClass3GP;
import X.AnonymousClass3HL;
import X.AnonymousClass3I6;
import X.AnonymousClass3IA;
import X.AnonymousClass3IE;
import X.AnonymousClass3IY;
import X.AnonymousClass3XS;
import X.C018609s;
import X.C03340Fu;
import X.C05900Qy;
import X.C444920i;
import X.C61992u4;
import X.C63262w8;
import X.C63302wC;
import X.C63862x8;
import X.C69703Ib;
import X.C73743Yn;
import X.C73773Yq;
import X.C74733bP;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilSmbMerchantNuxUpSellBottomSheet;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiBankAccountLinkingConfirmationActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountLinkingRetryActivity;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerifActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.payments.ui.IndiaUpiEducationActivity;
import com.whatsapp.payments.ui.IndiaUpiInvitePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;
import com.whatsapp.payments.ui.PaymentRailPickerFragment;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity;
import com.whatsapp.payments.ui.ReTosFragment;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;

public class ViewOnClickEBaseShape7S0100000_I1_5 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape7S0100000_I1_5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        Bundle bundle;
        switch (this.A01) {
            case 0:
                MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                if (!(mediaViewBaseFragment instanceof MediaViewFragment)) {
                    mediaViewBaseFragment.A0v();
                    return;
                }
                MediaViewFragment mediaViewFragment = (MediaViewFragment) mediaViewBaseFragment;
                if (mediaViewFragment.A0J != null) {
                    mediaViewFragment.A0s();
                    return;
                } else {
                    mediaViewFragment.A0t();
                    return;
                }
            case 1:
                MediaViewBaseFragment mediaViewBaseFragment2 = (MediaViewBaseFragment) this.A00;
                mediaViewBaseFragment2.A10(!mediaViewBaseFragment2.A0G, true);
                return;
            case 2:
                AbstractC61982u3 r0 = ((PinBottomSheetDialogFragment) this.A00).A08;
                if (r0 != null) {
                    r0.AGJ(view);
                    return;
                }
                return;
            case 3:
                AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = (AddPaymentMethodBottomSheet) this.A00;
                AnonymousClass3GP r02 = addPaymentMethodBottomSheet.A00;
                if (r02 != null) {
                    addPaymentMethodBottomSheet.startActivityForResult(r02.A00, 10);
                    AnonymousClass21S A10 = addPaymentMethodBottomSheet.A10(false);
                    if (A10 != null) {
                        A10.A00 = Boolean.TRUE;
                        addPaymentMethodBottomSheet.A02.A0B(A10, null, false);
                    }
                    C444920i A0z = addPaymentMethodBottomSheet.A0z(false);
                    if (A0z != null) {
                        A0z.A01 = 1;
                        A0z.A00 = 5;
                        addPaymentMethodBottomSheet.A02.A0B(A0z, null, false);
                        return;
                    }
                    return;
                }
                throw null;
            case 4:
                DialogFragment dialogFragment = (DialogFragment) this.A00;
                BrazilSmbPaymentActivity brazilSmbPaymentActivity = (BrazilSmbPaymentActivity) dialogFragment.A0A();
                if (!(brazilSmbPaymentActivity == null || (bundle = ((AnonymousClass037) dialogFragment).A06) == null)) {
                    brazilSmbPaymentActivity.A0a(bundle.getString("AMOUNT_STR"), (C05900Qy) ((AnonymousClass037) dialogFragment).A06.getParcelable("AMOUNT"));
                }
                dialogFragment.A0q();
                return;
            case 5:
                BrazilSmbMerchantNuxUpSellBottomSheet brazilSmbMerchantNuxUpSellBottomSheet = (BrazilSmbMerchantNuxUpSellBottomSheet) this.A00;
                String A02 = brazilSmbMerchantNuxUpSellBottomSheet.A01.A02(false);
                if (A02 != null) {
                    Intent intent = new Intent(brazilSmbMerchantNuxUpSellBottomSheet.A00(), BrazilPayBloksActivity.class);
                    intent.putExtra("screen_name", A02);
                    brazilSmbMerchantNuxUpSellBottomSheet.A0h(intent);
                }
                brazilSmbMerchantNuxUpSellBottomSheet.A0q();
                return;
            case 6:
                ((AbstractView$OnClickListenerC33371gd) this.A00).lambda$onCreate$41$FbPayHubActivity(view);
                return;
            case 7:
                ((AbstractView$OnClickListenerC33371gd) this.A00).lambda$onCreate$42$FbPayHubActivity(view);
                return;
            case 8:
                ((AbstractView$OnClickListenerC33371gd) this.A00).lambda$onCreate$43$FbPayHubActivity(view);
                return;
            case 9:
                ((IndiaUpiBankAccountLinkingConfirmationActivity) this.A00).lambda$onCreate$15$IndiaUpiBankAccountLinkingConfirmationActivity(view);
                return;
            case 10:
                ((IndiaUpiBankAccountLinkingRetryActivity) this.A00).lambda$onCreate$16$IndiaUpiBankAccountLinkingRetryActivity(view);
                return;
            case 11:
                ((IndiaUpiBankPickerActivity) this.A00).lambda$onSearchRequested$20$IndiaUpiBankPickerActivity(view);
                return;
            case 12:
                ((ContactPickerFragment) this.A00).A0H.APm(new IndiaUpiSendPaymentToVpaDialogFragment());
                return;
            case 13:
                AnonymousClass037 r3 = (AnonymousClass037) this.A00;
                r3.A0h(new Intent(r3.A00(), IndiaUpiQrCodeScanActivity.class));
                ActivityC004902h A0A = r3.A0A();
                if (A0A != null) {
                    A0A.finish();
                    return;
                }
                return;
            case 14:
                ((IndiaUpiDebitCardVerifActivity) this.A00).A0e();
                return;
            case 15:
                ((IndiaUpiDeviceBindActivity) this.A00).lambda$onCreate$78$IndiaUpiDeviceBindActivity(view);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                ((IndiaUpiEducationActivity) this.A00).lambda$onCreate$81$IndiaUpiEducationActivity(view);
                return;
            case 17:
                ((IndiaUpiInvitePaymentActivity) this.A00).lambda$onCreate$84$IndiaUpiInvitePaymentActivity(view);
                return;
            case 18:
                ((IndiaUpiPaymentSettingsActivity) this.A00).lambda$maybeAddMandateSection$117$IndiaUpiPaymentSettingsActivity(view);
                return;
            case 19:
                ((IndiaUpiPaymentSettingsActivity) this.A00).lambda$updateProfileHeader$118$IndiaUpiPaymentSettingsActivity(view);
                return;
            case AnonymousClass0PW.A01:
                ((IndiaUpiPaymentSettingsActivity) this.A00).lambda$setActionRequiredRowVisibility$120$IndiaUpiPaymentSettingsActivity(view);
                return;
            case 21:
                AnonymousClass3IY r2 = ((IndiaUpiQrCodeScannedDialogFragment) this.A00).A0A;
                if (r2 == null) {
                    throw null;
                } else if (r2.A0F.A08()) {
                    C63862x8 r1 = new C63862x8(1);
                    Object A012 = r2.A06.A01();
                    if (A012 != null) {
                        r1.A01 = ((C61992u4) A012).A01;
                        r1.A02 = r2.A0B;
                        r2.A0A.A07(r1);
                        return;
                    }
                    throw null;
                } else {
                    r2.A0A.A07(new C63862x8(0));
                    return;
                }
            case 22:
                ((Dialog) this.A00).cancel();
                return;
            case 23:
                ((DialogFragment) this.A00).A0w(false, false);
                return;
            case 24:
                ((AbstractView$OnClickListenerC32271ec) this.A00).A0U();
                return;
            case 25:
                ((AbstractView$OnClickListenerC32271ec) this.A00).A0U();
                return;
            case 26:
                AnonymousClass037 r03 = ((AnonymousClass037) this.A00).A0D;
                if (r03 != null) {
                    r03.A0C().A0C();
                    return;
                }
                return;
            case 27:
                AnonymousClass037 r04 = ((AnonymousClass037) this.A00).A0D;
                if (r04 != null) {
                    r04.A0C().A0C();
                    return;
                }
                return;
            case 28:
                ((PaymentRailPickerFragment) this.A00).A0n(0);
                return;
            case 29:
                ((PaymentRailPickerFragment) this.A00).A0n(1);
                return;
            case 30:
                ((AbstractView$OnClickListenerC32241eZ) this.A00).lambda$onCreate$90$PaymentSettingsActivity(view);
                return;
            case 31:
                ((AbstractView$OnClickListenerC32241eZ) this.A00).lambda$onCreate$91$PaymentSettingsActivity(view);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                ((PaymentTransactionHistoryActivity) this.A00).A0V();
                return;
            case 33:
                AnonymousClass037 r22 = (AnonymousClass037) this.A00;
                ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) r22.A09();
                if (confirmPaymentFragment != null) {
                    confirmPaymentFragment.A0n(0);
                }
                AnonymousClass037 r05 = r22.A0D;
                if (r05 != null) {
                    r05.A0C().A0C();
                    return;
                }
                return;
            case 34:
                AnonymousClass037 r23 = (AnonymousClass037) this.A00;
                ConfirmPaymentFragment confirmPaymentFragment2 = (ConfirmPaymentFragment) r23.A09();
                if (confirmPaymentFragment2 != null) {
                    confirmPaymentFragment2.A0n(1);
                }
                AnonymousClass037 r06 = r23.A0D;
                if (r06 != null) {
                    r06.A0C().A0C();
                    return;
                }
                return;
            case 35:
                AnonymousClass037 r07 = ((AnonymousClass037) this.A00).A0D;
                if (r07 != null) {
                    r07.A0C().A0C();
                    return;
                }
                return;
            case 36:
                ((PaymentsUpdateRequiredActivity) this.A00).lambda$onCreate$108$PaymentsUpdateRequiredActivity(view);
                return;
            case 37:
                ReTosFragment reTosFragment = (ReTosFragment) this.A00;
                reTosFragment.A0v(false);
                reTosFragment.A00.setVisibility(8);
                reTosFragment.A01.setVisibility(0);
                C03340Fu r4 = reTosFragment.A03;
                Bundle bundle2 = ((AnonymousClass037) reTosFragment).A06;
                if (bundle2 != null) {
                    boolean z = bundle2.getBoolean("is_merchant");
                    Bundle bundle3 = ((AnonymousClass037) reTosFragment).A06;
                    if (bundle3 != null) {
                        boolean z2 = bundle3.getBoolean("is_merchant");
                        AnonymousClass3HL r9 = new AnonymousClass3HL(reTosFragment);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new AnonymousClass0OS("version", 2));
                        if (z) {
                            arrayList.add(new AnonymousClass0OS("consumer", 1));
                        }
                        if (z2) {
                            arrayList.add(new AnonymousClass0OS("merchant", 1));
                        }
                        r4.A0A(true, "urn:xmpp:whatsapp:account", new AnonymousClass0M5("accept_pay", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0])), new AnonymousClass3XS(r4, r4.A04.A00, r4.A00, r4.A02, r4.A0A, r9, z, z2), 0);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 38:
                ((C73743Yn) this.A00).A00.A07(new C63262w8(1));
                return;
            case 39:
                C73743Yn r42 = (C73743Yn) this.A00;
                AbstractC59432ne r12 = (AbstractC59432ne) ((AnonymousClass3IA) r42).A01.A06;
                if (!TextUtils.isEmpty(r12.A08)) {
                    C63262w8 r32 = new C63262w8(3);
                    r32.A05 = r12.A08.replaceAll("[^\\d]", "");
                    r42.A00.A07(r32);
                    return;
                }
                return;
            case 40:
                ((C73743Yn) this.A00).A00.A07(new C63262w8(0));
                return;
            case 41:
                C73743Yn r33 = (C73743Yn) this.A00;
                C74733bP r24 = (C74733bP) ((AnonymousClass3IA) r33).A01.A06;
                if (r24 != null && !TextUtils.isEmpty(r24.A02)) {
                    C63262w8 r13 = new C63262w8(2);
                    r13.A03 = Uri.parse(r24.A02);
                    r33.A00.A07(r13);
                    return;
                }
                return;
            case 42:
                C63302wC r34 = new C63302wC();
                r34.A01 = true;
                Pair A03 = C018609s.A03(new int[]{417, 418}, new int[]{40});
                r34.A00 = new AnonymousClass1X4((String) A03.second, (String[]) A03.first);
                ((AnonymousClass3I6) this.A00).A02.A07(r34);
                return;
            case 43:
                C63302wC r35 = new C63302wC();
                r35.A01 = true;
                Pair A032 = C018609s.A03(new int[]{20, 401}, new int[]{40});
                r35.A00 = new AnonymousClass1X4((String) A032.second, (String[]) A032.first);
                ((AnonymousClass3I6) this.A00).A02.A07(r35);
                return;
            case 44:
                ((C73773Yq) this.A00).A0C();
                return;
            case 45:
                ((AnonymousClass3IE) this.A00).A03();
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                ((C69703Ib) this.A00).A04(1, null);
                return;
            case 47:
                ((C69703Ib) this.A00).A04(2, null);
                return;
            case 48:
                MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment = (MandatePaymentBottomSheetFragment) this.A00;
                mandatePaymentBottomSheetFragment.A0p(mandatePaymentBottomSheetFragment.A0B);
                return;
            case 49:
                MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment2 = (MandatePaymentBottomSheetFragment) this.A00;
                mandatePaymentBottomSheetFragment2.A0p(mandatePaymentBottomSheetFragment2.A0B);
                return;
            default:
                return;
        }
    }
}
