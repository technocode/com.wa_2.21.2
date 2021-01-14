package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.DeadObjectException;
import com.whatsapp.util.Log;

/* renamed from: X.0wE  reason: invalid class name and case insensitive filesystem */
public class C20150wE {
    public final Context A00;
    public final C20160wF A01;
    public final String A02;
    public final String A03;

    public C20150wE(C20160wF r6, Context context, String str) {
        String str2;
        String[] strArr = C20140wD.A00;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = null;
                break;
            }
            str2 = strArr[i];
            if (C20130wC.A01(context, str2)) {
                break;
            }
            i++;
        }
        this.A03 = str2;
        this.A01 = r6;
        this.A00 = context;
        this.A02 = str;
    }

    public void A00() {
        String str;
        if (this.A01.A00 && (str = this.A03) != null) {
            Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER");
            Context context = this.A00;
            intent.putExtra("pkg_name", context.getPackageName());
            intent.putExtra("appid", this.A02);
            if ("com.facebook.services".equals(str) || "com.facebook.services.dev".equals(str)) {
                ComponentName componentName = null;
                try {
                    intent.setComponent(new ComponentName(str, "com.facebook.oxygen.services.fbns.PreloadedFbnsService"));
                    C20130wC.A00(context, intent);
                    componentName = context.startService(intent);
                } catch (IllegalStateException e) {
                    if (Build.VERSION.SDK_INT < 26) {
                        throw e;
                    }
                } catch (SecurityException unused) {
                } catch (RuntimeException e2) {
                    if (!(e2.getCause() instanceof DeadObjectException)) {
                        throw e2;
                    }
                }
                if (componentName != null) {
                    return;
                }
            }
            Log.d("FBNSPreloadClient/register failed");
        }
    }
}
