package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.21d  reason: invalid class name and case insensitive filesystem */
public class C447021d extends AbstractC28771Vr {
    public final AnonymousClass01I A00;
    public final AnonymousClass01A A01;
    public final C014308b A02;
    public final C28691Vj A03;
    public final C28701Vk A04;
    public final AbstractC02170Ax A05;
    public final AbstractC02170Ax A06;

    public C447021d(AnonymousClass01I r1, AnonymousClass01A r2, C014308b r3, AbstractC02170Ax r4, AbstractC02170Ax r5, C28701Vk r6, C28691Vj r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r6;
        this.A03 = r7;
    }

    public static String A02(Voip.CallState callState) {
        switch (callState.ordinal()) {
            case 1:
            case 2:
                return "outgoing_ringing";
            case 3:
            case 8:
                return "incoming_ringing";
            case 4:
            case 5:
            case 6:
                return "active";
            case 7:
            default:
                return "idle";
        }
    }

    public static JSONObject A03(Voip.CallState callState, CallInfo callInfo, AnonymousClass01I r12, AnonymousClass01A r13, C014308b r14, C28831Vx r15, C28701Vk r16, C28691Vj r17) {
        String A022 = A02(callState);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("call_state", A022);
        if (!"idle".equals(A022) && callInfo != null) {
            if (!callInfo.isCaller) {
                jSONObject.put("caller_contact_id", r17.A01.A04(r15, callInfo.peerJid.getRawString()));
                jSONObject.put("caller_name", r14.A09(r13.A0A(callInfo.peerJid), false));
            }
            GroupJid groupJid = callInfo.groupJid;
            if (groupJid != null) {
                jSONObject.put("group_name", r14.A08(r13.A0A(groupJid), false));
            }
            Set<AnonymousClass02N> keySet = callInfo.participants.keySet();
            if (!keySet.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                int i = 0;
                for (AnonymousClass02N r9 : keySet) {
                    if (!r12.A09(r9)) {
                        String A09 = r14.A09(r13.A0A(r9), false);
                        if (TextUtils.isEmpty(A09)) {
                            i++;
                        } else {
                            jSONArray.put(r17.A01.A04(r15, r9.getRawString()));
                            jSONArray2.put(A09);
                        }
                    }
                }
                jSONObject.put("call_participant_contact_ids", jSONArray);
                jSONObject.put("call_participant_names", jSONArray2);
                jSONObject.put("unnamed_call_participant_count", i);
            }
            jSONObject.put("call_id", r16.A04(r15, callInfo.callId));
            jSONObject.put("video_call", callInfo.videoEnabled);
        }
        return jSONObject;
    }
}
