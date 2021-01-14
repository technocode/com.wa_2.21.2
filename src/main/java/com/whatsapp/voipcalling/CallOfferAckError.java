package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import com.whatsapp.jid.UserJid;

public class CallOfferAckError {
    public final int errorCode;
    public final UserJid errorJid;

    public CallOfferAckError(String str, int i) {
        UserJid nullable = UserJid.getNullable(str);
        if (nullable != null) {
            this.errorJid = nullable;
            this.errorCode = i;
            return;
        }
        throw null;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallOfferAckError {errorJid=");
        A0S.append(this.errorJid);
        A0S.append(", errorCode=");
        A0S.append(this.errorCode);
        A0S.append('}');
        return A0S.toString();
    }
}
