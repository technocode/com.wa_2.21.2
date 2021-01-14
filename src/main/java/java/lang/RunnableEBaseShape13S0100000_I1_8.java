package java.lang;

import X.AbstractC07220Wk;
import X.AbstractC229313t;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01K;
import X.AnonymousClass02M;
import X.AnonymousClass0C4;
import X.AnonymousClass0JW;
import X.AnonymousClass0LW;
import X.AnonymousClass0PW;
import X.AnonymousClass0QB;
import X.AnonymousClass0S2;
import X.AnonymousClass0W2;
import X.AnonymousClass124;
import X.AnonymousClass232;
import X.AnonymousClass25M;
import X.AnonymousClass25N;
import X.AnonymousClass25O;
import X.AnonymousClass342;
import X.AnonymousClass348;
import X.AnonymousClass34A;
import X.AnonymousClass34J;
import X.AnonymousClass35G;
import X.AnonymousClass36B;
import X.AnonymousClass372;
import X.AnonymousClass374;
import X.AnonymousClass37G;
import X.AnonymousClass37U;
import X.AnonymousClass37V;
import X.AnonymousClass39E;
import X.AnonymousClass3R1;
import X.AnonymousClass3RR;
import X.AnonymousClass3RT;
import X.AnonymousClass3RY;
import X.AnonymousClass3SK;
import X.AnonymousClass3WU;
import X.AnonymousClass3WV;
import X.C004302a;
import X.C02400Bv;
import X.C02580Cq;
import X.C03410Gc;
import X.C225112b;
import X.C28051Sr;
import X.C48672Ng;
import X.C665134q;
import X.C676439o;
import X.C71923Qv;
import X.C72363So;
import X.C72403Ss;
import X.C73193Vv;
import X.C73263Wc;
import X.C74313ac;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.ViewOnClickEBaseShape3S0200000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.storage.StorageUsageMediaPreviewView;
import com.whatsapp.twofactor.DoneFragment;
import com.whatsapp.twofactor.SetEmailFragment;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.twofactor.TwoFactorAuthActivity;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import com.whatsapp.util.FloatingChildLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.crash.SigquitBasedANRDetector;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.PermissionDialogFragment;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.wabloks.base.BkScreenFragment;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.npci.commonlibrary.GetCredential;
import org.npci.commonlibrary.NPCIFragment;

