package X;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* renamed from: X.16m  reason: invalid class name and case insensitive filesystem */
public class C235816m {
    public static final ComponentName A00 = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final AnonymousClass18U A01 = new AnonymousClass18U("Auth", "GoogleAuthUtil");
    public static final String[] A02 = {"com.google", "com.google.work", "cn.google"};

    public static Object A00(Context context, ComponentName componentName, AbstractC235916n r11) {
        AnonymousClass16r r7 = new AnonymousClass16r();
        AbstractC238817y A002 = AbstractC238817y.A00(context);
        if (A002 == null) {
            throw null;
        } else if (A002.A02(new C238717x(componentName), r7, "GoogleAuthUtil")) {
            try {
                C001801b.A1U("BlockingServiceConnection.getService() called on main thread");
                if (!r7.A00) {
                    r7.A00 = true;
                    Object AS9 = r11.AS9((IBinder) r7.A01.take());
                    A002.A01(new C238717x(componentName), r7, "GoogleAuthUtil");
                    return AS9;
                }
                throw new IllegalStateException("Cannot call get on this connection more than once");
            } catch (RemoteException | InterruptedException e) {
                Log.i("Auth", A01.A00("GoogleAuthUtil", "Error on service connection.", e));
                throw new IOException("Error on service connection.", e);
            } catch (Throwable th) {
                A002.A01(new C238717x(componentName), r7, "GoogleAuthUtil");
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }

    public static void A01(Account account) {
        if (!TextUtils.isEmpty(account.name)) {
            for (String str : A02) {
                if (str.equals(account.type)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
        throw new IllegalArgumentException("Account name cannot be empty!");
    }

    public static void A02(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            AnonymousClass0LQ r1 = AnonymousClass0LQ.A00;
            int A002 = r1.A00(applicationContext, 8400000);
            if (A002 != 0) {
                Intent A012 = r1.A01(applicationContext, A002, "e");
                StringBuilder sb = new StringBuilder(57);
                sb.append("GooglePlayServices not available due to error ");
                sb.append(A002);
                Log.e("GooglePlayServicesUtil", sb.toString());
                if (A012 == null) {
                    throw new AnonymousClass16s(A002);
                }
                throw new C34681iz(A002, A012);
            }
        } catch (C34681iz e) {
            throw new C456025m(e.zzaf, e.getMessage(), new Intent(e.mIntent));
        } catch (AnonymousClass16s e2) {
            throw new AnonymousClass16O(e2.getMessage());
        }
    }

    public static void A03(Object obj) {
        if (obj == null) {
            Log.w("Auth", A01.A00("GoogleAuthUtil", "Binder call returned null."));
            throw new IOException("Service unavailable.");
        }
    }
}
