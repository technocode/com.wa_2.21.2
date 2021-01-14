package X;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: X.0gU  reason: invalid class name and case insensitive filesystem */
public class C11540gU implements PBEKey {
    public String algorithm;
    public int digest;
    public int ivSize;
    public int keySize;
    public AbstractC11530gT param;
    public PBEKeySpec pbeKeySpec;
    public boolean tryWrong = false;
    public int type;

    public String getFormat() {
        return "RAW";
    }

    public C11540gU(String str, int i, int i2, PBEKeySpec pBEKeySpec, AbstractC11530gT r8) {
        this.algorithm = str;
        this.type = i;
        this.digest = 1;
        this.keySize = i2;
        this.ivSize = -1;
        this.pbeKeySpec = pBEKeySpec;
        this.param = r8;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        C11520gS r1;
        AbstractC11530gT r12 = this.param;
        if (r12 != null) {
            if (r12 instanceof C11550gV) {
                r1 = (C11520gS) ((C11550gV) r12).A00;
            } else {
                r1 = (C11520gS) r12;
            }
            return r1.A00;
        } else if (this.type == 5) {
            char[] password = this.pbeKeySpec.getPassword();
            return password != null ? C68093Br.A01(password) : new byte[0];
        } else {
            char[] password2 = this.pbeKeySpec.getPassword();
            if (password2 == null) {
                return new byte[0];
            }
            int length = password2.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr[i] = (byte) password2[i];
            }
            return bArr;
        }
    }

    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }

    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }

    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }
}
