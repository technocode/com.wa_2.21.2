package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.0so  reason: invalid class name and case insensitive filesystem */
public class C18110so {
    public static final String A00 = AbstractC17610rq.A01("PackageManagerHelper");

    public static void A00(Context context, Class cls, boolean z) {
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            String name = cls.getName();
            ComponentName componentName = new ComponentName(context, name);
            int i = 2;
            if (z) {
                i = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            AbstractC17610rq A002 = AbstractC17610rq.A00();
            String str2 = A00;
            Object[] objArr = new Object[2];
            objArr[0] = name;
            String str3 = "disabled";
            if (z) {
                str3 = str;
            }
            objArr[1] = str3;
            A002.A02(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            AbstractC17610rq A003 = AbstractC17610rq.A00();
            String str4 = A00;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            A003.A02(str4, String.format("%s could not be %s", objArr2), e);
        }
    }
}
