package X;

/* renamed from: X.3XF  reason: invalid class name */
public final class AnonymousClass3XF extends AbstractC68363Cx {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public AnonymousClass3XF(Object obj) {
        this.reference = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass3XF) {
            return this.reference.equals(((AnonymousClass3XF) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Optional.of(");
        A0S.append(this.reference);
        A0S.append(")");
        return A0S.toString();
    }
}
