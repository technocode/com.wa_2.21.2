package X;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import java.lang.reflect.Field;

/* renamed from: X.1kR  reason: invalid class name and case insensitive filesystem */
public final class C35491kR implements AnonymousClass192 {
    @Override // X.AnonymousClass192
    public final int A79(Context context, String str) {
        String str2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                str2 = new String("Failed to load module descriptor class: ");
            }
            Log.e("DynamiteModule", str2);
            return 0;
        }
    }

    @Override // X.AnonymousClass192
    public final int ARf(Context context, String str, boolean z) {
        try {
            synchronized (AnonymousClass196.class) {
                Boolean bool = AnonymousClass196.A04;
                if (bool == null) {
                    try {
                        Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName());
                        Field declaredField = loadClass.getDeclaredField("sClassLoader");
                        synchronized (loadClass) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader != null) {
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        AnonymousClass196.A04(classLoader);
                                    } catch (AnonymousClass191 unused) {
                                    }
                                    bool = Boolean.TRUE;
                                }
                            } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int A00 = AnonymousClass196.A00(context, str, z);
                                    String str2 = AnonymousClass196.A05;
                                    if (str2 == null || str2.isEmpty()) {
                                        return A00;
                                    }
                                    AnonymousClass198 r1 = new AnonymousClass198(str2, ClassLoader.getSystemClassLoader());
                                    AnonymousClass196.A04(r1);
                                    declaredField.set(null, r1);
                                    AnonymousClass196.A04 = Boolean.TRUE;
                                    return A00;
                                } catch (AnonymousClass191 unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                    AnonymousClass196.A04 = bool;
                                    if (bool.booleanValue()) {
                                        try {
                                            return AnonymousClass196.A00(context, str, z);
                                        } catch (AnonymousClass191 e) {
                                            String valueOf = String.valueOf(e.getMessage());
                                            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                                            return 0;
                                        }
                                    } else {
                                        AnonymousClass199 A03 = AnonymousClass196.A03(context);
                                        if (A03 == null) {
                                            return 0;
                                        }
                                        try {
                                            if (A03.AS4() >= 2) {
                                                return A03.AS5(new BinderC04800Lv(context), str, z);
                                            }
                                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                            return A03.ARg(new BinderC04800Lv(context), str, z);
                                        } catch (RemoteException e2) {
                                            String valueOf2 = String.valueOf(e2.getMessage());
                                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                            return 0;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String valueOf3 = String.valueOf(e3);
                        StringBuilder sb = new StringBuilder(valueOf3.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf3);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                C001801b.A1Q(context);
                C001801b.A1Q(th);
                throw th;
            } catch (Exception e4) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
                throw th;
            }
        }
    }
}
