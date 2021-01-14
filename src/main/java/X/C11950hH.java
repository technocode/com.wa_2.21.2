package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0hH  reason: invalid class name and case insensitive filesystem */
public class C11950hH {
    public static C11950hH A02 = new C11950hH();
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public static final void A00(Map map, C11970hK r5, AnonymousClass082 r6, Class cls) {
        Object obj = map.get(r5);
        if (obj == null) {
            map.put(r5, r6);
        } else if (r6 != obj) {
            Method method = r5.A01;
            StringBuilder A0S = AnonymousClass008.A0S("Method ");
            A0S.append(method.getName());
            A0S.append(" in ");
            A0S.append(cls.getName());
            A0S.append(" already declared with different @OnLifecycleEvent value: previous value ");
            A0S.append(obj);
            A0S.append(", new value ");
            A0S.append(r6);
            throw new IllegalArgumentException(A0S.toString());
        }
    }

    public final C11960hJ A01(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C11960hJ r0 = (C11960hJ) this.A00.get(superclass);
            if (r0 == null) {
                r0 = A01(superclass, null);
            }
            hashMap.putAll(r0.A01);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> cls2 : interfaces) {
            C11960hJ r02 = (C11960hJ) this.A00.get(cls2);
            if (r02 == null) {
                r02 = A01(cls2, null);
            }
            for (Map.Entry entry : r02.A01.entrySet()) {
                A00(hashMap, (C11970hK) entry.getKey(), (AnonymousClass082) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(AbstractC005102k.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                AnonymousClass082 value = onLifecycleEvent.value();
                if (length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AnonymousClass082.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == AnonymousClass082.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (length <= 2) {
                    A00(hashMap, new C11970hK(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C11960hJ r2 = new C11960hJ(hashMap);
        this.A00.put(cls, r2);
        this.A01.put(cls, Boolean.valueOf(z));
        return r2;
    }
}
