package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipCallFooter;

/* renamed from: X.39f  reason: invalid class name and case insensitive filesystem */
public class C675939f {
    public int A00;
    public int A01;
    public BluetoothAdapter A02;
    public BluetoothHeadset A03;
    public boolean A04;
    public boolean A05 = false;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final AnonymousClass03P A0A;
    public final AbstractC72633Tq A0B;
    public final C09230cV A0C;
    public final C09210cT A0D;
    public final AnonymousClass3U7 A0E;
    public final C675639c A0F;
    public final C675739d A0G;
    public final C675839e A0H;

    public C675939f(AnonymousClass3U7 r5, Context context, AnonymousClass03P r7, C09210cT r8) {
        AbstractC72633Tq r0;
        this.A0E = r5;
        this.A09 = context;
        this.A0A = r7;
        this.A0D = r8;
        StringBuilder sb = new StringBuilder("voip/audio_route/create ");
        sb.append(this);
        Log.i(sb.toString());
        AnonymousClass3TK r3 = new AnonymousClass3TK(this);
        int i = Build.VERSION.SDK_INT;
        C74383am r2 = null;
        if (i >= 23) {
            r0 = new C74343ag(r7);
        } else {
            r0 = new C74353ah(context, r7);
        }
        r0.A00 = r3;
        this.A0B = r0;
        this.A0F = new C675639c(this);
        this.A0H = new C675839e(this);
        this.A0G = new C675739d(this);
        this.A0C = i >= 28 ? new C74383am(this) : r2;
    }

