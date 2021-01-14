package X;

/* renamed from: X.1aj  reason: invalid class name and case insensitive filesystem */
public class C30101aj extends C14840my {
    public final Object A00 = new Object();

    public C30101aj(int i) {
        super(i);
    }

    @Override // X.C14840my
    public Object A00() {
        Object A002;
        synchronized (this.A00) {
            A002 = super.A00();
        }
        return A002;
    }

    @Override // X.C14840my
    public boolean A01(Object obj) {
        boolean A01;
        synchronized (this.A00) {
            A01 = super.A01(obj);
        }
        return A01;
    }
}
