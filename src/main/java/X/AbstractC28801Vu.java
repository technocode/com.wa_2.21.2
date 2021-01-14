package X;

/* renamed from: X.1Vu  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC28801Vu {
    public String A00() {
        if (this instanceof C447721k) {
            return "message_revoked";
        }
        if (this instanceof C447621j) {
            return "incoming_message";
        }
        if (!(this instanceof C447521i)) {
            return !(this instanceof C447421h) ? "authorization_revoked" : "call_ended";
        }
        return "call_state_changed";
    }
}
