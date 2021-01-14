package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

public class CallParticipantJid {
    public final DeviceJid[] deviceJids;
    public final UserJid userJid;

    public CallParticipantJid(UserJid userJid2, DeviceJid[] deviceJidArr) {
        this.userJid = userJid2;
        this.deviceJids = deviceJidArr;
    }

    public DeviceJid[] getDeviceJids() {
        return this.deviceJids;
    }

    public UserJid getUserJid() {
        return this.userJid;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallParticipantJid userJid=");
        A0S.append(this.userJid);
        A0S.append(", deviceJids=(");
        A0S.append(Arrays.toString(this.deviceJids));
        A0S.append(')');
        return A0S.toString();
    }
}
