package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0HH  reason: invalid class name */
public class AnonymousClass0HH {
    public static volatile AnonymousClass0HH A03;
    public SharedPreferences A00;
    public final AnonymousClass022 A01;
    public final TreeMap A02 = new TreeMap();

    public AnonymousClass0HH(AnonymousClass022 r2) {
        this.A01 = r2;
    }

    public static AnonymousClass0HH A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0HH.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0HH(AnonymousClass022.A00());
                }
            }
        }
        return A03;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A01("user_notice_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public AnonymousClass357 A02() {
        SharedPreferences A012 = A01();
        int i = A012.getInt("current_user_notice_id", -1);
        if (i == -1) {
            return null;
        }
        return new AnonymousClass357(i, A012.getInt("current_user_notice_stage", 0), A012.getLong("current_user_notice_stage_timestamp", 0), A012.getInt("current_user_notice_version", 0));
    }

    public TreeMap A03() {
        String string;
        AnonymousClass357 r6;
        TreeMap treeMap = this.A02;
        if (treeMap.isEmpty() && (string = A01().getString("user_notices", null)) != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.get(next).toString());
                    try {
                        r6 = new AnonymousClass357(jSONObject2.getInt("id"), jSONObject2.getInt("stage"), jSONObject2.getLong("t"), jSONObject2.getInt("version"));
                    } catch (JSONException e) {
                        Log.e("UserNoticeMetadata/fromJSON exception: ", e);
                        r6 = null;
                    }
                    treeMap.put(Integer.valueOf(next), r6);
                }
            } catch (JSONException e2) {
                Log.e("UserNoticeSharedPreferences/getUserNoticeMap/parsing failed", e2);
            }
        }
        return treeMap;
    }

    public void A04(AnonymousClass357 r6) {
        SharedPreferences.Editor edit = A01().edit();
        int i = r6.A00;
        edit.putInt("current_user_notice_id", i).putInt("current_user_notice_stage", r6.A01).putLong("current_user_notice_stage_timestamp", r6.A03).putInt("current_user_notice_version", r6.A02).apply();
        TreeMap A032 = A03();
        A032.put(Integer.valueOf(i), r6);
        A05(new ArrayList(A032.values()));
    }

    public void A05(List list) {
        HashMap hashMap = new HashMap();
        TreeMap treeMap = this.A02;
        treeMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass357 r6 = (AnonymousClass357) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                int i = r6.A00;
                jSONObject.put("id", i);
                jSONObject.put("stage", r6.A01);
                jSONObject.put("t", r6.A03);
                jSONObject.put("version", r6.A02);
                hashMap.put(String.valueOf(i), jSONObject.toString());
                treeMap.put(Integer.valueOf(i), r6);
            } catch (JSONException e) {
                Log.e("UserNoticeMetadata/toJSON exception: ", e);
            }
        }
        A01().edit().putString("user_notices", new JSONObject(hashMap).toString()).apply();
    }
}