public class RunnableEBaseShape13S0100000_I1_8 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableEBaseShape13S0100000_I1_8(C71923Qv r2) {
        this.A01 = 2;
        this.A00 = new WeakReference(r2);
    }

    public RunnableEBaseShape13S0100000_I1_8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void run() {
        AnonymousClass34J r6;
        switch (this.A01) {
            case 0:
                ((C03410Gc) this.A00).A07();
                return;
            case 1:
                StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this.A00;
                AnonymousClass3R1 r0 = stickerStoreMyTabFragment.A02;
                if (r0 != null) {
                    ((AnonymousClass0JW) r0).A00.cancel(true);
                }
                AnonymousClass3R1 r2 = new AnonymousClass3R1(((StickerStoreTabFragment) stickerStoreMyTabFragment).A0D, stickerStoreMyTabFragment);
                stickerStoreMyTabFragment.A02 = r2;
                stickerStoreMyTabFragment.A04.ANC(r2, new Void[0]);
                return;
            case 2:
                C71923Qv r02 = (C71923Qv) ((Reference) this.A00).get();
                if (r02 != null) {
                    r02.A00();
                    return;
                }
                return;
            case 3:
                ((AnonymousClass3RR) this.A00).A00.A0V(3);
                return;
            case 4:
                ((StorageUsageActivity) ((RunnableEBaseShape9S0200000_I1_4) this.A00).A01).A0V(3);
                return;
            case 5:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                storageUsageActivity.A0T.ANF(new RunnableEBaseShape13S0100000_I1_8(storageUsageActivity, 6));
                AnonymousClass00T r22 = storageUsageActivity.A0T;
                r22.ANF(new RunnableEBaseShape13S0100000_I1_8(storageUsageActivity, 13));
                r22.ANF(new RunnableEBaseShape13S0100000_I1_8(storageUsageActivity, 12));
                Log.i("storage-usage-activity/fetch cache");
                AnonymousClass348 r4 = storageUsageActivity.A07;
                if (!r4.A01("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME")) {
                    C73193Vv r1 = r4.A01;
                    r1.A0E("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME", null);
                    r1.A0E("STORAGE_USAGE_MEDIA_SIZE", null);
                }
                if (!r4.A01("STORAGE_USAGE_LARGE_FILES_CACHE_TIME")) {
                    C73193Vv r12 = r4.A01;
                    r12.A0E("STORAGE_USAGE_LARGE_FILES_CACHE_TIME", null);
                    r12.A0E("STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE", null);
                    r12.A0E("STORAGE_USAGE_LARGE_FILES_COUNT", null);
                    r12.A0E("STORAGE_USAGE_LARGE_FILES_ROW_IDS", null);
                }
                if (!r4.A01("STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME")) {
                    C73193Vv r13 = r4.A01;
                    r13.A0E("STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME", null);
                    r13.A0E("STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE", null);
                    r13.A0E("STORAGE_USAGE_FORWARDED_FILES_COUNT", null);
                    r13.A0E("STORAGE_USAGE_FORWARDED_FILES_ROW_IDS", null);
                }
                AnonymousClass34A A002 = storageUsageActivity.A07.A00();
                Long l = A002.A04;
                if (l == null) {
                    r6 = null;
                } else {
                    long longValue = l.longValue();
                    AnonymousClass00C r03 = storageUsageActivity.A0K;
                    r6 = new AnonymousClass34J(longValue, r03.A02(), r03.A04());
                }
                List list = A002.A06;
                Integer num = A002.A01;
                Long l2 = A002.A03;
                C02580Cq r42 = storageUsageActivity.A0R;
                AnonymousClass01K r3 = storageUsageActivity.A0M;
                RunnableEBaseShape1S0500000_I1 runnableEBaseShape1S0500000_I1 = new RunnableEBaseShape1S0500000_I1(storageUsageActivity, r6, C28051Sr.A0g(list, num, l2, r42, r3), C28051Sr.A0g(A002.A05, A002.A00, A002.A02, r42, r3), A002, 4);
                AnonymousClass02M r23 = storageUsageActivity.A0F;
                r23.A02.post(new RunnableEBaseShape9S0200000_I1_4(storageUsageActivity, runnableEBaseShape1S0500000_I1, 20));
                return;
            case 6:
                StorageUsageActivity storageUsageActivity2 = (StorageUsageActivity) this.A00;
                Log.i("storage-usage-activity/fetch media size");
                long A0H = C28051Sr.A0H(storageUsageActivity2.A0E, storageUsageActivity2.A07);
                AnonymousClass00C r04 = storageUsageActivity2.A0K;
                RunnableEBaseShape9S0200000_I1_4 runnableEBaseShape9S0200000_I1_4 = new RunnableEBaseShape9S0200000_I1_4(storageUsageActivity2, new AnonymousClass34J(A0H, r04.A02(), r04.A04()), 18);
                AnonymousClass02M r24 = storageUsageActivity2.A0F;
                r24.A02.post(new RunnableEBaseShape9S0200000_I1_4(storageUsageActivity2, runnableEBaseShape9S0200000_I1_4, 20));
                return;
            case 7:
                ((AnonymousClass3RT) this.A00).A0D(2, true);
                return;
            case 8:
                ((AnonymousClass3RY) this.A00).A00.A0r();
                return;
            case 9:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A00;
                ProgressDialogFragment A003 = ProgressDialogFragment.A00(0, R.string.loading_spinner);
                storageUsageGalleryActivity.A0C = A003;
                A003.A0v(true);
                ProgressDialogFragment progressDialogFragment = storageUsageGalleryActivity.A0C;
                progressDialogFragment.A00 = new AnonymousClass342(storageUsageGalleryActivity);
                AnonymousClass0LW A04 = storageUsageGalleryActivity.A04();
                String name = ProgressDialogFragment.class.getName();
                if (progressDialogFragment != null) {
                    AnonymousClass0QB r25 = new AnonymousClass0QB(A04);
                    r25.A0A(0, progressDialogFragment, name, 1);
                    r25.A01();
                    return;
                }
                throw null;
            case 10:
                ((ActivityC004702f) this.A00).A0G(R.string.delete_items_wait_progress);
                return;
            case 11:
                StorageUsageMediaPreviewView storageUsageMediaPreviewView = (StorageUsageMediaPreviewView) this.A00;
                storageUsageMediaPreviewView.setPreviewMediaItems(storageUsageMediaPreviewView.A02, storageUsageMediaPreviewView.A00, storageUsageMediaPreviewView.A01);
                return;
            case 12:
                StorageUsageActivity storageUsageActivity3 = (StorageUsageActivity) this.A00;
                if (storageUsageActivity3.A08 != null) {
                    Log.i("storage-usage-activity/fetch large files");
                    RunnableEBaseShape9S0200000_I1_4 runnableEBaseShape9S0200000_I1_42 = new RunnableEBaseShape9S0200000_I1_4(storageUsageActivity3, storageUsageActivity3.A08.A00(storageUsageActivity3.A01, 2), 21);
                    AnonymousClass02M r26 = storageUsageActivity3.A0F;
                    r26.A02.post(new RunnableEBaseShape9S0200000_I1_4(storageUsageActivity3, runnableEBaseShape9S0200000_I1_42, 20));
                    return;
                }
                return;
            case 13:
                StorageUsageActivity storageUsageActivity4 = (StorageUsageActivity) this.A00;
                if (storageUsageActivity4.A08 != null) {
                    Log.i("storage-usage-activity/fetch forwarded files");
                    RunnableEBaseShape9S0200000_I1_4 runnableEBaseShape9S0200000_I1_43 = new RunnableEBaseShape9S0200000_I1_4(storageUsageActivity4, storageUsageActivity4.A08.A00(storageUsageActivity4.A01, 1), 19);
                    AnonymousClass02M r27 = storageUsageActivity4.A0F;
                    r27.A02.post(new RunnableEBaseShape9S0200000_I1_4(storageUsageActivity4, runnableEBaseShape9S0200000_I1_43, 20));
                    return;
                }
                return;
            case 14:
                ((TwoFactorAuthActivity) this.A00).ALK();
                return;
            case 15:
                ((SettingsTwoFactorAuthActivity) this.A00).ALK();
                return;
            case GlVideoRenderer.CAP_RENDER_I420:
                SetEmailFragment setEmailFragment = (SetEmailFragment) this.A00;
                TwoFactorAuthActivity twoFactorAuthActivity = setEmailFragment.A05;
                SetEmailFragment.ConfirmSkipEmailDialog confirmSkipEmailDialog = new SetEmailFragment.ConfirmSkipEmailDialog();
                confirmSkipEmailDialog.A0Q(setEmailFragment, -1);
                twoFactorAuthActivity.APl(confirmSkipEmailDialog, SetEmailFragment.ConfirmSkipEmailDialog.class.getName());
                return;
            case 17:
                ActivityC004702f r14 = (ActivityC004702f) this.A00;
                r14.A0K.A00();
                r14.APo(R.string.two_factor_auth_save_error);
                return;
            case 18:
                TwoFactorAuthActivity twoFactorAuthActivity2 = (TwoFactorAuthActivity) this.A00;
                twoFactorAuthActivity2.A0K.A00();
                int[] iArr = twoFactorAuthActivity2.A05;
                if (iArr.length == 1) {
                    int i = iArr[0];
                    if (i == 1) {
                        ((ActivityC004702f) twoFactorAuthActivity2).A0F.A06(R.string.two_factor_auth_code_changed, 1);
                    } else if (i == 2) {
                        ((ActivityC004702f) twoFactorAuthActivity2).A0F.A06(R.string.two_factor_auth_email_changed, 1);
                    }
                    twoFactorAuthActivity2.finish();
                    return;
                }
                AnonymousClass0LW A042 = twoFactorAuthActivity2.A04();
                while (A042.A03() > 0) {
                    A042.A0t();
                }
                View currentFocus = twoFactorAuthActivity2.getCurrentFocus();
                if (currentFocus != null) {
                    ((ActivityC004602e) twoFactorAuthActivity2).A0H.A02(currentFocus);
                }
                AnonymousClass0S2 r05 = twoFactorAuthActivity2.A00;
                if (r05 != null) {
                    r05.A0A(false);
                    twoFactorAuthActivity2.A00.A0C(false);
                }
                twoFactorAuthActivity2.A0W(new DoneFragment(), false);
                return;
            case 19:
                C48672Ng r15 = ((C665134q) this.A00).A05;
                if (r15.A01()) {
                    r15.A00(true);
                    return;
                }
                return;
            case AnonymousClass0PW.A01:
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A00;
                userNoticeBottomSheetDialogFragment.A11(true, true);
                userNoticeBottomSheetDialogFragment.A0B = null;
                return;
            case 21:
                MediaPlayer mediaPlayer = ((AnonymousClass232) this.A00).A00;
                mediaPlayer.reset();
                mediaPlayer.release();
                return;
            case 22:
                FloatingChildLayout floatingChildLayout = (FloatingChildLayout) this.A00;
                if (floatingChildLayout.A04.isRunning()) {
                    floatingChildLayout.A04.reverse();
                    return;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 127);
                floatingChildLayout.A04 = ofInt;
                ofInt.addUpdateListener(new AnonymousClass35G(floatingChildLayout));
                floatingChildLayout.A04.setDuration((long) floatingChildLayout.A00).start();
                return;
            case 23:
                AnonymousClass36B r16 = (AnonymousClass36B) this.A00;
                r16.A03.A02.A01.clear();
                r16.A05.A05.clear();
                r16.A04.A02();
                return;
            case 24:
                AnonymousClass3SK r06 = (AnonymousClass3SK) this.A00;
                SigquitBasedANRDetector sigquitBasedANRDetector = r06.A01;
                File file = r06.A00;
                if (sigquitBasedANRDetector != null) {
                    Log.i("SigquitBasedANRDetector/abortANRAndDiscardReport");
                    Log.i("SigquitBasedANRDetector/abortANR");
                    sigquitBasedANRDetector.A0A = false;
                    StringBuilder A0S = AnonymousClass008.A0S("anr-helper/discarding anr report: ");
                    A0S.append(file.getName());
                    Log.i(A0S.toString());
                    file.delete();
                    return;
                }
                throw null;
            case 25:
                ((AnonymousClass3SK) this.A00).A01.A0A = false;
                return;
            case 26:
                ((C72363So) this.A00).A08();
                return;
            case 27:
                C72403Ss r43 = (C72403Ss) this.A00;
                Log.d("ExoPlayerVideoPlayer/preparePlayer");
                if (r43.A08 != null) {
                    AnonymousClass37G r07 = r43.A0D;
                    if (r07 != null) {
                        r07.A00();
                    }
                    r43.A08.A07(r43.A0E(), !r43.A0P, false);
                    r43.A0J();
                    return;
                }
                Log.d("ExoPlayerVideoPlayer/player is null when preparing");
                return;
            case 28:
                AnonymousClass25O r28 = (AnonymousClass25O) this.A00;
                C225112b r17 = r28.A0J;
                if (r17.A02 != null) {
                    r17.A00();
                }
                AnonymousClass25M r5 = r28.A0G;
                if (r5 != null) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("Release ");
                    A0S2.append(Integer.toHexString(System.identityHashCode(r5)));
                    A0S2.append(" [");
                    A0S2.append("ExoPlayerLib/2.9.6");
                    A0S2.append("] [");
                    A0S2.append(AnonymousClass0W2.A02);
                    A0S2.append("] [");
                    synchronized (AnonymousClass124.class) {
                    }
                    A0S2.append("goog.exo.core");
                    A0S2.append("]");
                    android.util.Log.i("ExoPlayerImpl", A0S2.toString());
                    AnonymousClass25N r32 = r5.A0C;
                    synchronized (r32) {
                        if (!r32.A0A) {
                            r32.A0Q.A00.sendEmptyMessage(7);
                            boolean z = false;
                            while (!r32.A0A) {
                                try {
                                    r32.wait();
                                } catch (InterruptedException unused) {
                                    z = true;
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                    r5.A0A.removeCallbacksAndMessages(null);
                    r28.A01();
                    Surface surface = r28.A04;
                    if (surface != null) {
                        if (r28.A0E) {
                            surface.release();
                        }
                        r28.A04 = null;
                    }
                    AbstractC229313t r18 = r28.A0B;
                    if (r18 != null) {
                        r18.AMc(r28.A0I);
                        r28.A0B = null;
                    }
                    r28.A0K.AMd(r28.A0I);
                    r28.A0C = Collections.emptyList();
                    return;
                }
                throw null;
            case 29:
                AnonymousClass37V r08 = ((AnonymousClass37U) this.A00).A00;
                r08.A07.onError(r08.A09, 1, 0);
                return;
            case 30:
                C74313ac r29 = (C74313ac) this.A00;
                if (r29.A01) {
                    r29.A07.A00(r29.A06);
                    r29.A01 = false;
                    return;
                }
                return;
            case 31:
                C74313ac r210 = (C74313ac) this.A00;
                if (!r210.A01) {
                    r210.A07.A01(r210.A06);
                    r210.A01 = true;
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH:
                ((AnonymousClass372) this.A00).A00();
                return;
            case 33:
                ((ExoPlaybackControlView) this.A00).A00();
                return;
            case 34:
                ((AnonymousClass374) this.A00).A00();
                return;
            case 35:
                ((ExoPlaybackControlView) this.A00).A05();
                return;
            case 36:
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = (MaximizedParticipantVideoDialogFragment) this.A00;
                if (maximizedParticipantVideoDialogFragment.A0U()) {
                    VideoCallParticipantView videoCallParticipantView = maximizedParticipantVideoDialogFragment.A08;
                    if (videoCallParticipantView != null) {
                        videoCallParticipantView.setVisibility(8);
                    }
                    maximizedParticipantVideoDialogFragment.A0r();
                    return;
                }
                return;
            case 37:
                ((AnonymousClass39E) this.A00).A00();
                return;
            case 38:
                ((AnonymousClass39E) this.A00).A01();
                return;
            case 39:
                PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) this.A00;
                AbstractC07220Wk r211 = permissionDialogFragment.A04;
                if (r211 != null) {
                    r211.AIS(permissionDialogFragment.A00, permissionDialogFragment.A08);
                    return;
                }
                return;
            case 40:
                ((Animator) this.A00).start();
                return;
            case 41:
                ((C676439o) this.A00).A00.A03.start();
                return;
            case 42:
                BkScreenFragment bkScreenFragment = (BkScreenFragment) this.A00;
                View view = bkScreenFragment.A00;
                if (view != null) {
                    view.setVisibility(8);
                }
                FrameLayout frameLayout = bkScreenFragment.A03;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    return;
                }
                return;
            case 43:
                AnonymousClass3WV r212 = ((AnonymousClass3WU) this.A00).A00;
                C02400Bv r09 = r212.A06;
                if (r09.A01().A01(r212.A00)) {
                    r212.A05.A02();
                    return;
                }
                return;
            case 44:
                ((AnonymousClass0C4) this.A00).A0A();
                return;
            case 45:
                ((GetCredential) this.A00).A0C = false;
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH:
                ((NPCIFragment) this.A00).A03.dismiss();
                return;
            case 47:
                NPCIFragment nPCIFragment = (NPCIFragment) this.A00;
                int i2 = nPCIFragment.A00;
                if (i2 != -1) {
                    ArrayList arrayList = nPCIFragment.A0C;
                    if (arrayList.get(i2) instanceof C73263Wc) {
                        C73263Wc r52 = (C73263Wc) arrayList.get(i2);
                        r52.A02(false);
                        r52.AQf(nPCIFragment.A0B.A06(R.string.npci_action_resend), C004302a.A03(nPCIFragment.A0A(), R.drawable.ic_action_reload), new ViewOnClickEBaseShape3S0200000_I1_2(this, r52, 2), 0, true, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
