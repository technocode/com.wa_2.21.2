package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Xr  reason: invalid class name and case insensitive filesystem */
public class C29251Xr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final C03960Il[] A06;

    public C29251Xr(C03960Il[] r1, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A06 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A00 = str5;
        this.A05 = z;
    }

    public static C29251Xr A00(byte[] bArr) {
        String str;
        Object opt;
        if (bArr == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
            ArrayList arrayList = new ArrayList();
            if (jSONObject.has("emojis") && (opt = jSONObject.opt("emojis")) != null) {
                if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i, null);
                        if (optString != null) {
                            arrayList.add(C002001d.A0w(optString));
                        }
                    }
                } else if (opt instanceof String) {
                    String str2 = (String) opt;
                    int length = str2.length();
                    if (length > 2) {
                        String[] split = str2.substring(1, length - 1).split(",");
                        for (String str3 : split) {
                            if (str3 != null) {
                                arrayList.add(C002001d.A0w(str3));
                            }
                        }
                    }
                } else {
                    StringBuilder A0S = AnonymousClass008.A0S("StickerMetadata/createFromWebpMetadata unrecognizable type of emoji metadata:");
                    A0S.append(opt.getClass());
                    Log.w(A0S.toString());
                }
            }
            if (jSONObject.has("sticker-pack-id")) {
                str = jSONObject.optString("sticker-pack-id", null);
            } else {
                Log.d("StickerMetadata/createFromWebpMetadata no sticker pack id added");
                str = null;
            }
            C03960Il[] r6 = !arrayList.isEmpty() ? (C03960Il[]) arrayList.toArray(new C03960Il[0]) : null;
            String optString2 = jSONObject.optString("sticker-pack-name", null);
            String optString3 = jSONObject.optString("sticker-pack-publisher", null);
            String optString4 = jSONObject.optString("android-app-store-link", null);
            String optString5 = jSONObject.optString("ios-app-store-link", null);
            boolean z = false;
            if (jSONObject.optInt("is-first-party-sticker", 0) == 1) {
                z = true;
            }
            return new C29251Xr(r6, str, optString2, optString3, optString4, optString5, z);
        } catch (JSONException unused) {
            Log.e("WebpUtils/extractWebpMetadata invalid metadata");
            return null;
        } catch (UnsupportedEncodingException unused2) {
            Log.e("WebpUtils/extractWebpMetadata invalid metadata encoding");
            return null;
        }
    }

    public byte[] A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sticker-pack-id", this.A01);
            jSONObject.put("sticker-pack-name", this.A02);
            jSONObject.put("sticker-pack-publisher", this.A04);
            String str = this.A03;
            if (str != null) {
                jSONObject.put("android-app-store-link", str);
            }
            String str2 = this.A00;
            if (str2 != null) {
                jSONObject.put("ios-app-store-link", str2);
            }
            C03960Il[] r4 = this.A06;
            if (r4 != null) {
                int length = r4.length;
                ArrayList arrayList = new ArrayList(length);
                for (C03960Il r0 : r4) {
                    arrayList.add(r0.toString());
                }
                jSONObject.put("emojis", new JSONArray((Collection) arrayList));
            }
            if (this.A05) {
                jSONObject.put("is-first-party-sticker", 1);
            }
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            Log.e("StickerMetadata/convertToBytes error during JSON conversion", e);
            return null;
        }
    }

    public String toString() {
        String obj;
        StringBuffer stringBuffer = new StringBuffer("StickerMetadata{");
        stringBuffer.append("emojis=");
        C03960Il[] r0 = this.A06;
        if (r0 == null) {
            obj = "null";
        } else {
            obj = Arrays.asList(r0).toString();
        }
        stringBuffer.append(obj);
        stringBuffer.append(", isFirstPartySticker=");
        stringBuffer.append(this.A05);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
