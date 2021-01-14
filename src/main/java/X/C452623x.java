package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.23x  reason: invalid class name and case insensitive filesystem */
public class C452623x extends C30271b3 {
    public static C452623x A01;
    public Application A00;

    public C452623x(Application application) {
        this.A00 = application;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (!C30231ay.class.isAssignableFrom(cls)) {
            return super.A3B(cls);
        }
        try {
            return (AnonymousClass0SD) cls.getConstructor(Application.class).newInstance(this.A00);
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (InstantiationException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create an instance of ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Cannot create an instance of ");
            sb4.append(cls);
            throw new RuntimeException(sb4.toString(), e4);
        }
    }
}
