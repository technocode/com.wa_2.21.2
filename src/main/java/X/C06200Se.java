package X;

/* renamed from: X.0Se  reason: invalid class name and case insensitive filesystem */
public class C06200Se implements AbstractC05230Ns {
    public static final int A04 = Math.max(64, Math.min(512, (int) ((Runtime.getRuntime().maxMemory() / 16) / 16384)));
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public C06200Se(int i, int i2, int i3) {
        this.A02 = i != 1 ? i * 3072 : i2;
        this.A01 = i3;
    }

    @Override // X.AbstractC05230Ns
    public int A77() {
        return this.A03;
    }

    @Override // X.AbstractC05230Ns
    public boolean AKq(boolean z, int i) {
        int i2 = this.A02;
        if (i2 == 0) {
            return true;
        }
        int i3 = this.A00;
        int i4 = 1;
        if (z) {
            i4 = Math.max(1, 3072 / A04);
        }
        int i5 = i3 + i4;
        this.A00 = i5;
        if (i5 <= i2 || i >= this.A01 - A04) {
            return true;
        }
        this.A03 = i;
        return false;
    }
}