    public void A00(CallInfo callInfo) {
        boolean z;
        if (callInfo != null && callInfo.callState != Voip.CallState.NONE) {
            if (A06()) {
                A02(callInfo);
                A04(true, callInfo);
            } else if (this.A0B.A03()) {
                A03(callInfo);
            } else {
                Boolean A002 = Voip.A00("options.android_should_use_speaker_for_ringtone");
                if (callInfo.videoEnabled || (A002 != null && A002.booleanValue() && callInfo.callState == Voip.CallState.RECEIVED_CALL)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    A05(true, callInfo);
                } else {
                    A05(false, callInfo);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r0 != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.whatsapp.voipcalling.CallInfo r4) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675939f.A01(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void A02(CallInfo callInfo) {
        boolean z = true;
        if (this.A00 != 1 || callInfo.videoEnabled || callInfo.callState == Voip.CallState.RECEIVED_CALL) {
            z = false;
        }
        this.A08 = z;
    }

    public final void A03(CallInfo callInfo) {
        Voip.CallState callState;
        VoipCallFooter voipCallFooter;
        AnonymousClass00E.A01();
        if (callInfo != null && (callState = callInfo.callState) != Voip.CallState.NONE && callState != Voip.CallState.ACTIVE_ELSEWHERE) {
            int i = this.A00;
            AudioManager A092 = this.A0A.A09();
            if (A092 != null) {
                AnonymousClass3U7 r4 = this.A0E;
                AnonymousClass39G A093 = r4.A09(callInfo.callId);
                boolean z = true;
                if (Build.VERSION.SDK_INT < 28 || A093 == null || A093.getCallAudioState() == null) {
                    if (A092.isBluetoothScoOn()) {
                        this.A00 = 3;
                    } else if (A092.isSpeakerphoneOn() && !this.A06) {
                        this.A00 = 1;
                        if (i != 1) {
                            this.A08 = false;
                        }
                    } else if (this.A0B.A03()) {
                        this.A00 = 4;
                    } else {
                        this.A00 = 2;
                    }
                    this.A04 = A092.isBluetoothScoOn();
                    z = false;
                } else {
                    int route = A093.getCallAudioState().getRoute();
                    if (route == 1) {
                        this.A00 = 2;
                    } else if (route == 2) {
                        this.A00 = 3;
                    } else if (route == 4) {
                        this.A00 = 4;
                    } else if (route == 8) {
                        this.A00 = 1;
                    }
                }
                StringBuilder A0S = AnonymousClass008.A0S("voip/audio_route/updateAudioRoute: [");
                A0S.append(Voip.A05(i));
                A0S.append(" -> ");
                A0S.append(Voip.A05(this.A00));
                A0S.append("], ");
                A0S.append("using telecom: ");
                A0S.append(z);
                A0S.append(", ");
                A0S.append("Bluetooth: [ScoAudioState: ");
                A0S.append(C675839e.A00(this.A01));
                A0S.append(", ScoOn: ");
                A0S.append(A092.isBluetoothScoOn());
                A0S.append(", ScoRequested: ");
                A0S.append(this.A04);
                A0S.append("], ");
                A0S.append("Speaker: ");
                A0S.append(A092.isSpeakerphoneOn());
                A0S.append(", ");
                A0S.append(this);
                Log.i(A0S.toString());
                this.A06 = false;
                int i2 = this.A00;
                r4.A0o.execute(new RunnableEBaseShape0S0001000_I1(i2, 1));
                AbstractC07250Wp r2 = r4.A0W;
                if (r2 != null) {
                    boolean A062 = r4.A1z.A06();
                    VoipActivityV2 voipActivityV2 = (VoipActivityV2) r2;
                    AnonymousClass00E.A01();
                    VoipCallControlBottomSheet voipCallControlBottomSheet = voipActivityV2.A11;
                    if (voipCallControlBottomSheet == null || (voipCallFooter = voipCallControlBottomSheet.A0F) == null) {
                        voipActivityV2.A12.A03(callInfo, i2, A062);
                    } else {
                        voipCallFooter.A03(callInfo, i2, A062);
                    }
                }
                r4.A0V(callInfo);
                r4.A16 = false;
            }
        }
    }

    public void A04(boolean z, CallInfo callInfo) {
        String str;
        String str2;
        AudioManager A092;
        AnonymousClass3U7 r1 = this.A0E;
        if (callInfo == null) {
            str = null;
        } else {
            str = callInfo.callId;
        }
        AnonymousClass39G A093 = r1.A09(str);
        StringBuilder A0S = AnonymousClass008.A0S("voip/audio_route/changeBluetoothState ");
        if (z) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A0S.append(str2);
        A0S.append(" using telecom: ");
        boolean z2 = false;
        if (A093 != null) {
            z2 = true;
        }
        AnonymousClass008.A1a(A0S, z2);
        if (Build.VERSION.SDK_INT < 28 || A093 == null) {
            if (this.A04 != z && (A092 = this.A0A.A09()) != null) {
                this.A04 = z;
                if (z) {
                    try {
                        A092.startBluetoothSco();
                        A092.setBluetoothScoOn(true);
                    } catch (Exception e) {
                        Log.e(e);
                    }
                } else {
                    A092.setBluetoothScoOn(false);
                    A092.stopBluetoothSco();
                }
                A03(callInfo);
            }
        } else if (z) {
            A093.setAudioRoute(2);
        } else if (A093.getCallAudioState() != null && A093.getCallAudioState().getRoute() == 2) {
            A093.setAudioRoute(5);
        }
    }

    public void A05(boolean z, CallInfo callInfo) {
        String str;
        String str2;
        AnonymousClass3U7 r1 = this.A0E;
        if (callInfo == null) {
            str = null;
        } else {
            str = callInfo.callId;
        }
        AnonymousClass39G A092 = r1.A09(str);
        StringBuilder A0S = AnonymousClass008.A0S("voip/audio_route/changeSpeakerphoneState ");
        if (z) {
            str2 = "On";
        } else {
            str2 = "Off";
        }
        A0S.append(str2);
        A0S.append(" using telecom: ");
        boolean z2 = false;
        if (A092 != null) {
            z2 = true;
        }
        AnonymousClass008.A1a(A0S, z2);
        if (Build.VERSION.SDK_INT < 28 || A092 == null) {
            AudioManager A093 = this.A0A.A09();
            if (A093 != null) {
                A093.setSpeakerphoneOn(z);
                A03(callInfo);
            }
        } else if (z) {
            A092.setAudioRoute(8);
        } else {
            A092.setAudioRoute(5);
        }
    }

    public boolean A06() {
        AudioManager A092;
        BluetoothHeadset bluetoothHeadset;
        try {
            BluetoothAdapter bluetoothAdapter = this.A02;
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled() || (A092 = this.A0A.A09()) == null || !A092.isBluetoothScoAvailableOffCall() || (bluetoothHeadset = this.A03) == null || bluetoothHeadset.getConnectedDevices().isEmpty()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Log.e(e);
            return false;
        }
    }
}
