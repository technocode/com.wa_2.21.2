package com.facebook.redex;

import X.AbstractC000400g;
import X.AbstractC665434t;
import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0HE;
import X.AnonymousClass0HG;
import X.AnonymousClass0PW;
import X.AnonymousClass357;
import X.AnonymousClass374;
import X.AnonymousClass377;
import X.AnonymousClass37D;
import X.AnonymousClass390;
import X.AnonymousClass3Aa;
import X.AnonymousClass3BY;
import X.AnonymousClass3TO;
import X.AnonymousClass3UG;
import X.AnonymousClass3UH;
import X.AnonymousClass3UT;
import X.AnonymousClass3UV;
import X.C007003k;
import X.C665334s;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallRatingActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import com.whatsapp.wabloks.debug.WaBloksDebugActivity;
import org.npci.commonlibrary.GetCredential;
import org.npci.commonlibrary.NPCIFragment;
import org.npci.commonlibrary.widget.FormItemEditText;
import org.npci.commonlibrary.widget.Keypad;

public class ViewOnClickEBaseShape9S0100000_I1_7 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape9S0100000_I1_7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        switch (this.A01) {
            case 0:
                ((StorageUsageGalleryActivity) this.A00).onBackPressed();
                return;
            case 1:
                ((StorageUsageGalleryActivity) this.A00).lambda$initToolbar$2625$StorageUsageGalleryActivity(view);
                return;
            case 2:
                ((AnonymousClass037) this.A00).A0A().finish();
                return;
            case 3:
                ((SettingsTwoFactorAuthActivity) this.A00).lambda$onCreate$2641$SettingsTwoFactorAuthActivity(view);
                return;
            case 4:
                ((SettingsTwoFactorAuthActivity) this.A00).lambda$onCreate$2643$SettingsTwoFactorAuthActivity(view);
                return;
            case 5:
                ((SettingsTwoFactorAuthActivity) this.A00).lambda$onCreate$2640$SettingsTwoFactorAuthActivity(view);
                return;
            case 6:
                ((SettingsTwoFactorAuthActivity) this.A00).lambda$onCreate$2642$SettingsTwoFactorAuthActivity(view);
                return;
            case 7:
                ReadMoreTextView readMoreTextView = (ReadMoreTextView) this.A00;
                readMoreTextView.setExpanded(!readMoreTextView.A05);
                return;
            case 8:
                C665334s r1 = (C665334s) this.A00;
                r1.A01.AEF(r1, view);
                return;
            case 9:
                ((AbstractC665434t) this.A00).AEE();
                return;
            case 10:
                ((MediaCard) this.A00).A0B.AEE();
                return;
            case 11:
                ((AbstractC665434t) this.A00).AEE();
                return;
            case 12:
                ((AbstractC665434t) this.A00).AEE();
                return;
            case 13:
                ((AbstractC665434t) this.A00).AEE();
                return;
            case 14:
                ((AbstractC665434t) this.A00).AEE();
                return;
            case 15:
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A00;
                AnonymousClass0HG r12 = userNoticeBottomSheetDialogFragment.A0H;
                boolean z = !TextUtils.isEmpty(userNoticeBottomSheetDialogFragment.A09.A03);
                if (r12 != null) {
                    if (z) {
                        r12.A01(4);
                    }
                    userNoticeBottomSheetDialogFragment.A0w(false, false);
                    return;
                }
                throw null;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment2 = (UserNoticeBottomSheetDialogFragment) this.A00;
                AnonymousClass0HG r13 = userNoticeBottomSheetDialogFragment2.A0H;
                if (!TextUtils.isEmpty(userNoticeBottomSheetDialogFragment2.A09.A03)) {
                    r13.A01(6);
                } else {
                    r13.A01(9);
                }
                AnonymousClass0HE r2 = userNoticeBottomSheetDialogFragment2.A0I;
                Log.i("UserNoticeManager/agreeUserNotice");
                AnonymousClass357 A02 = r2.A05.A02();
                if (A02 != null) {
                    r2.A07(A02, 5);
                    userNoticeBottomSheetDialogFragment2.A0w(false, false);
                    return;
                }
                throw null;
            case 17:
                ((AnonymousClass374) this.A00).A0B();
                return;
            case 18:
                ((AnonymousClass374) this.A00).A0A();
                return;
            case 19:
                ((AnonymousClass374) this.A00).A09();
                return;
            case AnonymousClass0PW.A01:
                ((AnonymousClass377) this.A00).A02();
                return;
            case 21:
                ((AnonymousClass37D) this.A00).A01();
                return;
            case 22:
                AnonymousClass3TO r22 = (AnonymousClass3TO) this.A00;
                r22.A0M.A0w(((AnonymousClass390) r22).A00, r22);
                return;
            case 23:
                ActivityC004902h A0A = ((AnonymousClass037) this.A00).A0A();
                if (A0A != null) {
                    A0A.onBackPressed();
                    return;
                }
                return;
            case 24:
                ((CallRatingActivity) this.A00).lambda$onCreate$2698$CallRatingActivity(view);
                return;
            case 25:
                ((CallRatingActivity) this.A00).lambda$onCreate$2697$CallRatingActivity(view);
                return;
            case 26:
                ((MaximizedParticipantVideoDialogFragment) this.A00).A0y(true);
                return;
            case 27:
                AnonymousClass037 r3 = (AnonymousClass037) this.A00;
                if (r3.A0A() != null) {
                    VoipErrorDialogFragment.A00(9, new AnonymousClass3UV()).A0u(r3.A0A().A04(), null);
                    return;
                }
                return;
            case 28:
                VoipCallControlBottomSheet voipCallControlBottomSheet = ((AnonymousClass3UT) this.A00).A03;
                AnonymousClass3UH r14 = voipCallControlBottomSheet.A0D;
                if (r14 != null && voipCallControlBottomSheet.A00() != null) {
                    CallInfo A0W = r14.A00.A0W();
                    if (A0W == null || A0W.callState == Voip.CallState.ACTIVE) {
                        AnonymousClass3UH r5 = voipCallControlBottomSheet.A0D;
                        VoipActivityV2 voipActivityV2 = r5.A00;
                        CallInfo A0W2 = voipActivityV2.A0W();
                        if (A0W2 == null) {
                            return;
                        }
                        if (voipActivityV2.A1U.A06(AbstractC000400g.A39) == A0W2.participants.size()) {
                            VoipErrorDialogFragment.A00(4, new AnonymousClass3UV()).A0u(voipActivityV2.A04(), null);
                            return;
                        } else if (8 == A0W2.getConnectedParticipantsCount()) {
                            VoipErrorDialogFragment.A00(5, new AnonymousClass3UG(r5)).A0u(voipActivityV2.A04(), null);
                            return;
                        } else {
                            voipActivityV2.A0l();
                            return;
                        }
                    } else {
                        C007003k A0A2 = voipCallControlBottomSheet.A0M.A0A(A0W.peerJid);
                        AlertDialog.Builder builder = new AlertDialog.Builder(voipCallControlBottomSheet.A00());
                        AnonymousClass01X r6 = voipCallControlBottomSheet.A0R;
                        builder.setMessage(r6.A0A(R.plurals.voip_joinable_can_not_join_call_before_connected, (long) (A0W.participants.keySet().size() - 1), voipCallControlBottomSheet.A0N.A08(A0A2, false))).setPositiveButton(r6.A06(R.string.ok), (DialogInterface.OnClickListener) null).create().show();
                        return;
                    }
                } else {
                    return;
                }
            case 29:
                ((VoipCallControlBottomSheet) this.A00).A18(1);
                return;
            case 30:
                ((VoipCallControlBottomSheet) this.A00).A18(0);
                return;
            case 31:
                ((Activity) this.A00).finish();
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                ((AnonymousClass3Aa) this.A00).A00();
                return;
            case 33:
                ((WaBloksDebugActivity) this.A00).lambda$testHttpsRetry$54$WaBloksDebugActivity(view);
                return;
            case 34:
                ((WaBloksDebugActivity) this.A00).lambda$testHttps$50$WaBloksDebugActivity(view);
                return;
            case 35:
                ((GetCredential) this.A00).lambda$renderTransactionBar$180$GetCredential(view);
                return;
            case 36:
                ((GetCredential) this.A00).lambda$onCreate$177$GetCredential(view);
                return;
            case 37:
                ((NPCIFragment) this.A00).A03.dismiss();
                return;
            case 38:
                FormItemEditText formItemEditText = (FormItemEditText) this.A00;
                formItemEditText.setSelection(formItemEditText.getText().length());
                View.OnClickListener onClickListener = formItemEditText.A0E;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 39:
                AnonymousClass3BY r15 = ((Keypad) this.A00).A04;
                if (r15 != null) {
                    r15.AGw(view, 67);
                    return;
                }
                return;
            case 40:
                AnonymousClass3BY r16 = ((Keypad) this.A00).A04;
                if (r16 != null) {
                    r16.AGw(view, 7);
                    return;
                }
                return;
            case 41:
                AnonymousClass3BY r17 = ((Keypad) this.A00).A04;
                if (r17 != null) {
                    r17.AGw(view, 66);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
