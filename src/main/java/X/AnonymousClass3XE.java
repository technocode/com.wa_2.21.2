package X;

/* renamed from: X.3XE  reason: invalid class name */
public final class AnonymousClass3XE extends AbstractC68363Cx {
    public static final AnonymousClass3XE A00 = new AnonymousClass3XE();
    public static final long serialVersionUID = 0;

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 1502476572;
    }

    public String toString() {
        return "Optional.absent()";
    }

    private Object readResolve() {
        return A00;
    }
}
