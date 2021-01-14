package X;

import org.json.JSONObject;

/* renamed from: X.1Vr  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC28771Vr {
    public static String A00(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("error_code", i);
        jSONObject.put("error_message", str);
        return jSONObject.toString();
    }

    public static String A01(Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", true);
        jSONObject.putOpt("result", obj);
        return jSONObject.toString();
    }
}
