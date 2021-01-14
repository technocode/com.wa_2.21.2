package com.whatsapp.util;

import X.AbstractC007503q;
import X.AbstractC06110Rt;
import X.AbstractC07220Wk;
import X.AbstractC71533Pi;
import X.AbstractC71663Pv;
import X.AbstractC74123aA;
import X.AbstractView$OnClickListenerC08330av;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass037;
import X.AnonymousClass0FI;
import X.AnonymousClass0H0;
import X.AnonymousClass0JW;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass0PW;
import X.AnonymousClass0QM;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass32Z;
import X.AnonymousClass33N;
import X.AnonymousClass390;
import X.AnonymousClass3PJ;
import X.AnonymousClass3Q1;
import X.AnonymousClass3R6;
import X.AnonymousClass3TO;
import X.C002001d;
import X.C006803i;
import X.C007003k;
import X.C007303n;
import X.C008805h;
import X.C03570Gt;
import X.C04360Kb;
import X.C11260fz;
import X.C13380k9;
import X.C72483Ta;
import X.C74103a6;
import X.C74223aN;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.StatusDeleteDialogFragment;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.stickers.ConfirmPackDeleteDialogFragment;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.twofactor.SetCodeFragment;
import com.whatsapp.twofactor.SetEmailFragment;
import com.whatsapp.twofactor.TwoFactorAuthActivity;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import com.whatsapp.voipcalling.CallLogActivity;
import com.whatsapp.voipcalling.CallRatingActivity;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.PermissionDialogFragment;
import com.whatsapp.voipcalling.VoipAppUpdateActivity;
import java.util.ArrayList;
import java.util.Collections;

