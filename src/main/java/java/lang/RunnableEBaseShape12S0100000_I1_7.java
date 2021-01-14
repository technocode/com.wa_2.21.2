package java.lang;

import X.AbstractActivityC29861aJ;
import X.AbstractC07260Wt;
import X.AbstractC16300pa;
import X.AbstractC64972z6;
import X.AbstractC659532f;
import X.AbstractC71533Pi;
import X.AbstractC71653Pu;
import X.AbstractC71663Pv;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass0I2;
import X.AnonymousClass0JW;
import X.AnonymousClass0PW;
import X.AnonymousClass0Q7;
import X.AnonymousClass0ZB;
import X.AnonymousClass1MI;
import X.AnonymousClass1Y6;
import X.AnonymousClass2C0;
import X.AnonymousClass2F8;
import X.AnonymousClass2OD;
import X.AnonymousClass303;
import X.AnonymousClass30M;
import X.AnonymousClass32Y;
import X.AnonymousClass3L6;
import X.AnonymousClass3MH;
import X.AnonymousClass3ML;
import X.AnonymousClass3OU;
import X.AnonymousClass3ZK;
import X.AnonymousClass3ZP;
import X.C002001d;
import X.C006803i;
import X.C007003k;
import X.C007603r;
import X.C018609s;
import X.C01970Ad;
import X.C02430Bz;
import X.C06170Sb;
import X.C08450b8;
import X.C09900di;
import X.C28241Tl;
import X.C30971cJ;
import X.C49232Po;
import X.C59842oN;
import X.C659432e;
import X.C660132l;
import X.C70893Mu;
import X.C74103a6;
import android.content.Intent;
import android.graphics.Rect;
import android.hardware.Camera;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Me;
import com.whatsapp.MessageReplyActivity;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.qrcode.QrEducationDialogFragment;
import com.whatsapp.qrcode.QrScannerView;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.qrcode.contactqr.ScannedCodeDialogFragment;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.search.IteratingPlayer;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;
import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.StatusReplyActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.stickers.StickerStoreDialogFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RunnableEBaseShape12S0100000_I1_7 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableEBaseShape12S0100000_I1_7(AnonymousClass3ML r2) {
        this.A01 = 19;
        this.A00 = r2;
    }

    public RunnableEBaseShape12S0100000_I1_7(VerifyTwoFactorAuth verifyTwoFactorAuth, int i) {
        this.A01 = i;
        switch (i) {
            case 26:
            case 27:
                this.A00 = verifyTwoFactorAuth;
                return;
            default:
                this.A00 = verifyTwoFactorAuth;
                return;
        }
    }

    public RunnableEBaseShape12S0100000_I1_7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void run() {
        List A0W;
        int i;
        int identifier;
        C59842oN r0;
        int indexOf;
        switch (this.A01) {
            case 0:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
                C007003k r1 = profileInfoActivity.A04;
                if (r1.A02 == 0 && r1.A01 == 0) {
                    profileInfoActivity.A02.setVisibility(4);
                    return;
                }
                return;
            case 1:
                ((AnonymousClass3L6) this.A00).A00.A0F(new HashSet(), null);
                return;
            case 2:
                AnonymousClass008.A0u("LinkPreviewViewModel/CTWAListener/errorCode/", 422);
                return;
            case 3:
                Log.e("LinkPreviewViewModel/CTWAListener/onDeliveryFailure");
                return;
            case 4:
                ((View) this.A00).requestLayout();
                return;
            case 5:
                ((AbstractActivityC29861aJ) this.A00).A0T();
                return;
            case 6:
                DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A00;
                if (devicePairQrScannerActivity.A0P()) {
                    ((AbstractActivityC29861aJ) devicePairQrScannerActivity).A05 = null;
                    return;
                } else if (((AbstractActivityC29861aJ) devicePairQrScannerActivity).A05 != null) {
                    devicePairQrScannerActivity.A00.A00().AAA(((AbstractActivityC29861aJ) devicePairQrScannerActivity).A05);
                    return;
                } else {
                    devicePairQrScannerActivity.A0H.A01();
                    return;
                }
            case 7:
                C02430Bz r4 = ((DevicePairQrScannerActivity) this.A00).A0D;
                synchronized (r4.A0I) {
                    AnonymousClass2F8 r2 = r4.A00;
                    if (r2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("companion-device-manager/device login canceled: ");
                        sb.append(r2.A01.A05);
                        Log.d(sb.toString());
                        r4.A09(r4.A00.A01.A05);
                        r4.A00 = null;
                    }
                }
                return;
            case 8:
                DevicePairQrScannerActivity devicePairQrScannerActivity2 = (DevicePairQrScannerActivity) this.A00;
                devicePairQrScannerActivity2.A0I.ANF(new RunnableEBaseShape12S0100000_I1_7(devicePairQrScannerActivity2, 7));
                if (!devicePairQrScannerActivity2.AB1()) {
                    devicePairQrScannerActivity2.APo(R.string.timeout_qr_code);
                    devicePairQrScannerActivity2.A0V();
                    ((AbstractActivityC29861aJ) devicePairQrScannerActivity2).A05 = null;
                    return;
                }
                return;
            case 9:
                ((AbstractActivityC29861aJ) this.A00).A0U();
                return;
            case 10:
                AbstractActivityC29861aJ r22 = (AbstractActivityC29861aJ) this.A00;
                Camera camera = r22.A04.A04;
                if (camera != null) {
                    camera.setOneShotPreviewCallback(r22.A08);
                    return;
                }
                return;
            case 11:
                QrScannerView qrScannerView = (QrScannerView) this.A00;
                Camera camera2 = qrScannerView.A04;
                if (camera2 != null) {
                    try {
                        camera2.autoFocus(qrScannerView.A0A);
                        return;
                    } catch (RuntimeException e) {
                        Log.w("qrview/onAutoFocus error:", e);
                        return;
                    }
                } else {
                    return;
                }
            case 12:
                QrScannerView qrScannerView2 = (QrScannerView) this.A00;
                qrScannerView2.A03();
                Camera camera3 = qrScannerView2.A04;
                if (camera3 != null) {
                    try {
                        camera3.setPreviewDisplay(qrScannerView2.A0C);
                        qrScannerView2.A00();
                        return;
                    } catch (IOException | RuntimeException e2) {
                        qrScannerView2.A04.release();
                        qrScannerView2.A04 = null;
                        Log.e("qrview/startcamera ", e2);
                        qrScannerView2.A01();
                        return;
                    }
                } else {
                    return;
                }
            case 13:
                ((DevicePairQrScannerActivity) this.A00).A03.A06(R.string.scan_qr_code_again, 1);
                return;
            case 14:
                QrScanCodeFragment qrScanCodeFragment = ((AnonymousClass3MH) this.A00).A00;
                if (qrScanCodeFragment.A0G.A04()) {
                    qrScanCodeFragment.A0D.A06(R.string.error_camera_disabled_during_video_call, 1);
                }
                ActivityC004902h A0A = qrScanCodeFragment.A0A();
                if (A0A instanceof AnonymousClass1Y6) {
                    AnonymousClass1Y6 r12 = (AnonymousClass1Y6) A0A;
                    r12.A03.A0B(!r12.A0O.A0M(), true);
                    return;
                }
                return;
            case 15:
                ((AnonymousClass3MH) this.A00).A00.A0o();
                return;
            case GlVideoRenderer.CAP_RENDER_I420:
                QrScanCodeFragment qrScanCodeFragment2 = (QrScanCodeFragment) this.A00;
                qrScanCodeFragment2.A0A = false;
                qrScanCodeFragment2.A0p();
                return;
            case 17:
                QrScanCodeFragment qrScanCodeFragment3 = (QrScanCodeFragment) this.A00;
                if (qrScanCodeFragment3.A0W()) {
                    C002001d.A2o(qrScanCodeFragment3.A0C(), new QrEducationDialogFragment());
                    qrScanCodeFragment3.A07 = true;
                }
                qrScanCodeFragment3.A09 = true;
                return;
            case 18:
                ScannedCodeDialogFragment scannedCodeDialogFragment = (ScannedCodeDialogFragment) this.A00;
                scannedCodeDialogFragment.A0H.A00.A09(new C28241Tl(scannedCodeDialogFragment.A06, scannedCodeDialogFragment.A09, scannedCodeDialogFragment.A0B));
                return;
            case 19:
                AbstractC64972z6 r23 = ((AnonymousClass3ML) this.A00).A00;
                r23.A46(630, true);
                r23.A45(113, 300000);
                return;
            case AnonymousClass0PW.A01:
                AnonymousClass01K r42 = ((AnonymousClass303) this.A00).A00.A0G;
                synchronized (r42) {
                    C01970Ad r02 = r42.A1L;
                    r02.A04();
                    C018609s r3 = r02.A05;
                    synchronized (r3) {
                        r3.A07.A07(null, "PaymentTransactionStore/failReceiverPendingTransactions", null);
                        A0W = r3.A0W(true);
                    }
                    r42.A0Y(A0W);
                }
                return;
            case 21:
                AnonymousClass01I r24 = ((ChangeNumber) this.A00).A0B;
                r24.A04();
                Me me = r24.A00;
                r24.A04();
                r24.A07(me, "me_old");
                return;
            case 22:
                AnonymousClass2C0 r32 = (AnonymousClass2C0) this.A00;
                AnonymousClass01X r25 = r32.A01;
                ((TextView) r32.findViewById(R.id.change_number_overview_body_one)).setText(r25.A06(R.string.change_number_overview_payments_one));
                ((TextView) r32.findViewById(R.id.change_number_overview_body_two)).setText(r25.A06(R.string.change_number_overview_payments_two));
                ((TextView) r32.findViewById(R.id.change_number_overview_body_three)).setText(r25.A06(R.string.change_number_overview_payments_three));
                return;
            case 23:
                ChangeNumberOverview changeNumberOverview = (ChangeNumberOverview) this.A00;
                C01970Ad r03 = changeNumberOverview.A04;
                r03.A04();
                if (((AbstractCollection) r03.A05.A0S(1)).size() > 0) {
                    ((ActivityC004702f) changeNumberOverview).A0F.A0E(new RunnableEBaseShape12S0100000_I1_7(changeNumberOverview, 22));
                    return;
                }
                AnonymousClass01X r26 = ((AnonymousClass2C0) changeNumberOverview).A01;
                ((TextView) changeNumberOverview.findViewById(R.id.change_number_overview_body_one)).setText(r26.A06(R.string.change_number_overview_one));
                ((TextView) changeNumberOverview.findViewById(R.id.change_number_overview_body_two)).setText(r26.A06(R.string.change_number_overview_two));
                ((TextView) changeNumberOverview.findViewById(R.id.change_number_overview_body_three)).setText(r26.A06(R.string.change_number_overview_three));
                return;
            case 24:
                ((EULA) this.A00).A0T();
                return;
            case 25:
                AnonymousClass30M r13 = (AnonymousClass30M) this.A00;
                r13.A0A.A02.A01.clear();
                r13.A0C.A05.clear();
                r13.A0B.A02();
                return;
            case 26:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A00;
                int A0T = verifyTwoFactorAuth.A0T();
                long A05 = ((verifyTwoFactorAuth.A03 * 1000) + verifyTwoFactorAuth.A01) - verifyTwoFactorAuth.A0N.A05();
                StringBuilder sb2 = new StringBuilder("verifytwofactorauth/ask-reset wipeStatus=");
                sb2.append(A0T);
                sb2.append(" timeToWaitInMillis=");
                sb2.append(A05);
                Log.d(sb2.toString());
                VerifyTwoFactorAuth.ConfirmResetCode confirmResetCode = new VerifyTwoFactorAuth.ConfirmResetCode();
                Bundle bundle = new Bundle();
                bundle.putInt("wipeStatus", A0T);
                bundle.putLong("timeToWaitInMillis", A05);
                confirmResetCode.A0N(bundle);
                verifyTwoFactorAuth.APl(confirmResetCode, "forgotPinDialogTag");
                return;
            case 27:
                VerifyTwoFactorAuth verifyTwoFactorAuth2 = (VerifyTwoFactorAuth) this.A00;
                verifyTwoFactorAuth2.A0V.A0B();
                verifyTwoFactorAuth2.startActivity(new Intent(verifyTwoFactorAuth2, RegisterPhone.class));
                verifyTwoFactorAuth2.finish();
                return;
            case 28:
                ((AnonymousClass2OD) this.A00).A01();
                return;
            case 29:
                StringBuilder sb3 = new StringBuilder();
                VerifyTwoFactorAuth verifyTwoFactorAuth3 = (VerifyTwoFactorAuth) this.A00;
                sb3.append(verifyTwoFactorAuth3.A0C);
                sb3.append(verifyTwoFactorAuth3.A0D);
                byte[] A0E = C007603r.A0E(verifyTwoFactorAuth3.getApplicationContext(), C002001d.A1o(sb3.toString()));
                if (A0E != null) {
                    byte[] A04 = AnonymousClass0I2.A04(verifyTwoFactorAuth3.getApplicationContext(), ((ActivityC004702f) verifyTwoFactorAuth3).A0G, verifyTwoFactorAuth3.A0D);
                    AnonymousClass00T r14 = verifyTwoFactorAuth3.A0Z;
                    C09900di r27 = new C09900di(((ActivityC004702f) verifyTwoFactorAuth3).A0J, verifyTwoFactorAuth3.A0U, verifyTwoFactorAuth3.A0C, verifyTwoFactorAuth3.A0D, A0E, A04, verifyTwoFactorAuth3, verifyTwoFactorAuth3.A0O);
                    verifyTwoFactorAuth3.A0A = r27;
                    r14.ANC(r27, new Void[0]);
                    return;
                }
                throw null;
            case 30:
                C70893Mu r33 = (C70893Mu) this.A00;
                r33.A06(r33.A05.A00.getInt("migrate_from_other_app_attempt_count", 0), 4);
                r33.A05(4);
                r33.A03();
                AnonymousClass3ZK r04 = r33.A09.A00;
                if (r04 != null) {
                    ((AnonymousClass0JW) r04).A00.cancel(true);
                    return;
                }
                return;
            case 31:
                IteratingPlayer iteratingPlayer = (IteratingPlayer) this.A00;
                iteratingPlayer.A02();
                int i2 = iteratingPlayer.A00 + 1;
                if (i2 > iteratingPlayer.A02) {
                    i2 = iteratingPlayer.A01;
                }
                iteratingPlayer.A03(i2);
                if (iteratingPlayer.A03) {
                    iteratingPlayer.A06.A02.postDelayed(iteratingPlayer.A07, 2000);
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH:
                SearchFragment searchFragment = (SearchFragment) this.A00;
                AbstractC07260Wt r28 = (AbstractC07260Wt) searchFragment.A0A();
                searchFragment.A0B.A0G(2);
                if (!(r28 == null || r28.isFinishing())) {
                    r28.AJq();
                    return;
                }
                return;
            case 33:
                AnonymousClass3ZP r05 = ((SearchFragment) this.A00).A0A;
                if (r05 != null) {
                    ((AbstractC16300pa) r05).A01.A00();
                    return;
                }
                return;
            case 34:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A00;
                AnonymousClass0ZB r06 = messageGifVideoPlayer.A05;
                if (r06 != null) {
                    C49232Po A002 = C49232Po.A00(r06);
                    messageGifVideoPlayer.A04 = A002;
                    try {
                        MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
                        if (mediaPlayer == null) {
                            messageGifVideoPlayer.A02 = new MediaPlayer();
                        } else {
                            mediaPlayer.reset();
                        }
                        messageGifVideoPlayer.A02.setLooping(true);
                        messageGifVideoPlayer.A02.setDataSource(A002.A03);
                        messageGifVideoPlayer.A02.setOnPreparedListener(messageGifVideoPlayer.A01);
                        messageGifVideoPlayer.A02.setOnErrorListener(messageGifVideoPlayer.A00);
                        messageGifVideoPlayer.A02.prepareAsync();
                        return;
                    } catch (IOException | IllegalStateException | NullPointerException e3) {
                        StringBuilder sb4 = new StringBuilder("MessageGifVideoPlayer/");
                        sb4.append("prepareMediaPlayer failed to prepare mediaplayer");
                        Log.e(sb4.toString(), e3);
                        return;
                    }
                } else {
                    return;
                }
            case 35:
                Log.d("RestoreChatConnectionWorker timeout");
                ((RestoreChatConnectionWorker) this.A00).A01.A08(new C30971cJ());
                return;
            case 36:
                ((AnonymousClass3OU) this.A00).A04();
                return;
            case 37:
                MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
                ((ActivityC004702f) myStatusesActivity).A0F.A02.removeCallbacks(myStatusesActivity.A0p);
                myStatusesActivity.A0m.ANF(new RunnableEBaseShape4S0100000_I0_4(myStatusesActivity, 23));
                return;
            case 38:
                MyStatusesActivity myStatusesActivity2 = (MyStatusesActivity) this.A00;
                myStatusesActivity2.A06.notifyDataSetChanged();
                myStatusesActivity2.A0X();
                return;
            case 39:
                ((Set) this.A00).clear();
                return;
            case 40:
                StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this.A00;
                View view = ((MessageReplyActivity) statusReplyActivity).A02;
                Rect rect = statusReplyActivity.A00;
                view.getWindowVisibleDisplayFrame(rect);
                int[] iArr = new int[2];
                ((MessageReplyActivity) statusReplyActivity).A02.getLocationOnScreen(iArr);
                int measuredHeight = rect.bottom - ((MessageReplyActivity) statusReplyActivity).A01.getMeasuredHeight();
                if (C06170Sb.A01(((MessageReplyActivity) statusReplyActivity).A02) || (r0 = ((MessageReplyActivity) statusReplyActivity).A0C) == null || !r0.isShowing()) {
                    i = 0;
                } else {
                    i = ((AnonymousClass1MI) ((MessageReplyActivity) statusReplyActivity).A0C).A01;
                }
                int i3 = (measuredHeight - i) - iArr[1];
                if (C006803i.A0j() && (identifier = statusReplyActivity.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                    i3 -= statusReplyActivity.getResources().getDimensionPixelSize(identifier);
                }
                View view2 = ((MessageReplyActivity) statusReplyActivity).A01;
                AnonymousClass0Q7.A0U(view2, i3 - view2.getTop());
                return;
            case 41:
                ((StatusPlaybackFragment) this.A00).A0o();
                return;
            case 42:
                AnonymousClass32Y A0t = ((StatusPlaybackBaseFragment) this.A00).A0t();
                A0t.A0B.startAnimation(AnonymousClass008.A02(1.0f, 0.0f, 125));
                A0t.A0B.setVisibility(8);
                return;
            case 43:
                AbstractC71663Pv r15 = ((AbstractC71653Pu) this.A00).A00;
                if (((AbstractC659532f) r15).A03) {
                    r15.A05 = false;
                    AbstractC71533Pi r29 = r15.A0I;
                    StringBuilder A0S = AnonymousClass008.A0S("playbackFragment/onPlaybackFinished ");
                    A0S.append(r29.A00);
                    Log.i(A0S.toString());
                    StatusPlaybackContactFragment.A00(((C74103a6) r29).A01, 4, 6);
                    return;
                }
                return;
            case 44:
                ((AbstractC71663Pv) this.A00).A0O(false, true);
                return;
            case 45:
                C659432e r16 = (C659432e) this.A00;
                if (!r16.A00) {
                    ((AbstractC16300pa) r16.A0D).A01.A00();
                    r16.A00();
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH:
                ((C660132l) this.A00).A02();
                return;
            case 47:
                StickerStoreDialogFragment stickerStoreDialogFragment = (StickerStoreDialogFragment) this.A00;
                StickerStoreMyTabFragment stickerStoreMyTabFragment = stickerStoreDialogFragment.A06;
                C08450b8 r07 = stickerStoreDialogFragment.A04;
                if (!(r07 == null || (indexOf = r07.A00.indexOf(stickerStoreMyTabFragment)) == -1)) {
                    stickerStoreDialogFragment.A01.A0B(indexOf, true);
                    return;
                }
                return;
            case 48:
                ((StickerStoreDialogFragment) this.A00).A02.A0D(3);
                return;
            case 49:
                for (String str : (Collection) this.A00) {
                    C006803i.A0m(new File(str));
                    StringBuilder sb5 = new StringBuilder("StickerStorePackPreviewActivity/deleteFiles/deleted: ");
                    sb5.append(str);
                    Log.d(sb5.toString());
                }
                return;
            default:
                return;
        }
    }
}
