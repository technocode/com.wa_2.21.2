package X;

import java.util.Hashtable;

/* renamed from: X.0gR  reason: invalid class name and case insensitive filesystem */
public class C11510gR {
    public static Hashtable A07;
    public int A00;
    public int A01;
    public AbstractC05820Qj A02;
    public AbstractC05800Qh A03;
    public AbstractC05800Qh A04;
    public byte[] A05;
    public byte[] A06;

    static {
        Hashtable hashtable = new Hashtable();
        A07 = hashtable;
        hashtable.put("GOST3411", 32);
        A07.put("MD2", 16);
        A07.put("MD4", 64);
        A07.put("MD5", 64);
        A07.put("RIPEMD128", 64);
        A07.put("RIPEMD160", 64);
        A07.put("SHA-1", 64);
        A07.put("SHA-224", 64);
        A07.put("SHA-256", 64);
        A07.put("SHA-384", 128);
        A07.put("SHA-512", 128);
        A07.put("Tiger", 64);
        A07.put("Whirlpool", 64);
    }

    public C11510gR(AbstractC05820Qj r4) {
        int intValue;
        if (r4 instanceof AbstractC05810Qi) {
            intValue = ((AbstractC05810Qi) r4).A53();
        } else {
            Hashtable hashtable = A07;
            String A4i = r4.A4i();
            Number number = (Number) hashtable.get(A4i);
            if (number != null) {
                intValue = number.intValue();
            } else {
                StringBuilder A0S = AnonymousClass008.A0S("unknown digest passed: ");
                A0S.append(A4i);
                throw new IllegalArgumentException(A0S.toString());
            }
        }
        this.A02 = r4;
        int A64 = r4.A64();
        this.A01 = A64;
        this.A00 = intValue;
        this.A05 = new byte[intValue];
        this.A06 = new byte[(intValue + A64)];
    }

    public void A00(AbstractC11530gT r6) {
        byte[] bArr;
        this.A02.reset();
        byte[] bArr2 = ((C11520gS) r6).A00;
        int length = bArr2.length;
        if (length > this.A00) {
            AbstractC05820Qj r1 = this.A02;
            r1.update(bArr2, 0, length);
            r1.A3r(this.A05, 0);
            length = this.A01;
        } else {
            System.arraycopy(bArr2, 0, this.A05, 0, length);
        }
        while (true) {
            bArr = this.A05;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.A06, 0, this.A00);
        byte[] bArr3 = this.A05;
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ 54);
        }
        byte[] bArr4 = this.A06;
        for (int i3 = 0; i3 < i; i3++) {
            bArr4[i3] = (byte) (bArr4[i3] ^ 92);
        }
        AbstractC05820Qj r12 = this.A02;
        if (r12 instanceof AbstractC05800Qh) {
            AbstractC05800Qh A37 = ((AbstractC05800Qh) r12).A37();
            this.A04 = A37;
            ((AbstractC05820Qj) A37).update(this.A06, 0, this.A00);
        }
        AbstractC05820Qj r2 = this.A02;
        byte[] bArr5 = this.A05;
        r2.update(bArr5, 0, bArr5.length);
        if (r2 instanceof AbstractC05800Qh) {
            this.A03 = ((AbstractC05800Qh) r2).A37();
        }
    }

    public void A01(byte[] bArr) {
        AbstractC05820Qj r3;
        this.A02.A3r(this.A06, this.A00);
        AbstractC05800Qh r1 = this.A04;
        if (r1 != null) {
            ((AbstractC05800Qh) this.A02).AMy(r1);
            r3 = this.A02;
            r3.update(this.A06, this.A00, r3.A64());
        } else {
            r3 = this.A02;
            byte[] bArr2 = this.A06;
            r3.update(bArr2, 0, bArr2.length);
        }
        r3.A3r(bArr, 0);
        int i = this.A00;
        while (true) {
            byte[] bArr3 = this.A06;
            if (i >= bArr3.length) {
                break;
            }
            bArr3[i] = 0;
            i++;
        }
        AbstractC05800Qh r12 = this.A03;
        if (r12 != null) {
            ((AbstractC05800Qh) this.A02).AMy(r12);
            return;
        }
        AbstractC05820Qj r2 = this.A02;
        byte[] bArr4 = this.A05;
        r2.update(bArr4, 0, bArr4.length);
    }
}
