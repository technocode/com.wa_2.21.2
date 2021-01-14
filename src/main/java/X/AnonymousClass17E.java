package X;

/* renamed from: X.17E  reason: invalid class name */
public final class AnonymousClass17E extends UnsupportedOperationException {
    public final C34671iy zzar;

    public AnonymousClass17E(C34671iy r1) {
        this.zzar = r1;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.zzar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
