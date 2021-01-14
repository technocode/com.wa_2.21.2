package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3Cp  reason: invalid class name and case insensitive filesystem */
public class C68283Cp {
    public static final byte[] A03 = {2};
    public static final byte[] A04 = {1};
    public final int A00;
    public final AbstractC68253Cm A01;
    public final byte[] A02;

    public C68283Cp(AbstractC68253Cm r1, byte[] bArr, int i) {
        this.A01 = r1;
        this.A02 = bArr;
        this.A00 = i;
    }

    public C68283Cp A00() {
        return new C68283Cp(this.A01, A02(A03), this.A00 + 1);
    }

    public C68293Cq A01() {
        C68233Ck r0 = new C68233Ck(this.A01.A01(A02(A04), new byte[32], "WhisperMessageKeys".getBytes(), 80));
        return new C68293Cq(r0.A01, r0.A02, r0.A00, this.A00);
    }

    public final byte[] A02(byte[] bArr) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(this.A02, "HmacSHA256"));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
