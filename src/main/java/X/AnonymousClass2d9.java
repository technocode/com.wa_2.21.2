package X;

/* renamed from: X.2d9  reason: invalid class name */
public class AnonymousClass2d9 implements AbstractC05230Ns {
    public int A00 = 0;
    public int A01 = 0;
    public final int A02 = 128;

    @Override // X.AbstractC05230Ns
    public int A77() {
        return this.A00;
    }

    @Override // X.AbstractC05230Ns
    public boolean AKq(boolean z, int i) {
        if (z) {
            this.A01++;
        }
        if (this.A01 < this.A02) {
            return true;
        }
        this.A00 = i;
        return false;
    }
}
