package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import com.whatsapp.jid.GroupJid;

public class CallMetadata {
    public final GroupJid groupJid;

    public CallMetadata(GroupJid groupJid2) {
        this.groupJid = groupJid2;
    }

    public GroupJid getGroupJid() {
        return this.groupJid;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallMetadata groupJid=");
        A0S.append(this.groupJid);
        return A0S.toString();
    }
}
