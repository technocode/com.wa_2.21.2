package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Lx  reason: invalid class name and case insensitive filesystem */
public class C26671Lx {
    public static volatile C26671Lx A00;

    public static boolean A00(String str, String str2, AbstractC26661Lw r14) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(str2);
            JSONArray jSONArray = jSONObject2.getJSONArray("url");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                String string = jSONObject3.getString("regex");
                HashMap hashMap = new HashMap();
                Matcher matcher = Pattern.compile(string, 2).matcher(str);
                if (matcher.find()) {
                    int groupCount = matcher.groupCount();
                    if (groupCount >= 1) {
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("param");
                        int i2 = 0;
                        while (i2 < groupCount) {
                            i2++;
                            hashMap.put(jSONArray2.getJSONObject(i2).getString("name"), matcher.group(i2));
                        }
                    }
                    if (jSONObject2.has("opts")) {
                        jSONObject = jSONObject2.getJSONObject("opts");
                    } else {
                        jSONObject = new JSONObject();
                    }
                    if (jSONObject3.has("opts")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("opts");
                        Iterator<String> keys = jSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject.put(next, jSONObject4.get(next));
                        }
                    }
                    ((C73163Vs) r14).A00 = new JSONObject(hashMap);
                    return true;
                }
            }
        } catch (JSONException e) {
            Log.e(e);
        }
        return false;
    }
}
