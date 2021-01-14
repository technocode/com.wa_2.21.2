package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2th  reason: invalid class name and case insensitive filesystem */
public class C61762th {
    public static final byte[] A04 = Base64.decode("l6AjIyMhJYdTCB0+urtee7k2HmerRdr4c6seZyY2Pmw=", 2);
    public static final byte[] A05 = Base64.decode("oHsO+vVXYHOZXitgkZS2DI9N4+L+klLpMby3+JOPVGo=", 2);
    public static volatile C61762th A06;
    public final AnonymousClass00S A00;
    public final C61752tg A01;
    public final C018809u A02 = C018809u.A00("PaymentsProviderKeyManager", "infra", "COMMON");
    public final C64412y9 A03;

    public C61762th(AnonymousClass00S r4, C64412y9 r5, C61752tg r6) {
        this.A00 = r4;
        this.A03 = r5;
        this.A01 = r6;
    }

    public static C61762th A00() {
        if (A06 == null) {
            synchronized (C61762th.class) {
                if (A06 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C64412y9 r3 = C64412y9.A00;
                    if (C61752tg.A03 == null) {
                        synchronized (C61752tg.class) {
                            if (C61752tg.A03 == null) {
                                C61752tg.A03 = new C61752tg(AnonymousClass022.A00());
                            }
                        }
                    }
                    A06 = new C61762th(A002, r3, C61752tg.A03);
                }
            }
        }
        return A06;
    }

    public C68653Ea A01(AnonymousClass0M5 r15) {
        byte[] bArr;
        Long valueOf;
        byte[] bytes;
        String A0F = r15.A0F("key-type");
        String A0F2 = r15.A0F("provider");
        String A0F3 = r15.A0F("key-version");
        String A0F4 = r15.A0F("key-scope");
        String A0G = r15.A0G("expiry-ts", null);
        if ("none".equals(A0F)) {
            bArr = null;
        } else {
            bArr = r15.A0E("data").A01;
        }
        byte[] bArr2 = r15.A0E("signature").A01;
        if (bArr2 != null) {
            if (TextUtils.isEmpty(A0G)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(C006803i.A04(A0G, 0));
            }
            C68653Ea r7 = new C68653Ea(A0F2, A0F4, A0F, A0F3, bArr, valueOf);
            if (this.A03 != null) {
                byte[] bArr3 = A04;
                int length = bArr3.length;
                if (length == 32) {
                    byte[][] bArr4 = new byte[6][];
                    bArr4[0] = r7.A05.getBytes();
                    bArr4[1] = r7.A03.getBytes();
                    bArr4[2] = r7.A04.getBytes();
                    byte[] bArr5 = r7.A06;
                    if (bArr5 == null) {
                        bArr5 = new byte[0];
                    }
                    bArr4[3] = bArr5;
                    bArr4[4] = r7.A02.getBytes();
                    Long l = r7.A01;
                    if (l == null) {
                        bytes = new byte[0];
                    } else {
                        bytes = String.valueOf(l).getBytes();
                    }
                    bArr4[5] = bytes;
                    if (C11580gY.A00().A03(bArr3, C05360Of.A08(bArr4), bArr2)) {
                        return r7;
                    }
                    return null;
                }
                StringBuilder A0S = AnonymousClass008.A0S("Wrong length: ");
                A0S.append(length);
                throw new IllegalArgumentException(A0S.toString());
            }
            throw null;
        }
        throw null;
    }

    public C68653Ea A02(String str, String str2, boolean z) {
        C68653Ea r9;
        Long l;
        C61752tg r4 = this.A01;
        String string = r4.A00().getString(AnonymousClass008.A0L(str, "::", str2), null);
        if (TextUtils.isEmpty(string)) {
            C018809u r7 = r4.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("getProviderKey/provider=");
            sb.append(str);
            sb.append(" is null");
            r7.A03(sb.toString());
        } else {
            try {
                JSONObject jSONObject = new JSONObject(string);
                String optString = jSONObject.optString("key_type");
                String optString2 = jSONObject.optString("key_version");
                String optString3 = jSONObject.optString("key_data");
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || (!"none".equals(optString) && TextUtils.isEmpty(optString3))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getProviderKey/provider=");
                    sb2.append(str);
                    sb2.append(" providerKey is null");
                    StringBuilder sb3 = new StringBuilder(C018809u.A01("PaymentProviderKeySharedPrefs", sb2.toString()));
                    if (TextUtils.isEmpty(optString)) {
                        sb3.append(" keyType is null");
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        sb3.append(" keyVersion is null");
                    }
                    if (!"none".equals(optString) && TextUtils.isEmpty(optString3)) {
                        sb3.append(" keyData is null");
                    }
                    Log.e(sb3.toString());
                } else {
                    String optString4 = jSONObject.optString("key_expiry");
                    r9 = new C68653Ea(str, str2, optString, optString2, Base64.decode(optString3, 2), TextUtils.isEmpty(optString4) ? null : Long.valueOf(C006803i.A04(optString4, 0)));
                    if (z || r9 == null || (l = r9.A01) == null || l.longValue() * 1000 >= this.A00.A05()) {
                        return r9;
                    }
                    r4.A00().edit().remove(AnonymousClass008.A0L(str, "::", str2)).apply();
                    return null;
                }
            } catch (JSONException e) {
                C018809u r72 = r4.A01;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("getProviderKey/provider=");
                sb4.append(str);
                sb4.append(" threw: ");
                r72.A08(sb4.toString(), e);
            }
        }
        r9 = null;
        if (z) {
        }
        return r9;
    }

    public void A03(C68653Ea r9) {
        C61752tg r4 = this.A01;
        String str = r9.A02;
        SharedPreferences.Editor edit = r4.A00().edit();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key_type", r9.A03).put("key_version", r9.A04);
            byte[] bArr = r9.A06;
            if (bArr != null) {
                jSONObject.put("key_data", Base64.encodeToString(bArr, 2));
            }
            Long l = r9.A01;
            if (l != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(l);
                jSONObject.put("key_expiry", sb.toString());
            }
            edit.putString(AnonymousClass008.A0L(r9.A05, "::", str), jSONObject.toString());
            edit.apply();
        } catch (JSONException e) {
            C018809u r2 = r4.A01;
            StringBuilder sb2 = new StringBuilder("storeProviderKey threw ");
            sb2.append(e);
            r2.A04(sb2.toString());
        }
    }

    public void A04(String str, String str2, C61072sS r7) {
        this.A01.A00().edit().remove(AnonymousClass008.A0L(str, "::", str2)).apply();
        AnonymousClass0M5 r0 = r7.keyNode;
        if (r0 != null) {
            try {
                C68653Ea A012 = A01(r0);
                if (A012 != null) {
                    A03(A012);
                }
            } catch (AnonymousClass1XC e) {
                C018809u r2 = this.A02;
                StringBuilder sb = new StringBuilder("handleStaleKey/failed to parse key node/exception: ");
                sb.append(e);
                r2.A04(sb.toString());
            }
        }
    }
}
