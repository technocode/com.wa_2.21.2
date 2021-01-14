package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ld  reason: invalid class name and case insensitive filesystem */
public class C26491Ld {
    public static volatile C26491Ld A03;
    public final AnonymousClass02M A00;
    public final AnonymousClass01X A01;
    public final AnonymousClass325 A02;

    public C26491Ld(AnonymousClass02M r1, AnonymousClass325 r2, AnonymousClass01X r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static C26491Ld A00() {
        if (A03 == null) {
            synchronized (C26491Ld.class) {
                if (A03 == null) {
                    A03 = new C26491Ld(AnonymousClass02M.A00(), AnonymousClass325.A00(), AnonymousClass01X.A00());
                }
            }
        }
        return A03;
    }

    public boolean A01(Intent intent, Context context, AbstractC004502c r12, String str, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String str2 = activityInfo.name;
                    String str3 = activityInfo.applicationInfo.packageName;
                    Intent intent2 = new Intent(intent);
                    intent2.setClassName(str3, str2);
                    intent2.setPackage(str3);
                    StringBuilder sb = new StringBuilder("email-sender/app ");
                    sb.append(str3);
                    sb.append(" | ");
                    sb.append(str2);
                    Log.i(sb.toString());
                    if (str3.contains("gm") || str3.contains("email") || str3.contains("fsck.k9") || str3.contains("maildroid") || str3.contains("hotmail") || str3.contains("android.mail") || str3.contains("com.baydin.boomerang") || str3.contains("yandex.mail") || str3.contains("com.google.android.apps.inbox") || str3.contains("com.microsoft.office.outlook") || str3.contains("com.asus.email") || str3.equals("org.kman.AquaMail")) {
                        arrayList.add(intent2);
                    }
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                if (r12 != null) {
                    r12.APo(R.string.error_no_email_client);
                    return false;
                }
                this.A00.A06(R.string.error_no_email_client, 0);
                return false;
            } else if (size == 1) {
                context.startActivity((Intent) arrayList.get(0));
                return true;
            } else {
                int i = size - 1;
                Object obj = arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(0, obj);
                context.startActivity(C002001d.A0S(arrayList, str, null));
                return true;
            }
        } else {
            try {
                context.startActivity(Intent.createChooser(intent, str));
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("email-sender/start-activity ", e);
                this.A00.A06(R.string.error_no_email_client, 0);
                return false;
            }
        }
    }
}
