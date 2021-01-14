package com.whatsapp.voipcalling;

import X.AnonymousClass01I;
import X.C002001d;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.SecureRandom;

public class DefaultCryptoCallback implements CryptoCallback {
    public static final int E2E_CALL_KEY_LENGTH = 32;
    public static final int E2E_EXTENDED_V2_KEY_LENGTH = 46;
    public static final int SECURE_SSRC_LENGTH = 4;
    public final AnonymousClass01I meManager;
    public final SecureRandom secureRandom = new SecureRandom();

    public DefaultCryptoCallback(AnonymousClass01I r2) {
        this.meManager = r2;
    }

    private byte[] expandCallKey(byte[] bArr, String str) {
        if (bArr.length == 32) {
            if (str == null) {
                AnonymousClass01I r0 = this.meManager;
                r0.A04();
                UserJid userJid = r0.A03;
                if (userJid != null) {
                    str = userJid.getRawString();
                } else {
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("expandCallKey with  ");
            sb.append(str);
            Log.d(sb.toString());
            byte[] A3o = C002001d.A3o(bArr, str.getBytes(), 46);
            if (A3o.length == 46) {
                return A3o;
            }
            throw new IllegalStateException("split byte counts do not match");
        }
        throw new IllegalArgumentException("callKey should be 32 bytes");
    }

    @Override // com.whatsapp.voipcalling.CryptoCallback
    public boolean generateE2EKeysV2(byte[] bArr, byte[] bArr2, String str) {
        if (bArr == null || bArr2 == null || bArr.length != 32 || bArr2.length != 46) {
            return false;
        }
        System.arraycopy(expandCallKey(bArr, str), 0, bArr2, 0, 46);
        return true;
    }

    @Override // com.whatsapp.voipcalling.CryptoCallback
    public boolean generateRandomBytes(byte[] bArr) {
        this.secureRandom.nextBytes(bArr);
        return true;
    }

    public static byte[] generateSecureSsrc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] A3p = C002001d.A3p(bArr, bArr3, bArr2, 4);
        if (A3p.length == 4) {
            return A3p;
        }
        throw new IllegalStateException("split byte counts do not match");
    }

    @Override // com.whatsapp.voipcalling.CryptoCallback
    public boolean getSecureSsrc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null || bArr2 == null || bArr3 == null || bArr4 == null || bArr.length == 0 || bArr2.length == 0 || bArr3.length != 4) {
            return false;
        }
        System.arraycopy(generateSecureSsrc(bArr, bArr2, bArr3), 0, bArr4, 0, 4);
        return true;
    }
}
