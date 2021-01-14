package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipPermissionsActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0cS  reason: invalid class name and case insensitive filesystem */
public class C09200cS {
    public static volatile C09200cS A0M;
    public long A00;
    public final Handler A01;
    public final AnonymousClass0C2 A02;
    public final AnonymousClass0GG A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass01I A05;
    public final C000300f A06;
    public final C03170Fb A07;
    public final AnonymousClass01A A08;
    public final C014308b A09;
    public final AnonymousClass04j A0A;
    public final AnonymousClass03P A0B;
    public final AnonymousClass00S A0C;
    public final AnonymousClass00G A0D;
    public final AnonymousClass03S A0E;
    public final AnonymousClass01X A0F;
    public final AnonymousClass01L A0G;
    public final C015808q A0H;
    public final AnonymousClass00T A0I;
    public final C09210cT A0J;
    public final AnonymousClass0Z0 A0K;
    public volatile C09250cY A0L;

    public C09200cS(AnonymousClass00S r4, AnonymousClass02M r5, AnonymousClass01I r6, C03170Fb r7, AnonymousClass00G r8, AnonymousClass00T r9, C000300f r10, AnonymousClass01A r11, AnonymousClass03P r12, C014308b r13, AnonymousClass01X r14, AnonymousClass0GG r15, C015808q r16, AnonymousClass01L r17, AnonymousClass04j r18, AnonymousClass0Z0 r19, AnonymousClass03S r20, AnonymousClass0C2 r21, C09210cT r22) {
        this.A0D = r8;
        this.A0C = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r7;
        this.A0I = r9;
        this.A06 = r10;
        this.A08 = r11;
        this.A0B = r12;
        this.A09 = r13;
        this.A0F = r14;
        this.A03 = r15;
        this.A0H = r16;
        this.A0G = r17;
        this.A0A = r18;
        this.A0K = r19;
        this.A0E = r20;
        this.A02 = r21;
        this.A0J = r22;
        if (Build.VERSION.SDK_INT >= 28) {
            r22.A02().A01(new C09220cU(this, r22, r5));
        }
        this.A01 = new HandlerC09240cW(this, Looper.getMainLooper());
    }

    public static C09200cS A00() {
        if (A0M == null) {
            synchronized (C09200cS.class) {
                if (A0M == null) {
                    A0M = new C09200cS(AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass01I.A00(), C03170Fb.A00(), AnonymousClass00G.A01, C002101e.A00(), C000300f.A00(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass0GG.A00(), C015808q.A00(), AnonymousClass01L.A00(), AnonymousClass04j.A00(), AnonymousClass0Z0.A00(), AnonymousClass03S.A00(), AnonymousClass0C2.A00(), C09210cT.A00());
                }
            }
        }
        return A0M;
    }

    public int A01(C007003k r8, Context context, int i, boolean z, boolean z2) {
        if (r8 == null) {
            return 1;
        }
        return A02(Collections.singletonList(r8), context, i, z, z2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b6, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("samsung") == false) goto L_0x01b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(java.util.List r28, android.content.Context r29, int r30, boolean r31, boolean r32, com.whatsapp.jid.GroupJid r33) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09200cS.A02(java.util.List, android.content.Context, int, boolean, boolean, com.whatsapp.jid.GroupJid):int");
    }

    public final int A03(List list, Context context, boolean z, ArrayList arrayList, ArrayList arrayList2, String str) {
        boolean equals;
        if (list.isEmpty()) {
            Log.e("app/startOutgoingCall empty list of contacts");
            return 1;
        } else if (this.A0L != null) {
            Log.e("app/startOutgoingCall user tapped the call button twice before the telecom framework responds");
            return 2;
        } else {
            this.A00 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C007003k r3 = (C007003k) it.next();
                if (this.A05.A09(r3.A09)) {
                    this.A04.A0G(this.A0F.A06(R.string.voip_error_calling_self), 1);
                    return 1;
                }
                AnonymousClass00E.A09(!r3.A09(), "can't start a call with a group contact");
            }
            if (!this.A07.A05()) {
                Log.w("app/startOutgoingCall/tos_not_allowed");
                return 3;
            }
            boolean z2 = true;
            if (str == null) {
                z2 = false;
                if (this.A0A.A03(true) == 0) {
                    if (AnonymousClass04j.A02(context)) {
                        Log.w("app/startOutgoingCall/failed_airplane_mode_is_on");
                        this.A04.A04(R.string.can_not_start_voip_call_in_airplane_mode, 1);
                        return 4;
                    }
                    Log.w("app/startOutgoingCall/failed_no_network");
                    this.A04.A04(R.string.voip_call_failed_no_network, 1);
                    return 4;
                }
            }
            AnonymousClass01X r4 = this.A0F;
            String A0D2 = r4.A0D(R.string.voip_blocked_contact, r4.A0E(this.A09.A0C(arrayList2)));
            if (arrayList2.size() == list.size()) {
                AnonymousClass02M r0 = this.A04;
                AbstractC004502c r42 = r0.A00;
                if (r42 == null) {
                    r0.A0C(A0D2, 0);
                    return 5;
                } else if (r42.AB1() || !(r42 instanceof ActivityC004702f)) {
                    return 5;
                } else {
                    DisplayExceptionDialogFactory$ContactBlockedDialogFragment displayExceptionDialogFactory$ContactBlockedDialogFragment = new DisplayExceptionDialogFactory$ContactBlockedDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", A0D2);
                    bundle.putParcelableArrayList("jids", arrayList2);
                    displayExceptionDialogFactory$ContactBlockedDialogFragment.A0N(bundle);
                    r42.APm(displayExceptionDialogFactory$ContactBlockedDialogFragment);
                    return 5;
                }
            } else {
                if (!arrayList2.isEmpty()) {
                    this.A04.A0C(A0D2, 0);
                }
                AnonymousClass00E.A08(!arrayList.isEmpty(), "callable jids must not be empty");
                Object obj = arrayList.get(0);
                if (!this.A0E.A0B(z)) {
                    Log.w("app/startOutgoingCall/failed_no_record_audio_permission");
                    return 7;
                }
                CallInfo callInfo = Voip.getCallInfo();
                if (callInfo == null || !Voip.A08(callInfo)) {
                    TelephonyManager A0F2 = this.A0B.A0F();
                    if (A0F2 == null || A0F2.getCallState() == 0) {
                        return 0;
                    }
                    Log.w("app/startOutgoingCall/failed_cellular_call_in_progress");
                    int i = R.string.can_not_start_voip_call_in_phone_call;
                    if (z2) {
                        i = R.string.voip_joinable_can_not_join_already_in_phone_call;
                    }
                    this.A04.A04(i, 1);
                    return 9;
                }
                if (z2) {
                    equals = TextUtils.equals(str, callInfo.callId);
                } else {
                    equals = obj.equals(callInfo.peerJid);
                }
                if (callInfo.callState == Voip.CallState.ACTIVE_ELSEWHERE) {
                    Log.w("app/startOutgoingCall/failed_call_is_active_on_elsewhere");
                    int i2 = R.string.can_not_start_voip_call_when_active_elsewhere_message;
                    if (z2) {
                        i2 = R.string.voip_joinable_can_not_join_when_active_elsewhere_message;
                    }
                    AnonymousClass0MB r32 = new AnonymousClass0MB(context);
                    String A062 = r4.A06(i2);
                    AnonymousClass0MC r02 = r32.A01;
                    r02.A0E = A062;
                    r02.A0J = true;
                    r32.A07(r4.A06(R.string.can_not_start_voip_call_when_active_elsewhere_positive_action), new DialogInterface$OnClickListenerC671437j(this, context));
                    r32.A05(r4.A06(R.string.ok), DialogInterface$OnClickListenerC671537k.A00);
                    r32.A00().show();
                    return 8;
                } else if (equals) {
                    context.startActivity(VoipActivityV2.A05(context, callInfo.peerJid, Boolean.valueOf(!this.A02.A00)));
                    return 0;
                } else {
                    Log.w("app/startOutgoingCall/ try to start outgoing call from active voip call ");
                    this.A04.A06(R.string.error_call_disabled_during_call, 1);
                    return 8;
                }
            }
        }
    }