public class ViewOnClickCListenerShape14S0100000_I1_3 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape14S0100000_I1_3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        long j;
        int i;
        Long valueOf;
        AnonymousClass0JW r0;
        Integer num;
        InputMethodManager A0H;
        switch (this.A01) {
            case 0:
                ((MyStatusesActivity) this.A00).A0W();
                return;
            case 1:
                Context context = (Context) this.A00;
                if (context != null) {
                    Intent intent = new Intent(context, TextStatusComposerActivity.class);
                    intent.putExtra("origin", 4);
                    context.startActivity(intent);
                    return;
                }
                throw null;
            case 2:
                MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
                AbstractC007503q r1 = (AbstractC007503q) view.getTag();
                AbstractC06110Rt r02 = myStatusesActivity.A01;
                if (r02 != null) {
                    r02.A00();
                }
                if (AnonymousClass0FI.A0F(r1.A0m)) {
                    myStatusesActivity.A0F.A02((AnonymousClass0M3) r1);
                    return;
                } else {
                    myStatusesActivity.A0I.A0L(r1);
                    return;
                }
            case 3:
                MyStatusesActivity myStatusesActivity2 = (MyStatusesActivity) this.A00;
                C13380k9 r03 = myStatusesActivity2.A02;
                if (r03 != null) {
                    r03.A03.A01();
                }
                AnonymousClass3Q1 r12 = new AnonymousClass3Q1(view.getContext(), view);
                myStatusesActivity2.A02 = r12;
                ((C13380k9) r12).A01 = new AnonymousClass3PJ(this, (AbstractC007503q) view.getTag());
                r12.A00();
                return;
            case 4:
                AnonymousClass32Z r13 = (AnonymousClass32Z) ((AnonymousClass037) this.A00).A0A();
                if (r13 != null) {
                    r13.AFp(2);
                    return;
                }
                return;
            case 5:
                AbstractC74123aA r4 = (AbstractC74123aA) this.A00;
                AnonymousClass0M3 r3 = (AnonymousClass0M3) r4.A03;
                if (!r3.A0r) {
                    AnonymousClass0M4 r04 = r3.A02;
                    if (r04 == null) {
                        throw null;
                    } else if (r04.A07 == 1) {
                        if (r3.A0m == 2) {
                            r4.A0A.A04(R.string.gallery_unsafe_audio_removed, 1);
                            return;
                        } else {
                            r4.A0A.A04(R.string.gallery_unsafe_video_removed, 1);
                            return;
                        }
                    } else if (r3.A09 != null) {
                        C04360Kb.A00().A06((ActivityC004702f) r4.A0A(), r3, true);
                        return;
                    } else {
                        Log.e("cannot download media message with no media attached");
                        r4.A0A.A06(R.string.invalid_media_message_download, 0);
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                AbstractC74123aA r05 = (AbstractC74123aA) this.A00;
                r05.A0B.A03((AnonymousClass0M3) r05.A03, true, true);
                return;
            case 7:
                AbstractC74123aA r06 = (AbstractC74123aA) this.A00;
                r06.A02.A07(r06.A03, true);
                return;
            case 8:
                BottomSheetBehavior bottomSheetBehavior = ((AbstractC71663Pv) this.A00).A00;
                if (bottomSheetBehavior.A0B != 3) {
                    bottomSheetBehavior.A0D(3);
                    return;
                } else {
                    bottomSheetBehavior.A0D(4);
                    return;
                }
            case 9:
                AbstractC74123aA r07 = (AbstractC74123aA) this.A00;
                AbstractC71533Pi r14 = r07.A0I;
                AbstractC007503q r08 = r07.A03;
                StatusPlaybackContactFragment statusPlaybackContactFragment = ((C74103a6) r14).A01;
                C007303n r32 = r08.A0n;
                StatusDeleteDialogFragment statusDeleteDialogFragment = new StatusDeleteDialogFragment();
                Bundle bundle = new Bundle();
                C006803i.A0T(bundle, r32, "");
                statusDeleteDialogFragment.A0N(bundle);
                C008805h.A17(statusPlaybackContactFragment, statusDeleteDialogFragment);
                return;
            case 10:
                AbstractC74123aA r15 = (AbstractC74123aA) this.A00;
                AbstractC71533Pi r09 = r15.A0I;
                AbstractC007503q r7 = r15.A03;
                StatusPlaybackContactFragment statusPlaybackContactFragment2 = ((C74103a6) r09).A01;
                if (AnonymousClass0FI.A0N(statusPlaybackContactFragment2.A0D, r7)) {
                    statusPlaybackContactFragment2.A04 = r7;
                    Intent intent2 = new Intent(statusPlaybackContactFragment2.A00(), ContactPicker.class);
                    intent2.putExtra("forward", true);
                    intent2.putExtra("forward_jid", AnonymousClass1VY.A0D(r7.A0n.A00));
                    byte b = r7.A0m;
                    intent2.putIntegerArrayListExtra("message_types", new ArrayList<>(Collections.singleton(Integer.valueOf(Byte.valueOf(b).intValue()))));
                    if (b == 3) {
                        j = ((long) ((AnonymousClass0M3) r7).A00) * 1000;
                    } else {
                        j = 0;
                    }
                    intent2.putExtra("forward_video_duration", j);
                    if (b == 0) {
                        String A0D = r7.A0D();
                        if (A0D != null) {
                            i = A0D.length();
                        } else {
                            throw null;
                        }
                    } else {
                        i = 0;
                    }
                    intent2.putExtra("forward_text_length", i);
                    statusPlaybackContactFragment2.A0M(intent2, 2, null);
                    return;
                }
                statusPlaybackContactFragment2.A0A.A04(R.string.message_forward_media_missing, 1);
                return;
            case 11:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) this.A00;
                AnonymousClass33N r2 = stickerStorePackPreviewActivity.A0G.A02;
                if (r2 == null) {
                    return;
                }
                if (!r2.A05 || r2.A01()) {
                    r2.A05 = true;
                    stickerStorePackPreviewActivity.A0U();
                    stickerStorePackPreviewActivity.A0V.A0I(r2, null);
                    return;
                }
                return;
            case 12:
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity2 = (StickerStorePackPreviewActivity) this.A00;
                AnonymousClass33N r42 = stickerStorePackPreviewActivity2.A0G.A02;
                if (r42 == null) {
                    throw null;
                } else if (r42.A0N || r42.A02 != null) {
                    ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = new ConfirmPackDeleteDialogFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("pack_id", r42.A0D);
                    bundle2.putString("pack_name", r42.A0F);
                    confirmPackDeleteDialogFragment.A0N(bundle2);
                    stickerStorePackPreviewActivity2.APm(confirmPackDeleteDialogFragment);
                    return;
                } else {
                    return;
                }
            case 13:
                ((AnonymousClass3R6) this.A00).A03();
                return;
            case 14:
                C74223aN r010 = (C74223aN) this.A00;
                C03570Gt r16 = r010.A07;
                String str = r010.A04.A0D;
                AnonymousClass0H0 r17 = r16.A0H;
                if (r17.A01.containsKey(str) && (r0 = (AnonymousClass0JW) r17.A00.get(str)) != null) {
                    r0.A00.cancel(true);
                    return;
                }
                return;
            case 15:
                SetCodeFragment.A00((SetCodeFragment) this.A00);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                SetEmailFragment setEmailFragment = (SetEmailFragment) this.A00;
                if (setEmailFragment != null) {
                    Log.i("setemailfragment/submit");
                    int i2 = setEmailFragment.A00;
                    if (i2 == 1) {
                        TwoFactorAuthActivity twoFactorAuthActivity = setEmailFragment.A05;
                        Bundle A012 = AnonymousClass008.A01("type", 2);
                        SetEmailFragment setEmailFragment2 = new SetEmailFragment();
                        setEmailFragment2.A0N(A012);
                        twoFactorAuthActivity.A0W(setEmailFragment2, true);
                        return;
                    } else if (i2 == 2) {
                        TwoFactorAuthActivity twoFactorAuthActivity2 = setEmailFragment.A05;
                        if (TextUtils.equals(twoFactorAuthActivity2.A03, twoFactorAuthActivity2.A04)) {
                            setEmailFragment.A05.A0U();
                            return;
                        } else {
                            setEmailFragment.A04.setText(setEmailFragment.A06.A06(R.string.two_factor_auth_email_mismatch));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    throw null;
                }
            case 17:
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A00;
                NestedScrollView nestedScrollView = userNoticeBottomSheetDialogFragment.A08;
                View childAt = nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1);
                userNoticeBottomSheetDialogFragment.A08.A08(childAt.getHeight() + childAt.getScrollY(), false);
                return;
            case 18:
                AnonymousClass390 r011 = (AnonymousClass390) view.getTag();
                if (r011 != null) {
                    C11260fz r33 = ((C72483Ta) r011.A00).A00;
                    AnonymousClass3TO r5 = (AnonymousClass3TO) this.A00;
                    CallsFragment callsFragment = r5.A0M;
                    if (callsFragment.A01 != null) {
                        callsFragment.A0v(r33, r5);
                        return;
                    } else if (r33.A04()) {
                        if (!(callsFragment.A0A() == null || (A0H = r5.A0H.A0H()) == null || callsFragment.A0A().getCurrentFocus() == null)) {
                            A0H.hideSoftInputFromWindow(callsFragment.A0A().getCurrentFocus().getWindowToken(), 0);
                        }
                        C002001d.A30((AnonymousClass0QM) r33.A03.get(0), r5.A0C, callsFragment.A0A(), 21);
                        return;
                    } else {
                        C007003k A02 = r33.A02();
                        int A002 = r33.A00();
                        if (A002 == 0) {
                            num = 2;
                        } else if (A002 == 1) {
                            num = 9;
                        } else if (A002 != 2) {
                            num = null;
                        } else {
                            num = 1;
                        }
                        r5.A0N.A01(A02, callsFragment.A0A(), num.intValue(), true, r33.A05());
                        return;
                    }
                } else {
                    return;
                }
            case 19:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (callLogActivity.A0Q.A01(callLogActivity.A05, callLogActivity, 4, false, false) == 0) {
                    callLogActivity.finish();
                    return;
                }
                return;
            case AnonymousClass0PW.A01:
                CallLogActivity callLogActivity2 = (CallLogActivity) this.A00;
                if (callLogActivity2.A0Q.A01(callLogActivity2.A05, callLogActivity2, 4, false, true) == 0) {
                    callLogActivity2.finish();
                    return;
                }
                return;
            case 21:
                ((Activity) this.A00).finish();
                return;
            case 22:
                CallRatingActivity callRatingActivity = (CallRatingActivity) this.A00;
                WamCall wamCall = callRatingActivity.A06;
                if (wamCall != null) {
                    wamCall.userRating = Long.valueOf((long) callRatingActivity.A04.getRating());
                }
                if (((double) callRatingActivity.A04.getRating()) >= 4.0d || callRatingActivity.A02.getVisibility() == 0) {
                    WamCall wamCall2 = callRatingActivity.A06;
                    if (wamCall2 != null) {
                        Integer num2 = callRatingActivity.A08;
                        String str2 = null;
                        if (num2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(num2.longValue());
                        }
                        wamCall2.userProblems = valueOf;
                        String A0B = AnonymousClass008.A0B(callRatingActivity.A01);
                        WamCall wamCall3 = callRatingActivity.A06;
                        if (!TextUtils.isEmpty(A0B)) {
                            str2 = A0B;
                        }
                        wamCall3.userDescription = str2;
                    }
                    callRatingActivity.finish();
                    return;
                }
                callRatingActivity.A03.setVisibility(8);
                callRatingActivity.A02.setVisibility(0);
                ((TextView) callRatingActivity.findViewById(R.id.call_rating_title)).setText(((AnonymousClass2C0) callRatingActivity).A01.A06(R.string.call_problems_title));
                callRatingActivity.A08 = 0;
                return;
            case 23:
                PermissionDialogFragment permissionDialogFragment = (PermissionDialogFragment) this.A00;
                permissionDialogFragment.A01.dismiss();
                AbstractC07220Wk r18 = permissionDialogFragment.A04;
                if (r18 != null) {
                    r18.AIR(permissionDialogFragment.A00);
                    return;
                }
                return;
            case 24:
                ((Activity) this.A00).finish();
                return;
            case 25:
                Intent intent3 = new Intent("android.intent.action.VIEW");
                VoipAppUpdateActivity voipAppUpdateActivity = (VoipAppUpdateActivity) this.A00;
                intent3.setData(voipAppUpdateActivity.A01.A01());
                voipAppUpdateActivity.startActivity(intent3);
                voipAppUpdateActivity.finish();
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
