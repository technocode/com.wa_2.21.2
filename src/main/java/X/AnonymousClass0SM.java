package X;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.0SM  reason: invalid class name */
public class AnonymousClass0SM {
    public EnumC014207z A00;
    public AnonymousClass0SK A01;

    public AnonymousClass0SM(AnonymousClass0SL r5, EnumC014207z r6) {
        AnonymousClass0SK reflectiveGenericLifecycleObserver;
        if (r5 instanceof AnonymousClass0SK) {
            reflectiveGenericLifecycleObserver = (AnonymousClass0SK) r5;
        } else {
            Class<?> cls = r5.getClass();
            if (C11940hG.A00(cls) == 2) {
                List list = (List) C11940hG.A01.get(cls);
                if (list.size() == 1) {
                    C11940hG.A01((Constructor) list.get(0), r5);
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver();
                } else {
                    AbstractC15600oL[] r1 = new AbstractC15600oL[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        r1[i] = C11940hG.A01((Constructor) list.get(i), r5);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(r1);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(r5);
            }
        }
        this.A01 = reflectiveGenericLifecycleObserver;
        this.A00 = r6;
    }

    public void A00(AbstractC005102k r4, AnonymousClass082 r5) {
        EnumC014207z A012 = C013807v.A01(r5);
        EnumC014207z r1 = this.A00;
        if (A012 != null && A012.compareTo((Enum) r1) < 0) {
            r1 = A012;
        }
        this.A00 = r1;
        this.A01.AKQ(r4, r5);
        this.A00 = A012;
    }
}
