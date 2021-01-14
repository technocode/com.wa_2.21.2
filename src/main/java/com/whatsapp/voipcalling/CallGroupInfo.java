package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import java.util.Arrays;

public final class CallGroupInfo {
    public final CallParticipant[] participants;
    public final int transactionId;

    public CallGroupInfo(int i, CallParticipant[] callParticipantArr) {
        this.transactionId = i;
        this.participants = callParticipantArr;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallGroupInfo{transactionId=");
        A0S.append(this.transactionId);
        A0S.append(", participants=");
        A0S.append(Arrays.toString(this.participants));
        A0S.append('}');
        return A0S.toString();
    }
}
