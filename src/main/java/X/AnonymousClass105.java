package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.phoneid.PhoneIdRequestReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.105  reason: invalid class name */
public abstract class AnonymousClass105 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        AnonymousClass0PC A8L = ((PhoneIdRequestReceiver) this).A00.A8L();
        if ("com.facebook.GET_PHONE_ID".equals(intent.getAction())) {
            Bundle resultExtras = getResultExtras(true);
            PendingIntent pendingIntent = (PendingIntent) resultExtras.getParcelable("auth");
            if (pendingIntent == null) {
                StringBuilder sb = new StringBuilder("phoneid-request-receiver/on-receive invalid auth intent; data=");
                sb.append(resultExtras);
                Log.e(sb.toString());
                return;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                str = pendingIntent.getCreatorPackage();
            } else {
                str = pendingIntent.getTargetPackage();
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    str2 = null;
                } else {
                    str2 = C003701u.A01(signatureArr[0]);
                }
                if (AnonymousClass1YJ.A00.contains(str2)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("timestamp", A8L.A00);
                    setResult(-1, A8L.A01, bundle);
                }
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sb2 = new StringBuilder("cannot find package; packageName=");
                sb2.append(str);
                Log.e(sb2.toString(), e);
            }
        }
    }
}
