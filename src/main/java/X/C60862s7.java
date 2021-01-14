package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2s7  reason: invalid class name and case insensitive filesystem */
public class C60862s7 {
    public static volatile C60862s7 A04;
    public final AnonymousClass00S A00;
    public final C63842x6 A01;
    public final C63852x7 A02;
    public final JniBridge A03;

    public C60862s7(AnonymousClass00S r1, JniBridge jniBridge, C63842x6 r3, C63852x7 r4) {
        this.A00 = r1;
        this.A03 = jniBridge;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static C60862s7 A00() {
        if (A04 == null) {
            AnonymousClass00S A002 = AnonymousClass00S.A00();
            JniBridge instance = JniBridge.getInstance();
            C63842x6 A003 = C63842x6.A00();
            if (C63852x7.A04 == null) {
                C63852x7.A04 = new C63852x7(AnonymousClass00G.A01, C02010Ah.A00());
            }
            A04 = new C60862s7(A002, instance, A003, C63852x7.A04);
        }
        return A04;
    }

    public static final String A01(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clientDeviceID", str);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("clientReferenceID", str2);
        }
        jSONObject.put("vProvisionedTokenID", str3);
        jSONObject.put("nonce", String.valueOf(new SecureRandom().nextInt(100000)));
        return jSONObject.toString();
    }

    public static String A02(BigInteger bigInteger) {
        if (bigInteger == null) {
            return null;
        }
        try {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (length < 4) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = length - 1; i >= length - 4; i--) {
                sb.append(String.format("%02X", Byte.valueOf(byteArray[i])));
            }
            return sb.toString();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("PAY: getCertID: ");
            sb2.append(e);
            Log.e(sb2.toString());
            return null;
        }
    }

    public final String A03() {
        PrivateKey A002 = this.A02.A00();
        if (A002 == null) {
            return null;
        }
        StringBuilder A0S = AnonymousClass008.A0S("-----BEGIN PRIVATE KEY-----\r\n");
        A0S.append(Base64.encodeToString(A002.getEncoded(), 0));
        A0S.append("-----END PRIVATE KEY-----\r\n\u0000");
        return A0S.toString();
    }

    public String A04(String str, C68653Ea r23) {
        BigInteger bigInteger;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alg", "PS256");
            String obj = jSONObject.toString();
            String str2 = null;
            try {
                JSONObject put = new JSONObject().put("alg", "RSA-OAEP-256").put("enc", "A256GCM").put("typ", "JOSE");
                try {
                    bigInteger = ((RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(r23.A06))).getModulus();
                } catch (Exception e) {
                    Log.w("PAY: getModulusFromProviderKey failed: ", e);
                    bigInteger = null;
                }
                String encodeToString = Base64.encodeToString(put.put("kid", A02(bigInteger)).toString().getBytes("UTF-8"), 11);
                byte[] bArr = new byte[32];
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextBytes(bArr);
                try {
                    PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(r23.A06));
                    Cipher instance = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
                    instance.init(1, generatePublic);
                    String encodeToString2 = Base64.encodeToString(instance.doFinal(bArr), 11);
                    byte[] bArr2 = new byte[12];
                    secureRandom.nextBytes(bArr2);
                    String encodeToString3 = Base64.encodeToString(bArr2, 11);
                    byte[] bytes = encodeToString.getBytes("US-ASCII");
                    PrivateKey A002 = this.A02.A00();
                    if (A002 != null) {
                        byte[] bytes2 = new JSONObject().put("otp", str).put("certID", A02(((RSAKey) A002).getModulus())).toString().getBytes("UTF-8");
                        if (this.A03 != null) {
                            byte[] bArr3 = (byte[]) JniBridge.jvidispatchOIOOOO(4, (long) 16, bArr, bArr2, bytes2, bytes);
                            if (bArr3 != null) {
                                int length = bytes2.length;
                                str2 = TextUtils.join(".", new String[]{encodeToString, encodeToString2, encodeToString3, Base64.encodeToString(Arrays.copyOfRange(bArr3, 0, length), 11), Base64.encodeToString(Arrays.copyOfRange(bArr3, length, bArr3.length), 11)});
                            }
                        } else {
                            throw null;
                        }
                    }
                } catch (Exception e2) {
                    StringBuilder A0S = AnonymousClass008.A0S("PAY: encryptCek");
                    A0S.append(e2.toString());
                    Log.w(A0S.toString());
                    throw new RuntimeException(e2);
                }
            } catch (Exception e3) {
                Log.w("PAY: generateStepUpJweToken failed: ", e3);
            }
            return A05(obj, str2);
        } catch (JSONException e4) {
            Log.w("PAY: generateJwsTokenForCode failed: ", e4);
            return null;
        }
    }

    public final String A05(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            String join = TextUtils.join(".", new String[]{Base64.encodeToString(str.getBytes("UTF-8"), 11), Base64.encodeToString(str2.getBytes("UTF-8"), 11)});
            String A032 = A03();
            if (!TextUtils.isEmpty(A032)) {
                JniBridge jniBridge = this.A03;
                byte[] bytes = join.getBytes();
                byte[] bytes2 = A032.getBytes();
                if (jniBridge != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(join);
                    sb.append(".");
                    sb.append(Base64.encodeToString((byte[]) JniBridge.jvidispatchOOO(7, bytes, bytes2), 11));
                    return sb.toString();
                }
                throw null;
            }
        } catch (UnsupportedEncodingException e) {
            Log.w("PAY: generateJwsToken threw UnsupportedEncoding Exception: ", e);
        }
        return null;
    }

    public final String A06(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", "PS256");
        jSONObject.put("typ", "JOSE");
        jSONObject.put("kid", this.A01.A02());
        if (z) {
            jSONObject.put("iat", this.A00.A05() / 1000);
        }
        return jSONObject.toString();
    }
}
