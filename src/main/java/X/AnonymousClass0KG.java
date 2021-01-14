package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0KG  reason: invalid class name */
public class AnonymousClass0KG implements AnonymousClass0KF {
    public final AnonymousClass00G A00;

    public AnonymousClass0KG(AnonymousClass00G r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0KF
    public Intent A93(int i, List list) {
        String str;
        String str2;
        if (i == 5 || i == 4) {
            return null;
        }
        if (i == 1) {
            str = "image/png";
        } else {
            str = (i == 2 || i == 4) ? "video/mp4" : "*/*";
        }
        if (i == 5 || i == 3 || i == 1) {
            str2 = "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias";
        } else {
            str2 = "com.facebook.lite.composer.activities.ShareIntentVideoAlphabeticalAlias";
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            JSONObject jSONObject = new JSONObject();
            AnonymousClass32D r12 = (AnonymousClass32D) list.get(i2);
            Uri uri = r12.A02;
            try {
                jSONObject.put("story_media_caption", r12.A03);
                jSONObject.put("story_media_uri", uri.toString());
                jSONObject.put("story_media_video_length_sec", r12.A01);
                jSONObject.put("story_media_aspect_ratio", r12.A00);
                jSONObject.put("story_media_link_url", r12.A04);
                jSONArray.put(jSONObject.toString());
                arrayList.add(uri);
            } catch (JSONException e) {
                Log.w("liteposter/json", e);
            }
        }
        Intent putExtra = new Intent().setType(str).setPackage("com.facebook.lite").setComponent(new ComponentName("com.facebook.lite", str2)).addFlags(268435456).putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).putExtra("media_list", jSONArray.toString());
        if (list.size() == 1) {
            putExtra.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", ((AnonymousClass32D) list.get(0)).A02);
        } else if (list.size() > 1) {
            putExtra.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(putExtra, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
            return null;
        }
        return putExtra;
    }

    @Override // X.AnonymousClass0KF
    public boolean ABg() {
        Intent intent = new Intent();
        intent.setPackage("com.facebook.lite").setType("image/png").setComponent(new ComponentName("com.facebook.lite", "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias"));
        AnonymousClass00G r3 = this.A00;
        try {
            List<ResolveInfo> queryIntentActivities = r3.A00.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            try {
                if (Integer.parseInt(r3.A00.getPackageManager().getPackageInfo("com.facebook.lite", 0).versionName.split("\\.")[0]) >= 91) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                Log.w("Cannot get FBLite version number", e);
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
