package com.facebook.redex;

import X.AbstractActivityC29861aJ;
import X.AbstractActivityC34761jB;
import X.AbstractC16300pa;
import X.AbstractC59432ne;
import X.AbstractC63952xH;
import X.AbstractC674838t;
import X.AnonymousClass008;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass0M3;
import X.AnonymousClass0M5;
import X.AnonymousClass0MH;
import X.AnonymousClass0PW;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QM;
import X.AnonymousClass1PY;
import X.AnonymousClass1VM;
import X.AnonymousClass20I;
import X.AnonymousClass20J;
import X.AnonymousClass20K;
import X.AnonymousClass2UI;
import X.AnonymousClass374;
import X.AnonymousClass37M;
import X.AnonymousClass3FA;
import X.AnonymousClass3FS;
import X.AnonymousClass3GS;
import X.AnonymousClass3GY;
import X.AnonymousClass3I9;
import X.AnonymousClass3IE;
import X.AnonymousClass3IH;
import X.AnonymousClass3R7;
import X.AnonymousClass3R8;
import X.AnonymousClass3TY;
import X.AnonymousClass3XM;
import X.AnonymousClass3XT;
import X.AnonymousClass3Zm;
import X.AnonymousClass3Zn;
import X.C007003k;
import X.C018809u;
import X.C02010Ah;
import X.C02780Dk;
import X.C03340Fu;
import X.C05480Os;
import X.C07400Xm;
import X.C11260fz;
import X.C28301Tu;
import X.C57562kV;
import X.C60892sA;
import X.C61282sv;
import X.C61772ti;
import X.C63262w8;
import X.C63372wJ;
import X.C63692wr;
import X.C662433l;
import X.C68683Ed;
import X.C72533Tf;
import X.C72663Tt;
import X.C73743Yn;
import X.C73913Zi;
import X.C73923Zj;
import X.C73933Zk;
import X.C73943Zl;
import X.C73953Zo;
import X.C73963Zp;
import X.C73973Zq;
import X.C74733bP;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPaymentInviteOrSetupJob;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentTypePickerFragment;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerifActivity;
import com.whatsapp.payments.ui.IndiaUpiEducationActivity;
import com.whatsapp.payments.ui.IndiaUpiInvitePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentRailPickerFragment;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import java.util.HashMap;

