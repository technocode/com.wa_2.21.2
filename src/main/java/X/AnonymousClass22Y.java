package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.22Y  reason: invalid class name */
public final class AnonymousClass22Y extends AbstractC29021Ws {
    @Override // X.AbstractC29021Ws
    public void A01(Context context, int i) {
        if (Build.VERSION.SDK_INT < 22) {
            String packageName = context.getPackageName();
            try {
                Uri parse = Uri.parse("content://com.sec.badge/apps");
                ContentResolver contentResolver = context.getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("package", packageName);
                contentValues.put("class", "com.whatsapp.Main");
                contentValues.put("badgecount", Integer.valueOf(i));
                if (contentResolver.update(parse, contentValues, "package=? AND class=?", new String[]{packageName, "com.whatsapp.Main"}) == 0) {
                    contentResolver.insert(parse, contentValues);
                }
            } catch (Exception e) {
                Log.e("widgetprovider/updatebadge", e);
            }
        } else {
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", context.getPackageName());
            intent.putExtra("badge_count_class_name", "com.whatsapp.Main");
            context.sendBroadcast(intent);
        }
    }
}
