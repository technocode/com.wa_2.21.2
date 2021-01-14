package java.lang;

import X.AbstractC000400g;
import X.AbstractC16300pa;
import X.AbstractC55082fy;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass0Fh;
import X.AnonymousClass0PW;
import X.AnonymousClass0YW;
import X.AnonymousClass2C0;
import X.AnonymousClass2OT;
import X.AnonymousClass2WY;
import X.AnonymousClass2XR;
import X.AnonymousClass2XS;
import X.AnonymousClass3U7;
import X.AnonymousClass3WU;
import X.C002001d;
import X.C004302a;
import X.C10310eQ;
import X.C225512f;
import X.C27131Oe;
import X.C40411tE;
import X.C40491tM;
import X.C49332Qb;
import X.C53602dX;
import X.C55072fx;
import X.C55102g0;
import X.C55142g4;
import X.C55152g5;
import X.C55192g9;
import X.C59982ob;
import X.C60032og;
import X.View$OnClickListenerC53592dW;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;

public class RunnableEBaseShape1S0101000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public RunnableEBaseShape1S0101000_I1(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public void run() {
        String A04;
        switch (this.A02) {
            case 0:
                ((SystemForegroundService) this.A01).A00.cancel(this.A00);
                return;
            case 1:
                throw null;
            case 2:
                ((C225512f) this.A01).A01.AD6(this.A00);
                return;
            case 3:
                Process.setThreadPriority(this.A00);
                ((Runnable) this.A01).run();
                return;
            case 4:
                C40411tE r3 = (C40411tE) this.A01;
                int i = this.A00;
                AnonymousClass02N r1 = r3.A0K;
                r3.A02(r1);
                r3.A0A.A04.A02(r1, i);
                r3.A08.A06(R.string.failed_update_photo_not_authorized, 0);
                return;
            case 5:
                C40411tE r2 = (C40411tE) this.A01;
                r2.A03(r2.A0K, this.A00);
                return;
            case 6:
                C40491tM r9 = (C40491tM) this.A01;
                int i2 = this.A00;
                if (i2 == 403) {
                    r9.A00.A0C(r9.A02.A06(R.string.group_error_description_not_allowed), 0);
                    return;
                } else if (i2 == 406) {
                    int A06 = r9.A01.A06(AbstractC000400g.A3A);
                    r9.A00.A0C(r9.A02.A0A(R.plurals.description_reach_limit, (long) A06, Integer.valueOf(A06)), 0);
                    r9.A05.A0S(false);
                    return;
                } else if (i2 != 409) {
                    r9.A00.A0C(r9.A02.A06(R.string.group_error_description), 0);
                    return;
                } else {
                    r9.A05.A0D(r9.A04);
                    return;
                }
            case 7:
                C002001d.A2O(((C27131Oe) this.A01).A0Q, this.A00);
                return;
            case 8:
                ((SettingsGoogleDrive) this.A01).A0R.A09(this.A00);
                return;
            case 9:
                int i3 = this.A00;
                AnonymousClass008.A0w("cameraui/error ", i3);
                AnonymousClass0YW r32 = ((AnonymousClass2WY) this.A01).A01;
                if (r32.A1L.A04()) {
                    r32.A0s.A06(R.string.error_camera_disabled_during_video_call, 1);
                    r32.A01();
                    return;
                }
                if (i3 != 2) {
                    if (C004302a.A01(r32.A0L, "android.permission.CAMERA") != 0) {
                        Log.w("cameraui/no-camera-permission");
                        r32.A0s.A06(R.string.cannot_start_camera_no_permission, 1);
                    } else if (AnonymousClass0Fh.A01()) {
                        r32.A0s.A06(R.string.error_video_messages_disabled_during_call, 1);
                    } else if (i3 == 3) {
                        r32.A0s.A06(R.string.photo_capture_failed, 1);
                    } else {
                        AnonymousClass02M r12 = r32.A0s;
                        if (i3 == 4) {
                            r12.A06(R.string.video_capture_failed, 1);
                        } else {
                            r12.A06(R.string.cannot_start_camera, 1);
                        }
                    }
                }
                r32.A01();
                return;
            case 10:
                int i4 = this.A00;
                AnonymousClass2XR r13 = ((AnonymousClass2XS) this.A01).A05.A00;
                r13.A00 = null;
                r13.A0D.A04(i4);
                return;
            case 11:
                View$OnClickListenerC53592dW r8 = (View$OnClickListenerC53592dW) this.A01;
                int i5 = this.A00;
                C53602dX r4 = r8.A05;
                AnonymousClass2OT r14 = r4.A0A;
                int i6 = r14.A02;
                RecyclerView recyclerView = r14.A0R;
                View$OnClickListenerC53592dW r10 = (View$OnClickListenerC53592dW) recyclerView.A0C(i6);
                if (r10 != null) {
                    r10.A04.A03(false, true);
                    r10.A00.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                } else {
                    r4.A02(i6);
                }
                int size = FilterUtils.A00.size();
                if (i5 > 0 && i5 < (size >> 1)) {
                    i5--;
                } else if (i5 > (size >> 1) && i5 < size - 1) {
                    i5++;
                }
                recyclerView.A0Y(i5);
                SelectionCheckView selectionCheckView = r8.A04;
                selectionCheckView.setScaleX(1.0f);
                selectionCheckView.setScaleY(1.0f);
                selectionCheckView.A03(true, true);
                r8.A00.animate().scaleX(r4.A05).scaleY(r4.A04).setDuration(100).start();
                return;
            case 12:
                int i7 = this.A00;
                C53602dX r33 = ((View$OnClickListenerC53592dW) this.A01).A05;
                r33.A02[i7 - 1] = false;
                ((AbstractC16300pa) r33).A01.A04(i7, 1, null);
                return;
            case 13:
                int i8 = this.A00;
                C49332Qb r92 = ((C60032og) this.A01).A00;
                if (r92 == null) {
                    throw null;
                } else if (i8 == 400 || i8 == 401 || i8 == 404) {
                    r92.A03.A06(R.string.group_error_subject, 0);
                    return;
                } else if (i8 == 406) {
                    int A062 = r92.A04.A06(AbstractC000400g.A40);
                    r92.A03.A0C(r92.A08.A0A(R.plurals.subject_reach_limit, (long) A062, Integer.valueOf(A062)), 0);
                    r92.A0D.A0S(false);
                    return;
                } else {
                    return;
                }
            case 14:
                int i9 = this.A00;
                AbstractC55082fy r0 = ((C55072fx) this.A01).A00;
                String str = r0.A06;
                GroupChatInfo groupChatInfo = (GroupChatInfo) ((C59982ob) r0).A00.get();
                if (groupChatInfo == null) {
                    return;
                }
                if (i9 == 403) {
                    groupChatInfo.A0Z.A0C(((ChatInfoActivity) groupChatInfo).A0A.A06(R.string.group_error_description_not_allowed), 0);
                    return;
                } else if (i9 == 406) {
                    int A063 = groupChatInfo.A0e.A06(AbstractC000400g.A3A);
                    groupChatInfo.A0Z.A0C(((ChatInfoActivity) groupChatInfo).A0A.A0A(R.plurals.description_reach_limit, (long) A063, Integer.valueOf(A063)), 0);
                    groupChatInfo.A1A.A0S(false);
                    return;
                } else if (i9 != 409) {
                    groupChatInfo.A0Z.A06(R.string.group_error_description, 0);
                    return;
                } else {
                    groupChatInfo.A1A.A0D(groupChatInfo.A0S);
                    GroupChatInfo.DescriptionConflictDialogFragment descriptionConflictDialogFragment = new GroupChatInfo.DescriptionConflictDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("description", str);
                    descriptionConflictDialogFragment.A0N(bundle);
                    groupChatInfo.APl(descriptionConflictDialogFragment, null);
                    return;
                }
            case 15:
                int i10 = this.A00;
                IdentityVerificationActivity identityVerificationActivity = ((C55102g0) this.A01).A00;
                if (identityVerificationActivity.A0T.A04()) {
                    ((ActivityC004702f) identityVerificationActivity).A0F.A06(R.string.error_camera_disabled_during_video_call, 1);
                } else if (i10 != 2) {
                    ((ActivityC004702f) identityVerificationActivity).A0F.A06(R.string.cannot_start_camera, 1);
                }
                identityVerificationActivity.A0b(null);
                return;
            case GlVideoRenderer.CAP_RENDER_I420:
                IdentityVerificationActivity identityVerificationActivity2 = (IdentityVerificationActivity) this.A01;
                int i11 = this.A00;
                String A042 = identityVerificationActivity2.A0K.A04(identityVerificationActivity2.A0A);
                if (i11 == -4) {
                    identityVerificationActivity2.A0W();
                    return;
                } else if (i11 == -3) {
                    identityVerificationActivity2.A06.setText(((AnonymousClass2C0) identityVerificationActivity2).A01.A0D(R.string.verify_identity_result_wrong_you, A042));
                    identityVerificationActivity2.A06.setVisibility(0);
                    identityVerificationActivity2.A0W();
                    return;
                } else if (i11 == -2) {
                    identityVerificationActivity2.A06.setText(((AnonymousClass2C0) identityVerificationActivity2).A01.A0D(R.string.verify_identity_result_wrong_contact, A042));
                    identityVerificationActivity2.A06.setVisibility(0);
                    identityVerificationActivity2.A0W();
                    return;
                } else if (i11 == 1) {
                    identityVerificationActivity2.A0b(new RunnableEBaseShape10S0100000_I1_5(identityVerificationActivity2, 26));
                    return;
                } else if (i11 == 2) {
                    identityVerificationActivity2.A0b(new RunnableEBaseShape10S0100000_I1_5(identityVerificationActivity2, 27));
                    return;
                } else {
                    return;
                }
            case 17:
                int i12 = this.A00;
                C55152g5 r02 = ((C55142g4) this.A01).A01;
                C10310eQ r42 = r02.A00;
                C55192g9 r34 = r42.A03;
                String str2 = r02.A01;
                if (r34 != null) {
                    StringBuilder sb = new StringBuilder("ContactUsActivity/createTicketIq/onError/errorCode=");
                    sb.append(i12);
                    sb.append(" uploadedLogsId=");
                    sb.append(str2);
                    sb.append(" falling back to email support.");
                    Log.e(sb.toString());
                    r34.A00.A0V(str2);
                    r42.A01.AMi();
                    return;
                }
                throw null;
            case 18:
                AnonymousClass008.A0u("LinkPreviewViewModel/CTWAListener/errorCode/", this.A00);
                return;
            case 19:
                AnonymousClass3U7 r5 = (AnonymousClass3U7) this.A01;
                int i13 = this.A00;
                CallInfo callInfo = Voip.getCallInfo();
                if (callInfo != null) {
                    AnonymousClass008.A1L(AnonymousClass008.A0S("voip/service/signal_thread/end_call/"), r5.A2B);
                    if (i13 == 1) {
                        Integer num = r5.A0b;
                        if (num != null) {
                            long longValue = num.longValue();
                            if (longValue <= 10000 && callInfo.isCaller && callInfo.callState == Voip.CallState.ACTIVE && callInfo.callDuration <= longValue && SystemClock.elapsedRealtime() - r5.A08 >= 8000) {
                                r5.A0d = 1;
                                AnonymousClass01X r7 = r5.A1a;
                                Object[] objArr = new Object[1];
                                UserJid nullable = UserJid.getNullable(Voip.getRawPeerJid());
                                if (nullable == null) {
                                    Log.w("voip/getPeerDisplayNameShort/peer_jid_is_null call must have been finished");
                                    A04 = null;
                                } else {
                                    A04 = r5.A1T.A04(r5.A1S.A0A(nullable));
                                }
                                objArr[0] = A04;
                                String A0D = r7.A0D(R.string.voip_call_end_call_confirmation, objArr);
                                Context context = r5.A1A;
                                Intent A064 = VoipActivityV2.A06(context, null, Boolean.valueOf(!r5.A1C.A00), null, Boolean.TRUE, null);
                                A064.setAction(VoipActivityV2.A1r);
                                A064.putExtra("confirmationString", A0D);
                                context.startActivity(A064);
                                return;
                            }
                        }
                    } else if (i13 == 2) {
                        r5.A0c = r5.A0d;
                    }
                    Voip.endCall(true);
                    return;
                }
                return;
            case AnonymousClass0PW.A01:
                ((AnonymousClass3WU) this.A01).A00.A05.A04(this.A00);
                return;
            default:
                return;
        }
    }
}
