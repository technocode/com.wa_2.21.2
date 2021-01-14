package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: X.1BK  reason: invalid class name */
public class AnonymousClass1BK {
    public static Context A00;
    public static AnonymousClass1BM A01;

    public static Context A00(Context context) {
        Context context2;
        Context context3 = A00;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = AnonymousClass196.A01(context, AnonymousClass196.A08, "com.google.android.gms.maps_dynamite").A00;
        } catch (Exception e) {
            Log.e("zzbz", "Failed to load maps module, use legacy", e);
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
        }
        A00 = context2;
        return context2;
    }

    public static AnonymousClass1BM A01(Context context) {
        AnonymousClass1BM r2;
        C001801b.A1Q(context);
        AnonymousClass1BM r0 = A01;
        if (r0 != null) {
            return r0;
        }
        int A002 = AnonymousClass0LV.A00(context, 13400000);
        if (A002 == 0) {
            Log.i("zzbz", "Making Creator dynamically");
            ClassLoader classLoader = A00(context).getClassLoader();
            try {
                C001801b.A1Q(classLoader);
                Class<?> loadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
                try {
                    IBinder iBinder = (IBinder) loadClass.newInstance();
                    if (iBinder == null) {
                        r2 = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                        if (queryLocalInterface instanceof AnonymousClass1BM) {
                            r2 = (AnonymousClass1BM) queryLocalInterface;
                        } else {
                            r2 = new C35971lN(iBinder);
                        }
                    }
                    A01 = r2;
                    try {
                        r2.ARt(new BinderC04800Lv(A00(context).getResources()), 12451000);
                        return A01;
                    } catch (RemoteException e) {
                        throw new AnonymousClass06B(e);
                    }
                } catch (InstantiationException unused) {
                    String name = loadClass.getName();
                    throw new IllegalStateException(name.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name) : new String("Unable to instantiate the dynamic class "));
                } catch (IllegalAccessException unused2) {
                    String name2 = loadClass.getName();
                    throw new IllegalStateException(name2.length() != 0 ? "Unable to call the default constructor of ".concat(name2) : new String("Unable to call the default constructor of "));
                }
            } catch (ClassNotFoundException unused3) {
                throw new IllegalStateException("com.google.android.gms.maps.internal.CreatorImpl".length() != 0 ? "Unable to find dynamic class ".concat("com.google.android.gms.maps.internal.CreatorImpl") : new String("Unable to find dynamic class "));
            }
        } else {
            throw new AnonymousClass16s(A002);
        }
    }
}