    public void A04(AnonymousClass0QM r13, Context context) {
        AnonymousClass00E.A01();
        StringBuilder sb = new StringBuilder("app/startFromCallLog/from ");
        sb.append(r13.A03().toString());
        Log.i(sb.toString());
        if (this.A0L != null) {
            Log.e("app/startFromCallLog user tapped the call button twice before the telecom framework responds");
            return;
        }
        this.A00 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((AbstractCollection) r13.A04()).iterator();
        while (it.hasNext()) {
            UserJid userJid = ((AnonymousClass0QP) it.next()).A02;
            arrayList.add(userJid);
            arrayList3.add(this.A08.A0A(userJid));
        }
        boolean z = r13.A0E;
        C09260ca r2 = r13.A09;
        String str = r2.A02;
        String str2 = str;
        if (str.startsWith("call:")) {
            str2 = str.replaceFirst("call:", "");
        }
        int A032 = A03(arrayList3, context, z, arrayList, arrayList2, str2);
        if (A032 == 0) {
            this.A0I.ANF(new RunnableEBaseShape4S0200000_I0_3(this, r13, 20));
        } else if (A032 == 7) {
            Intent intent = new Intent(context, VoipPermissionsActivity.class);
            intent.putExtra("join_call_log", true);
            intent.putExtra("call_log_call_id", str);
            intent.putExtra("call_log_transaction_id", r2.A00);
            intent.putExtra("call_log_from_me", r2.A03);
            intent.putExtra("call_log_user_jid", r2.A01.getRawString());
            intent.putExtra("video_call", r13.A0E);
            context.startActivity(intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r2.A04.A00.getBoolean("enable_telecom_framework_caller", false) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05() {
        /*
            r6 = this;
            int r5 = android.os.Build.VERSION.SDK_INT
            r4 = 1
            r3 = 0
            r1 = 28
            if (r5 < r1) goto L_0x0023
            X.0cT r0 = r6.A0J
            X.3Ty r2 = r0.A02()
            if (r5 < r1) goto L_0x001d
            X.0cb r0 = r2.A04
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "enable_telecom_framework_caller"
            boolean r1 = r1.getBoolean(r0, r3)
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r2.A01 = r0
            if (r0 == 0) goto L_0x0023
            return r4
        L_0x0023:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09200cS.A05():boolean");
    }

    public boolean A06(C007003k r7, Context context, int i, boolean z) {
        return A01(r7, context, i, z, false) == 0;
    }
}