public class ViewOnClickEBaseShape2S0200000_I1_1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape2S0200000_I1_1(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        AnonymousClass0M3 A7O;
        AnonymousClass3GY r4;
        AnonymousClass3GY r42;
        AnonymousClass3GY r43;
        switch (this.A02) {
            case 0:
                ((C57562kV) this.A00).A00.A1A((AnonymousClass0M3) this.A01, 0, false);
                return;
            case 1:
                MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                view.setOnClickListener((ViewOnClickEBaseShape2S0200000_I1_1) this.A01);
                mediaViewBaseFragment.A10(!mediaViewBaseFragment.A0G, true);
                return;
            case 2:
                StringBuilder A0S = AnonymousClass008.A0S("mediaview/audioclick ");
                ProgressBar progressBar = (ProgressBar) this.A00;
                A0S.append(progressBar.getProgress());
                A0S.append(" | ");
                A0S.append(progressBar.getMax());
                A0S.append(" - ");
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A01;
                AnonymousClass008.A1L(A0S, mediaViewFragment.A01);
                if (mediaViewFragment.A0M == null) {
                    return;
                }
                if (mediaViewFragment.A01 != 2 || progressBar.getProgress() <= 0 || progressBar.getProgress() >= progressBar.getMax()) {
                    int i = mediaViewFragment.A01;
                    if (i == 2) {
                        if (mediaViewFragment.A0M.A01() >= mediaViewFragment.A0M.A02() && progressBar.getProgress() == progressBar.getMax()) {
                            progressBar.setProgress(0);
                            try {
                                mediaViewFragment.A0M.A07(0);
                            } catch (IOException | IllegalStateException e) {
                                Log.e("mediaview/failed to start from beginning reset pause", e);
                                mediaViewFragment.AMs().APo(R.string.gallery_audio_cannot_load);
                                return;
                            }
                        }
                        mediaViewFragment.A1B.A01();
                        C28301Tu.A03();
                        try {
                            mediaViewFragment.A0M.A06();
                            mediaViewFragment.A06.removeMessages(0);
                            mediaViewFragment.A06.sendEmptyMessage(0);
                            mediaViewFragment.A14();
                            mediaViewFragment.A01 = 1;
                            return;
                        } catch (IOException e2) {
                            Log.e("mediaview/failed to start from beginning no reset pause", e2);
                            mediaViewFragment.AMs().APo(R.string.gallery_audio_cannot_load);
                            return;
                        }
                    } else if (i == 1) {
                        mediaViewFragment.A13();
                        return;
                    } else {
                        int i2 = mediaViewFragment.A03;
                        AnonymousClass2UI r0 = mediaViewFragment.A0G;
                        if (r0 == null || (A7O = r0.A7O(i2)) == null) {
                            throw null;
                        }
                        mediaViewFragment.A19(A7O);
                        if (mediaViewFragment.A0M != null) {
                            mediaViewFragment.A1B.A01();
                            C28301Tu.A03();
                            try {
                                mediaViewFragment.A0M.A06();
                                mediaViewFragment.A14();
                                mediaViewFragment.A06.sendEmptyMessage(0);
                                mediaViewFragment.A01 = 1;
                                return;
                            } catch (IOException e3) {
                                Log.e("mediaview/failed to start from unknown", e3);
                                mediaViewFragment.AMs().APo(R.string.gallery_audio_cannot_load);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    mediaViewFragment.A1B.A01();
                    C28301Tu.A03();
                    try {
                        mediaViewFragment.A0M.A06();
                        mediaViewFragment.A06.sendEmptyMessage(0);
                        mediaViewFragment.A14();
                        mediaViewFragment.A01 = 1;
                        return;
                    } catch (IOException e4) {
                        Log.e("mediaview/failed to start from mid pause", e4);
                        mediaViewFragment.AMs().APo(R.string.gallery_audio_cannot_load);
                        return;
                    }
                }
            case 3:
                Context context = (Context) this.A00;
                String str = ((AnonymousClass0MH) this.A01).A0G;
                Intent intent = new Intent(context, IndiaUpiMandatePaymentActivity.class);
                intent.putExtra("payment_transaction_info_id", str);
                intent.putExtra("payment_method", (Parcelable) null);
                intent.putExtra("is_accept_mandate", false);
                context.startActivity(intent);
                return;
            case 4:
                ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) this.A00;
                PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A01;
                if (paymentBottomSheet != null && (r4 = confirmPaymentFragment.A0F) != null) {
                    int i3 = confirmPaymentFragment.A01;
                    r4.A01.A01.A01.A03(new AnonymousClass3FS(r4, r4.A02, i3, paymentBottomSheet), null);
                    return;
                }
                return;
            case 5:
                ((ConfirmPaymentFragment) this.A00).A0o((AnonymousClass1VM) this.A01);
                return;
            case 6:
                ConfirmPaymentFragment confirmPaymentFragment2 = (ConfirmPaymentFragment) this.A00;
                PaymentBottomSheet paymentBottomSheet2 = (PaymentBottomSheet) this.A01;
                if (paymentBottomSheet2 != null && (r42 = confirmPaymentFragment2.A0F) != null) {
                    int i4 = confirmPaymentFragment2.A01;
                    Bundle bundle = new Bundle();
                    if (i4 != 0) {
                        bundle.putString("arg_type", "friendsAndFamily");
                    } else {
                        bundle.putString("arg_type", "goodAndServices");
                    }
                    BrazilPaymentTypePickerFragment brazilPaymentTypePickerFragment = new BrazilPaymentTypePickerFragment();
                    brazilPaymentTypePickerFragment.A0N(bundle);
                    brazilPaymentTypePickerFragment.A0Q(r42.A02, 0);
                    paymentBottomSheet2.A0x(brazilPaymentTypePickerFragment);
                    return;
                }
                return;
            case 7:
                ConfirmPaymentFragment confirmPaymentFragment3 = (ConfirmPaymentFragment) this.A00;
                PaymentBottomSheet paymentBottomSheet3 = (PaymentBottomSheet) this.A01;
                if (paymentBottomSheet3 != null && (r43 = confirmPaymentFragment3.A0F) != null) {
                    int i5 = confirmPaymentFragment3.A00;
                    PaymentRailPickerFragment paymentRailPickerFragment = new PaymentRailPickerFragment();
                    Bundle bundle2 = new Bundle();
                    if (i5 != 0) {
                        bundle2.putString("arg_type", "debit");
                    } else {
                        bundle2.putString("arg_type", "credit");
                    }
                    paymentRailPickerFragment.A0N(bundle2);
                    paymentRailPickerFragment.A0Q(r43.A02, 0);
                    paymentBottomSheet3.A0x(paymentRailPickerFragment);
                    return;
                }
                return;
            case 8:
            default:
                return;
            case 9:
                BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) ((ConfirmReceivePaymentFragment) this.A00);
                ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A01.A01.A03(new AnonymousClass3FA(brazilConfirmReceivePaymentFragment, (PaymentBottomSheet) this.A01), null);
                return;
            case 10:
                AnonymousClass037 r5 = (AnonymousClass037) this.A00;
                Intent intent2 = new Intent(r5.A0A(), BrazilPayBloksActivity.class);
                intent2.putExtra("screen_name", "brpay_p_add_card");
                HashMap hashMap = new HashMap();
                hashMap.put("add_debit_only", "1");
                intent2.putExtra("screen_params", hashMap);
                r5.A0h(intent2);
                ((DialogFragment) this.A01).A0w(false, false);
                return;
            case 11:
                ConfirmReceivePaymentFragment confirmReceivePaymentFragment = (ConfirmReceivePaymentFragment) this.A00;
                BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment2 = (BrazilConfirmReceivePaymentFragment) confirmReceivePaymentFragment;
                String str2 = ((AnonymousClass1VM) this.A01).A07;
                AnonymousClass02M r6 = brazilConfirmReceivePaymentFragment2.A01;
                r6.A05(0, R.string.payment_get_verify_card_data);
                new C61282sv(brazilConfirmReceivePaymentFragment2.A04, brazilConfirmReceivePaymentFragment2.A00(), r6, brazilConfirmReceivePaymentFragment2.A02, brazilConfirmReceivePaymentFragment2.A0F, brazilConfirmReceivePaymentFragment2.A0B, brazilConfirmReceivePaymentFragment2.A03, brazilConfirmReceivePaymentFragment2.A09, brazilConfirmReceivePaymentFragment2.A07, brazilConfirmReceivePaymentFragment2.A08, str2).A00(new AnonymousClass3GS(brazilConfirmReceivePaymentFragment2, str2, (PaymentBottomSheet) confirmReceivePaymentFragment.A0D));
                return;
            case 12:
                IndiaUpiEducationActivity indiaUpiEducationActivity = (IndiaUpiEducationActivity) this.A00;
                AnonymousClass1VM r3 = (AnonymousClass1VM) this.A01;
                int i6 = indiaUpiEducationActivity.A00;
                if (i6 == 1) {
                    indiaUpiEducationActivity.setResult(-1);
                    indiaUpiEducationActivity.finish();
                    if (indiaUpiEducationActivity.A02 != 2) {
                        C68683Ed r32 = indiaUpiEducationActivity.A03;
                        C61772ti r02 = r32.A03;
                        String str3 = r02.A02;
                        if (str3 == null) {
                            str3 = r02.A02();
                        }
                        AnonymousClass20J r1 = new AnonymousClass20J();
                        r1.A02 = r32.A00;
                        r1.A03 = str3;
                        r1.A01 = Boolean.TRUE;
                        ((AnonymousClass1PY) indiaUpiEducationActivity).A0A.A0B(r1, null, false);
                        return;
                    }
                    return;
                } else if (i6 == 0) {
                    Intent intent3 = new Intent(indiaUpiEducationActivity, IndiaUpiDebitCardVerifActivity.class);
                    intent3.putExtra("extra_bank_account", r3);
                    indiaUpiEducationActivity.startActivityForResult(intent3, 1013);
                    C68683Ed r33 = indiaUpiEducationActivity.A03;
                    C61772ti r03 = r33.A03;
                    String str4 = r03.A02;
                    if (str4 == null) {
                        str4 = r03.A02();
                    }
                    AnonymousClass20K r12 = new AnonymousClass20K();
                    r12.A02 = r33.A00;
                    r12.A03 = str4;
                    r12.A01 = Boolean.TRUE;
                    ((AnonymousClass1PY) indiaUpiEducationActivity).A0A.A0B(r12, null, false);
                    return;
                } else {
                    C018809u r13 = indiaUpiEducationActivity.A04;
                    StringBuilder A0S2 = AnonymousClass008.A0S("unsupported education type ");
                    A0S2.append(i6);
                    r13.A03(A0S2.toString());
                    return;
                }
            case 13:
                IndiaUpiInvitePaymentActivity indiaUpiInvitePaymentActivity = (IndiaUpiInvitePaymentActivity) this.A00;
                UserJid userJid = (UserJid) this.A01;
                C07400Xm r8 = indiaUpiInvitePaymentActivity.A00;
                r8.A00.A00.A01(new SendPaymentInviteOrSetupJob(userJid, true));
                C02010Ah r7 = r8.A03;
                String string = r7.A01().getString("payments_invitee_jids", "");
                String A012 = C07400Xm.A01(string, userJid);
                AnonymousClass008.A0q(r7, "payments_invitee_jids", A012);
                r8.A05.A07(null, AnonymousClass008.A0M("addInviteeJid old invitees: ", string, "; saved new invitees: ", A012), null);
                C05480Os A0A = indiaUpiInvitePaymentActivity.A01.A0A(userJid, ((AbstractActivityC34761jB) indiaUpiInvitePaymentActivity).A0F.A05(), 42);
                A0A.A0Y(userJid);
                ((AbstractActivityC34761jB) indiaUpiInvitePaymentActivity).A0H.A0e(A0A, 16);
                indiaUpiInvitePaymentActivity.finish();
                return;
            case 14:
                IndiaUpiPaymentsTosActivity indiaUpiPaymentsTosActivity = (IndiaUpiPaymentsTosActivity) this.A00;
                indiaUpiPaymentsTosActivity.A07.AQ7();
                ((View) this.A01).setVisibility(8);
                indiaUpiPaymentsTosActivity.findViewById(R.id.progress).setVisibility(0);
                C03340Fu r2 = ((AbstractActivityC34761jB) indiaUpiPaymentsTosActivity).A0J;
                if (r2 != null) {
                    r2.A0A(true, "urn:xmpp:whatsapp:account", new AnonymousClass0M5("accept_pay", null), new AnonymousClass3XT(r2, r2.A04.A00, r2.A00, r2.A02, r2.A0A, indiaUpiPaymentsTosActivity), 0);
                    AnonymousClass20I r14 = indiaUpiPaymentsTosActivity.A04;
                    r14.A00 = Boolean.TRUE;
                    ((AnonymousClass1PY) indiaUpiPaymentsTosActivity).A0A.A07(r14);
                    return;
                }
                throw null;
            case 15:
                C73743Yn r44 = (C73743Yn) this.A00;
                AbstractC59432ne r15 = (AbstractC59432ne) this.A01;
                if (!TextUtils.isEmpty(r15.A08)) {
                    C63262w8 r34 = new C63262w8(3);
                    r34.A05 = r15.A08.replaceAll("[^\\d]", "");
                    r44.A00.A07(r34);
                    return;
                }
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                ((C73743Yn) this.A00).A03((C74733bP) this.A01);
                return;
            case 17:
                ((C73743Yn) this.A00).A03((C74733bP) this.A01);
                return;
            case 18:
                AnonymousClass3I9 r16 = new AnonymousClass3I9(103);
                ((C63372wJ) r16).A04 = (AnonymousClass0MH) this.A01;
                ((AnonymousClass3IE) this.A00).A06.A07(r16);
                return;
            case 19:
                AnonymousClass3I9 r17 = new AnonymousClass3I9(102);
                r17.A03 = ((AnonymousClass3XM) this.A01).A0H;
                ((AnonymousClass3IE) this.A00).A06.A07(r17);
                return;
            case AnonymousClass0PW.A01:
                C63372wJ r18 = new C63372wJ(9);
                r18.A03 = (AnonymousClass1VM) this.A01;
                ((AnonymousClass3IE) this.A00).A06.A07(r18);
                return;
            case 21:
                MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment = (MandatePaymentBottomSheetFragment) this.A00;
                View view2 = (View) this.A01;
                if (mandatePaymentBottomSheetFragment.A0A != null) {
                    mandatePaymentBottomSheetFragment.A0B = (AnonymousClass1VM) mandatePaymentBottomSheetFragment.A0E.get(view2.getId());
                    mandatePaymentBottomSheetFragment.A0o();
                    mandatePaymentBottomSheetFragment.A0A.cancel();
                    return;
                }
                return;
            case 22:
                MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment2 = (MandatePaymentBottomSheetFragment) this.A00;
                C60892sA r35 = (C60892sA) this.A01;
                mandatePaymentBottomSheetFragment2.A0F.A05(0, R.string.register_wait_message);
                mandatePaymentBottomSheetFragment2.A0D.A01(mandatePaymentBottomSheetFragment2.A0C, r35, new AnonymousClass3IH(mandatePaymentBottomSheetFragment2, r35));
                return;
            case 23:
                AnonymousClass02M r22 = ((PaymentView) this.A00).A0c;
                boolean isEmpty = TextUtils.isEmpty(((C63692wr) this.A01).A07);
                int i7 = R.string.payments_amount_cannot_edit_request;
                if (isEmpty) {
                    i7 = R.string.payments_amount_cannot_edit;
                }
                r22.A03(i7);
                return;
            case 24:
                PeerPaymentTransactionRow peerPaymentTransactionRow = (PeerPaymentTransactionRow) this.A00;
                QuickContactActivity.A04(C02780Dk.A00(peerPaymentTransactionRow.getContext()), view, ((AnonymousClass0MH) this.A01).A09, AnonymousClass0Q7.A0G(peerPaymentTransactionRow.A04));
                return;
            case 25:
                PeerPaymentTransactionRow peerPaymentTransactionRow2 = (PeerPaymentTransactionRow) this.A00;
                QuickContactActivity.A04(C02780Dk.A00(peerPaymentTransactionRow2.getContext()), view, ((AnonymousClass0MH) this.A01).A0A, AnonymousClass0Q7.A0G(peerPaymentTransactionRow2.A04));
                return;
            case 26:
                AbstractActivityC29861aJ r36 = (AbstractActivityC29861aJ) this.A00;
                ((View) this.A01).setVisibility(8);
                r36.A06 = false;
                if (r36.A07) {
                    r36.A04.A04.setOneShotPreviewCallback(r36.A08);
                }
                r36.A04.post(new RunnableEBaseShape12S0100000_I1_7(r36, 5));
                return;
            case 27:
                ((SearchViewModel) this.A00).A0I((UserJid) ((C007003k) this.A01).A02(UserJid.class));
                return;
            case 28:
                Object obj = this.A01;
                SearchViewModel searchViewModel = ((C73913Zi) this.A00).A00;
                searchViewModel.A0L(false);
                searchViewModel.A0F(2);
                searchViewModel.A0T.A07(obj);
                return;
            case 29:
                Object obj2 = this.A01;
                SearchViewModel searchViewModel2 = ((C73913Zi) this.A00).A00;
                searchViewModel2.A0L(false);
                searchViewModel2.A0F(2);
                searchViewModel2.A0T.A07(obj2);
                return;
            case 30:
                Object obj3 = this.A01;
                SearchViewModel searchViewModel3 = ((C73923Zj) this.A00).A00;
                searchViewModel3.A0L(false);
                searchViewModel3.A0F(2);
                searchViewModel3.A0T.A07(obj3);
                return;
            case 31:
                Object obj4 = this.A01;
                SearchViewModel searchViewModel4 = ((C73933Zk) this.A00).A00;
                searchViewModel4.A0L(false);
                searchViewModel4.A0F(2);
                searchViewModel4.A0T.A07(obj4);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                Object obj5 = this.A01;
                SearchViewModel searchViewModel5 = ((C73943Zl) this.A00).A00;
                searchViewModel5.A0L(false);
                searchViewModel5.A0R.A07(obj5);
                return;
            case 33:
                Object obj6 = this.A01;
                SearchViewModel searchViewModel6 = ((AnonymousClass3Zm) this.A00).A00;
                searchViewModel6.A0L(false);
                searchViewModel6.A0F(2);
                searchViewModel6.A0T.A07(obj6);
                return;
            case 34:
                Object obj7 = this.A01;
                SearchViewModel searchViewModel7 = ((AnonymousClass3Zn) this.A00).A00;
                searchViewModel7.A0L(false);
                searchViewModel7.A0F(2);
                searchViewModel7.A0T.A07(obj7);
                return;
            case 35:
                Object obj8 = this.A01;
                SearchViewModel searchViewModel8 = ((C73953Zo) this.A00).A00;
                searchViewModel8.A0L(false);
                searchViewModel8.A0F(2);
                searchViewModel8.A0T.A07(obj8);
                return;
            case 36:
                Object obj9 = this.A01;
                SearchViewModel searchViewModel9 = ((C73953Zo) this.A00).A00;
                searchViewModel9.A0L(false);
                searchViewModel9.A0R.A07(obj9);
                return;
            case 37:
                Object obj10 = this.A01;
                SearchViewModel searchViewModel10 = ((C73963Zp) this.A00).A00;
                searchViewModel10.A0L(false);
                searchViewModel10.A0F(2);
                searchViewModel10.A0T.A07(obj10);
                return;
            case 38:
                Object obj11 = this.A01;
                SearchViewModel searchViewModel11 = ((C73973Zq) this.A00).A00;
                searchViewModel11.A0L(false);
                searchViewModel11.A0F(2);
                searchViewModel11.A0T.A07(obj11);
                return;
            case 39:
                ((View) this.A01).setEnabled(false);
                ((DownloadableWallpaperPickerActivity) this.A00).A08.A02();
                return;
            case 40:
                AnonymousClass3R8 r04 = ((AnonymousClass3R7) this.A00).A02;
                int i8 = ((C662433l) this.A01).A00;
                AbstractC63952xH r19 = r04.A04;
                if (r19 != null) {
                    r19.A01(i8, true);
                    return;
                }
                return;
            case 41:
                AnonymousClass3R8 r05 = ((AnonymousClass3R7) this.A00).A02;
                int i9 = ((C662433l) this.A01).A00 + 1;
                AbstractC63952xH r06 = r05.A04;
                if (r06 != null) {
                    r06.A01(i9, true);
                    return;
                }
                return;
            case 42:
                AnonymousClass3R8 r07 = ((AnonymousClass3R7) this.A00).A02;
                int i10 = ((C662433l) this.A01).A00;
                AbstractC63952xH r110 = r07.A04;
                if (r110 != null) {
                    r110.A01(i10, true);
                    return;
                }
                return;
            case 43:
                AnonymousClass3R8 r111 = ((AnonymousClass3R7) this.A00).A02;
                int i11 = ((C662433l) this.A01).A00 + 3;
                AbstractC63952xH r112 = r111.A04;
                if (r112 != null) {
                    r112.A01(i11, true);
                    return;
                }
                return;
            case 44:
                AnonymousClass3R8 r113 = ((AnonymousClass3R7) this.A00).A02;
                int i12 = ((C662433l) this.A01).A00 + 2;
                AbstractC63952xH r114 = r113.A04;
                if (r114 != null) {
                    r114.A01(i12, true);
                    return;
                }
                return;
            case 45:
                ((AnonymousClass374) this.A00).A0G((AnonymousClass37M) this.A01);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                AnonymousClass3TY r37 = (AnonymousClass3TY) this.A00;
                UserJid userJid2 = (UserJid) this.A01;
                AbstractC674838t r08 = r37.A09.A02;
                if (r08 != null) {
                    r08.ADr(userJid2);
                }
                StringBuilder sb = new StringBuilder("voip/CallerPhotoGridAdapter/removeContact ");
                sb.append(userJid2);
                Log.d(sb.toString());
                r37.A08.remove(userJid2);
                ((AbstractC16300pa) r37).A01.A00();
                return;
            case 47:
                C72533Tf r09 = (C72533Tf) this.A00;
                r09.A0E.A06((C007003k) this.A01, r09.A0D.A0A(), 16, false);
                return;
            case 48:
                C72533Tf r010 = (C72533Tf) this.A00;
                r010.A0E.A01((C007003k) this.A01, r010.A0D.A0A(), 16, false, true);
                return;
            case 49:
                C72663Tt r38 = (C72663Tt) this.A00;
                r38.A0C.A04((AnonymousClass0QM) ((C11260fz) this.A01).A03.get(0), r38.A0B.A0B());
                return;
        }
    }
}
