package X;

import com.whatsapp.util.Log;

/* renamed from: X.3AP  reason: invalid class name */
public abstract class AnonymousClass3AP {
    public static volatile AnonymousClass3AP SELF;

    public abstract AbstractC02170Ax attain(Class cls);

    public abstract void onBloksLoaded();

    public abstract AnonymousClass3VU ui();

    public static AnonymousClass3AP get() {
        try {
            AnonymousClass3AP r0 = SELF;
            if (r0 != null) {
                return r0;
            }
            throw null;
        } catch (NullPointerException e) {
            throw new AnonymousClass3AS(e);
        }
    }

    public static boolean isLoaded() {
        Class<?> loadClass;
        if (SELF == null) {
            synchronized (AnonymousClass3AP.class) {
                if (SELF == null) {
                    AnonymousClass3AP r2 = null;
                    try {
                        ClassLoader classLoader = AnonymousClass3AX.A00.getClass().getClassLoader();
                        if (!(classLoader == null || (loadClass = classLoader.loadClass("com.whatsapp.wabloks.WaBloksBridge")) == null)) {
                            r2 = (AnonymousClass3AP) loadClass.newInstance();
                        }
                    } catch (ClassNotFoundException e) {
                        Log.e(e);
                    } catch (IllegalAccessException e2) {
                        Log.e(e2);
                    } catch (InstantiationException e3) {
                        Log.e(e3);
                    }
                    SELF = r2;
                }
            }
        }
        return SELF != null;
    }

    public static AbstractC02170Ax lazy(Class cls) {
        return get().attain(cls);
    }
}
