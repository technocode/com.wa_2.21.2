package X;

import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Iterator;

/* renamed from: X.39G  reason: invalid class name */
public class AnonymousClass39G extends Connection {
    public C72713Ty A00;
    public String A01;

    public AnonymousClass39G(C72713Ty r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void A00(int i) {
        if (this.A00 != null) {
            StringBuilder A0S = AnonymousClass008.A0S("voip/SelfManagedConnection/setDisconnected ");
            A0S.append(this.A01);
            A0S.append(", cause: ");
            A0S.append(i);
            Log.i(A0S.toString());
            setDisconnected(new DisconnectCause(i));
            destroy();
            this.A00.A05(this);
            this.A00 = null;
        }
    }

    public void onAbort() {
        Log.i("voip/SelfManagedConnection/onAbort");
        super.onAbort();
    }

    public void onAnswer() {
        onAnswer(0);
    }

    public void onAnswer(int i) {
        Log.i("voip/SelfManagedConnection/onAnswer");
        C72713Ty r2 = this.A00;
        if (r2 != null) {
            r2.A07(this.A01, 2);
        }
        setActive();
    }

    public void onCallAudioStateChanged(CallAudioState callAudioState) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnection/onCallAudioStateChanged ");
        sb.append(callAudioState);
        Log.i(sb.toString());
        super.onCallAudioStateChanged(callAudioState);
        C72713Ty r0 = this.A00;
        if (r0 != null) {
            String str = this.A01;
            AnonymousClass00E.A01();
            Iterator it = ((AbstractC003401r) r0).A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    C09230cV r2 = (C09230cV) r1.next();
                    if (!(r2 instanceof C74383am)) {
                        AnonymousClass00E.A01();
                    } else {
                        AnonymousClass00E.A01();
                        StringBuilder sb2 = new StringBuilder("voip/audio_route/selfManagedConnectionListener/onCallAudioStateChanged ");
                        sb2.append(str);
                        sb2.append(", ");
                        C675939f r3 = ((C74383am) r2).A00;
                        sb2.append(Voip.A05(r3.A00));
                        sb2.append(" -> ");
                        sb2.append(callAudioState);
                        Log.i(sb2.toString());
                        CallInfo callInfo = Voip.getCallInfo();
                        if (Voip.A0A(callInfo, str) && callInfo.callState != Voip.CallState.ACTIVE_ELSEWHERE) {
                            int i = r3.A00;
                            if (i == 3 || i == 4) {
                                r3.A01(callInfo);
                            } else {
                                r3.A02(callInfo);
                                r3.A03(callInfo);
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void onDisconnect() {
        Log.i("voip/SelfManagedConnection/onDisconnect");
        C72713Ty r2 = this.A00;
        if (r2 != null) {
            r2.A07(this.A01, 4);
        }
        A00(2);
    }

    public void onHold() {
        Log.i("voip/SelfManagedConnection/onHold");
        C72713Ty r2 = this.A00;
        if (r2 != null) {
            r2.A07(this.A01, 0);
        }
        setOnHold();
    }

    public void onReject() {
        Log.i("voip/SelfManagedConnection/onReject");
        C72713Ty r2 = this.A00;
        if (r2 != null) {
            r2.A07(this.A01, 3);
        }
        A00(6);
    }

    public void onReject(String str) {
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnection/onReject ");
        sb.append(str);
        Log.i(sb.toString());
        onReject();
    }

    public void onShowIncomingCallUi() {
        Log.i("voip/SelfManagedConnection/onShowIncomingCallUi");
        C72713Ty r0 = this.A00;
        if (r0 != null) {
            String str = this.A01;
            AnonymousClass00E.A01();
            Iterator it = ((AbstractC003401r) r0).A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((C09230cV) r1.next()).A01(str);
                } else {
                    return;
                }
            }
        }
    }

    public void onStateChanged(int i) {
        AnonymousClass008.A0v("voip/SelfManagedConnection/onStateChanged ", i);
        super.onStateChanged(i);
    }

    public void onUnhold() {
        Log.i("voip/SelfManagedConnection/onUnhold");
        C72713Ty r2 = this.A00;
        if (r2 != null) {
            r2.A07(this.A01, 1);
        }
        setActive();
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SelfManagedConnection: ");
        A0S.append(this.A01);
        return A0S.toString();
    }
}
