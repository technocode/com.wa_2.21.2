package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0SZ  reason: invalid class name */
public class AnonymousClass0SZ {
    public static final AnonymousClass05W A00 = new AnonymousClass05W();

    public AnonymousClass037 A00(ClassLoader classLoader, String str) {
        if (!(this instanceof AnonymousClass0SY)) {
            throw null;
        }
        try {
            ClassLoader classLoader2 = ((AnonymousClass0SY) this).A00.A04.A01.getClassLoader();
            try {
                AnonymousClass05W r2 = A00;
                Class<?> cls = (Class) r2.getOrDefault(str, null);
                if (cls == null) {
                    cls = Class.forName(str, false, classLoader2);
                    r2.put(str, cls);
                }
                return (AnonymousClass037) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                throw new C15380nz(AnonymousClass008.A0L("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
            } catch (ClassCastException e2) {
                throw new C15380nz(AnonymousClass008.A0L("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
            }
        } catch (InstantiationException e3) {
            throw new C15380nz(AnonymousClass008.A0L("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (IllegalAccessException e4) {
            throw new C15380nz(AnonymousClass008.A0L("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new C15380nz(AnonymousClass008.A0L("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new C15380nz(AnonymousClass008.A0L("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e6);
        }
    }
}
