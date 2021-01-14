package X;

import dalvik.system.PathClassLoader;

/* renamed from: X.198  reason: invalid class name */
public final class AnonymousClass198 extends PathClassLoader {
    public AnonymousClass198(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
