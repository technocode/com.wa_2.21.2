package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.38s  reason: invalid class name and case insensitive filesystem */
public class C674738s {
    public final long A00;
    public final GroupJid A01;
    public final UserJid A02;
    public final Voip.CallState A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C674738s(String str, Voip.CallState callState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, UserJid userJid, List list, boolean z6, GroupJid groupJid, boolean z7) {
        this.A04 = str;
        this.A03 = callState;
        this.A06 = z;
        this.A07 = z2;
        this.A0C = z3;
        this.A0A = z4;
        this.A09 = z5;
        this.A00 = j;
        this.A02 = userJid;
        this.A05 = list;
        this.A0B = z6;
        this.A01 = groupJid;
        this.A08 = z7;
    }

    public static C674738s A00(CallInfo callInfo, boolean z) {
        AnonymousClass1YO r1 = callInfo.callWaitingInfo;
        if (r1.A01 == 1) {
            UserJid userJid = r1.A03.initialPeerJid;
            if (userJid != null) {
                String str = r1.A04;
                Voip.CallState callState = Voip.CallState.RECEIVED_CALL;
                boolean z2 = false;
                if (r1.A00 > 1) {
                    z2 = true;
                }
                return new C674738s(str, callState, false, z2, r1.A06, false, false, 0, userJid, r1.A05, true, r1.A02, false);
            }
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass0QY r12 : callInfo.participants.values()) {
            if (!r12.A0D) {
                arrayList.add(r12.A06);
            }
        }
        return new C674738s(callInfo.callId, callInfo.callState, callInfo.isCaller, callInfo.isGroupCall, callInfo.videoEnabled, z, callInfo.isCallOnHold(), callInfo.callActiveTime, callInfo.peerJid, arrayList, false, callInfo.groupJid, callInfo.isJoinableGroupCall);
    }
}
