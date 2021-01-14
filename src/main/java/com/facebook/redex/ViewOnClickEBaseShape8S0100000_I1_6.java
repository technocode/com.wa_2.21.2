package com.facebook.redex;

import X.AbstractC000400g;
import X.AbstractC07650Yy;
import X.AbstractC63672wp;
import X.AbstractC71663Pv;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass0MH;
import X.AnonymousClass0PW;
import X.AnonymousClass0Q7;
import X.AnonymousClass1PO;
import X.AnonymousClass1VM;
import X.AnonymousClass1X1;
import X.AnonymousClass1Y6;
import X.AnonymousClass3IL;
import X.AnonymousClass3IN;
import X.AnonymousClass3IS;
import X.AnonymousClass3QO;
import X.AnonymousClass3R6;
import X.C003701u;
import X.C03570Gt;
import X.C05900Qy;
import X.C08450b8;
import X.C09060cE;
import X.C12420i4;
import X.C28051Sr;
import X.C59842oN;
import X.C63772wz;
import X.C69873Iw;
import X.C71353Oo;
import X.C71723Qb;
import X.C74203aL;
import X.C74223aN;
import X.DialogC70763Mh;
import X.DialogInterface$OnClickListenerC63442wQ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.qrcode.QrScannerView;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment;
import com.whatsapp.registration.ChangeNumberNotifyContacts;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import com.whatsapp.stickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.stickers.StickerStoreDialogFragment;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.math.BigDecimal;

