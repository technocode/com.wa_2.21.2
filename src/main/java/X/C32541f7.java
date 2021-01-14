package X;

/* renamed from: X.1f7  reason: invalid class name and case insensitive filesystem */
public class C32541f7 extends AbstractC20030w0 {
    public C32541f7(C20070w4 r1, AbstractC20020vz r2, Throwable th) {
        super(r1, r2, th);
    }

    public C32541f7(Object obj, AbstractC20050w2 r2, AbstractC20020vz r3, Throwable th) {
        super(obj, r2, r3, th);
    }

    @Override // java.lang.Object, X.AbstractC20030w0
    public void finalize() {
        boolean z;
        try {
            synchronized (this) {
                z = this.A00;
            }
            if (!z) {
                C20070w4 r3 = this.A02;
                C19960vt.A00.A00(5, "DefaultCloseableReference", String.format(null, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(r3)), r3.A00().getClass().getName()));
                this.A01.AMp(r3, this.A03);
                close();
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }
}
