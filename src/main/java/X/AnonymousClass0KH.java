package X;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0KH  reason: invalid class name */
public class AnonymousClass0KH implements AnonymousClass0KF {
    public final AnonymousClass00G A00;

    public AnonymousClass0KH(AnonymousClass00G r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0KF
    public Intent A93(int i, List list) {
        String str;
        if (i == 1 || i == 3) {
            str = "image/png";
        } else {
            str = "video/mp4";
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < list.size(); i2++) {
            AnonymousClass32D r8 = (AnonymousClass32D) list.get(i2);
            Bundle bundle = new Bundle();
            bundle.putString("story_media_caption", r8.A03);
            bundle.putParcelable("story_media_uri", r8.A02);
            bundle.putInt("story_media_video_length_sec", r8.A01);
            bundle.putDouble("story_media_aspect_ratio", r8.A00);
            String str2 = r8.A04;
            if (str2 != null) {
                bundle.putString("story_media_link_url", str2);
            }
            arrayList.add(bundle);
        }
        Intent putParcelableArrayListExtra = new Intent().setAction("com.facebook.stories.ADD_TO_STORY").setPackage("com.facebook.katana").putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).setType(str).putParcelableArrayListExtra("media_list", arrayList);
        List<ResolveInfo> queryIntentActivities = this.A00.A00.getPackageManager().queryIntentActivities(putParcelableArrayListExtra, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
            return null;
        }
        return putParcelableArrayListExtra;
    }

    @Override // X.AnonymousClass0KF
    public boolean ABg() {
        Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
        intent.setPackage("com.facebook.katana");
        intent.setType("image/png");
        AnonymousClass00G r3 = this.A00;
        try {
            List<ResolveInfo> queryIntentActivities = r3.A00.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            try {
                if (Integer.parseInt(r3.A00.getPackageManager().getPackageInfo("com.facebook.katana", 0).versionName.split("\\.")[0]) >= 227) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                Log.w("Cannot get FB version number", e);
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
