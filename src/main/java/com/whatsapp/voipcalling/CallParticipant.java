package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import X.AnonymousClass00E;
import com.whatsapp.jid.UserJid;

public final class CallParticipant {
    public final UserJid jid;
    public final String state;

    public CallParticipant(UserJid userJid, String str) {
        this.jid = userJid;
        this.state = str;
    }

    public static CallParticipant create(String str, String str2) {
        UserJid nullable = UserJid.getNullable(str);
        if (nullable != null) {
            return new CallParticipant(nullable, str2);
        }
        StringBuilder sb = new StringBuilder("UserJid was null. Parsed: ");
        sb.append(str);
        AnonymousClass00E.A08(false, sb.toString());
        return null;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallParticipant{jid=");
        A0S.append(this.jid);
        A0S.append(", state=");
        A0S.append(this.state);
        A0S.append('}');
        return A0S.toString();
    }
}
