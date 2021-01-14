package X;

/* renamed from: X.07U  reason: invalid class name */
public class AnonymousClass07U implements AnonymousClass07L {
    public static final Object A02 = new Object();
    public volatile AnonymousClass07L A00;
    public volatile Object A01 = A02;

    public AnonymousClass07U(AnonymousClass07L r2) {
        this.A00 = r2;
    }

    @Override // X.AnonymousClass07L
    public Object get() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.get();
                this.A01 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }
}
