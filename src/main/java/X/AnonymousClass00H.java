package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/* renamed from: X.00H  reason: invalid class name */
public final class AnonymousClass00H {
    public static final Set A00 = new HashSet();
    public static final boolean A01;

    static {
        String str;
        String str2;
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str3 = null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreTokens()) {
                str3 = stringTokenizer.nextToken();
            }
            if (!(str2 == null || str3 == null)) {
                try {
                    int parseInt = Integer.parseInt(str2);
                    int parseInt2 = Integer.parseInt(str3);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder A0Y = AnonymousClass008.A0Y("VM with version ", property);
        if (z) {
            str = " has multidex support";
        } else {
            str = " does not have multidex support";
        }
        A0Y.append(str);
        Log.i("MultiDex", A0Y.toString());
        A01 = z;
    }

    public static Field A00(Object obj, String str) {
        Class<?> cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (declaredField.isAccessible()) {
                    return declaredField;
                }
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder A0Z = AnonymousClass008.A0Z("Field ", str, " not found in ");
        A0Z.append(cls);
        throw new NoSuchFieldException(A0Z.toString());
    }

    public static void A01(Context context) {
        Log.i("MultiDex", "Installing application");
        if (A01) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                try {
                    File file = new File(applicationInfo.sourceDir);
                    File file2 = new File(applicationInfo.dataDir);
                    Set set = A00;
                    synchronized (set) {
                        if (!set.contains(file)) {
                            set.add(file);
                            int i = Build.VERSION.SDK_INT;
                            if (i > 20) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("MultiDex is not guaranteed to work in SDK version ");
                                sb.append(i);
                                sb.append(": SDK version higher than ");
                                sb.append(20);
                                sb.append(" should be backed by ");
                                sb.append("runtime with built-in multidex capabilty but it's not the ");
                                sb.append("case here: java.vm.version=\"");
                                sb.append(System.getProperty("java.vm.version"));
                                sb.append("\"");
                                Log.w("MultiDex", sb.toString());
                            }
                            try {
                                ClassLoader classLoader = context.getClassLoader();
                                if (!(classLoader instanceof BaseDexClassLoader)) {
                                    Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                                } else if (classLoader != null) {
                                    try {
                                        File file3 = new File(context.getFilesDir(), "secondary-dexes");
                                        if (file3.isDirectory()) {
                                            StringBuilder A0S = AnonymousClass008.A0S("Clearing old secondary dex dir (");
                                            A0S.append(file3.getPath());
                                            A0S.append(").");
                                            Log.i("MultiDex", A0S.toString());
                                            File[] listFiles = file3.listFiles();
                                            if (listFiles == null) {
                                                StringBuilder A0S2 = AnonymousClass008.A0S("Failed to list secondary dex dir content (");
                                                A0S2.append(file3.getPath());
                                                A0S2.append(").");
                                                Log.w("MultiDex", A0S2.toString());
                                            } else {
                                                for (File file4 : listFiles) {
                                                    StringBuilder A0S3 = AnonymousClass008.A0S("Trying to delete old file ");
                                                    A0S3.append(file4.getPath());
                                                    A0S3.append(" of size ");
                                                    A0S3.append(file4.length());
                                                    Log.i("MultiDex", A0S3.toString());
                                                    if (!file4.delete()) {
                                                        StringBuilder A0S4 = AnonymousClass008.A0S("Failed to delete old file ");
                                                        A0S4.append(file4.getPath());
                                                        Log.w("MultiDex", A0S4.toString());
                                                    } else {
                                                        StringBuilder A0S5 = AnonymousClass008.A0S("Deleted old file ");
                                                        A0S5.append(file4.getPath());
                                                        Log.i("MultiDex", A0S5.toString());
                                                    }
                                                }
                                                if (!file3.delete()) {
                                                    StringBuilder A0S6 = AnonymousClass008.A0S("Failed to delete secondary dex dir ");
                                                    A0S6.append(file3.getPath());
                                                    Log.w("MultiDex", A0S6.toString());
                                                } else {
                                                    StringBuilder A0S7 = AnonymousClass008.A0S("Deleted old secondary dex dir ");
                                                    A0S7.append(file3.getPath());
                                                    Log.i("MultiDex", A0S7.toString());
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                                    }
                                    File file5 = new File(file2, "code_cache");
                                    try {
                                        A02(file5);
                                    } catch (IOException unused) {
                                        file5 = new File(context.getFilesDir(), "code_cache");
                                        A02(file5);
                                    }
                                    File file6 = new File(file5, "secondary-dexes");
                                    A02(file6);
                                    C003901w r2 = new C003901w(file, file6);
                                    try {
                                        try {
                                            A03(classLoader, file6, r2.A04(context, false));
                                        } catch (IOException e) {
                                            Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e);
                                            A03(classLoader, file6, r2.A04(context, true));
                                        }
                                        try {
                                        } catch (IOException e2) {
                                            throw e2;
                                        }
                                    } finally {
                                        try {
                                            r2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                }
                            } catch (RuntimeException e3) {
                                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e3);
                            }
                        }
                    }
                    Log.i("MultiDex", "install done");
                    return;
                } catch (Exception e4) {
                    Log.e("MultiDex", "MultiDex installation failure", e4);
                    StringBuilder A0S8 = AnonymousClass008.A0S("MultiDex installation failed (");
                    A0S8.append(e4.getMessage());
                    A0S8.append(").");
                    throw new RuntimeException(A0S8.toString());
                }
            }
        } catch (RuntimeException e5) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e5);
        }
        Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
    }

    public static void A02(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder A0S = AnonymousClass008.A0S("Failed to create dir ");
                A0S.append(file.getPath());
                A0S.append(". Parent file is null.");
                Log.e("MultiDex", A0S.toString());
            } else {
                StringBuilder A0S2 = AnonymousClass008.A0S("Failed to create dir ");
                A0S2.append(file.getPath());
                A0S2.append(". parent file is a dir ");
                A0S2.append(parentFile.isDirectory());
                A0S2.append(", a file ");
                A0S2.append(parentFile.isFile());
                A0S2.append(", exists ");
                A0S2.append(parentFile.exists());
                A0S2.append(", readable ");
                A0S2.append(parentFile.canRead());
                A0S2.append(", writable ");
                A0S2.append(parentFile.canWrite());
                Log.e("MultiDex", A0S2.toString());
            }
            StringBuilder A0S3 = AnonymousClass008.A0S("Failed to create directory ");
            A0S3.append(file.getPath());
            throw new IOException(A0S3.toString());
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(java.lang.ClassLoader r14, java.io.File r15, java.util.List r16) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00H.A03(java.lang.ClassLoader, java.io.File, java.util.List):void");
    }

    public static void A04(Object obj, String str, Object[] objArr) {
        Field A002 = A00(obj, str);
        Object[] objArr2 = (Object[]) A002.get(obj);
        Class<?> componentType = objArr2.getClass().getComponentType();
        int length = objArr2.length;
        int length2 = objArr.length;
        Object newInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(objArr2, 0, newInstance, 0, length);
        System.arraycopy(objArr, 0, newInstance, length, length2);
        A002.set(obj, newInstance);
    }
}
