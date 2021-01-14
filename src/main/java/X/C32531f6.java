package X;

/* renamed from: X.1f6  reason: invalid class name and case insensitive filesystem */
public final class C32531f6 implements AbstractC20020vz {
    @Override // X.AbstractC20020vz
    public boolean AMx() {
        return false;
    }

    @Override // X.AbstractC20020vz
    public void AMp(C20070w4 r7, Throwable th) {
        C19960vt.A00.A00(5, AbstractC20030w0.class.getSimpleName(), String.format(null, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(r7)), r7.A00().getClass().getName()));
    }
}
