package java.lang;

import X.AbstractC03680Hf;
import X.AbstractC17610rq;
import X.AbstractC18190sw;
import X.ActivityC004702f;
import X.ActivityC004802g;
import X.AnonymousClass008;
import X.AnonymousClass02Y;
import X.AnonymousClass0JJ;
import X.AnonymousClass0PW;
import X.AnonymousClass1DU;
import X.AnonymousClass1u2;
import X.AnonymousClass2C0;
import X.AnonymousClass2OC;
import X.AnonymousClass2XQ;
import X.AnonymousClass2YB;
import X.AnonymousClass3U7;
import X.C01970Ad;
import X.C18200sx;
import X.C27261Ou;
import X.C28051Sr;
import X.C38481pw;
import X.C39101qx;
import X.C39591rm;
import X.C40141sh;
import X.C40381tB;
import X.C43751yt;
import X.C51052Xd;
import X.C669836s;
import X.C73423Xg;
import X.C74463ay;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.BlockConfirmationDialogFragment;
import com.whatsapp.Conversation;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.faq.FaqItemActivity;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class RunnableEBaseShape1S1100000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public RunnableEBaseShape1S1100000_I1(Object obj, String str, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public void run() {
        Account[] accountArr;
        switch (this.A02) {
            case 0:
                C18200sx r1 = (C18200sx) this.A00;
                synchronized (r1.A00) {
                    Map map = r1.A02;
                    String str = this.A01;
                    if (((RunnableEBaseShape1S1100000_I1) map.remove(str)) != null) {
                        AbstractC18190sw r0 = (AbstractC18190sw) r1.A01.remove(str);
                        if (r0 != null) {
                            r0.AKy(str);
                        }
                    } else {
                        AbstractC17610rq.A00().A02("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", str), new Throwable[0]);
                    }
                }
                return;
            case 1:
            case 2:
            case 3:
                throw null;
            case 4:
                ((BlockConfirmationDialogFragment) this.A00).A02.A0C(this.A01, 1);
                return;
            case 5:
                C39591rm r12 = (C39591rm) this.A00;
                String str2 = this.A01;
                Conversation conversation = r12.A01;
                C27261Ou.A01(conversation.A3M, ((ActivityC004702f) conversation).A0F, conversation.A4R, ((AnonymousClass2C0) conversation).A01, str2, new C38481pw(r12));
                return;
            case 6:
                AbstractC03680Hf r02 = ((C40141sh) this.A00).A00;
                if (r02 != null) {
                    r02.AGV();
                    return;
                }
                return;
            case 7:
                ((C40381tB) this.A00).A01.A03(this.A01, null);
                return;
            case 8:
                AnonymousClass1u2 r13 = (AnonymousClass1u2) this.A00;
                String str3 = this.A01;
                TextStatusComposerActivity textStatusComposerActivity = r13.A01;
                C27261Ou.A01(textStatusComposerActivity.A0S, ((ActivityC004702f) textStatusComposerActivity).A0F, textStatusComposerActivity.A0c, ((AnonymousClass2C0) textStatusComposerActivity).A01, str3, new C39101qx(r13));
                return;
            case 9:
                ActivityC004802g r4 = (ActivityC004802g) this.A00;
                String str4 = this.A01;
                View findViewById = r4.findViewById(R.id.gdrive_restore_size_info);
                if (findViewById != null) {
                    TextView textView = (TextView) findViewById;
                    View findViewById2 = r4.findViewById(R.id.calculating_transfer_size_progress_bar);
                    if (findViewById2 == null) {
                        throw null;
                    } else if (!AnonymousClass0JJ.A0H(r4)) {
                        textView.setText(str4);
                        findViewById2.setVisibility(8);
                        return;
                    } else {
                        return;
                    }
                } else {
                    throw null;
                }
            case 10:
                ((RestoreFromBackupActivity) this.A00).A0o(this.A01, 4);
                return;
            case 11:
                String str5 = this.A01;
                StringBuilder A0S = AnonymousClass008.A0S("gdrive-activity/auth-request unable to access ");
                A0S.append(AnonymousClass0JJ.A0B(str5));
                Log.e(A0S.toString());
                ((ActivityC004702f) this.A00).APo(R.string.settings_gdrive_unable_to_access_this_account);
                return;
            case 12:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                String str6 = this.A01;
                try {
                    accountArr = AccountManager.get(restoreFromBackupActivity.A0Z.A00).getAccountsByType("com.google");
                } catch (Exception e) {
                    Log.e("gdrive-activity/get-google-accounts", e);
                    accountArr = new Account[0];
                }
                for (Account account : accountArr) {
                    if (TextUtils.equals(account.name, str6)) {
                        restoreFromBackupActivity.A0o(str6, 1);
                        return;
                    }
                }
                try {
                    String string = AccountManager.get(restoreFromBackupActivity).addAccount("com.google", null, null, null, restoreFromBackupActivity, null, null).getResult().getString("authAccount");
                    if (string == null) {
                        Log.e("gdrive-activity/error-during-msgstore-download/account-manager-returned-with-no-account-name");
                        return;
                    } else if (!string.equals(str6)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("gdrive-activity/error-during-msgstore-download/account-manager user added ");
                        sb.append(AnonymousClass0JJ.A0B(string));
                        sb.append(" instead of ");
                        sb.append(AnonymousClass0JJ.A0B(str6));
                        Log.e(sb.toString());
                        return;
                    } else {
                        ((ActivityC004702f) restoreFromBackupActivity).A0F.A02.post(new RunnableEBaseShape7S0100000_I1_2(restoreFromBackupActivity, 18));
                        restoreFromBackupActivity.A0o(str6, 1);
                        return;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                    Log.e("gdrive-activity/error-during-msgstore-download", e2);
                    return;
                }
            case 13:
                RestoreFromBackupActivity restoreFromBackupActivity2 = (RestoreFromBackupActivity) this.A00;
                if (restoreFromBackupActivity2.A0o(this.A01, 1)) {
                    restoreFromBackupActivity2.A0e();
                    return;
                }
                return;
            case 14:
                SettingsGoogleDrive settingsGoogleDrive = (SettingsGoogleDrive) this.A00;
                String str7 = this.A01;
                for (Account account2 : AccountManager.get(settingsGoogleDrive).getAccountsByType("com.google")) {
                    if (TextUtils.equals(account2.name, str7)) {
                        settingsGoogleDrive.A0b(str7);
                        return;
                    }
                }
                try {
                    Bundle result = AccountManager.get(settingsGoogleDrive).addAccount("com.google", null, null, null, settingsGoogleDrive, null, null).getResult();
                    if (!result.containsKey("authAccount")) {
                        Log.e("settings-gdrive/error-during-media-restore/account-manager-returned-with-no-account-name");
                        return;
                    } else if (!str7.equals(result.get("authAccount"))) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("settings-gdrive/error-during-media-restore/account-manager user added ");
                        sb2.append(result.get("authAccount"));
                        sb2.append(" instead of ");
                        sb2.append(str7);
                        Log.e(sb2.toString());
                        return;
                    } else {
                        ((ActivityC004702f) settingsGoogleDrive).A0F.A02.post(new RunnableEBaseShape7S0100000_I1_2(settingsGoogleDrive, 23));
                        settingsGoogleDrive.A0b(str7);
                        return;
                    }
                } catch (AuthenticatorException | OperationCanceledException | IOException e3) {
                    Log.e("settings-gdrive/error-during-media-restore", e3);
                    return;
                }
            case 15:
                ((SettingsGoogleDrive) this.A00).A0b(this.A01);
                return;
            case GlVideoRenderer.CAP_RENDER_I420:
                ((SettingsGoogleDrive) this.A00).A0b(this.A01);
                return;
            case 17:
                SettingsGoogleDrive settingsGoogleDrive2 = (SettingsGoogleDrive) this.A00;
                AnonymousClass008.A17("settings-gdrive/auth-request unable to access ", this.A01);
                settingsGoogleDrive2.APo(R.string.settings_gdrive_unable_to_access_this_account);
                ((ActivityC004702f) settingsGoogleDrive2).A0J.A0m(0);
                settingsGoogleDrive2.A0F.setText(settingsGoogleDrive2.A0M[settingsGoogleDrive2.A0T()]);
                return;
            case 18:
                ((AnonymousClass2XQ) this.A00).A00.AAA(this.A01);
                return;
            case 19:
                C51052Xd r03 = (C51052Xd) this.A00;
                String str8 = this.A01;
                try {
                    r03.A00.A04.A09(DeviceJid.get(str8));
                    return;
                } catch (AnonymousClass02Y e4) {
                    StringBuilder sb3 = new StringBuilder("Invalid jid: ");
                    sb3.append(str8);
                    Log.e(sb3.toString(), e4);
                    return;
                }
            case AnonymousClass0PW.A01:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A00;
                C27261Ou.A01(sharedTextPreviewDialogFragment.A0M, ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0B, sharedTextPreviewDialogFragment.A0Q, ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A0F, this.A01, new AnonymousClass2YB(sharedTextPreviewDialogFragment));
                return;
            case 21:
                FaqItemActivity faqItemActivity = (FaqItemActivity) this.A00;
                String str9 = this.A01;
                if (C28051Sr.A1x(str9)) {
                    ArrayList parcelableArrayListExtra = faqItemActivity.getIntent().getParcelableArrayListExtra("payments_support_topics");
                    if (parcelableArrayListExtra != null) {
                        faqItemActivity.startActivity(SupportTopicsActivity.A04(faqItemActivity, parcelableArrayListExtra, faqItemActivity.getIntent().getBundleExtra("describe_problem_fields")));
                        return;
                    }
                    AnonymousClass2OC r3 = faqItemActivity.A06;
                    if (str9 == null) {
                        str9 = "FaqItemActivity";
                    }
                    r3.A01(faqItemActivity, str9, true, faqItemActivity.getIntent().getBundleExtra("describe_problem_fields"));
                    return;
                }
                AnonymousClass2OC r32 = faqItemActivity.A06;
                if (str9 == null) {
                    str9 = "FaqItemActivity";
                }
                r32.A01(faqItemActivity, str9, true, faqItemActivity.getIntent().getBundleExtra("describe_problem_fields"));
                return;
            case 22:
                C01970Ad r04 = ((C73423Xg) this.A00).A01.A08;
                r04.A04();
                if (r04.A06 != null) {
                    Log.w("PAY: removeMerchantPaymentMethod for nonSmbApp!");
                    return;
                }
                throw null;
            case 23:
                IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) this.A00;
                String str10 = this.A01;
                indiaUpiResetPinActivity.A0p(true);
                if (!TextUtils.isEmpty(str10)) {
                    indiaUpiResetPinActivity.A0B = indiaUpiResetPinActivity.A0X(((AnonymousClass1DU) indiaUpiResetPinActivity).A0D.A03());
                    indiaUpiResetPinActivity.A05.A00((C74463ay) indiaUpiResetPinActivity.A04.A06, null);
                    C43751yt r05 = indiaUpiResetPinActivity.A04;
                    indiaUpiResetPinActivity.A0l(str10, r05.A08, indiaUpiResetPinActivity.A0B, (C74463ay) r05.A06, 1, r05.A0A);
                    return;
                }
                ((AnonymousClass1DU) indiaUpiResetPinActivity).A04.A00();
                return;
            case 24:
                ((ProfileInfoActivity) this.A00).A0I.A01(this.A01, null);
                return;
            case 25:
                C669836s r06 = (C669836s) this.A00;
                ExoPlayerErrorFrame exoPlayerErrorFrame = r06.A03;
                exoPlayerErrorFrame.setLoadingViewVisibility(8);
                ExoPlaybackControlView exoPlaybackControlView = r06.A02;
                if (exoPlaybackControlView != null) {
                    exoPlaybackControlView.setPlayControlVisibility(8);
                }
                String str11 = this.A01;
                if (str11 == null) {
                    str11 = exoPlayerErrorFrame.A06.A06(R.string.unable_to_finish_download);
                }
                if (exoPlayerErrorFrame.A02 == null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(exoPlayerErrorFrame.getContext()).inflate(R.layout.wa_exoplayer_error_screen, (ViewGroup) null);
                    exoPlayerErrorFrame.A02 = frameLayout;
                    exoPlayerErrorFrame.A04.addView(frameLayout);
                    exoPlayerErrorFrame.A03 = (TextView) exoPlayerErrorFrame.findViewById(R.id.error_text);
                    View findViewById3 = exoPlayerErrorFrame.findViewById(R.id.retry_button);
                    exoPlayerErrorFrame.A01 = findViewById3;
                    findViewById3.setOnClickListener(exoPlayerErrorFrame.A00);
                }
                TextView textView2 = exoPlayerErrorFrame.A03;
                if (textView2 != null) {
                    textView2.setText(str11);
                    FrameLayout frameLayout2 = exoPlayerErrorFrame.A02;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(0);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 26:
                Voip.resendOfferOnDecryptionFailure((DeviceJid) this.A00, this.A01);
                return;
            case 27:
                AnonymousClass3U7 r5 = (AnonymousClass3U7) this.A00;
                String str12 = this.A01;
                StringBuilder sb4 = new StringBuilder("voip/actionStartNewOutgoingCall async start for callId ");
                sb4.append(str12);
                Log.i(sb4.toString());
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!Voip.A0A(Voip.getCallInfo(), str12)) {
                    Log.i("voip/actionStartNewOutgoingCall async operation canceled");
                    return;
                }
                r5.A1N.A07(true);
                StringBuilder sb5 = new StringBuilder("voip/actionStartNewOutgoingCall async operation elapsed ");
                sb5.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                sb5.append(" ms");
                Log.i(sb5.toString());
                return;
            default:
                return;
        }
    }
}