public class ViewOnClickEBaseShape8S0100000_I1_6 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape8S0100000_I1_6(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment, int i) {
        this.A01 = i;
        if (38 - i != 0) {
            this.A00 = addStickerPackDialogFragment;
        } else {
            this.A00 = addStickerPackDialogFragment;
        }
    }

    public ViewOnClickEBaseShape8S0100000_I1_6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        AbstractC07650Yy r2;
        C63772wz r22;
        String str;
        AbstractC07650Yy r23;
        int indexOf;
        String str2;
        AnonymousClass3R6 r0;
        switch (this.A01) {
            case 0:
                MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment = (MandatePaymentBottomSheetFragment) this.A00;
                if (mandatePaymentBottomSheetFragment.A0C.A0D != null && mandatePaymentBottomSheetFragment.A0E.size() >= 2) {
                    View inflate = LayoutInflater.from(mandatePaymentBottomSheetFragment.A00()).inflate(R.layout.india_upi_method_selection_dialog, (ViewGroup) null);
                    ViewGroup viewGroup = (ViewGroup) AnonymousClass0Q7.A0D(inflate, R.id.methods_list);
                    for (int i = 0; i < mandatePaymentBottomSheetFragment.A0E.size(); i++) {
                        AnonymousClass1VM r9 = (AnonymousClass1VM) mandatePaymentBottomSheetFragment.A0E.get(i);
                        View inflate2 = LayoutInflater.from(mandatePaymentBottomSheetFragment.A00()).inflate(R.layout.india_upi_method_row_item, (ViewGroup) null);
                        TextView textView = (TextView) AnonymousClass0Q7.A0D(inflate2, R.id.payment_method_title);
                        Bitmap A05 = r9.A05();
                        if (A05 != null) {
                            ((ImageView) AnonymousClass0Q7.A0D(inflate2, R.id.payment_method_icon)).setImageBitmap(A05);
                        }
                        textView.setText(C28051Sr.A0y(mandatePaymentBottomSheetFragment.A0L, mandatePaymentBottomSheetFragment.A0H, r9));
                        inflate2.setId(i);
                        inflate2.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(mandatePaymentBottomSheetFragment, inflate2, 21));
                        viewGroup.addView(inflate2);
                    }
                    AnonymousClass0MB r24 = new AnonymousClass0MB(mandatePaymentBottomSheetFragment.A00());
                    r24.A02(R.string.google_account_picker_title);
                    AnonymousClass0MC r1 = r24.A01;
                    r1.A0C = inflate;
                    r1.A01 = 0;
                    r1.A0J = true;
                    r24.A03(R.string.cancel, DialogInterface$OnClickListenerC63442wQ.A00);
                    AnonymousClass0MD A002 = r24.A00();
                    mandatePaymentBottomSheetFragment.A0A = A002;
                    A002.show();
                    return;
                }
                return;
            case 1:
                PaymentInteropShimmerRow paymentInteropShimmerRow = (PaymentInteropShimmerRow) this.A00;
                AnonymousClass1X1 A02 = paymentInteropShimmerRow.A03.A02(paymentInteropShimmerRow.A02.A0C);
                if (A02 != null) {
                    r23 = A02.A8I(paymentInteropShimmerRow.A02.A0E);
                } else {
                    r23 = null;
                }
                C28051Sr.A1L(paymentInteropShimmerRow.getContext(), r23, paymentInteropShimmerRow.A02);
                return;
            case 2:
                View.OnClickListener onClickListener = ((AnonymousClass3IL) this.A00).A00;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 3:
                PaymentView paymentView = (PaymentView) this.A00;
                paymentView.A0S.A01();
                paymentView.A01();
                if (paymentView.A05.getVisibility() == 0) {
                    paymentView.A03(false);
                    return;
                }
                return;
            case 4:
                PaymentView paymentView2 = (PaymentView) this.A00;
                String obj = paymentView2.A0N.getText().toString();
                int i2 = 1;
                if (paymentView2.A00 != 1) {
                    i2 = 0;
                }
                AnonymousClass0MH A0M = paymentView2.A0i.A0M(paymentView2.A0X, paymentView2.A0Z);
                if (A0M == null || A0M.A01 != 18) {
                    BigDecimal A4V = paymentView2.A0K.A4V(paymentView2.A0h, obj);
                    AnonymousClass3IS r10 = (AnonymousClass3IS) paymentView2.A0R;
                    if (A4V == null || r10.A04.A00.compareTo(A4V) > 0) {
                        AnonymousClass01X r12 = r10.A00;
                        r22 = new C63772wz(2, r12.A0D(R.string.payments_send_payment_min_amount, r10.A01.A4R(r12, r10.A04)));
                    } else {
                        r22 = new C63772wz(0, "");
                    }
                    if (r22.A00 == 0) {
                        r22 = r10.A00(i2, A4V, "", false);
                    }
                    int i3 = r22.A00;
                    if ((i3 == 2 || i3 == 3) && (str = r22.A01) != null) {
                        paymentView2.A0C.setText(str);
                        paymentView2.A0C.setVisibility(0);
                        paymentView2.A0S.A01();
                        return;
                    }
                    paymentView2.A0U = obj;
                    AnonymousClass3IN r02 = paymentView2.A0O;
                    if (r02 != null) {
                        paymentView2.A0W = r02.A03.getStringText();
                        paymentView2.A0a = paymentView2.A0O.A03.getMentions();
                    }
                    AbstractC63672wp r25 = paymentView2.A0P;
                    int A5z = paymentView2.A0K.A5z();
                    if (i2 != 0) {
                        r25.AJQ(obj, new C05900Qy(A4V, A5z));
                        return;
                    } else {
                        r25.AJx(obj, new C05900Qy(A4V, A5z));
                        return;
                    }
                } else {
                    paymentView2.A0P.AJy();
                    return;
                }
            case 5:
                PeerPaymentTransactionRow peerPaymentTransactionRow = (PeerPaymentTransactionRow) this.A00;
                AnonymousClass1X1 A022 = peerPaymentTransactionRow.A0Q.A02(peerPaymentTransactionRow.A0G.A0C);
                if (A022 != null) {
                    r2 = A022.A8I(peerPaymentTransactionRow.A0G.A0E);
                } else {
                    r2 = null;
                }
                C28051Sr.A1L(peerPaymentTransactionRow.getContext(), r2, peerPaymentTransactionRow.A0G);
                return;
            case 6:
                ((View) this.A00).getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")));
                return;
            case 7:
                C69873Iw r13 = ((PickerSearchDialogFragment) this.A00).A00;
                r13.A06 = true;
                PickerSearchDialogFragment pickerSearchDialogFragment = r13.A03;
                if (pickerSearchDialogFragment != null) {
                    pickerSearchDialogFragment.A0x();
                }
                C59842oN r03 = r13.A00;
                if (!(r03 == null || (r0 = r03.A0M) == null)) {
                    r0.A03();
                    return;
                }
                return;
            case 8:
                ((ProfileInfoActivity) this.A00).lambda$onCreate$2336$ProfileInfoActivity(view);
                return;
            case 9:
                ((ProfileInfoActivity) this.A00).lambda$onCreate$2337$ProfileInfoActivity(view);
                return;
            case 10:
                ((ProfileInfoActivity) this.A00).lambda$onCreate$2335$ProfileInfoActivity(view);
                return;
            case 11:
                ((ActivityC004702f) this.A00).onBackPressed();
                return;
            case 12:
                ((DialogFragment) this.A00).A0q();
                return;
            case 13:
                ((ActivityC004702f) this.A00).onBackPressed();
                return;
            case 14:
                QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) this.A00;
                qrScanCodeFragment.A06 = null;
                QrScannerView qrScannerView = qrScanCodeFragment.A05;
                if (qrScannerView.A04 != null) {
                    Handler handler = qrScannerView.A05;
                    if (handler != null) {
                        handler.removeCallbacks(qrScannerView.A0D);
                    } else {
                        qrScannerView.removeCallbacks(qrScannerView.A0D);
                    }
                    try {
                        qrScannerView.A04.cancelAutoFocus();
                        qrScannerView.A04.autoFocus(qrScannerView.A0A);
                        return;
                    } catch (RuntimeException e) {
                        Log.e("qrview/autofocus failed", e);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                ActivityC004902h A0A = ((AnonymousClass037) this.A00).A0A();
                if (A0A instanceof AnonymousClass1Y6) {
                    AnonymousClass1Y6 r26 = (AnonymousClass1Y6) A0A;
                    Intent intent = new Intent(r26, GalleryPickerLauncher.class);
                    r26.A0E = true;
                    r26.startActivityForResult(intent, 2);
                    return;
                }
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                QrScanCodeFragment qrScanCodeFragment2 = (QrScanCodeFragment) this.A00;
                QrScannerView qrScannerView2 = qrScanCodeFragment2.A05;
                boolean z = qrScannerView2.A08;
                if (z) {
                    Camera camera = qrScannerView2.A04;
                    if (camera != null && z) {
                        qrScannerView2.A09 = !qrScannerView2.A09;
                        Camera.Parameters parameters = camera.getParameters();
                        if (qrScannerView2.A09) {
                            str2 = "torch";
                        } else {
                            str2 = "off";
                        }
                        parameters.setFlashMode(str2);
                        qrScannerView2.A04.setParameters(parameters);
                    }
                    qrScanCodeFragment2.A0o();
                    return;
                }
                return;
            case 17:
                ((DialogFragment) this.A00).A0w(false, false);
                return;
            case 18:
                ScannedCodeDialogFragment scannedCodeDialogFragment = (ScannedCodeDialogFragment) this.A00;
                ContactInfoActivity.A07(scannedCodeDialogFragment.A05, scannedCodeDialogFragment.A0A(), null);
                return;
            case 19:
                ScannedCodeDialogFragment scannedCodeDialogFragment2 = (ScannedCodeDialogFragment) this.A00;
                ContactInfoActivity.A07(scannedCodeDialogFragment2.A05, scannedCodeDialogFragment2.A0A(), null);
                return;
            case AnonymousClass0PW.A01:
                ScannedCodeDialogFragment scannedCodeDialogFragment3 = (ScannedCodeDialogFragment) this.A00;
                int i4 = scannedCodeDialogFragment3.A00;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Context A003 = scannedCodeDialogFragment3.A00();
                            if (A003 != null) {
                                if (!TextUtils.isEmpty(scannedCodeDialogFragment3.A0A)) {
                                    scannedCodeDialogFragment3.A0h(Conversation.A07(A003, true, true, scannedCodeDialogFragment3.A0A, (byte) 0, scannedCodeDialogFragment3.A06, true));
                                } else {
                                    scannedCodeDialogFragment3.A0h(Conversation.A05(A003, scannedCodeDialogFragment3.A06));
                                }
                                if (scannedCodeDialogFragment3.A0D.A0D(AbstractC000400g.A0s)) {
                                    scannedCodeDialogFragment3.A0T.ANF(new RunnableEBaseShape12S0100000_I1_7(scannedCodeDialogFragment3, 18));
                                }
                                scannedCodeDialogFragment3.A0w(false, false);
                            } else {
                                throw null;
                            }
                        } else {
                            throw new IllegalArgumentException("Unhandled type");
                        }
                    }
                    scannedCodeDialogFragment3.A0w(false, false);
                    return;
                } else if (scannedCodeDialogFragment3.A05.A08 != null) {
                    scannedCodeDialogFragment3.A0h(Conversation.A05(scannedCodeDialogFragment3.A01(), scannedCodeDialogFragment3.A06));
                    scannedCodeDialogFragment3.A0w(false, false);
                    return;
                } else {
                    String A023 = C12420i4.A02(scannedCodeDialogFragment3.A06);
                    if (A023 != null) {
                        Intent A004 = C09060cE.A00(A023, scannedCodeDialogFragment3.A05.A0O, true, false);
                        A004.putExtra("finishActivityOnSaveCompleted", true);
                        scannedCodeDialogFragment3.startActivityForResult(A004, 1);
                        scannedCodeDialogFragment3.A08.A02(true, 11);
                        return;
                    }
                    throw null;
                }
            case 21:
                ((ChangeNumberNotifyContacts) this.A00).lambda$onCreate$2388$ChangeNumberNotifyContacts(view);
                return;
            case 22:
                ((ChangeNumberNotifyContacts) this.A00).lambda$onCreate$2390$ChangeNumberNotifyContacts(view);
                return;
            case 23:
                ((ChangeNumberOverview) this.A00).lambda$onCreate$2393$ChangeNumberOverview(view);
                return;
            case 24:
                ((EULA) this.A00).lambda$onCreate$2403$EULA(view);
                return;
            case 25:
                Log.i("registername/init/stack ");
                C003701u.A0C();
                RegisterName registerName = ((DialogC70763Mh) this.A00).A01;
                registerName.A0m.A01(registerName, "regname-init", false, null);
                return;
            case 26:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) ((AnonymousClass037) this.A00).A0A();
                int A0T = verifyTwoFactorAuth.A0T();
                StringBuilder sb = new StringBuilder("verifytwofactorauth/ask-reset wipeStatus=");
                sb.append(A0T);
                Log.d(sb.toString());
                VerifyTwoFactorAuth.ConfirmWipe confirmWipe = new VerifyTwoFactorAuth.ConfirmWipe();
                Bundle bundle = new Bundle();
                bundle.putInt("wipeStatus", A0T);
                confirmWipe.A0N(bundle);
                verifyTwoFactorAuth.APl(confirmWipe, null);
                return;
            case 27:
                VerifyTwoFactorAuth verifyTwoFactorAuth2 = (VerifyTwoFactorAuth) ((AnonymousClass037) this.A00).A0A();
                if (verifyTwoFactorAuth2 != null) {
                    AnonymousClass008.A0t("verifytwofactorauth/do-reset mode=", 1);
                    verifyTwoFactorAuth2.A0Y(null, 1, false);
                    return;
                }
                throw null;
            case 28:
                ((DialogFragment) this.A00).A0w(false, false);
                return;
            case 29:
                ((ChangeNumberNotifyContacts) this.A00).onRadioButtonClicked(view);
                return;
            case 30:
                ((RestoreFromConsumerDatabaseActivity) this.A00).lambda$null$2460$RestoreFromConsumerDatabaseActivity(view);
                return;
            case 31:
                ((RestoreFromConsumerDatabaseActivity) this.A00).lambda$onCreate$2459$RestoreFromConsumerDatabaseActivity(view);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                ((AnonymousClass1PO) this.A00).lambda$onCreate$2500$AbstractWallpaperPreview(view);
                return;
            case 33:
                ((GalleryWallpaperPreview) this.A00).lambda$onCreate$2501$GalleryWallpaperPreview(view);
                return;
            case 34:
                ((SolidColorWallpaperPreview) this.A00).lambda$onCreate$2503$SolidColorWallpaperPreview(view);
                return;
            case 35:
                ((WallpaperPreview) this.A00).lambda$onCreate$2513$WallpaperPreview(view);
                return;
            case 36:
                DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity = ((C71353Oo) this.A00).A02.A00;
                downloadableWallpaperPickerActivity.A05.A08(downloadableWallpaperPickerActivity.A06, downloadableWallpaperPickerActivity.A03, 2);
                return;
            case 37:
                ((AbstractC71663Pv) this.A00).A00.A0D(4);
                return;
            case 38:
                ((DialogFragment) this.A00).A0r();
                return;
            case 39:
                ((AnonymousClass3QO) this.A00).A08();
                return;
            case 40:
                ((DialogFragment) this.A00).A0w(false, false);
                return;
            case 41:
                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = ((C71723Qb) this.A00).A00;
                if (stickerStoreFeaturedTabFragment != null) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("http://play.google.com/store/search?q=WAStickerApps&c=apps"));
                    intent2.setPackage("com.android.vending");
                    StickerStoreFeaturedTabFragment.A03.A05(stickerStoreFeaturedTabFragment.A00(), intent2);
                    return;
                }
                throw null;
            case 42:
                AnonymousClass037 r3 = ((AnonymousClass037) this.A00).A0D;
                if (r3 instanceof StickerStoreDialogFragment) {
                    StickerStoreDialogFragment stickerStoreDialogFragment = (StickerStoreDialogFragment) r3;
                    StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment2 = stickerStoreDialogFragment.A05;
                    C08450b8 r04 = stickerStoreDialogFragment.A04;
                    if (!(r04 == null || (indexOf = r04.A00.indexOf(stickerStoreFeaturedTabFragment2)) == -1)) {
                        stickerStoreDialogFragment.A01.A0B(indexOf, true);
                        return;
                    }
                    return;
                }
                return;
            case 43:
                ((Activity) this.A00).finish();
                return;
            case 44:
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = (AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) this.A00;
                AnonymousClass01X r5 = addStickerPackDialogFragment.A06;
                addStickerPackDialogFragment.A0x(r5.A0D(R.string.sticker_third_party_pack_add_progress_message_with_app, addStickerPackDialogFragment.A02, r5.A06(R.string.localized_app_name)), 0, 8, 8);
                C03570Gt r52 = addStickerPackDialogFragment.A09;
                r52.A0R.ANF(new RunnableEBaseShape1S2100000_I1(r52, addStickerPackDialogFragment.A00, addStickerPackDialogFragment.A01, 5));
                return;
            case 45:
                ((C74203aL) this.A00).A0A.A03();
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                C74223aN r4 = (C74223aN) this.A00;
                String str3 = r4.A04.A0F;
                Bundle bundle2 = new Bundle();
                ThirdPartyPackPage$StickerBlockedDialogFragment thirdPartyPackPage$StickerBlockedDialogFragment = new ThirdPartyPackPage$StickerBlockedDialogFragment();
                bundle2.putString("sticker_pack_name", str3);
                thirdPartyPackPage$StickerBlockedDialogFragment.A0N(bundle2);
                ((ActivityC004702f) r4.A09).APm(thirdPartyPackPage$StickerBlockedDialogFragment);
                return;
            case 47:
                ((StorageUsageActivity) this.A00).onBackPressed();
                return;
            case 48:
                ((StorageUsageActivity) this.A00).onSearchRequested();
                return;
            case 49:
                View view2 = (View) this.A00;
                if (view2.isSelected()) {
                    view2.setSelected(false);
                }
                view2.setSelected(true);
                return;
            default:
                return;
        }
    }
}
