package X;

/* renamed from: X.06d  reason: invalid class name */
public abstract class AnonymousClass06d implements AbstractC009005t, AbstractC009906e, AbstractC009105u {
    public AbstractC009505y A00;
    public final int A01 = AnonymousClass1GL.A00.incrementAndGet();

    @Override // X.AnonymousClass05k
    public final Long A6l() {
        return null;
    }

    public AnonymousClass06d A00() {
        if (!(this instanceof C46432Ab)) {
            try {
                return (AnonymousClass06d) clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // X.AnonymousClass05m
    public final int A5J() {
        return this.A01;
    }

    @Override // X.AbstractC009105u
    public /* bridge */ /* synthetic */ AbstractC009105u ABr() {
        if (!(this instanceof C46432Ab)) {
            return A00();
        }
        throw new IllegalStateException();
    }

    @Override // X.AbstractC009005t
    public /* bridge */ /* synthetic */ AbstractC009005t ABs() {
        if (!(this instanceof C46432Ab)) {
            return A00();
        }
        throw new IllegalStateException();
    }
}
