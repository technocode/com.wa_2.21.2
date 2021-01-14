package com.whatsapp.voipcalling;

import X.AbstractC000400g;
import X.AbstractC07220Wk;
import X.AbstractC07230Wm;
import X.AbstractC07240Wo;
import X.AbstractC07250Wp;
import X.AbstractC12270hp;
import X.AbstractC16300pa;
import X.AbstractC673938k;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass03C;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0C2;
import X.AnonymousClass0Fh;
import X.AnonymousClass0GE;
import X.AnonymousClass0GG;
import X.AnonymousClass0IY;
import X.AnonymousClass0JO;
import X.AnonymousClass0JW;
import X.AnonymousClass0L1;
import X.AnonymousClass0L2;
import X.AnonymousClass0LH;
import X.AnonymousClass0LW;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QA;
import X.AnonymousClass0QB;
import X.AnonymousClass0QY;
import X.AnonymousClass0Wl;
import X.AnonymousClass0Wn;
import X.AnonymousClass0YX;
import X.AnonymousClass0Yz;
import X.AnonymousClass0Z0;
import X.AnonymousClass1VY;
import X.AnonymousClass1YO;
import X.AnonymousClass2C0;
import X.AnonymousClass37Y;
import X.AnonymousClass37Z;
import X.AnonymousClass38D;
import X.AnonymousClass38E;
import X.AnonymousClass38F;
import X.AnonymousClass38G;
import X.AnonymousClass38H;
import X.AnonymousClass38I;
import X.AnonymousClass38K;
import X.AnonymousClass38L;
import X.AnonymousClass38M;
import X.AnonymousClass38N;
import X.AnonymousClass38P;
import X.AnonymousClass38Q;
import X.AnonymousClass39G;
import X.AnonymousClass39P;
import X.AnonymousClass39R;
import X.AnonymousClass3AE;
import X.AnonymousClass3TE;
import X.AnonymousClass3TH;
import X.AnonymousClass3TJ;
import X.AnonymousClass3TM;
import X.AnonymousClass3TY;
import X.AnonymousClass3U7;
import X.AnonymousClass3U9;
import X.AnonymousClass3UB;
import X.AnonymousClass3UC;
import X.AnonymousClass3UD;
import X.AnonymousClass3UE;
import X.AnonymousClass3UF;
import X.AnonymousClass3UH;
import X.AnonymousClass3UL;
import X.AnonymousClass3UM;
import X.AnonymousClass3UN;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C004302a;
import X.C014308b;
import X.C02780Dk;
import X.C09200cS;
import X.C09270cb;
import X.C28051Sr;
import X.C58822mb;
import X.C673738h;
import X.C673838i;
import X.C674038l;
import X.C675539b;
import X.C675939f;
import X.C677039w;
import X.C74373al;
import X.C75083cB;
import X.EnumC675439a;
import X.RunnableC670537a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.components.AnimatingArrowsLayout;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VoipActivityV2 extends AnonymousClass0GE implements AbstractC07220Wk, AnonymousClass0Wl, AbstractC07230Wm, AnonymousClass0Wn, ViewTreeObserver.OnGlobalLayoutListener, AbstractC07240Wo, AbstractC07250Wp {
    public static final String A1o = AnonymousClass008.A0K("com.whatsapp", ".intent.action.END_CALL_AFTER_CONFIRMATION");
    public static final String A1p = AnonymousClass008.A0K("com.whatsapp", ".intent.action.REJECT_CALL_FROM_VOIP_UI");
    public static final String A1q = AnonymousClass008.A0K("com.whatsapp", ".intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL");
    public static final String A1r = AnonymousClass008.A0K("com.whatsapp", ".intent.action.SHOW_END_CALL_CONFIRMATION");
    public static final String A1s = AnonymousClass008.A0K("com.whatsapp", ".intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN");
    public int A00 = 3;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public Drawable A0B;
    public Drawable A0C;
    public Drawable A0D;
    public Handler A0E;
    public View.OnClickListener A0F;
    public View.OnClickListener A0G;
    public View.OnClickListener A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public ViewGroup A0T;
    public ViewGroup A0U;
    public AccessibilityManager A0V;
    public ImageButton A0W;
    public ImageButton A0X;
    public ImageButton A0Y;
    public ImageView A0Z;
    public ImageView A0a;
    public TextView A0b;
    public TextView A0c;
    public TextView A0d;
    public TextView A0e;
    public TextView A0f;
    public TextView A0g;
    public DialogFragment A0h;
    public DialogFragment A0i;
    public DialogFragment A0j;
    public AnonymousClass0BP A0k = null;
    public AnonymousClass0YX A0l;
    public C58822mb A0m;
    public ContactPickerFragment A0n;
    public CallDetailsLayout A0o;
    public CallInfoFragment A0p;
    public CallPictureGrid A0q;
    public MaximizedParticipantVideoDialogFragment A0r;
    public VideoCallParticipantView A0s;
    public VideoCallParticipantViewLayout A0t;
    public AnonymousClass39R A0u;
    public AnonymousClass3U7 A0v;
    public Voip.CallState A0w;
    public AnonymousClass3UH A0x;
    public EnumC675439a A0y;
    public AnonymousClass3UL A0z;
    public C675539b A10;
    public VoipCallControlBottomSheet A11;
    public VoipCallFooter A12;
    public VoipCallNewParticipantBanner A13;
    public AnonymousClass3AE A14 = new C74373al(this);
    public Boolean A15;
    public String A16;
    public String A17;
    public Map A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B = true;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O = true;
    public boolean A1P = false;
    public final AnonymousClass0C2 A1Q = AnonymousClass0C2.A00();
    public final AnonymousClass0GG A1R = AnonymousClass0GG.A00();
    public final AnonymousClass01I A1S = AnonymousClass01I.A00();
    public final AnonymousClass0IY A1T = AnonymousClass0IY.A00();
    public final C000300f A1U = C000300f.A00();
    public final AnonymousClass01A A1V = AnonymousClass01A.A00();
    public final AnonymousClass08B A1W = AnonymousClass08B.A00;
    public final C014308b A1X = C014308b.A00();
    public final AbstractC12270hp A1Y = new AnonymousClass3UD();
    public final AnonymousClass0L2 A1Z = AnonymousClass0L2.A01();
    public final AnonymousClass03P A1a = AnonymousClass03P.A00();
    public final AnonymousClass03C A1b = AnonymousClass03C.A00();
    public final AnonymousClass03S A1c = AnonymousClass03S.A00();
    public final AnonymousClass0L1 A1d = AnonymousClass0L1.A00();
    public final AnonymousClass00T A1e = C002101e.A00();
    public final AnonymousClass3TM A1f = new AnonymousClass3TM(this);
    public final C674038l A1g = C674038l.A01;
    public final AnonymousClass0LH A1h = new AnonymousClass3UC(this);
    public final AnonymousClass0JO A1i = AnonymousClass0JO.A00;
    public final C09200cS A1j = C09200cS.A00();
    public final AnonymousClass0Z0 A1k = AnonymousClass0Z0.A00();
    public final AnonymousClass0Fh A1l = AnonymousClass0Fh.A00();
    public final C09270cb A1m = C09270cb.A00();
    public final VoipCameraManager A1n = VoipCameraManager.getInstance();

    public void lambda$onCreate$2773$VoipActivityV2(View view) {
    }

    public VoipActivityV2() {
        super(false);
    }

    public static Intent A04(Context context, int i, String str, boolean z) {
        Intent A062 = A06(context, null, Boolean.valueOf(z), null, null, null);
        A062.setAction("com.whatsapp.intent.action.ACCEPT_CALL");
        A062.putExtra("call_ui_action", i);
        A062.putExtra("call_id", str);
        A062.putExtra("isTaskRoot", z);
        return A062;
    }

    public static Intent A05(Context context, UserJid userJid, Boolean bool) {
        ArrayList arrayList = new ArrayList();
        if (userJid != null) {
            arrayList.add(userJid);
        }
        return A06(context, arrayList, bool, null, null, null);
    }

    public static Intent A06(Context context, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        Intent intent = new Intent(context, VoipActivityV2.class);
        if (list != null) {
            intent.putStringArrayListExtra("jid", AnonymousClass1VY.A0F(list));
        }
        if (bool != null) {
            intent.putExtra("isTaskRoot", bool);
        }
        if (bool4 != null) {
            intent.putExtra("newCall", bool4);
        }
        if (bool2 != null) {
            intent.putExtra("video_call", bool2);
        }
        if (bool3 != null || !(C002001d.A0O(context) instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static void A07(VoipActivityV2 voipActivityV2, UserJid userJid) {
        AnonymousClass3U7 r3;
        CallInfo A0W2 = voipActivityV2.A0W();
        if (A0W2 != null && A0W2.callState != Voip.CallState.NONE && (r3 = voipActivityV2.A0v) != null) {
            r3.A0o.execute(new RunnableEBaseShape4S0200000_I0_3(r3, userJid, 21));
        }
    }

    public static final boolean A08(CallInfo callInfo) {
        return callInfo != null && callInfo.videoEnabled;
    }

    @Override // X.ActivityC004602e
    public void A0R() {
        if (((ActivityC004602e) this).A08.A01() != 1) {
            super.A0R();
        }
    }

    public final CallInfo A0W() {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            return A0X(callInfo);
        }
        return null;
    }

    public final CallInfo A0X(CallInfo callInfo) {
        String str = this.A17;
        if (str != null && str.equals(callInfo.callWaitingInfo.A04)) {
            return CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
        }
        if (str != null) {
            String str2 = callInfo.callId;
            if (!str.equals(str2)) {
                StringBuilder A0S2 = AnonymousClass008.A0S("VoipActivityV2/getCallInfoForDisplay CallIdToShow ");
                A0S2.append(str);
                A0S2.append(" does not match current call's id ");
                A0S2.append(str2);
                Log.d(A0S2.toString());
            }
        }
        return callInfo;
    }

    public final AnonymousClass39R A0Y(UserJid userJid) {
        AnonymousClass39R r1 = (AnonymousClass39R) this.A18.get(userJid);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass3UM r12 = new AnonymousClass3UM(this, this.A0t, userJid);
        this.A18.put(userJid, r12);
        return r12;
    }

    public final Voip.CallState A0Z(CallInfo callInfo) {
        Voip.CallState callState = callInfo.callState;
        if (Voip.A0B(callState) && this.A1A) {
            return Voip.CallState.ACCEPT_SENT;
        }
        if (!callInfo.hasOutgoingParticipantInActiveOneToOneCall()) {
            return callState;
        }
        AnonymousClass0QY defaultPeerInfo = callInfo.getDefaultPeerInfo();
        if (defaultPeerInfo == null) {
            throw null;
        } else if (defaultPeerInfo.A01 == 2) {
            return Voip.CallState.CALLING;
        } else {
            if (callInfo.getDefaultPeerInfo().A01 == 3) {
                return Voip.CallState.PRE_ACCEPT_RECEIVED;
            }
            return callState;
        }
    }

    public final String A0a(UserJid userJid, int i) {
        if (i == 2) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.voip_declined);
        }
        if (i == 9) {
            AnonymousClass3U7 r0 = this.A0v;
            if (r0 == null || r0.A2B != 7) {
                return null;
            }
            return ((AnonymousClass2C0) this).A01.A06(R.string.voip_unavailable);
        } else if (i == 17) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.voip_unavailable);
        } else {
            if (i == 4) {
                return ((AnonymousClass2C0) this).A01.A06(R.string.voip_not_answered);
            }
            if (i != 5) {
                return null;
            }
            return ((AnonymousClass2C0) this).A01.A0D(R.string.peer_in_another_call, this.A1X.A08(this.A1V.A0A(userJid), false));
        }
    }

    public final String A0b(AnonymousClass0QY r6, CallInfo callInfo) {
        String A042 = this.A1X.A04(this.A1V.A0A(r6.A06));
        if (r6.A0D || callInfo.callState != Voip.CallState.ACTIVE) {
            return null;
        }
        boolean z = false;
        if (r6.A04 == 3) {
            z = true;
        }
        if (z) {
            return ((AnonymousClass2C0) this).A01.A0D(R.string.voip_requested_upgrade_to_video_new, A042);
        }
        boolean z2 = callInfo.isGroupCall;
        if (z2 && r6.A01 == 2) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.calling);
        }
        if (z2 && r6.A01 == 3) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.ringing);
        }
        AnonymousClass0QY r0 = callInfo.self;
        if (r0 != null && r0.A09) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.voip_on_hold);
        }
        if (r6.A09) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.voip_on_hold);
        }
        if (r6.A0C) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.voip_reconnecting);
        }
        if (!callInfo.videoEnabled || r6.A00() || r6.A0I || r6.A04 == 2) {
            return null;
        }
        return ((AnonymousClass2C0) this).A01.A06(R.string.voip_connecting);
    }

    public final String A0c(AnonymousClass0QY r7, CallInfo callInfo, boolean z) {
        String A042 = this.A1X.A04(this.A1V.A0A(r7.A06));
        if (callInfo.videoEnabled) {
            boolean A002 = r7.A00();
            if (A002 && r7.A0B && !callInfo.isGroupCall) {
                AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
                if (!z) {
                    return r2.A06(R.string.voip_pip_peer_muted_camera_off);
                }
                return r2.A0D(R.string.voip_peer_muted_camera_off, A042);
            } else if (A002) {
                AnonymousClass01X r22 = ((AnonymousClass2C0) this).A01;
                if (!z) {
                    return r22.A06(R.string.voip_pip_peer_video_stopped);
                }
                return r22.A0D(R.string.voip_peer_video_stopped, A042);
            } else if (r7.A04 == 2) {
                if (!r7.A0B || callInfo.isGroupCall) {
                    AnonymousClass01X r23 = ((AnonymousClass2C0) this).A01;
                    if (!z) {
                        return r23.A06(R.string.voip_pip_peer_video_paused);
                    }
                    return r23.A0D(R.string.voip_peer_video_paused, A042);
                }
                AnonymousClass01X r24 = ((AnonymousClass2C0) this).A01;
                if (!z) {
                    return r24.A06(R.string.voip_peer_muted_video_paused_short);
                }
                return r24.A0D(R.string.voip_peer_muted_video_paused, A042);
            } else if (r7.A0G || r7.A0F) {
                AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
                if (z) {
                    return r1.A06(R.string.video_decode_paused);
                }
                return r1.A06(R.string.poor_connection);
            } else if (!r7.A0B || callInfo.isGroupCall) {
                return null;
            } else {
                AnonymousClass01X r25 = ((AnonymousClass2C0) this).A01;
                if (!z) {
                    return r25.A06(R.string.voip_pip_peer_muted);
                }
                return r25.A0D(R.string.voip_peer_muted, A042);
            }
        } else if (!r7.A0B) {
            return null;
        } else {
            AnonymousClass01X r26 = ((AnonymousClass2C0) this).A01;
            if (!z) {
                return r26.A06(R.string.voip_pip_peer_muted);
            }
            return r26.A0D(R.string.voip_peer_muted, A042);
        }
    }

    public final List A0d(CallInfo callInfo, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass0QY r2 : callInfo.participants.values()) {
            if (!r2.A0D && (z || ((i = r2.A01) != 11 && (!C002001d.A3M(this.A1U) || i == 1)))) {
                arrayList.add(r2.A06);
            }
        }
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/getPeerParticipantJids ");
        sb.append(arrayList);
        Log.i(sb.toString());
        return arrayList;
    }

    public void A0e() {
        AnonymousClass008.A1U(AnonymousClass008.A0S("voip/VoipActivityV2/showCallFailedMessage"), this.A16);
        String str = this.A16;
        if (str != null) {
            DialogFragment dialogFragment = this.A0j;
            if (dialogFragment != null) {
                dialogFragment.A0r();
                this.A0j = null;
                this.A16 = null;
                str = null;
            }
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("message", str);
            messageDialogFragment.A0N(bundle);
            this.A0j = messageDialogFragment;
            messageDialogFragment.A0u(A04(), null);
            return;
        }
        AnonymousClass00E.A08(false, "call failed message not defined");
    }

    public final void A0f() {
        this.A0d.setText("");
        this.A0O.setVisibility(8);
    }

    public final void A0g() {
        boolean z = false;
        if (this.A0n != null) {
            z = true;
        }
        AnonymousClass00E.A08(z, "contact picker fragment should not be null");
        ContactPickerFragment contactPickerFragment = this.A0n;
        if (contactPickerFragment != null) {
            contactPickerFragment.A0D.A04(false);
            if (C002001d.A3M(this.A1U)) {
                A0J("VoipContactPickerDialogFragment");
                this.A0n = null;
                return;
            }
            A16(this.A0n, this.A0U, new RunnableEBaseShape4S0100000_I0_4(this, 45));
        }
    }

    public final void A0h() {
        AnonymousClass0LW A042 = A04();
        AnonymousClass037 A012 = A042.A0Q.A01("permission_request");
        if (A012 != null) {
            Log.d("VoipActivityV2/dismissPermissionsDialogFragment Dismissing Fragment");
            if (A042 != null) {
                AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                r0.A03(A012);
                r0.A04();
                return;
            }
            throw null;
        }
    }

    public final void A0i() {
        if (this.A0I != null) {
            Log.i("voip/VoipActivityV2/hideAnswerCallView");
            C28051Sr.A1R(this.A0I, 8);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Q.getLayoutParams();
        if (this.A11 != null && layoutParams.bottomMargin == 0) {
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_btn_stub_height) - getResources().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_rounded_corner_radius);
            this.A0Q.setLayoutParams(layoutParams);
        }
    }

    public final void A0j() {
        Log.i("voip/VoipActivityV2/hideInCallControls");
        this.A0J.setVisibility(4);
        this.A0S.setVisibility(8);
        this.A0S.setTranslationY(0.0f);
        this.A12.setVisibility(4);
        this.A0O.setVisibility(8);
        A0J("CallControlSheet");
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0t;
        for (int i = 0; i < videoCallParticipantViewLayout.A01; i++) {
            videoCallParticipantViewLayout.A01(i).A01();
            videoCallParticipantViewLayout.A01(i).A08(false, false);
        }
        View findViewById = findViewById(R.id.debug_views);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void A0k() {
        if (this.A11 == null) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4);
            getWindow().setFlags(1024, 1024);
        }
    }

    public final void A0l() {
        if (this.A0n != null) {
            Log.i("contact picker is already shown, ignore new events");
            return;
        }
        CallInfo A0W2 = A0W();
        if (A0W2 != null) {
            Map map = A0W2.participants;
            Bundle bundle = new Bundle();
            bundle.putBoolean("for_group_call", true);
            bundle.putStringArrayList("contacts_to_exclude", AnonymousClass1VY.A0F(map.keySet()));
            if (C002001d.A3M(this.A1U)) {
                KeyguardManager A032 = this.A1a.A03();
                if (A032 != null && (A032.isKeyguardLocked() || A032.inKeyguardRestrictedInputMode())) {
                    A1T(false);
                }
                boolean z = A0W2.videoEnabled;
                VoipContactPickerDialogFragment voipContactPickerDialogFragment = new VoipContactPickerDialogFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("is_video_call", z);
                voipContactPickerDialogFragment.A0N(bundle2);
                ContactPickerFragment contactPickerFragment = voipContactPickerDialogFragment.A00;
                if (contactPickerFragment != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBundle("extras", bundle);
                    contactPickerFragment.A0N(bundle3);
                    this.A0n = contactPickerFragment;
                    APl(voipContactPickerDialogFragment, "VoipContactPickerDialogFragment");
                    return;
                }
                throw null;
            }
            ContactPickerFragment contactPickerFragment2 = new ContactPickerFragment();
            this.A0n = contactPickerFragment2;
            Bundle bundle4 = new Bundle();
            bundle4.putBundle("extras", bundle);
            contactPickerFragment2.A0N(bundle4);
            A12(R.id.contact_picker_fragment, this.A0n, "ContactPickerFragment");
        }
    }

    public final void A0m() {
        if (this.A0p != null) {
            Log.i("call info fragment is already shown, ignore new events");
            return;
        }
        CallInfoFragment callInfoFragment = new CallInfoFragment(new ViewOnClickEBaseShape1S0100000_I0_1(this, 41));
        this.A0p = callInfoFragment;
        A12(R.id.call_info_fragment, callInfoFragment, "CallInfoFragment");
    }

    public final void A0n() {
        CallInfo A0W2 = A0W();
        if (A0W2 != null && A0W2.callState != Voip.CallState.NONE && this.A1O && A1a(A0W2)) {
            this.A0E.removeMessages(3);
            this.A0E.sendEmptyMessageDelayed(3, 5000);
        }
    }

    public final void A0o() {
        boolean z = false;
        if (!C002001d.A3M(this.A1U)) {
            this.A12.setVisibility(0);
            this.A0J.setVisibility(0);
        } else if (this.A11 == null) {
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0t;
            if (!(videoCallParticipantViewLayout == null || videoCallParticipantViewLayout.getPaddingBottom() == 0)) {
                this.A0t.setPadding(0, 0, 0, 0);
            }
            CallInfo A0W2 = A0W();
            if (A0W2 != null && A0W2.videoEnabled) {
                z = true;
            }
            VoipCallControlBottomSheet voipCallControlBottomSheet = new VoipCallControlBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_video_call", z);
            voipCallControlBottomSheet.A0N(bundle);
            this.A11 = voipCallControlBottomSheet;
            this.A12.setVisibility(8);
            this.A0J.setVisibility(4);
            if (A0W2 != null && !A0W2.isPeerRequestingUpgrade()) {
                if (A0W2.isGroupCall || !Voip.A0B(A0W2.callState)) {
                    this.A11.A0u(A04(), "CallControlSheet");
                    VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A13;
                    if (voipCallNewParticipantBanner != null) {
                        voipCallNewParticipantBanner.A01();
                    }
                    A0i();
                }
            }
        }
    }

    public final void A0p() {
        Log.i("voip/VoipActivityV2/showInCallControls");
        this.A1O = true;
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
        if (voipCallControlBottomSheet == null) {
            this.A0J.setVisibility(0);
            this.A12.setVisibility(0);
        } else {
            voipCallControlBottomSheet.A0u(A04(), "CallControlSheet");
            this.A12.setVisibility(8);
            this.A0J.setVisibility(8);
            A0w();
            VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A13;
            if (voipCallNewParticipantBanner != null) {
                voipCallNewParticipantBanner.A01();
            }
        }
        this.A0S.setVisibility(0);
        if (this.A0d.length() > 0) {
            this.A0O.setVisibility(0);
        }
        View findViewById = findViewById(R.id.debug_views);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void A0q() {
        if (this.A11 == null) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
            getWindow().clearFlags(1024);
        }
    }

    public final void A0r() {
        this.A1n.removeCameraErrorListener(this.A14);
        this.A0E.removeMessages(6);
        Voip.setVideoPreviewPort(null, this.A17);
        Voip.setVideoPreviewSize(0, 0);
    }

    public final void A0s() {
        Log.i("voip/VoipActivityV2/toggleIncallControlls");
        CallInfo A0W2 = A0W();
        if (A1a(A0W2) && !this.A1N && !this.A1E && this.A0n == null) {
            this.A0E.removeMessages(3);
            boolean z = !this.A1O;
            this.A1O = z;
            if (z) {
                VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
                if (voipCallControlBottomSheet != null && !voipCallControlBottomSheet.A0U() && this.A00 == 3) {
                    voipCallControlBottomSheet.A0u(A04(), "CallControlSheet");
                }
                A0q();
            } else {
                A0k();
            }
            A1E(A0W2);
            A13(300, 250, A0W2);
            if (this.A1O) {
                this.A0E.sendEmptyMessageDelayed(3, 5000);
            }
        }
    }

    public final void A0t() {
        Log.i("VoipActivityV2 vm unbindService");
        try {
            this.A1k.A00.obtainMessage(5, this).sendToTarget();
        } catch (IllegalArgumentException e) {
            Log.e(e);
        }
        AnonymousClass3U7 r0 = this.A0v;
        if (r0 != null) {
            r0.A0e(this);
            this.A0v = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r1.A0I == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0125, code lost:
        if (r17.A00 == 1) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        if (r7 != com.whatsapp.voipcalling.Voip.CallState.ACTIVE) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r17.A1A != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0185, code lost:
        if (com.whatsapp.voipcalling.Voip.A0B(r1.callState) == false) goto L_0x0187;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0u() {
        /*
        // Method dump skipped, instructions count: 746
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0u():void");
    }

    public final void A0v() {
        TextView textView = (TextView) findViewById(R.id.debug_tx_network_conditioner_param_text_view);
        if (textView != null) {
            if (Voip.isTxNetworkConditionerOn()) {
                StringBuilder A0S2 = AnonymousClass008.A0S("Tx network conditioner is ON !!!\n");
                A0S2.append(Voip.getCurrentTxNetworkConditionerParameters());
                textView.setText(A0S2.toString());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.debug_rx_network_conditioner_param_text_view);
        if (textView2 == null) {
            return;
        }
        if (Voip.isRxNetworkConditionerOn()) {
            StringBuilder A0S3 = AnonymousClass008.A0S("Rx network conditioner is ON !!!\n");
            A0S3.append(Voip.getCurrentRxNetworkConditionerParameters());
            textView2.setText(A0S3.toString());
            textView2.setVisibility(0);
            return;
        }
        textView2.setVisibility(8);
    }

    public final void A0w() {
        CallInfo A0W2 = A0W();
        if (A08(A0W2)) {
            for (AnonymousClass39R r2 : this.A18.values()) {
                VideoCallParticipantView videoCallParticipantView = r2.A00;
                if (videoCallParticipantView != null && videoCallParticipantView.getLayoutMode() == 1) {
                    A0x();
                    AnonymousClass0QY infoByJid = A0W2.getInfoByJid(r2.A03);
                    r2.A05(infoByJid);
                    r2.A06(infoByJid, A0W2);
                    return;
                }
            }
        }
    }

    public final void A0x() {
        int i;
        float dimension;
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0t;
        float f = 0.225f;
        if (this.A1I) {
            f = 0.4f;
        }
        videoCallParticipantViewLayout.A00 = f;
        int i2 = 0;
        if (this.A1O) {
            if (this.A11 != null) {
                dimension = getResources().getDimension(R.dimen.call_control_bottom_sheet_btn_stub_height);
            } else {
                dimension = getResources().getDimension(R.dimen.call_footer_height);
            }
            i = (int) dimension;
        } else {
            i = 0;
        }
        videoCallParticipantViewLayout.A02 = i;
        VideoCallParticipantViewLayout videoCallParticipantViewLayout2 = this.A0t;
        if (this.A1O) {
            i2 = this.A0S.getHeight();
        }
        videoCallParticipantViewLayout2.A04 = i2;
    }

    public final void A0y(int i) {
        String A062;
        Log.i("voip/VoipActivityV2/call/accept");
        CallInfo A0W2 = A0W();
        if (A0W2 != null && A0W2.callState != Voip.CallState.NONE) {
            int i2 = 2;
            boolean z = true;
            if (!this.A1A) {
                A0i();
                VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
                if (voipCallControlBottomSheet != null) {
                    voipCallControlBottomSheet.A0u(A04(), "CallControlSheet");
                }
                C28051Sr.A1R(this.A0W, 0);
                CallDetailsLayout callDetailsLayout = this.A0o;
                if (callDetailsLayout != null) {
                    Log.i("voip/CallDetailsLayout/animateAvatarLayout");
                    if (A0W2.callState == Voip.CallState.NONE) {
                        Log.i("voip/CallDetailsLayout/animateAvatarLayout return directly, no call is going on");
                    } else {
                        int i3 = callDetailsLayout.A00;
                        if (i3 == 1) {
                            AnonymousClass008.A1L(AnonymousClass008.A0S("voip/CallDetailsLayout/animateAvatarLayout return directly, avatarAnimationState: "), i3);
                        } else if (callDetailsLayout.A04.getVisibility() == 8) {
                            Log.i("voip/CallDetailsLayout/animateAvatarLayout return directly, peerAvatarLayout.getVisibility() == View.GONE ");
                        } else {
                            int height = callDetailsLayout.A0A.getHeight();
                            if (height == 0) {
                                callDetailsLayout.A0A.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            }
                            callDetailsLayout.A00 = 1;
                            boolean z2 = A0W2.videoEnabled;
                            int i4 = 4;
                            if (z2) {
                                i4 = 1;
                            }
                            ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[i4];
                            if (!z2) {
                                for (int i5 = 0; i5 < callDetailsLayout.A0A.getChildCount(); i5++) {
                                    C673738h r13 = (C673738h) callDetailsLayout.A0A.getChildAt(i5);
                                    height = r13.A01.getMeasuredHeight();
                                    LinearLayout linearLayout = r13.A01;
                                    if (linearLayout != null) {
                                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                        scaleAnimation.setInterpolator(new DecelerateInterpolator());
                                        scaleAnimation.setDuration(125);
                                        linearLayout.startAnimation(scaleAnimation);
                                    }
                                }
                                float f = (float) (-height);
                                objectAnimatorArr[0] = CallDetailsLayout.A00(callDetailsLayout.A0A, "translationY", f);
                                objectAnimatorArr[1] = CallDetailsLayout.A00(callDetailsLayout.A07, "translationY", f);
                                objectAnimatorArr[2] = CallDetailsLayout.A00(callDetailsLayout.A06, "translationY", f);
                                objectAnimatorArr[3] = CallDetailsLayout.A00(callDetailsLayout.A05, "translationY", f);
                            } else {
                                objectAnimatorArr[0] = CallDetailsLayout.A00(callDetailsLayout, "alpha", 0.0f);
                            }
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorArr);
                            animatorSet.start();
                            animatorSet.addListener(new C673838i(callDetailsLayout, z2));
                        }
                    }
                    VoipCallFooter voipCallFooter = this.A12;
                    if (voipCallFooter != null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(voipCallFooter, "translationY", 0.0f);
                        ofFloat.setInterpolator(new DecelerateInterpolator());
                        ofFloat.setDuration(125L);
                        ofFloat.start();
                    }
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A12.getLayoutParams();
                    if (layoutParams.bottomMargin != 0) {
                        layoutParams.bottomMargin = 0;
                        this.A12.setLayoutParams(layoutParams);
                    }
                } else {
                    throw null;
                }
            } else {
                Log.w("callAccepted is true when calling acceptCall()");
            }
            this.A1A = true;
            if (this.A0v != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    AnonymousClass03S r1 = this.A1c;
                    boolean z3 = !r1.A09();
                    if (!A0W2.videoEnabled || r1.A07()) {
                        z = false;
                    }
                    if (z3 || z) {
                        StringBuilder sb = new StringBuilder("voip/service/accept noRecordPermission = ");
                        sb.append(z3);
                        sb.append(", noCameraPermission = ");
                        sb.append(z);
                        Log.w(sb.toString());
                        AnonymousClass01X r12 = ((AnonymousClass2C0) this).A01;
                        if (!z) {
                            A062 = r12.A06(R.string.can_not_start_voip_call_without_record_permission);
                        } else if (z3) {
                            A062 = r12.A06(R.string.can_not_start_video_call_without_mic_and_camera_permission);
                        } else {
                            A062 = r12.A06(R.string.can_not_start_video_call_without_camera_permission);
                        }
                        this.A0v.A0P(27, A062);
                        return;
                    }
                }
                this.A0v.A0F();
                UserJid userJid = A0W2.peerJid;
                boolean z4 = A0W2.videoEnabled;
                if (!A0W2.isPeerRequestingUpgrade()) {
                    i2 = 0;
                }
                if (!A1Z(userJid, z4, i2)) {
                    return;
                }
                if (Voip.A0B(A0W2.callState)) {
                    this.A0v.A0g(this.A17, i);
                } else if (A0W2.isPeerRequestingUpgrade()) {
                    AnonymousClass3U7 r2 = this.A0v;
                    r2.A0O();
                    r2.A22.setRequestedCamera2SupportLevel(r2.A21.A03());
                    r2.A0o.execute(AnonymousClass37Z.A00);
                }
            } else {
                Log.e("voip/VoipActivityV2/call/accept voiceService is null");
            }
        }
    }

    public final void A0z(int i) {
        Log.i("voip/VoipActivityV2/call/reject");
        CallInfo A0W2 = A0W();
        if (A0W2 != null && A0W2.callState != Voip.CallState.NONE) {
            A0i();
            AnonymousClass3U7 r2 = this.A0v;
            if (r2 == null) {
                return;
            }
            if (Voip.A0B(A0W2.callState)) {
                r2.A0j(A0W2.callId, null, i);
            } else if (A0W2.isPeerRequestingUpgrade()) {
                this.A0v.A0o.execute(new RunnableEBaseShape0S0001000_I1(0, 2));
            }
        }
    }

    public final void A10(int i) {
        VideoCallParticipantView videoCallParticipantView;
        VoipCallFooter voipCallFooter;
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
        if (voipCallControlBottomSheet == null || (voipCallFooter = voipCallControlBottomSheet.A0F) == null) {
            this.A12.A02(i);
            float f = (float) i;
            this.A0W.setRotation(f);
            this.A0X.setRotation(f);
        } else {
            voipCallFooter.A02(i);
        }
        float f2 = (float) i;
        this.A0Y.setRotation(f2);
        this.A0O.setRotation(f2);
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0t;
        for (int i2 = 0; i2 < videoCallParticipantViewLayout.A01; i2++) {
            VideoCallParticipantView A012 = videoCallParticipantViewLayout.A01(i2);
            A012.A0H.setRotation(f2);
            A012.A0F.setRotation(f2);
            A012.A0D.setRotation(f2);
        }
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A0r;
        if (!(maximizedParticipantVideoDialogFragment == null || (videoCallParticipantView = maximizedParticipantVideoDialogFragment.A08) == null)) {
            videoCallParticipantView.A0H.setRotation(f2);
            videoCallParticipantView.A0F.setRotation(f2);
            videoCallParticipantView.A0D.setRotation(f2);
        }
    }

    public final void A11(int i) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("finish", true);
        AnonymousClass3U9 r3 = new AnonymousClass3U9(this);
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putInt("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A0N(bundle2);
        voipErrorDialogFragment.A02 = r3;
        voipErrorDialogFragment.A0u(A04(), null);
    }

    public final void A12(int i, AnonymousClass037 r7, String str) {
        CallInfo A0W2 = A0W();
        if (A0W2 != null) {
            KeyguardManager A032 = this.A1a.A03();
            if (A032 != null && (A032.isKeyguardLocked() || A032.inKeyguardRestrictedInputMode())) {
                A1T(false);
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) this.A04, 0.0f);
            translateAnimation.setDuration(200);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            View A0D2 = AnonymousClass0Q7.A0D(this.A0R, i);
            A0D2.startAnimation(translateAnimation);
            A0D2.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 19) {
                this.A0L.setImportantForAccessibility(4);
            }
            AnonymousClass0LW A042 = A04();
            if (A042 != null) {
                AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                r0.A0A(i, r7, str, 1);
                r0.A04();
                if (A0W2.videoEnabled) {
                    A0q();
                }
                AnonymousClass3U7 r1 = this.A0v;
                if (r1 != null) {
                    Log.i("voip/disableProximitySensor");
                    if (!r1.A0t) {
                        r1.A0t = true;
                        r1.A0J.removeMessages(14);
                        r1.A0J.sendEmptyMessageDelayed(14, 500);
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        if (r22.A1O != false) goto L_0x00fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A13(long r23, long r25, com.whatsapp.voipcalling.CallInfo r27) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A13(long, long, com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A14(Intent intent, CallInfo callInfo) {
        AnonymousClass00E.A08("com.whatsapp.intent.action.ACCEPT_CALL".equals(intent.getAction()), "should only be called if intent action is ACTION_ACCEPT_INCOMING_CALL");
        String stringExtra = intent.getStringExtra("call_id");
        if (Voip.A09(callInfo)) {
            if (!callInfo.callId.equals(stringExtra)) {
                AnonymousClass1YO r1 = callInfo.callWaitingInfo;
                if (r1.A01 != 1 || !r1.A04.equals(stringExtra)) {
                    return;
                }
            }
            this.A1A = true;
            this.A01 = 0;
            if (this.A0v != null) {
                A0y(intent.getIntExtra("call_ui_action", 0));
            } else {
                this.A19 = true;
            }
        }
    }

    public final void A15(Intent intent, CallInfo callInfo) {
        AnonymousClass00E.A08(A1q.equals(intent.getAction()), "should only be called if intent action is ACTION_SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL");
        if (callInfo.callState == Voip.CallState.ACTIVE) {
            String stringExtra = intent.getStringExtra("alertMessage");
            NonActivityDismissDialogFragment nonActivityDismissDialogFragment = new NonActivityDismissDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("text", stringExtra);
            bundle.putBoolean("dismiss", false);
            nonActivityDismissDialogFragment.A0N(bundle);
            nonActivityDismissDialogFragment.A0u(A04(), "VoipAlertDialog");
            return;
        }
        Log.i("voip/VoipActivityV2/new-intent call is gone, ignore the request to show alert message");
        finish();
    }

    public final void A16(AnonymousClass037 r10, View view, Runnable runnable) {
        CallInfo A0W2;
        int i;
        if (r10 != null && !r10.A0g) {
            A1T(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) this.A04);
            translateAnimation.setAnimationListener(new AnonymousClass3UB(this, translateAnimation, r10, view, runnable));
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(200);
            view.startAnimation(translateAnimation);
            if (Build.VERSION.SDK_INT >= 21 && (A0W2 = A0W()) != null) {
                boolean A3M = C002001d.A3M(this.A1U);
                Window window = getWindow();
                if (A0W2.videoEnabled) {
                    i = R.color.video_call_text_background;
                    if (A3M) {
                        i = R.color.transparent;
                    }
                } else {
                    i = R.color.primary;
                }
                window.setStatusBarColor(C004302a.A00(this, i));
                if (A3M) {
                    Window window2 = getWindow();
                    boolean z = A0W2.videoEnabled;
                    int i2 = R.color.primary_voip;
                    if (z) {
                        i2 = R.color.black;
                    }
                    window2.setNavigationBarColor(C004302a.A00(this, i2));
                }
            }
            AnonymousClass3U7 r2 = this.A0v;
            if (r2 != null) {
                Log.i("voip/restoreProximitySensor");
                if (r2.A0t) {
                    r2.A0t = false;
                    r2.A0J.removeMessages(14);
                    r2.A0J.sendEmptyMessage(14);
                }
            }
        }
    }

    public void A17(UserJid userJid) {
        AnonymousClass00E.A01();
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/videoRenderStarted ");
        sb.append(userJid);
        Log.i(sb.toString());
        A0Y(userJid).A04();
        A1H(A0W());
        A0n();
    }

    public /* synthetic */ void A18(UserJid userJid) {
        startActivity(Conversation.A04(this, this.A1V.A0A(userJid)));
        if (Build.VERSION.SDK_INT >= 26) {
            A1b(A0W());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r6.isEitherSideRequestingUpgrade() != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A19(com.whatsapp.voipcalling.CallInfo r6) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A19(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A1A(CallInfo callInfo) {
        Object valueOf;
        if (!A1c(callInfo.callId, "voipActivityV2/videoStateChanged")) {
            this.A1H = false;
            this.A0E.removeMessages(10);
            if (callInfo.callState != Voip.CallState.NONE && !callInfo.callEnding) {
                StringBuilder A0S2 = AnonymousClass008.A0S("voip/VoipActivityV2/videoStateChanged self_video_state: ");
                A0S2.append(callInfo.self.A04);
                A0S2.append(", peer_video_state: ");
                if (callInfo.getDefaultPeerInfo() == null) {
                    valueOf = "null";
                } else {
                    valueOf = Integer.valueOf(callInfo.getDefaultPeerInfo().A04);
                }
                A0S2.append(valueOf);
                Log.i(A0S2.toString());
                this.A1E = false;
                this.A0E.removeMessages(3);
                this.A0o.clearAnimation();
                this.A12.clearAnimation();
                if (callInfo.isEitherSideRequestingUpgrade()) {
                    this.A1A = false;
                }
                A1G(callInfo);
                A1H(callInfo);
            }
        }
    }

    public final void A1B(CallInfo callInfo) {
        AnonymousClass0QY r0;
        AnonymousClass3U7 r1 = this.A0v;
        if (r1 != null) {
            boolean z = false;
            if (r1.A09(callInfo.callId) != null) {
                z = true;
            }
            if (z && callInfo.callState == Voip.CallState.ACTIVE && (r0 = callInfo.self) != null && r0.A09) {
                Log.i("voip/VoipActivityV2/checkToShowResumeCallButton");
                AnonymousClass01X r12 = ((AnonymousClass2C0) this).A01;
                A1O(r12.A06(R.string.voip_on_hold), r12.A06(R.string.voip_resume), this.A0H, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (r15.isEitherSideRequestingUpgrade() == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1C(com.whatsapp.voipcalling.CallInfo r15) {
        /*
        // Method dump skipped, instructions count: 597
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1C(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A1D(CallInfo callInfo) {
        AnonymousClass00E.A08(A08(callInfo), "can be called only for video call");
        for (AnonymousClass39R r2 : this.A18.values()) {
            AnonymousClass0QY infoByJid = callInfo.getInfoByJid(r2.A03);
            r2.A05(infoByJid);
            r2.A06(infoByJid, callInfo);
            MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A0r;
            if (maximizedParticipantVideoDialogFragment != null) {
                maximizedParticipantVideoDialogFragment.A0x(infoByJid, callInfo);
            }
        }
    }

    public final void A1E(CallInfo callInfo) {
        VoipCallControlBottomSheet voipCallControlBottomSheet;
        if (callInfo != null) {
            Voip.CallState callState = callInfo.callState;
            int i = 0;
            boolean z = false;
            if (callState != Voip.CallState.NONE) {
                z = true;
            }
            if (this.A0J == null || this.A12 == null) {
                Log.e("voip/VoipActivityV2/updateButtonStates/null");
                return;
            }
            Voip.CallState callState2 = this.A0w;
            this.A0w = callState;
            View view = this.A0K;
            if (view != null) {
                view.setVisibility(8);
            }
            if (!this.A1O) {
                View view2 = this.A0I;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else if (!Voip.A0B(callState) || this.A1A) {
                if (callInfo.isPeerRequestingUpgrade()) {
                    boolean z2 = false;
                    if (callInfo.self.A04 == 3) {
                        z2 = true;
                    }
                    if (!z2 && !this.A1A) {
                        Log.i("voip/VoipActivityV2/updateButtonStates/answerCallView/visible kVideoStateUpgradeRequest");
                        A1C(callInfo);
                        return;
                    }
                }
                Log.i("voip/VoipActivityV2/updateButtonStates");
                View view3 = this.A0I;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                VoipCallControlBottomSheet voipCallControlBottomSheet2 = this.A11;
                if (voipCallControlBottomSheet2 != null) {
                    voipCallControlBottomSheet2.A0u(A04(), "CallControlSheet");
                    return;
                }
                if (z && Voip.A0B(callState2) && this.A12.getVisibility() != 0) {
                    Log.i("voip/VoipActivityV2/updateButtonStates/animateButtonIn");
                    C28051Sr.A1Q(this.A0W, 0);
                    VoipCallFooter voipCallFooter = this.A12;
                    C28051Sr.A1Q(voipCallFooter.A0A, 100);
                    if (voipCallFooter.A00.isShown()) {
                        C28051Sr.A1Q(voipCallFooter.A05, 100);
                    }
                    C28051Sr.A1Q(voipCallFooter.A06, 150);
                    C28051Sr.A1Q(voipCallFooter.A09, 200);
                    if (callInfo.self.A07) {
                        C28051Sr.A1Q(voipCallFooter.A0B, 250);
                    } else {
                        voipCallFooter.A04.setVisibility(8);
                    }
                    voipCallFooter.setCallInfoButtonVisibility(callInfo);
                    if (voipCallFooter.A03.getVisibility() == 0) {
                        C28051Sr.A1Q(voipCallFooter.A08, 300);
                    }
                    if (voipCallFooter.A02.getVisibility() == 0) {
                        C28051Sr.A1Q(voipCallFooter.A07, 350);
                    }
                }
                this.A0J.setVisibility(0);
                this.A12.setVisibility(0);
                this.A12.setTranslationY(0.0f);
                ImageButton imageButton = this.A0W;
                if (!z) {
                    i = 4;
                }
                imageButton.setVisibility(i);
            } else {
                Log.i("voip/VoipActivityV2/updateButtonStates/answerCallView/visible RECEIVED_CALL");
                if (!callInfo.isGroupCall || (voipCallControlBottomSheet = this.A11) == null) {
                    A1C(callInfo);
                } else {
                    voipCallControlBottomSheet.A0u(A04(), "CallControlSheet");
                }
            }
        }
    }

    public final void A1F(CallInfo callInfo) {
        AnonymousClass00E.A01();
        if (this.A08 == 0 || this.A07 == 0 || this.A1H || this.A0o.A00 == 1 || callInfo == null || callInfo.callEnding || callInfo.callState == Voip.CallState.NONE || callInfo.self == null) {
            Log.d("voip/VoipActivityV2/updateCallStatusBar skipped");
            return;
        }
        String str = null;
        switch (A0Z(callInfo).ordinal()) {
            case 0:
            case 7:
                return;
            case 1:
                AnonymousClass3U7 r0 = this.A0v;
                if (r0 == null || !r0.A10) {
                    AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
                    boolean z = callInfo.isJoinableGroupCall;
                    int i = R.string.voip_call_outgoing;
                    if (z) {
                        i = R.string.voip_joinable_waiting_for_others;
                    }
                    str = r2.A06(i);
                    break;
                } else {
                    str = ((AnonymousClass2C0) this).A01.A0D(R.string.peer_in_another_call, this.A1X.A08(this.A1V.A0A(callInfo.peerJid), false));
                    break;
                }
                break;
            case 2:
                AnonymousClass3U7 r02 = this.A0v;
                if (r02 == null || !r02.A10) {
                    str = ((AnonymousClass2C0) this).A01.A06(R.string.voip_call_outgoing_peer_ringing);
                    break;
                }
            case 3:
            case 9:
                if (callInfo.isGroupCall) {
                    if (this.A0o.A06.getVisibility() != 0) {
                        boolean z2 = callInfo.videoEnabled;
                        AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
                        if (!z2) {
                            str = r1.A06(R.string.group_voip_call_label);
                            break;
                        } else {
                            str = r1.A06(R.string.group_video_call_label);
                            break;
                        }
                    }
                } else {
                    boolean z3 = callInfo.videoEnabled;
                    AnonymousClass01X r12 = ((AnonymousClass2C0) this).A01;
                    if (!z3) {
                        str = r12.A06(R.string.voip_call_label);
                        break;
                    } else {
                        str = r12.A06(R.string.video_call_label);
                        break;
                    }
                }
                break;
            case 4:
            case 5:
                str = ((AnonymousClass2C0) this).A01.A06(R.string.voip_connecting);
                break;
            case 6:
                if (C002001d.A3P(this.A1U, callInfo)) {
                    str = ((AnonymousClass2C0) this).A01.A06(R.string.voip_joinable_waiting_for_others);
                    break;
                } else if (!callInfo.videoEnabled) {
                    if (callInfo.isCallOnHold()) {
                        str = ((AnonymousClass2C0) this).A01.A06(R.string.voip_on_hold);
                    } else if (!callInfo.isGroupCall) {
                        AnonymousClass0QY defaultPeerInfo = callInfo.getDefaultPeerInfo();
                        if (defaultPeerInfo != null) {
                            str = A0b(defaultPeerInfo, callInfo);
                            if (str == null) {
                                str = A0c(defaultPeerInfo, callInfo, true);
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (!this.A1F) {
                        long j = this.A0A;
                        if (j != 0) {
                            if (SystemClock.uptimeMillis() - j > 3000) {
                                this.A1F = true;
                            } else {
                                str = ((AnonymousClass2C0) this).A01.A06(R.string.voip_android_weak_wifi_network_switch_description);
                            }
                        }
                    }
                    if (str == null) {
                        str = C002001d.A1W(((AnonymousClass2C0) this).A01, callInfo.callDuration / 1000);
                    }
                    if (callInfo.isGroupCall) {
                        CallPictureGrid callPictureGrid = this.A0q;
                        callPictureGrid.setCallInfo(callInfo);
                        AnonymousClass3TY r03 = callPictureGrid.A01;
                        ((AbstractC16300pa) r03).A01.A04(0, r03.A05(), r03.A07);
                        break;
                    }
                } else {
                    A0f();
                    AnonymousClass00E.A08(A08(callInfo), "can be called only for video call");
                    for (AnonymousClass39R r22 : this.A18.values()) {
                        AnonymousClass0QY infoByJid = callInfo.getInfoByJid(r22.A03);
                        r22.A06(infoByJid, callInfo);
                        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A0r;
                        if (maximizedParticipantVideoDialogFragment != null) {
                            maximizedParticipantVideoDialogFragment.A0x(infoByJid, callInfo);
                        }
                    }
                    A1B(callInfo);
                    if (!this.A1F) {
                        long j2 = this.A0A;
                        if (j2 == 0) {
                            return;
                        }
                        if (SystemClock.uptimeMillis() - j2 > 3000) {
                            this.A1F = true;
                            return;
                        } else {
                            A1O(((AnonymousClass2C0) this).A01.A06(R.string.voip_android_weak_wifi_network_switch_description), null, null, false);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 8:
            default:
                AnonymousClass00E.A08(false, "voip/VoipActivityV2/updateCallStatusBar/unknownCallState");
                break;
        }
        this.A0o.A03(str);
        A1B(callInfo);
    }

    public final void A1G(CallInfo callInfo) {
        if (!callInfo.videoEnabled) {
            A1S(true);
        } else if (!this.A1M) {
            C675539b r0 = this.A10;
            if (r0 == null) {
                r0 = new C675539b(this, this);
                this.A10 = r0;
            }
            if (r0.canDetectOrientation()) {
                Log.i("voip/VoipActivityV2/enableOrientationListener");
                this.A10.enable();
                this.A1M = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0248, code lost:
        if (r4 == com.whatsapp.voipcalling.Voip.CallState.ACCEPT_RECEIVED) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x033a, code lost:
        if ((r6.size() + r12.size()) <= 3) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ae, code lost:
        if (r26.isGroupCallEnabled == false) goto L_0x01b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1H(com.whatsapp.voipcalling.CallInfo r26) {
        /*
        // Method dump skipped, instructions count: 1113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1H(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0211, code lost:
        if (r4 > 1) goto L_0x0213;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x037a A[LOOP:13: B:191:0x0374->B:193:0x037a, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1I(com.whatsapp.voipcalling.CallInfo r14) {
        /*
        // Method dump skipped, instructions count: 918
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1I(com.whatsapp.voipcalling.CallInfo):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r2 == 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J(com.whatsapp.voipcalling.CallInfo r7) {
        /*
            r6 = this;
            boolean r1 = A08(r7)
            java.lang.String r0 = "can be called only for video call"
            X.AnonymousClass00E.A08(r1, r0)
            java.util.Map r0 = r6.A18
            java.util.Collection r0 = r0.values()
            java.util.Iterator r5 = r0.iterator()
        L_0x0013:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r4 = r5.next()
            X.39R r4 = (X.AnonymousClass39R) r4
            com.whatsapp.jid.UserJid r0 = r4.A03
            X.0QY r3 = r7.getInfoByJid(r0)
            com.whatsapp.voipcalling.VideoCallParticipantView r1 = r4.A00
            if (r1 == 0) goto L_0x0013
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x0013
            int r2 = r1.A03
            r0 = 2
            if (r2 == r0) goto L_0x0038
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 != 0) goto L_0x0013
            r4.A06(r3, r7)
            goto L_0x0013
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1J(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A1K(CallInfo callInfo, int i) {
        Log.d("VoipActivityV2/callWaitingStateChanged ");
        if (i == 1) {
            this.A1A = false;
        } else if (i == 3) {
            if (callInfo.videoEnabled) {
                A1L(this.A0u, callInfo.self);
            }
        } else if (i == 4) {
            this.A17 = callInfo.callId;
            Voip.startVideoCaptureStream();
            A1H(callInfo);
        }
    }

    public final void A1L(AnonymousClass39R r6, AnonymousClass0QY r7) {
        this.A0E.removeMessages(6);
        CallInfo A0W2 = A0W();
        if (A0W2 != null && this.A1L && this.A1c.A02("android.permission.CAMERA") == 0) {
            StringBuilder A0S2 = AnonymousClass008.A0S("voip/VoipActivityV2/startCameraPreview/setting preview surface to presenter ");
            A0S2.append(r6.A07);
            A0S2.append(" retry: ");
            int i = this.A01;
            this.A01 = i + 1;
            AnonymousClass008.A1L(A0S2, i);
            if (Voip.setVideoPreviewPort(r6.A01, A0W2.callId) == 0) {
                VideoPort videoPort = r6.A01;
                Point point = new Point(0, 0);
                if (videoPort != null) {
                    point = videoPort.getWindowSize();
                }
                Voip.setVideoPreviewSize(point.x, point.y);
                this.A01 = 0;
                r6.A05(r7);
                this.A1n.addCameraErrorListener(this.A14);
            } else if (this.A01 >= 10) {
                AnonymousClass3U7 r2 = this.A0v;
                if (r2 != null) {
                    r2.A0Q(15, null);
                }
            } else {
                this.A0E.sendEmptyMessageDelayed(6, 500);
            }
        }
    }

    public void A1M(Voip.CallState callState, CallInfo callInfo) {
        String A0a2;
        if (callInfo == null) {
            Log.w("voip/VoipActivityV2/callStateChanged info == NULL finishing current activity");
            finish();
        } else if (!A1c(callInfo.callId, "VoipActivityV2/callStateChanged ")) {
            Voip.CallState A0Z2 = A0Z(callInfo);
            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/callStateChanged from ");
            sb.append(callState);
            sb.append(" to ");
            sb.append(A0Z2);
            Log.i(sb.toString());
            if (A0Z2 == Voip.CallState.NONE || A0Z2 == Voip.CallState.ACTIVE_ELSEWHERE) {
                DialogFragment dialogFragment = this.A0i;
                if (dialogFragment != null) {
                    dialogFragment.A0r();
                    this.A0i = null;
                }
                getWindow().clearFlags(128);
                int i = callInfo.callResult;
                String str = this.A16;
                if (str != null) {
                    AnonymousClass008.A1U(AnonymousClass008.A0S("voip/VoipActivityV2/callStateChanged state == NONE showing text: "), str);
                    if (this.A1J) {
                        A0e();
                    } else {
                        if (this.A1Q.A00) {
                            AnonymousClass02M r1 = ((ActivityC004702f) this).A0F;
                            if (r1.A00 != null) {
                                r1.A0G(this.A16, 1);
                            }
                        }
                        AnonymousClass3U7 r12 = this.A0v;
                        if (r12 != null) {
                            String str2 = this.A16;
                            AnonymousClass008.A18("voip/showCallFailedMessage ", str2);
                            Context context = r12.A1A;
                            Intent A062 = A06(context, null, Boolean.valueOf(!r12.A1C.A00), null, Boolean.TRUE, null);
                            A062.putExtra("showCallFailedMessage", str2);
                            context.startActivity(A062);
                        } else {
                            Log.w("can not show call failed message because voice service is null.");
                        }
                    }
                } else if ((callState == Voip.CallState.CALLING || callState == Voip.CallState.REJOINING || callState == Voip.CallState.PRE_ACCEPT_RECEIVED || (callState == Voip.CallState.ACTIVE && i != 1)) && !this.A1D && this.A0v != null) {
                    AnonymousClass008.A0v("voip/VoipActivityV2/callStateChanged state == NONE showing call failed screen, result=", i);
                    if (i == 2 || i == 17 || (i == 4 && callState == Voip.CallState.REJOINING)) {
                        if (callState == Voip.CallState.REJOINING) {
                            A0a2 = ((AnonymousClass2C0) this).A01.A06(R.string.voip_joinable_call_ended_while_joining_title);
                        } else if (i == 17) {
                            A0a2 = ((AnonymousClass2C0) this).A01.A06(R.string.voip_unavailable);
                        } else if (i == 2) {
                            A0a2 = ((AnonymousClass2C0) this).A01.A06(R.string.voip_declined);
                        } else {
                            A0a2 = A0a(callInfo.peerJid, i);
                        }
                        C002001d.A2R(this, this.A1a, A0a2);
                        if (this.A0O.getVisibility() == 0) {
                            A1O(A0a2, null, null, false);
                        } else {
                            this.A0o.A03(A0a2);
                        }
                        ((Vibrator) getSystemService("vibrator")).vibrate(500);
                        this.A0E.removeMessages(9);
                        this.A0E.sendEmptyMessageDelayed(9, 500);
                    } else if (callState != Voip.CallState.REJOINING) {
                        UserJid userJid = callInfo.peerJid;
                        boolean z = callInfo.videoEnabled;
                        if (userJid == null) {
                            Log.i("VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null jid");
                            finish();
                        } else {
                            A0t();
                            String A0a3 = A0a(userJid, i);
                            this.A0o.A03(A0a3);
                            if (A0a3 != null) {
                                C002001d.A2R(this, this.A1a, A0a3);
                            }
                            A0J("CallControlSheet");
                            this.A12.setVisibility(8);
                            this.A0W.setVisibility(8);
                            if (this.A0K == null) {
                                ViewStub viewStub = (ViewStub) findViewById(R.id.call_failed_btns_stub);
                                StringBuilder sb2 = new StringBuilder("voip/VoipActivityV2/showCallFailedScreen found callFailedButtonsStub:");
                                sb2.append(viewStub);
                                Log.i(sb2.toString());
                                this.A0K = viewStub.inflate();
                            }
                            View findViewById = findViewById(R.id.cancel_call_back_btn);
                            ImageView imageView = (ImageView) findViewById(R.id.call_back_btn);
                            View view = this.A0K;
                            if (z) {
                                view.setBackgroundColor(getResources().getColor(R.color.video_call_text_background));
                                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_call_accept_video));
                                this.A0q.setAlpha(1.0f);
                            } else {
                                view.setBackgroundColor(0);
                                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_call_accept_voice));
                                this.A0q.setAlpha(0.54901963f);
                            }
                            Log.i("VoipActivityV2 vm showing call failed screen");
                            View.OnClickListener onClickListener = this.A0F;
                            if (onClickListener == null) {
                                Log.i("VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null call back button click listener");
                                finish();
                            } else {
                                imageView.setOnClickListener(onClickListener);
                                findViewById.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 39));
                                this.A0K.setVisibility(0);
                                C28051Sr.A1Q(imageView, 100);
                                C28051Sr.A1Q(findViewById, 100);
                            }
                        }
                    } else {
                        finish();
                    }
                } else if (callState == Voip.CallState.ACCEPT_SENT && i == 10 && this.A0v.A2B == 26) {
                    A11(7);
                } else if (callState != Voip.CallState.ACCEPT_SENT || !callInfo.isGroupCall || !C002001d.A3L(this.A1U) || callInfo.isEndedByMe || callInfo.callResult != 10) {
                    if (this.A1I) {
                        ((ActivityC004702f) this).A0F.A06(R.string.voip_android_pip_dismissed_for_call_ended, 1);
                    }
                    Log.i("voip/VoipActivityV2/callStateChanged state == NONE finishing current activity");
                    finish();
                } else {
                    A11(8);
                }
                AnonymousClass1YO r13 = callInfo.callWaitingInfo;
                if (r13.A01 == 1) {
                    this.A17 = r13.A04;
                }
                this.A1A = false;
                return;
            }
            switch (callInfo.callState.ordinal()) {
                case 0:
                    setVolumeControlStream(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    setVolumeControlStream(0);
                    break;
                case 3:
                    setVolumeControlStream(2);
                    break;
            }
            A1H(callInfo);
        }
    }

    public void A1N(VoipCallFooter voipCallFooter, UserJid userJid) {
        voipCallFooter.A09.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 26));
        voipCallFooter.A0B.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 35));
        voipCallFooter.A06.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this, userJid, 9));
        voipCallFooter.A0A.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 34));
        voipCallFooter.A05.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 40));
        voipCallFooter.A08.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 28));
        voipCallFooter.A07.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 29));
    }

    public final void A1O(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener, boolean z) {
        Drawable drawable;
        this.A0d.setText(charSequence);
        this.A0O.setVisibility(0);
        TextView textView = this.A0d;
        Drawable drawable2 = null;
        if (z) {
            drawable = this.A0D;
        } else {
            drawable = null;
        }
        textView.setCompoundDrawables(null, drawable, null, null);
        if (charSequence2 == null) {
            View view = this.A0O;
            if (z) {
                drawable2 = this.A0C;
            }
            view.setBackground(drawable2);
            this.A0N.setVisibility(8);
            this.A0c.setVisibility(8);
            return;
        }
        boolean z2 = false;
        if (onClickListener != null) {
            z2 = true;
        }
        AnonymousClass00E.A08(z2, "buttonOnClickListener must be set together with buttonText");
        this.A0O.setBackground(this.A0B);
        this.A0N.setVisibility(0);
        this.A0c.setVisibility(0);
        this.A0c.setText(charSequence2);
        this.A0c.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this, onClickListener, 10));
    }

    public final void A1P(String str) {
        this.A0E.removeMessages(7);
        this.A0E.removeMessages(8);
        DialogFragment dialogFragment = this.A0h;
        if (dialogFragment != null && dialogFragment.A0U()) {
            dialogFragment.A0r();
            this.A0h = null;
        }
        NonActivityDismissDialogFragment nonActivityDismissDialogFragment = new NonActivityDismissDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("text", str);
        bundle.putBoolean("dismiss", true);
        nonActivityDismissDialogFragment.A0N(bundle);
        this.A0h = nonActivityDismissDialogFragment;
        this.A0E.sendEmptyMessage(8);
        this.A0E.sendEmptyMessageDelayed(7, 6000);
    }

    public final void A1Q(String str, int i) {
        if (C002001d.A3M(this.A1U)) {
            Toast A012 = ((ActivityC004702f) this).A0F.A01(str, i);
            A012.setGravity(17, 0, 0);
            A012.show();
            return;
        }
        int[] iArr = new int[2];
        findViewById(R.id.call_btns).getLocationOnScreen(iArr);
        int height = getWindow().getDecorView().getHeight() - iArr[1];
        Toast A013 = ((ActivityC004702f) this).A0F.A01(str, i);
        A013.setGravity(80, 0, height);
        A013.show();
    }

    public void A1R(boolean z) {
        AnonymousClass00E.A01();
        Window window = getWindow();
        View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            Log.i("voip/voipactivity/ear-near. changing visibility of the window.");
            if (childAt.getVisibility() == 0) {
                attributes.flags |= 1024;
                attributes.screenBrightness = 0.1f;
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                childAt.setVisibility(4);
                window.setAttributes(attributes);
            }
            this.A0E.removeMessages(2);
            this.A0E.sendEmptyMessageDelayed(2, 3000);
            return;
        }
        Log.i("voip/voipactivity/ear-far. changing visibility of the window.");
        if (childAt.getVisibility() == 4) {
            attributes.flags &= -1025;
            attributes.screenBrightness = -1.0f;
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -3);
            childAt.setVisibility(0);
            window.setAttributes(attributes);
        }
        this.A0E.removeMessages(2);
        CallInfo A0W2 = A0W();
        if (!C002001d.A3M(this.A1U) && this.A0v != null && A0W2 != null && A0W2.bytesReceived == 0) {
            Voip.CallState callState = A0W2.callState;
            if (callState == Voip.CallState.ACTIVE || callState == Voip.CallState.ACCEPT_SENT || callState == Voip.CallState.ACCEPT_RECEIVED) {
                A1Q(((AnonymousClass2C0) this).A01.A06(R.string.voip_connecting), 1);
            }
        }
    }

    public final void A1S(boolean z) {
        if (this.A1M && this.A10 != null) {
            Log.i("voip/VoipActivityV2/disableOrientationListener");
            this.A10.disable();
            this.A1M = false;
            if (z) {
                A10(0);
            }
        }
        this.A0V = this.A1a.A0G();
    }

    public final void A1T(boolean z) {
        Dialog dialog;
        Window window = getWindow();
        if (z) {
            window.addFlags(524288);
        } else {
            window.clearFlags(524288);
        }
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
        if (voipCallControlBottomSheet != null && (dialog = ((DialogFragment) voipCallControlBottomSheet).A03) != null && dialog.getWindow() != null) {
            if (z) {
                ((DialogFragment) voipCallControlBottomSheet).A03.getWindow().addFlags(524288);
            } else {
                ((DialogFragment) voipCallControlBottomSheet).A03.getWindow().clearFlags(524288);
            }
        }
    }

    public final void A1U(boolean z) {
        CallInfo A0W2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0S.getLayoutParams();
        if (this.A11 != null && (A0W2 = A0W()) != null && A0W2.callState != Voip.CallState.ACTIVE && !this.A1A) {
            this.A0S.setVisibility(8);
        } else if (z) {
            layoutParams.height = (int) getResources().getDimension(R.dimen.call_video_top_bar_height);
            this.A0S.setLayoutParams(layoutParams);
            View view = this.A0S;
            view.setPadding(view.getPaddingLeft(), this.A06, this.A0S.getPaddingRight(), this.A0S.getPaddingBottom());
            this.A0S.setBackgroundResource(R.drawable.video_call_header_background);
            this.A0Y.setImageResource(R.drawable.call_minimize_shadow);
            this.A0X.setImageResource(R.drawable.call_add_participant_shadow);
            this.A0Z.setImageResource(R.drawable.ic_voip_e2ee_padlock_shadow);
            this.A0Z.setImageAlpha(255);
            this.A0f.setTextColor(C004302a.A00(this, R.color.white_alpha_80));
            this.A0f.setShadowLayer(10.0f, 0.0f, 0.0f, C004302a.A00(this, R.color.black_alpha_50));
        } else {
            layoutParams.height = (int) getResources().getDimension(R.dimen.call_voice_top_bar_height);
            this.A0S.setLayoutParams(layoutParams);
            View view2 = this.A0S;
            view2.setPadding(view2.getPaddingLeft(), 0, this.A0S.getPaddingRight(), this.A0S.getPaddingBottom());
            this.A0Z.setImageResource(R.drawable.ic_voip_e2ee_padlock_flat);
            this.A0Z.setImageAlpha(153);
            this.A0f.setTextColor(C004302a.A00(this, R.color.white_alpha_60));
            this.A0f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.A0Y.setImageResource(R.drawable.call_minimize_flat);
            this.A0X.setImageResource(R.drawable.call_add_participant_flat);
            this.A0S.setVisibility(0);
        }
    }

    public final boolean A1V() {
        if (Build.VERSION.SDK_INT < 26 || !this.A1a.A0H.A00.getPackageManager().hasSystemFeature("android.software.picture_in_picture") || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        try {
            if (((AppOpsManager) getSystemService("appops")).checkOp("android:picture_in_picture", Process.myUid(), getPackageName()) == 0) {
                return true;
            }
            return false;
        } catch (SecurityException e) {
            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/isPictureInPictureAllowed");
            sb.append(e);
            Log.w(sb.toString());
            return false;
        }
    }

    public final boolean A1W() {
        Boolean bool = this.A15;
        if (bool == null) {
            bool = Voip.A00("options.android_enable_pip_for_group_call");
            this.A15 = bool;
        }
        return bool != null && bool.booleanValue();
    }

    public boolean A1X(View.OnClickListener onClickListener, View view) {
        Drawable drawable;
        AnonymousClass39R r1;
        Log.i("voip/VoipActivityV2/videoParticipantView/onLongClick");
        if (!(view instanceof VideoCallParticipantView)) {
            AnonymousClass00E.A08(false, "long click on non VideoCallParticipantView");
            return false;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        VideoCallParticipantView videoCallParticipantView = (VideoCallParticipantView) view;
        UserJid userJid = videoCallParticipantView.A0N;
        CallInfo A0W2 = A0W();
        boolean z = true;
        if (userJid != null) {
            if (A0W2 != null && videoCallParticipantView.A09()) {
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A0r;
                if (maximizedParticipantVideoDialogFragment != null) {
                    maximizedParticipantVideoDialogFragment.A0y(true);
                }
                AnonymousClass38Q r11 = new AnonymousClass38Q(this, userJid);
                int i = 2;
                int[] iArr = new int[2];
                videoCallParticipantView.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int width = videoCallParticipantView.getWidth();
                int height = videoCallParticipantView.getHeight();
                if (C677039w.A00 || Build.VERSION.SDK_INT < 21) {
                    drawable = new ColorDrawable(-16777216);
                } else {
                    VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0t;
                    if (!(videoCallParticipantViewLayout.A08 != null && videoCallParticipantViewLayout.getWidth() == videoCallParticipantViewLayout.A08.getWidth() && videoCallParticipantViewLayout.getHeight() == videoCallParticipantViewLayout.A08.getHeight())) {
                        videoCallParticipantViewLayout.A08 = Bitmap.createBitmap(videoCallParticipantViewLayout.getWidth(), videoCallParticipantViewLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    }
                    videoCallParticipantViewLayout.draw(new Canvas(videoCallParticipantViewLayout.A08));
                    Bitmap bitmap = videoCallParticipantViewLayout.A08;
                    Canvas canvas = new Canvas(bitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(new LightingColorFilter(-10066330, 0));
                    for (AnonymousClass39R r0 : this.A18.values()) {
                        Bitmap A002 = r0.A00();
                        if (!(A002 == null || r0.A00 == null)) {
                            int[] iArr2 = new int[i];
                            int[] iArr3 = new int[i];
                            this.A0t.getLocationOnScreen(iArr3);
                            VideoCallParticipantView videoCallParticipantView2 = r0.A00;
                            videoCallParticipantView2.getLocationOnScreen(iArr2);
                            iArr2[0] = iArr2[0] - iArr3[0];
                            int i4 = iArr2[1] - iArr3[1];
                            iArr2[1] = i4;
                            int i5 = iArr2[0];
                            canvas.drawBitmap(A002, (Rect) null, new Rect(i5, i4, videoCallParticipantView2.getWidth() + i5, videoCallParticipantView2.getHeight() + iArr2[1]), paint);
                            A002.recycle();
                            i = 2;
                        }
                    }
                    FilterUtils.blurNative(bitmap, getResources().getDimensionPixelSize(R.dimen.maximized_video_call_background_blur_radius), i);
                    drawable = new BitmapDrawable(getResources(), bitmap);
                }
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment2 = new MaximizedParticipantVideoDialogFragment(i2, i3, width, height, drawable, r11, onClickListener, new RunnableEBaseShape4S0100000_I0_4(this, 44));
                this.A0r = maximizedParticipantVideoDialogFragment2;
                if (userJid != this.A0u.A03) {
                    r1 = new AnonymousClass3UM(this, maximizedParticipantVideoDialogFragment2, userJid);
                } else {
                    r1 = new AnonymousClass3UN(this, "max_preview", maximizedParticipantVideoDialogFragment2, userJid);
                }
                maximizedParticipantVideoDialogFragment2.A09 = r1;
                if (this.A1O) {
                    this.A1O = false;
                    A0k();
                    A13(300, 250, A0W2);
                    VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
                    if (voipCallControlBottomSheet == null) {
                        return true;
                    }
                    voipCallControlBottomSheet.A0y();
                    return true;
                }
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment3 = this.A0r;
                if (maximizedParticipantVideoDialogFragment3.A0U()) {
                    return true;
                }
                maximizedParticipantVideoDialogFragment3.A0u(A04(), "maximized_video");
                return true;
            }
        } else if (A0W2 != null) {
            z = false;
        }
        AnonymousClass00E.A08(z, "null jid or callinfo on long clicked VideoCallParticipantView");
        return false;
    }

    public final boolean A1Y(UserJid userJid) {
        Object obj;
        CallInfo A0W2 = A0W();
        StringBuilder A0S2 = AnonymousClass008.A0S("voip/VoipActivityV2/shouldShowBatteryLowNotif: batteryState: voiceService: ");
        A0S2.append(this.A0v);
        A0S2.append(" callInfo: ");
        A0S2.append(A0W2);
        A0S2.append(" callState = ");
        if (A0W2 != null) {
            obj = A0W2.callState;
        } else {
            obj = "";
        }
        A0S2.append(obj);
        A0S2.append(" jid: ");
        A0S2.append(userJid);
        Log.d(A0S2.toString());
        if (this.A0v == null || A0W2 == null || A0W2.callState == Voip.CallState.NONE || !this.A1J) {
            return false;
        }
        if (userJid == null || A0W2.participants.containsKey(userJid)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.A02("android.permission.CAMERA") == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1Z(com.whatsapp.jid.UserJid r9, boolean r10, int r11) {
        /*
            r8 = this;
            r8.A0h()
            X.03S r1 = r8.A1c
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = r1.A02(r0)
            r6 = 1
            r5 = 0
            r7 = 0
            if (r0 == 0) goto L_0x0011
            r7 = 1
        L_0x0011:
            if (r10 == 0) goto L_0x001c
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r1.A02(r0)
            r4 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001c:
            r4 = 0
            if (r7 != 0) goto L_0x0020
            return r6
        L_0x0020:
            com.whatsapp.voipcalling.PermissionDialogFragment r3 = new com.whatsapp.voipcalling.PermissionDialogFragment
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r9.getRawString()
            java.lang.String r0 = "jid"
            r2.putString(r0, r1)
            java.lang.String r0 = "microphone"
            r2.putBoolean(r0, r7)
            java.lang.String r0 = "camera"
            r2.putBoolean(r0, r4)
            java.lang.String r0 = "request_code"
            r2.putInt(r0, r11)
            r3.A0N(r2)
            X.0LW r0 = r8.A04()
            if (r0 == 0) goto L_0x0059
            X.0QB r1 = new X.0QB
            r1.<init>(r0)
            java.lang.String r0 = "permission_request"
            r1.A0A(r5, r3, r0, r6)
            r1.A04()
            return r5
        L_0x0059:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1Z(com.whatsapp.jid.UserJid, boolean, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1a(com.whatsapp.voipcalling.CallInfo r5) {
        /*
            r4 = this;
            boolean r0 = r4.A1L
            r3 = 0
            if (r0 == 0) goto L_0x0033
            if (r5 == 0) goto L_0x0033
            com.whatsapp.voipcalling.Voip$CallState r1 = r5.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.ACTIVE
            if (r1 != r0) goto L_0x0033
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x0033
            java.util.Map r0 = r5.participants
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()
            X.0QY r1 = (X.AnonymousClass0QY) r1
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x001b
        L_0x0031:
            r0 = 1
            return r0
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1a(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (r4 != null) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1b(com.whatsapp.voipcalling.CallInfo r7) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1b(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    public final boolean A1c(String str, String str2) {
        String str3 = this.A17;
        if (str.equals(str3)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" Ignoring update because callId = ");
        sb.append(str);
        sb.append(" callIdToShow = ");
        AnonymousClass008.A1S(sb, str3);
        return true;
    }

    @Override // X.AnonymousClass0Wn
    public AnonymousClass3UH A56() {
        AnonymousClass3UH r0 = this.A0x;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3UH r02 = new AnonymousClass3UH(this);
        this.A0x = r02;
        return r02;
    }

    @Override // X.AnonymousClass0Wl
    public C58822mb A6j() {
        C58822mb r0 = this.A0m;
        if (r0 != null) {
            return r0;
        }
        C75083cB r02 = new C75083cB(this, this);
        this.A0m = r02;
        return r02;
    }

    @Override // X.AbstractC07220Wk
    public void AIR(int i) {
        A0h();
        AnonymousClass3U7 r4 = this.A0v;
        if (r4 != null) {
            if (i == 0) {
                r4.A0P(24, null);
            } else if (i == 1) {
            } else {
                if (i != 2) {
                    AnonymousClass00E.A08(false, "Unknown request code");
                } else {
                    r4.A0o.execute(new RunnableEBaseShape0S0001000_I1(0, 2));
                }
            }
        }
    }

    @Override // X.AbstractC07220Wk
    public void AIS(int i, String[] strArr) {
        boolean z;
        A0h();
        CallInfo A0W2 = A0W();
        if (Voip.A08(A0W2) && this.A0v != null) {
            boolean z2 = false;
            if (A0W2 != null) {
                z2 = true;
            }
            AnonymousClass00E.A08(z2, "Call Info should not be null");
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    z = false;
                    break;
                } else if ("android.permission.CAMERA".equals(strArr[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (i == 0) {
                if (A0W2.videoEnabled && z) {
                    Voip.refreshVideoDevice();
                    A1L(this.A0u, A0W2.self);
                }
                if (Voip.A0B(A0W2.callState)) {
                    Log.d("voip/VoipActivityV2/onPermissionsGranted starting call");
                    this.A0v.A0g(this.A17, 1);
                }
            } else if (i == 1) {
                Log.i("voip/VoipActivityV2/onPermissionsGranted switching to video call");
                this.A0v.A0E();
            } else if (i != 2) {
                AnonymousClass00E.A08(false, "Unknown request code");
            } else if (A0W2.isPeerRequestingUpgrade()) {
                Log.d("voip/VoipActivityV2/onRequestPermissionsResult granted, accept video upgrade");
                Voip.refreshVideoDevice();
                A1L(this.A0u, A0W2.self);
                AnonymousClass3U7 r2 = this.A0v;
                r2.A0O();
                r2.A22.setRequestedCamera2SupportLevel(r2.A21.A03());
                r2.A0o.execute(AnonymousClass37Z.A00);
            } else {
                Log.d("voip/VoipActivityV2/onRequestPermissionsResult granted, but the upgrade request was already cancelled");
            }
        }
    }

    @Override // X.AbstractC07230Wm
    public void AK0(AnonymousClass3U7 r6) {
        Log.i("voip/VoipActivityV2/onServiceConnected");
        this.A0v = r6;
        r6.A0W = this;
        r6.A12 = false;
        CallInfo A0W2 = A0W();
        A1M(Voip.CallState.NONE, A0W2);
        AnonymousClass3U7 r3 = this.A0v;
        Log.i("voip/restoreProximitySensor");
        if (r3.A0t) {
            r3.A0t = false;
            r3.A0J.removeMessages(14);
            r3.A0J.sendEmptyMessage(14);
        }
        AnonymousClass3U7 r1 = this.A0v;
        if (r1.A0u) {
            r1.A0J();
        } else {
            r1.A0I();
        }
        if (this.A19 && getIntent() != null && A0W2 != null && Voip.A0B(A0W2.callState)) {
            A0y(getIntent().getIntExtra("call_ui_action", 0));
            this.A19 = false;
        }
    }

    @Override // X.ActivityC004702f
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A1B && Build.VERSION.SDK_INT >= 21) {
            return super.dispatchTouchEvent(motionEvent);
        }
        AnonymousClass3U7 r2 = this.A0v;
        if (r2 != null) {
            boolean z = true;
            if (r2.A1z.A00 != 1) {
                z = false;
            }
            if (!z && r2.A0u) {
                Log.i("voip/VoipActivityV2/dispatchTouchEvent Touch event ignored");
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void hideView(View view) {
        view.clearAnimation();
        view.setVisibility(4);
    }

    public /* synthetic */ void lambda$onCreate$2770$VoipActivityV2(View view) {
        CallInfo A0W2 = A0W();
        if (A0W2 != null) {
            int i = A0W2.self.A04;
            boolean z = false;
            if (i == 3) {
                z = true;
            }
            if (z && this.A0v != null) {
                Log.i("voip/VoipActivityV2/centerScreenCallStatusButton/cancelSwitchToVideoCallListener");
                this.A0v.A0o.execute(new RunnableEBaseShape0S0001000_I1(0, 0));
            }
        }
    }

    public void lambda$onCreate$2771$VoipActivityV2(View view) {
        if (this.A0v != null) {
            Log.i("voip/VoipActivityV2/centerScreenCallStatusButton/resumeWhatsAppCallListener");
            AnonymousClass3U7 r3 = this.A0v;
            String currentCallId = Voip.getCurrentCallId();
            boolean z = false;
            if (r3.A09(currentCallId) != null) {
                z = true;
            }
            AnonymousClass00E.A08(z, "must be called for self managed connection");
            AnonymousClass39G A092 = r3.A09(currentCallId);
            if (A092 != null && A092.getState() == 5) {
                A092.onUnhold();
            }
        }
    }

    public /* synthetic */ void lambda$onCreate$2774$VoipActivityV2(View view) {
        APm(new E2EEInfoDialogFragment());
    }

    public void lambda$onCreate$2775$VoipActivityV2(View view) {
        Log.i("voip end call button pressed");
        Voip.CallState currentCallState = Voip.getCurrentCallState();
        if (currentCallState == Voip.CallState.NONE) {
            Log.e("voip end call button pressed in NONE state");
            finish();
        } else if (Voip.A0B(currentCallState)) {
            A0z(2);
        } else {
            Log.i("voip/VoipActivityV2/call/end");
            AnonymousClass3U7 r2 = this.A0v;
            if (r2 != null) {
                r2.A0Q(1, null);
            }
            this.A1D = true;
        }
    }

    public /* synthetic */ void lambda$onCreate$2776$VoipActivityV2(View view) {
        if (!A1V() || !A1b(A0W())) {
            finish();
        }
        if (getIntent().getBooleanExtra("isTaskRoot", true)) {
            startActivity(new Intent(this, HomeActivity.class));
        }
    }

    public /* synthetic */ void lambda$onCreate$2779$VoipActivityV2(View view) {
        A0l();
    }

    public /* synthetic */ void lambda$onCreate$2781$VoipActivityV2(View view) {
        A0s();
    }

    public void lambda$onCreate$2782$VoipActivityV2(View view) {
        Log.i("voip/VoipActivityV2/videoPipParticipantView/onClick");
        if (!Build.DEVICE.equalsIgnoreCase("j7elte")) {
            CallInfo A0W2 = A0W();
            if (!A08(A0W2)) {
                Log.i("voip/VoipActivityV2/switchVideoSurface. ignore switch when it's not a video call");
                return;
            }
            if (this.A18.size() == 2) {
                boolean z = true;
                if (this.A0s.getLayoutMode() == 1) {
                    boolean z2 = false;
                    if (this.A18.size() == 2) {
                        z2 = true;
                    }
                    AnonymousClass00E.A08(z2, "This function can only be called when there are exactly two participants");
                    Iterator it = this.A18.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            AnonymousClass00E.A08(false, "Can not be here");
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() != this.A0u) {
                            AnonymousClass39R r4 = (AnonymousClass39R) entry.getValue();
                            if (r4 != null) {
                                VideoCallParticipantView videoCallParticipantView = this.A0u.A00;
                                if (videoCallParticipantView != null) {
                                    VideoCallParticipantView videoCallParticipantView2 = r4.A00;
                                    if (videoCallParticipantView2 != null) {
                                        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/switchVideoSurface. show preview on full screen = ");
                                        if (videoCallParticipantView2.getLayoutMode() != 0) {
                                            z = false;
                                        }
                                        sb.append(z);
                                        Log.i(sb.toString());
                                        r4.A03();
                                        this.A0u.A03();
                                        this.A0u.A07(videoCallParticipantView2);
                                        r4.A07(videoCallParticipantView);
                                        A1D(A0W2);
                                        return;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                        }
                    }
                    throw null;
                }
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("voip/VoipActivityV2/switchVideoSurface. switch is allowed only for two participants, # of participants = ");
            A0S2.append(this.A18.size());
            Log.w(A0S2.toString());
        }
    }

    public void lambda$onCreate$2783$VoipActivityV2(View view) {
        Log.i("voip/VoipActivityV2/VideoCallParticipantView/cancelButton/onClick");
        if (view.getTag() != null) {
            Object tag = view.getTag();
            AnonymousClass3U7 r0 = this.A0v;
            if (r0 != null) {
                r0.A0o.execute(new RunnableEBaseShape4S0100000_I0_4(tag, 43));
            }
        }
    }

    public /* synthetic */ void lambda$openCallInfoFragment$2801$VoipActivityV2(View view) {
        A0l();
    }

    public /* synthetic */ void lambda$setupCallFooter$2788$VoipActivityV2(View view) {
        VoipCallFooter voipCallFooter;
        AnonymousClass0QY r0;
        if (this.A0v != null) {
            CallInfo callInfo = Voip.getCallInfo();
            if (!(callInfo == null || (r0 = callInfo.self) == null)) {
                Voip.muteCall(!r0.A0B);
            }
            CallInfo A0W2 = A0W();
            if (A0W2 != null && A0W2.self != null) {
                C675939f r02 = this.A0v.A1z;
                int i = r02.A00;
                boolean A062 = r02.A06();
                AnonymousClass00E.A01();
                VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
                if (voipCallControlBottomSheet == null || (voipCallFooter = voipCallControlBottomSheet.A0F) == null) {
                    this.A12.A03(A0W2, i, A062);
                } else {
                    voipCallFooter.A03(A0W2, i, A062);
                }
            } else {
                return;
            }
        }
        A0n();
    }

    public void lambda$setupCallFooter$2789$VoipActivityV2(View view) {
        this.A1P = false;
        CallInfo A0W2 = A0W();
        if (A0W2 != null && A0W2.callState == Voip.CallState.ACTIVE && !A0W2.callEnding && this.A0v != null) {
            Log.i("voip/VoipActivityV2/toggleVideoBtn/clicked");
            AnonymousClass0QY r1 = A0W2.self;
            AnonymousClass0QY defaultPeerInfo = A0W2.getDefaultPeerInfo();
            if (defaultPeerInfo != null && !defaultPeerInfo.A07) {
                String A042 = this.A1X.A04(this.A1V.A0A(defaultPeerInfo.A06));
                if (defaultPeerInfo.A08) {
                    A1Q(((AnonymousClass2C0) this).A01.A0D(R.string.voip_not_enable_switch_voice_and_video_call, A042), 0);
                    return;
                }
                A1Q(((AnonymousClass2C0) this).A01.A0D(R.string.voip_not_support_switch_voice_and_video_call, A042), 0);
            } else if (r1.A00()) {
                view.setSelected(false);
                A1L(this.A0u, r1);
                this.A0v.A0o.execute(AnonymousClass37Y.A00);
            } else {
                int i = r1.A04;
                if (i == 0) {
                    if (A0W2.isGroupCall) {
                        A1Q(((AnonymousClass2C0) this).A01.A06(R.string.voip_not_support_switch_voice_and_video_call_in_group_call), 0);
                        return;
                    }
                    UserJid userJid = A0W2.peerJid;
                    if (((ActivityC004702f) this).A0J.A00.getInt("switch_to_video_call_confirmation_dialog_count", 0) < 5) {
                        APm(new SwitchConfirmationFragment());
                    } else if (A1Z(userJid, true, 1)) {
                        AnonymousClass3U7 r0 = this.A0v;
                        if (r0 != null) {
                            r0.A0E();
                            return;
                        }
                        throw null;
                    }
                } else if (i == 1) {
                    this.A0v.A0o.execute(RunnableC670537a.A00);
                    view.setSelected(true);
                } else {
                    boolean z = false;
                    if (r1.A04 == 3) {
                        z = true;
                    }
                    if (z) {
                        this.A0v.A0o.execute(new RunnableEBaseShape0S0001000_I1(0, 0));
                    }
                }
            }
        }
    }

    public /* synthetic */ void lambda$setupCallFooter$2791$VoipActivityV2(View view) {
        CallInfo A0W2 = A0W();
        if (A0W2 != null && A0W2.callState != Voip.CallState.NONE) {
            if (A0W2.videoEnabled) {
                AnonymousClass0QY r2 = A0W2.self;
                if (!r2.A00()) {
                    this.A01 = 0;
                    this.A0E.removeMessages(3);
                    Voip.switchCamera();
                    A1L(this.A0u, r2);
                }
            } else {
                AnonymousClass3U7 r0 = this.A0v;
                if (r0 != null) {
                    C675939f r5 = r0.A1z;
                    boolean z = true;
                    if (r5.A00 == 1) {
                        z = false;
                    }
                    CallInfo callInfo = Voip.getCallInfo();
                    if (z && r5.A00 == 3 && !r5.A07) {
                        r5.A04(false, callInfo);
                    }
                    r5.A05(z, callInfo);
                }
            }
            A0n();
        }
    }

    public /* synthetic */ void lambda$setupCallFooter$2792$VoipActivityV2(View view) {
        AnonymousClass3U7 r0 = this.A0v;
        if (r0 != null) {
            C675939f r4 = r0.A1z;
            boolean z = false;
            if (r4.A00 == 3) {
                z = true;
            }
            r4.A04(!z, Voip.getCallInfo());
        }
        A0n();
    }

    public /* synthetic */ void lambda$setupCallFooter$2793$VoipActivityV2(View view) {
        A0m();
    }

    public /* synthetic */ void lambda$setupCallFooter$2794$VoipActivityV2(View view) {
        this.A0W.callOnClick();
    }

    public /* synthetic */ void lambda$showCallFailedScreen$2803$VoipActivityV2(View view) {
        Log.i("VoipActivityV2 vm cancel onClick");
        finish();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A0n;
        if (contactPickerFragment != null) {
            if (!contactPickerFragment.A1D()) {
                A0g();
            }
        } else if (this.A0p != null) {
            if (1 == 0) {
                Log.e(new AssertionError("call info fragment should not be null"));
            }
            A16(this.A0p, this.A0T, new RunnableEBaseShape4S0100000_I0_4(this, 46));
        } else if (!A1V() || !A1b(A0W())) {
            super.onBackPressed();
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0GE, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass01X r8 = ((AnonymousClass2C0) this).A01;
        setTitle(r8.A06(R.string.voip_activity_label));
        Iterator it = this.A1g.A00.iterator();
        while (it.hasNext()) {
            ((AbstractC673938k) it.next()).A4G();
        }
        this.A17 = getIntent().getStringExtra("call_id");
        CallInfo A0W2 = A0W();
        if (this.A17 == null && A0W2 != null) {
            this.A17 = A0W2.callId;
        }
        boolean z = true;
        if (A0W2 != null && A0W2.callState != Voip.CallState.NONE) {
            UserJid userJid = A0W2.peerJid;
            ((ActivityC004602e) this).A02 = false;
            A1T(true);
            getWindow().addFlags(2097152);
            if (Build.VERSION.SDK_INT >= 27) {
                setTurnScreenOn(true);
            }
            setContentView(getLayoutInflater().inflate(R.layout.voip_activity_v2, (ViewGroup) null));
            this.A0M = findViewById(R.id.call_screen_root);
            this.A0L = findViewById(R.id.call_screen);
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024);
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = getResources().getDimensionPixelSize(identifier);
            } else {
                i = 25;
            }
            this.A06 = i;
            View decorView2 = getWindow().getDecorView();
            Rect rect = new Rect();
            decorView2.getWindowVisibleDisplayFrame(rect);
            this.A04 = rect.height();
            this.A05 = rect.width();
            AnonymousClass0QA r4 = A04().A0Q;
            this.A0n = (ContactPickerFragment) r4.A01("ContactPickerFragment");
            this.A0U = (ViewGroup) findViewById(R.id.contact_picker_fragment);
            this.A0p = (CallInfoFragment) r4.A01("CallInfoFragment");
            this.A0T = (ViewGroup) findViewById(R.id.call_info_fragment);
            SharedPreferences sharedPreferences = this.A1m.A00;
            this.A1B = sharedPreferences.getBoolean("enable_touch_near_ear_fix", true);
            View findViewById = findViewById(R.id.center_screen_call_status_layout);
            this.A0O = findViewById;
            this.A0d = (TextView) findViewById.findViewById(R.id.center_screen_call_status_text);
            this.A0N = this.A0O.findViewById(R.id.center_screen_call_status_divider);
            TextView textView = (TextView) this.A0O.findViewById(R.id.center_screen_call_status_button);
            this.A0c = textView;
            C002301g.A03(textView);
            this.A0B = C004302a.A03(this, R.drawable.video_call_status_background);
            this.A0G = new ViewOnClickEBaseShape1S0100000_I0_1(this, 37);
            this.A0H = new ViewOnClickEBaseShape1S0100000_I0_1(this, 27);
            this.A0o = (CallDetailsLayout) findViewById(R.id.call_details);
            this.A0Q = findViewById(R.id.call_picture_grid_layout);
            this.A0l = new AnonymousClass0YX(this.A1Z, this.A05, 0.0f);
            CallPictureGrid callPictureGrid = (CallPictureGrid) findViewById(R.id.call_picture_grid);
            this.A0q = callPictureGrid;
            callPictureGrid.setParticipantStatusStringProvider(this);
            callPictureGrid.setPhotoLoader(this.A0l);
            callPictureGrid.A00 = this.A1Y;
            callPictureGrid.A02 = new AnonymousClass3TJ(this);
            View findViewById2 = findViewById(R.id.debug_btn);
            this.A0y = EnumC675439a.Gone;
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 31));
            A0v();
            View findViewById3 = findViewById(R.id.debug_views);
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            this.A0S = findViewById(R.id.top_bar_layout);
            TextView textView2 = (TextView) findViewById(R.id.e2ee_label);
            this.A0f = textView2;
            textView2.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 36));
            this.A0Z = (ImageView) findViewById(R.id.e2ee_padlock);
            this.A0P = findViewById(R.id.e2ee_container);
            this.A0J = findViewById(R.id.call_btns);
            ImageButton imageButton = (ImageButton) findViewById(R.id.end_call_btn);
            this.A0W = imageButton;
            if (A08(A0W2)) {
                imageButton.setContentDescription(r8.A06(R.string.video_call_end_button_description));
            }
            this.A0W.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 42));
            this.A0Y = (ImageButton) findViewById(R.id.top_minimize_btn);
            this.A0X = (ImageButton) findViewById(R.id.top_add_participant_btn);
            ViewOnClickEBaseShape1S0100000_I0_1 viewOnClickEBaseShape1S0100000_I0_1 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 32);
            VoipCallFooter voipCallFooter = (VoipCallFooter) findViewById(R.id.footer);
            this.A12 = voipCallFooter;
            A1N(voipCallFooter, userJid);
            VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
            if (voipCallControlBottomSheet != null && voipCallControlBottomSheet.A0U()) {
                voipCallControlBottomSheet.A0w(false, false);
            }
            A0o();
            if (this.A11 != null) {
                VoipCallNewParticipantBanner voipCallNewParticipantBanner = (VoipCallNewParticipantBanner) AnonymousClass0Q7.A0D(this.A0M, R.id.call_new_participant_banner);
                this.A13 = voipCallNewParticipantBanner;
                voipCallNewParticipantBanner.A05 = new AnonymousClass3TH(this);
                voipCallNewParticipantBanner.setOnBannerClickListener(new AnonymousClass3TE(this));
            }
            this.A0Y.setOnClickListener(viewOnClickEBaseShape1S0100000_I0_1);
            this.A0X.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 30));
            AnonymousClass38D r12 = new AnonymousClass38D(this);
            ViewOnClickEBaseShape1S0100000_I0_1 viewOnClickEBaseShape1S0100000_I0_12 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 33);
            ViewOnClickEBaseShape1S0100000_I0_1 viewOnClickEBaseShape1S0100000_I0_13 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 25);
            ViewOnClickEBaseShape1S0100000_I0_1 viewOnClickEBaseShape1S0100000_I0_14 = new ViewOnClickEBaseShape1S0100000_I0_1(this, 38);
            AnonymousClass38G r42 = new AnonymousClass38G(this, viewOnClickEBaseShape1S0100000_I0_14);
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = (VideoCallParticipantViewLayout) findViewById(R.id.video_participant_views);
            this.A0t = videoCallParticipantViewLayout;
            this.A0s = videoCallParticipantViewLayout.A0N;
            int i2 = this.A05;
            int i3 = this.A04;
            videoCallParticipantViewLayout.A06 = i2;
            videoCallParticipantViewLayout.A05 = i3;
            AnonymousClass3UE r6 = new AnonymousClass3UE(this);
            if (this.A1U.A0D(AbstractC000400g.A17)) {
                this.A0t.setCommonViewListeners(r12, viewOnClickEBaseShape1S0100000_I0_12, viewOnClickEBaseShape1S0100000_I0_14, r42);
                if (this.A11 != null) {
                    this.A0t.setCommonViewListeners(r12, null, viewOnClickEBaseShape1S0100000_I0_14, r42);
                }
            } else {
                this.A0t.setCommonViewListeners(null, viewOnClickEBaseShape1S0100000_I0_12, viewOnClickEBaseShape1S0100000_I0_14, null);
            }
            VideoCallParticipantViewLayout videoCallParticipantViewLayout2 = this.A0t;
            videoCallParticipantViewLayout2.A0F = r6;
            videoCallParticipantViewLayout2.A0E = new AnonymousClass39P(videoCallParticipantViewLayout2);
            videoCallParticipantViewLayout2.A0B = viewOnClickEBaseShape1S0100000_I0_13;
            videoCallParticipantViewLayout2.A08(videoCallParticipantViewLayout2.A0N);
            boolean A0M2 = r8.A0M();
            int i4 = sharedPreferences.getInt("video_call_pip_position", -1);
            if (i4 >= 0) {
                A0M2 = false;
                if ((i4 & 1) == 0) {
                    A0M2 = true;
                }
                if ((i4 & 2) != 0) {
                    z = false;
                }
            }
            VideoCallParticipantViewLayout videoCallParticipantViewLayout3 = this.A0t;
            if (!(A0M2 == videoCallParticipantViewLayout3.A0J && z == videoCallParticipantViewLayout3.A0I)) {
                videoCallParticipantViewLayout3.A0J = A0M2;
                videoCallParticipantViewLayout3.A0I = z;
            }
            AnonymousClass01I r0 = this.A1S;
            r0.A04();
            UserJid userJid2 = r0.A03;
            AnonymousClass00E.A04(userJid2, "MeContact/Jid can not be null at this point");
            AnonymousClass3UN r43 = new AnonymousClass3UN(this, "preview", this.A0t, userJid2);
            this.A0u = r43;
            HashMap hashMap = new HashMap();
            this.A18 = hashMap;
            hashMap.put(userJid2, r43);
            this.A0R = findViewById(16908290);
            this.A0a = (ImageView) findViewById(R.id.video_pip_replacement);
            A0u();
            Intent intent = getIntent();
            setIntent(intent);
            this.A1A = intent.getBooleanExtra("callAccepted", false);
            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/create intent: ");
            sb.append(intent);
            sb.append(", call info: ");
            sb.append(A0W2);
            Log.i(sb.toString());
            AnonymousClass3UF r62 = new AnonymousClass3UF(this);
            this.A0k = r62;
            this.A1W.A01(r62);
            this.A0E = new Handler(new AnonymousClass38P(this));
            this.A0C = C004302a.A03(this, R.drawable.video_call_full_layout_mute_background);
            Drawable A032 = C004302a.A03(this, R.drawable.videocall_mute);
            this.A0D = A032;
            if (A032 != null) {
                A032.setBounds(0, 0, (int) (((float) A032.getIntrinsicWidth()) * 0.875f), (int) (((float) this.A0D.getIntrinsicHeight()) * 0.875f));
                this.A0D.setAlpha(230);
            }
            this.A03 = sharedPreferences.getInt("portrait_mode_threshold", 30);
            int i5 = sharedPreferences.getInt("landscape_mode_threshold", 30);
            this.A02 = i5;
            StringBuilder A0S2 = AnonymousClass008.A0S("VoipActivityV2/onCreate portraitModeThreshold = ");
            A0S2.append(this.A03);
            A0S2.append(" landscapeModeThreshold = ");
            AnonymousClass008.A1L(A0S2, i5);
            C02780Dk.A04(getWindow());
            String action = intent.getAction();
            if ("com.whatsapp.intent.action.ACCEPT_CALL".equals(action)) {
                A14(intent, A0W2);
            } else if (A1q.equals(action)) {
                A15(intent, A0W2);
            } else if (A1s.equals(action)) {
                Voip.stopVideoCaptureStream();
            }
            this.A1i.A01(this.A1h);
        } else if (getIntent().getBooleanExtra("joinable", false)) {
            String str = this.A17;
            if (str == null) {
                finish();
                return;
            }
            long A022 = this.A1m.A02(str);
            if (A022 == -1) {
                finish();
                return;
            }
            AnonymousClass3UL r44 = new AnonymousClass3UL(this);
            this.A0z = r44;
            this.A1e.ANC(r44, Long.valueOf(A022));
        } else {
            finish();
            if (getIntent().getBooleanExtra("fromCallNotification", false)) {
                Log.d("voip/VoipActivityV2/create/redirect_to_voice_service");
                this.A1d.A02();
                List A0G2 = AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("jid"));
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((AbstractCollection) A0G2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(this.A1V.A0A((AnonymousClass02N) it2.next()));
                }
                this.A1j.A02(arrayList, this, 5, false, getIntent().getBooleanExtra("video_call", false), null);
                return;
            }
            Log.e("voip/VoipActivityV2/create/call_not_active");
        }
    }

    @Override // X.AnonymousClass0GE, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        Dialog A0n2;
        ContactPickerFragment contactPickerFragment = this.A0n;
        return (contactPickerFragment == null || (A0n2 = contactPickerFragment.A0n(i)) == null) ? super.onCreateDialog(i) : A0n2;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        AnonymousClass0YX r0;
        super.onDestroy();
        Handler handler = this.A0E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CallDetailsLayout callDetailsLayout = this.A0o;
        if (!(callDetailsLayout == null || (r0 = callDetailsLayout.A0A.A02) == null)) {
            r0.A00();
        }
        AnonymousClass0BP r1 = this.A0k;
        if (r1 != null) {
            this.A1W.A00(r1);
        }
        AnonymousClass3U7 r02 = this.A0v;
        if (r02 != null) {
            r02.A0e(this);
        }
        A1S(false);
        AnonymousClass0YX r03 = this.A0l;
        if (r03 != null) {
            r03.A00();
        }
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0t;
        if (videoCallParticipantViewLayout != null) {
            for (VideoPort videoPort : videoCallParticipantViewLayout.A0O.values()) {
                videoPort.release();
            }
            videoCallParticipantViewLayout.A0O.clear();
        }
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
        if (voipCallControlBottomSheet != null && voipCallControlBottomSheet.A0U()) {
            voipCallControlBottomSheet.A0w(false, false);
        }
        VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A13;
        if (voipCallNewParticipantBanner != null) {
            voipCallNewParticipantBanner.A00();
        }
        this.A1i.A00(this.A1h);
    }

    public void onGlobalLayout() {
        VideoCallParticipantViewLayout videoCallParticipantViewLayout;
        int i;
        if (this.A0R.getWidth() != this.A08 || this.A0R.getHeight() != this.A07) {
            StringBuilder A0S2 = AnonymousClass008.A0S("voip/VoipActivityV2/onGlobalLayout size: ");
            A0S2.append(this.A0R.getWidth());
            A0S2.append("x");
            A0S2.append(this.A0R.getHeight());
            A0S2.append(", orientation: ");
            AnonymousClass008.A1L(A0S2, getResources().getConfiguration().orientation);
            this.A08 = this.A0R.getWidth();
            this.A07 = this.A0R.getHeight();
            CallInfo A0W2 = A0W();
            A1H(A0W2);
            if (this.A1L && A08(A0W2)) {
                if (A0W2.isGroupCall && A0W2.videoEnabled && A1W() && (i = (videoCallParticipantViewLayout = this.A0t).A01) > 2) {
                    videoCallParticipantViewLayout.A05(i, true);
                }
                this.A1n.updateCameraPreviewOrientation();
                A1D(A0W2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r12 == 86) goto L_0x0058;
     */
    @Override // X.ActivityC004602e, X.ActivityC004802g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r12, android.view.KeyEvent r13) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder("voip/VoipActivityV2/onNewIntent ");
        sb.append(intent);
        sb.append(", action ");
        sb.append(action);
        sb.append(", is finishing ");
        sb.append(isFinishing());
        Log.i(sb.toString());
        super.onNewIntent(intent);
        setIntent(intent);
        this.A1H = false;
        this.A19 = false;
        this.A17 = intent.getStringExtra("call_id");
        CallInfo A0W2 = A0W();
        if (A0W2 != null) {
            if (this.A17 == null) {
                this.A17 = A0W2.callId;
            }
            if (this.A0v == null) {
                this.A1k.A00.obtainMessage(4, this).sendToTarget();
            }
            A1G(A0W2);
            if ("com.whatsapp.intent.action.ACCEPT_CALL".equals(action)) {
                A14(intent, A0W2);
            } else if (A1s.equals(action)) {
                this.A1A = false;
                this.A1O = true;
                VoipCallControlBottomSheet voipCallControlBottomSheet = this.A11;
                if (voipCallControlBottomSheet != null && voipCallControlBottomSheet.A0U()) {
                    voipCallControlBottomSheet.A0w(false, false);
                }
                this.A11 = null;
                A0o();
                Voip.stopVideoCaptureStream();
                A1H(A0W2);
            } else if (A1r.equals(action)) {
                String stringExtra = intent.getStringExtra("confirmationString");
                if (this.A0i == null && AnonymousClass0Fh.A01()) {
                    Log.w("voip/VoipActivityV2/showEndCallConfirmationDialog.");
                    EndCallConfirmationDialogFragment endCallConfirmationDialogFragment = new EndCallConfirmationDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("message", stringExtra);
                    endCallConfirmationDialogFragment.A0N(bundle);
                    this.A0i = endCallConfirmationDialogFragment;
                    endCallConfirmationDialogFragment.A0u(A04(), null);
                }
            } else {
                int i = 2;
                if (A1o.equals(action)) {
                    AnonymousClass3U7 r0 = this.A0v;
                    if (r0 != null) {
                        r0.A0Q(2, null);
                    }
                } else if (A1q.equals(action)) {
                    A15(intent, A0W2);
                } else if ("ACTION_AUTOMATION_BRING_TO_FRONT".equals(action)) {
                    Log.d("VoipActivityV2/actionAutomationBringToFront Start");
                    AnonymousClass00E.A08(false, "it can only be used in smoke or automation");
                } else if ("com.whatsapp.intent.action.CALL_BACK".equals(action) && AnonymousClass0Fh.A01()) {
                    ((ActivityC004702f) this).A0F.A06(R.string.error_call_disabled_during_call, 1);
                } else if (A1p.equals(action)) {
                    if (intent.getBooleanExtra("pendingCall", false)) {
                        i = 7;
                    }
                    A0z(i);
                } else if (isFinishing()) {
                    Log.e("voip/VoipActivityV2/new-intent activity is finishing, do nothing");
                    return;
                } else if (Voip.A09(A0W2)) {
                    Log.e("voip/VoipActivityV2/new-intent the WhatsApp call is not active, do nothing");
                    return;
                } else {
                    A1H(A0W2);
                    if (intent.getBooleanExtra("newCall", false)) {
                        Log.i("voip/VoipActivityV2/onNewIntent/NewCall clearing states");
                        this.A1A = intent.getBooleanExtra("callAccepted", false);
                        this.A01 = 0;
                        this.A0E.removeMessages(9);
                        DialogFragment dialogFragment = this.A0j;
                        if (dialogFragment != null) {
                            dialogFragment.A0r();
                            this.A0j = null;
                            this.A16 = null;
                        }
                    }
                }
            }
            this.A1b.A04(null, 7, "VoipActivity1");
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A0n == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A0g();
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A1J = false;
        this.A1D = false;
        if (this.A00 == 0) {
            this.A1O = false;
            A0j();
            CallInfo A0W2 = A0W();
            if (this.A1L && A08(A0W2)) {
                A13(0, 0, A0W2);
            }
        }
    }

    @Override // X.ActivityC004902h
    public void onPictureInPictureModeChanged(boolean z) {
        ((ActivityC004902h) this).A07.A00.A03.A0p(z);
        if (z) {
            this.A1I = true;
            this.A00 = 1;
            AnonymousClass3U7 r2 = this.A0v;
            if (r2 != null) {
                Log.i("VoiceService:onEnterPictureInPicture");
                r2.A0A = System.currentTimeMillis();
            }
        } else {
            this.A1I = false;
            this.A00 = 2;
            AnonymousClass3U7 r0 = this.A0v;
            if (r0 != null) {
                r0.A0D();
            }
        }
        CallInfo A0W2 = A0W();
        if (A0W2 != null && A0W2.videoEnabled) {
            A0x();
            A1D(A0W2);
            Voip.processPipModeChange(z);
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        Voip.CallState callState;
        AnonymousClass3U7 r0;
        ContactPickerFragment contactPickerFragment;
        AnonymousClass01X r7;
        String A062;
        super.onResume();
        if (this.A0R != null) {
            this.A1J = true;
            this.A1K = true;
            CallInfo A0W2 = A0W();
            if (A0W2 != null && (callState = A0W2.callState) != Voip.CallState.NONE) {
                if (callState == Voip.CallState.RECEIVED_CALL) {
                    if (A0W2.videoEnabled) {
                        boolean z = A0W2.isGroupCall;
                        r7 = ((AnonymousClass2C0) this).A01;
                        if (z) {
                            A062 = r7.A06(R.string.group_video_call_label);
                        } else {
                            A062 = r7.A06(R.string.video_call_label);
                        }
                    } else {
                        boolean z2 = A0W2.isGroupCall;
                        r7 = ((AnonymousClass2C0) this).A01;
                        if (z2) {
                            A062 = r7.A06(R.string.group_voip_call_label);
                        } else {
                            A062 = r7.A06(R.string.voip_call_label);
                        }
                    }
                    C002001d.A2R(this, this.A1a, r7.A0D(R.string.voip_accessibility_incoming_call_label_with_placeholders, A062, this.A1X.A08(this.A1V.A0A(A0W2.peerJid), false)));
                }
                if (this.A1J && ((contactPickerFragment = this.A0n) == null || ((AnonymousClass037) contactPickerFragment).A0g)) {
                    ((ActivityC004602e) this).A0H.A02(this.A0R);
                }
                this.A0E.sendEmptyMessageDelayed(1, 500);
                String action = getIntent().getAction();
                if (A0W2.videoEnabled) {
                    if (!A0W2.self.A00()) {
                        if (A08(A0W2)) {
                            if (!A0W2.videoPreviewReady) {
                                this.A0u.A04();
                            }
                            if (A0W2.videoCaptureStarted) {
                                Log.i("voip/VoipActivityV2/videoCaptureStarted.");
                            }
                            UserJid userJid = A0W2.peerJid;
                            AnonymousClass0QY infoByJid = A0W2.getInfoByJid(userJid);
                            if (infoByJid == null || !infoByJid.A0I) {
                                A1H(A0W2);
                            } else {
                                A17(userJid);
                            }
                        }
                        if (!A1s.equals(action)) {
                            Voip.startVideoCaptureStream();
                        }
                    } else if (this.A1P && (r0 = this.A0v) != null) {
                        r0.A0o.execute(AnonymousClass37Y.A00);
                    }
                }
                if (this.A1P) {
                    this.A1P = false;
                }
                if (this.A00 == 2) {
                    this.A00 = 3;
                    this.A0t.A03();
                    A0p();
                    A13(0, 0, A0W2);
                }
            }
        }
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A0n;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A0D.A01();
        return true;
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A0n;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A0D.A01();
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        View view = this.A0R;
        if (view != null) {
            this.A1L = true;
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            AnonymousClass3U7 r0 = this.A0v;
            if (r0 != null) {
                r0.A12 = false;
            }
            CallInfo A0W2 = A0W();
            if (A0W2 != null && A0W2.callState != Voip.CallState.NONE) {
                if (A0W2.isPeerRequestingUpgrade()) {
                    this.A1A = false;
                }
                A1G(A0W2);
                A1H(A0W2);
                if (this.A1G || ("join_call".equals(getIntent().getAction()) && Voip.A0B(A0W2.callState))) {
                    AnonymousClass0Z0 r2 = this.A1k;
                    r2.A00.obtainMessage(1, new AnonymousClass0Yz("refresh_notification", null, null)).sendToTarget();
                    this.A1G = false;
                }
                if (A0W2.videoEnabled) {
                    this.A0u.A04();
                    AnonymousClass3U7 r22 = this.A0v;
                    if (r22 != null && this.A1I) {
                        Log.i("VoiceService:onEnterPictureInPicture");
                        r22.A0A = System.currentTimeMillis();
                    }
                }
                Log.i("voip/VoipActivityV2/bindService");
                this.A1k.A00.obtainMessage(4, this).sendToTarget();
            } else if (getIntent().hasExtra("showCallFailedMessage")) {
                A0e();
            } else {
                finish();
                Log.e("voip/VoipActivityV2/onStart call_not_active, finishing");
            }
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        Voip.CallState callState;
        super.onStop();
        AnonymousClass3UL r0 = this.A0z;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        int i = 0;
        A1S(false);
        this.A1L = false;
        View view = this.A0R;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A0r;
        if (maximizedParticipantVideoDialogFragment != null) {
            maximizedParticipantVideoDialogFragment.A0y(true);
        }
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0t;
        if (videoCallParticipantViewLayout != null) {
            C09270cb r1 = this.A1m;
            if (videoCallParticipantViewLayout.A0K) {
                videoCallParticipantViewLayout.A0K = false;
                int i2 = !videoCallParticipantViewLayout.A0J ? 1 : 0;
                if (!videoCallParticipantViewLayout.A0I) {
                    i = 2;
                }
                r1.A00.edit().putInt("video_call_pip_position", i2 + i).apply();
            }
        }
        Handler handler = this.A0E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CallInfo A0W2 = A0W();
        if (A0W2 == null || (callState = A0W2.callState) == Voip.CallState.NONE) {
            A0t();
            return;
        }
        if (callState == Voip.CallState.RECEIVED_CALL && Build.VERSION.SDK_INT >= 21 && !this.A1T.A00 && !this.A1A) {
            Bundle A012 = AnonymousClass008.A01("notification_type", 1);
            StringBuilder A0S2 = AnonymousClass008.A0S("voip/VoipActivityV2/onStop post ");
            A0S2.append("NOTIFICATION_HEADS_UP");
            Log.i(A0S2.toString());
            this.A1k.A00.obtainMessage(1, new AnonymousClass0Yz("refresh_notification", A012, null)).sendToTarget();
            this.A1G = true;
        }
        AnonymousClass3U7 r12 = this.A0v;
        if (r12 != null && this.A1I) {
            r12.A0D();
        }
        if (A0W2.videoEnabled) {
            Voip.stopVideoCaptureStream();
            if (A0W2.callState != Voip.CallState.NONE && Build.VERSION.SDK_INT < 19 && this.A0s.getLayoutMode() == 1) {
                Log.i("voip/VoipActivityV2/onStop finish current activity, will recreate on foreground");
                AnonymousClass3U7 r02 = this.A0v;
                if (r02 != null) {
                    r02.A0e(this);
                }
                finish();
            }
        }
        if (this.A0v != null && !this.A1Q.A00) {
            Log.i("voip/VoipActivityV2/onStop. App is put to background, mark to show VoipActivity again when foregrounded.");
            this.A0v.A12 = true;
        }
        A0t();
    }

    public void onUserInteraction() {
        this.A1K = true;
    }

    public void onUserLeaveHint() {
        Log.i("voip/VoipActivityV2/onUserLeaveHint");
        if (this.A0n != null || this.A0p != null || Build.VERSION.SDK_INT < 26 || !A1b(A0W())) {
            this.A1K = false;
        }
    }

    public void recreate() {
        if (this.A00 == 3) {
            super.recreate();
        }
    }

    public void showView(View view) {
        view.setVisibility(0);
        ((AnimatingArrowsLayout) view).A01.start();
    }

    public class SwitchConfirmationFragment extends WaDialogFragment {
        public final AnonymousClass00D A00 = AnonymousClass00D.A00();
        public final AnonymousClass01X A01 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A01());
            AnonymousClass01X r2 = this.A01;
            r3.A01.A0E = r2.A06(R.string.voip_requesting_upgrade_to_video_confirmation_text);
            r3.A07(r2.A06(R.string.voip_requesting_upgrade_to_video_confirmation_positive_button_label), new AnonymousClass38N(this));
            r3.A05(r2.A06(R.string.cancel), null);
            AnonymousClass0MD A002 = r3.A00();
            A002.setCanceledOnTouchOutside(true);
            return A002;
        }
    }

    public class ReplyWithMessageDialogFragment extends WaDialogFragment {
        public static final int[] A02 = {R.string.incomming_call_reply_0, R.string.incomming_call_reply_1, R.string.incomming_call_reply_2, R.string.incomming_call_reply_3, R.string.incomming_call_reply_custom};
        public UserJid A00;
        public final AnonymousClass01X A01 = AnonymousClass01X.A00();

        public ReplyWithMessageDialogFragment(UserJid userJid) {
            this.A00 = userJid;
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A01());
            String[] A0N = this.A01.A0N(A02);
            AnonymousClass38M r1 = new AnonymousClass38M(this, A0N);
            AnonymousClass0MC r0 = r3.A01;
            r0.A0M = A0N;
            r0.A05 = r1;
            AnonymousClass0MD A002 = r3.A00();
            A002.setCanceledOnTouchOutside(true);
            return A002;
        }
    }

    public class NonActivityDismissDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            Context A01 = A01();
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                AnonymousClass0MB r2 = new AnonymousClass0MB(A01);
                String string = bundle2.getString("text");
                AnonymousClass0MC r1 = r2.A01;
                r1.A0E = string;
                r1.A0J = true;
                if (bundle2.getBoolean("dismiss", false)) {
                    r2.A07(this.A00.A06(R.string.ok), new AnonymousClass38L(this));
                }
                return r2.A00();
            }
            throw null;
        }
    }

    public class MessageDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();
        public final AnonymousClass0Fh A01 = AnonymousClass0Fh.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            Context A012 = A01();
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                String string = bundle2.getString("message");
                AnonymousClass0MB r2 = new AnonymousClass0MB(A012);
                AnonymousClass0MC r1 = r2.A01;
                r1.A0E = string;
                r1.A0J = true;
                r2.A07(this.A00.A06(R.string.ok), new AnonymousClass38K(this));
                return r2.A00();
            }
            throw null;
        }

        @Override // androidx.fragment.app.DialogFragment
        public void onDismiss(DialogInterface dialogInterface) {
            if (A0A() != null && !AnonymousClass0Fh.A01()) {
                A0A().finish();
            }
        }
    }

    public class EndCallConfirmationDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                String string = bundle2.getString("message");
                AnonymousClass0MB r3 = new AnonymousClass0MB(A01());
                AnonymousClass0MC r1 = r3.A01;
                r1.A0E = string;
                r1.A0J = true;
                AnonymousClass01X r2 = this.A00;
                r3.A07(r2.A06(R.string.btn_continue), new AnonymousClass38I(this));
                r3.A05(r2.A06(R.string.hang_up), new AnonymousClass38H(this));
                return r3.A00();
            }
            throw null;
        }
    }

    public class E2EEInfoDialogFragment extends WaDialogFragment {
        public final C02780Dk A00 = C02780Dk.A02();
        public final AnonymousClass01X A01 = AnonymousClass01X.A00();
        public final AnonymousClass0M9 A02 = AnonymousClass0M9.A01();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A01());
            AnonymousClass01X r2 = this.A01;
            r3.A01.A0E = r2.A06(R.string.encryption_description);
            r3.A05(r2.A06(R.string.ok), new AnonymousClass38F(this));
            r3.A06(r2.A06(R.string.learn_more), new AnonymousClass38E(this));
            return r3.A00();
        }
    }
}
