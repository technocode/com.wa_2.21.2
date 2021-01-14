package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import com.whatsapp.jid.UserJid;

public class SyncDevicesUserInfo {
    public final UserJid jid;
    public final String phash;

    public SyncDevicesUserInfo(String str, String str2) {
        UserJid nullable = UserJid.getNullable(str);
        if (nullable != null) {
            this.jid = nullable;
            this.phash = str2;
            return;
        }
        throw null;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SyncDevicesUserInfo {jid=");
        A0S.append(this.jid);
        A0S.append(", phash=");
        A0S.append(this.phash);
        A0S.append('}');
        return A0S.toString();
    }
}
