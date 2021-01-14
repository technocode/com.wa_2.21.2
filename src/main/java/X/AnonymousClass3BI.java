package X;

import android.content.Context;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3BI  reason: invalid class name */
public class AnonymousClass3BI {
    public final String A00;
    public final AnonymousClass3BE A01;

    public AnonymousClass3BI(AnonymousClass3BE r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public AnonymousClass3BM A00(Context context, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("txnId");
            String string2 = jSONObject.getString("credential");
            AnonymousClass3BA A002 = AnonymousClass3BA.A00(context);
            String string3 = A002.A02.A00.getString("k0", "");
            if (A002.A07()) {
                string3 = A002.A01("k0", "aes_k0", string3);
            }
            Matcher matcher = Pattern.compile("\\{([^}]*)\\}").matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            AnonymousClass3BM r3 = null;
            if (matcher.find()) {
                String group = matcher.group();
                String substring = group.substring(1, group.length() - 1);
                try {
                    AnonymousClass3BE r10 = this.A01;
                    String str4 = this.A00;
                    if (str4 == null || !str4.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (AnonymousClass3BC r1 : AnonymousClass3BE.A01) {
                            if (r1.A00.equals(str4)) {
                                arrayList.add(r1);
                            }
                        }
                        if (arrayList.size() != 0) {
                            AnonymousClass3BC r8 = (AnonymousClass3BC) arrayList.get(new SecureRandom().nextInt(arrayList.size()));
                            r10.A00 = r8.A02;
                            StringBuilder sb = new StringBuilder(500);
                            try {
                                String encodeToString = Base64.encodeToString(AnonymousClass1YV.A0e(AnonymousClass1YV.A0c(substring), AnonymousClass1YV.A0b(string3)), 2);
                                sb.append(string2);
                                sb.append("|");
                                sb.append(string);
                                sb.append("|");
                                sb.append(encodeToString);
                                try {
                                    byte[] bytes = sb.toString().getBytes();
                                    PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(r10.A00.getBytes("utf-8"), 2)));
                                    Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                                    instance.init(1, generatePublic);
                                    AnonymousClass3BM r0 = new AnonymousClass3BM(new AnonymousClass3BH(r8.A01, r8.A00, Base64.encodeToString(instance.doFinal(bytes), 2)));
                                    r3 = r0;
                                    r0.type = str2;
                                    r0.subType = str3;
                                    AnonymousClass3BH r2 = r0.data;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("2.0|");
                                    sb2.append(r2.encryptedBase64String);
                                    r2.encryptedBase64String = sb2.toString();
                                    matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(r3.data.encryptedBase64String.replaceAll("\n", "")));
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (Exception unused) {
                                throw new AnonymousClass3BF(AnonymousClass3BG.UNKNOWN_ERROR);
                            }
                        } else {
                            throw new AnonymousClass3BF(AnonymousClass3BG.KEY_CODE_INVALID);
                        }
                    } else {
                        throw new AnonymousClass3BF(AnonymousClass3BG.KEY_CODE_EMPTY);
                    }
                } catch (AnonymousClass3BF e2) {
                    StringBuilder A0S = AnonymousClass008.A0S("PAY: ");
                    A0S.append(e2.toString());
                    Log.e(A0S.toString());
                }
            }
            if (stringBuffer.length() > 0) {
                matcher.appendTail(stringBuffer);
            }
            if (r3 != null) {
                r3.data.encryptedBase64String = stringBuffer.toString();
            }
            return r3;
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }
}
