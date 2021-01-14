package X;

/* renamed from: X.1fX  reason: invalid class name and case insensitive filesystem */
public final class C32751fX implements AbstractC20480wm {
    @Override // X.AbstractC20480wm
    public int A97(Object obj) {
        int sizeInBytes;
        AbstractC20610x0 r2 = (AbstractC20610x0) obj;
        if (r2 instanceof C32841fh) {
            return C20830xQ.A01(((C32841fh) r2).A01);
        }
        C32831fg r22 = (C32831fg) r2;
        synchronized (r22) {
            sizeInBytes = r22.A00() ? 0 : r22.A00.A00.getSizeInBytes();
        }
        return sizeInBytes;
    }
}
