package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1Q3  reason: invalid class name */
public final class AnonymousClass1Q3 {
    public final Jid A00;

    public AnonymousClass1Q3(Jid jid) {
        this.A00 = jid;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("AxolotlSessionEvent{jid='");
        A0S.append(this.A00);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
