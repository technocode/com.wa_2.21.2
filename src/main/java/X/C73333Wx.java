package X;

import java.lang.reflect.Constructor;
import javax.crypto.BadPaddingException;

/* renamed from: X.3Wx  reason: invalid class name and case insensitive filesystem */
public class C73333Wx implements AbstractC68053Bn {
    public static final Constructor A01;
    public C11700go A00;

    @Override // X.AbstractC68053Bn
    public boolean ARK() {
        return false;
    }

    static {
        try {
            Class<?> loadClass = C73353Wz.class.getClassLoader().loadClass("javax.crypto.AEADBadTagException");
            Constructor<?> constructor = null;
            if (loadClass != null) {
                try {
                    constructor = loadClass.getConstructor(String.class);
                } catch (Exception unused) {
                }
                A01 = constructor;
            }
        } catch (Exception unused2) {
        }
    }

    public C73333Wx(C11700go r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC68053Bn
    public int A3r(byte[] bArr, int i) {
        try {
            return this.A00.A01(bArr, i);
        } catch (C73273We e) {
            Constructor constructor = A01;
            if (constructor != null) {
                BadPaddingException badPaddingException = null;
                try {
                    badPaddingException = (BadPaddingException) constructor.newInstance(e.getMessage());
                } catch (Exception unused) {
                }
                if (badPaddingException != null) {
                    throw badPaddingException;
                }
            }
            throw new BadPaddingException(e.getMessage());
        }
    }

    @Override // X.AbstractC68053Bn
    public String A4i() {
        return this.A00.A06.A4i();
    }

    @Override // X.AbstractC68053Bn
    public int A7p(int i) {
        return this.A00.A00(i);
    }

    @Override // X.AbstractC68053Bn
    public AbstractC11690gn A9X() {
        return this.A00.A06;
    }

    @Override // X.AbstractC68053Bn
    public int A9Z(int i) {
        C11700go r1 = this.A00;
        int i2 = i + r1.A01;
        if (!r1.A09) {
            int i3 = r1.A02;
            i2 -= i3;
            if (i2 < i3) {
                return 0;
            }
        }
        return i2 - (i2 % 16);
    }

    @Override // X.AbstractC68053Bn
    public void AAX(boolean z, AbstractC11530gT r3) {
        this.A00.A04(z, r3);
    }

    @Override // X.AbstractC68053Bn
    public int AMA(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.A00.A02(bArr, i, i2, bArr2, i3);
    }

    @Override // X.AbstractC68053Bn
    public void AQp(byte[] bArr, int i, int i2) {
        this.A00.A05(bArr, i, i2);
    }
}
