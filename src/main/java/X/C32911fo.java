package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.1fo  reason: invalid class name and case insensitive filesystem */
public class C32911fo extends OutputStream {
    public int A00;
    public AbstractC20030w0 A01;
    public final AbstractC461428g A02;

    public C32911fo(AbstractC461428g r4, int i) {
        AnonymousClass0N2.A1Y(i > 0);
        if (r4 != null) {
            this.A02 = r4;
            this.A00 = 0;
            this.A01 = AbstractC20030w0.A01(r4.get(i), this.A02, AbstractC20030w0.A04);
            return;
        }
        throw null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC20030w0 r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
        this.A01 = null;
        this.A00 = -1;
        try {
            super.close();
        } catch (IOException e) {
            AnonymousClass0N2.A1V(e);
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder A0S = AnonymousClass008.A0S("length=");
            AnonymousClass008.A1O(A0S, bArr.length, "; regionStart=", i, "; regionLength=");
            A0S.append(i2);
            throw new ArrayIndexOutOfBoundsException(A0S.toString());
        } else if (AbstractC20030w0.A02(this.A01)) {
            int i3 = this.A00 + i2;
            if (AbstractC20030w0.A02(this.A01)) {
                if (i3 > ((AbstractC20730xC) this.A01.A04()).A96()) {
                    AbstractC461428g r4 = this.A02;
                    AbstractC20730xC r3 = (AbstractC20730xC) r4.get(i3);
                    ((AbstractC20730xC) this.A01.A04()).A38(0, r3, 0, this.A00);
                    this.A01.close();
                    this.A01 = AbstractC20030w0.A01(r3, r4, AbstractC20030w0.A04);
                }
                ((AbstractC20730xC) this.A01.A04()).ARL(this.A00, bArr, i, i2);
                this.A00 += i2;
                return;
            }
            throw new C20750xE();
        } else {
            throw new C20750xE();
        }
    }
}
