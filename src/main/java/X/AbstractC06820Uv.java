package X;

import androidx.lifecycle.SavedStateHandleController;
import com.whatsapp.search.SearchViewModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: X.0Uv  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06820Uv extends C06830Uw implements AnonymousClass0O4 {
    public AnonymousClass0SD A01(String str, Class cls) {
        Constructor<?> constructor;
        AnonymousClass0SD r0;
        if (!(this instanceof C452523v)) {
            AbstractC452323o r13 = (AbstractC452323o) this;
            AnonymousClass0SI r3 = r13.A01;
            AbstractC013907w r2 = r13.A00;
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C15610oN.A00(r3.A00(str), null));
            savedStateHandleController.A02(r3, r2);
            SavedStateHandleController.A01(r3, r2);
            C15610oN r02 = savedStateHandleController.A01;
            C74863bg r132 = (C74863bg) r13;
            AnonymousClass00E.A09(cls.isAssignableFrom(SearchViewModel.class), "Invalid viewModel");
            SearchViewModel searchViewModel = new SearchViewModel(r132.A01, r132.A0E, r132.A08, r132.A02, r132.A0D, r132.A03, r132.A07, r132.A0A, r02, r132.A0C, r132.A0B, r132.A09, r132.A04, r132.A06, r132.A05);
            searchViewModel.A01(savedStateHandleController);
            return searchViewModel;
        }
        C452523v r7 = (C452523v) this;
        boolean isAssignableFrom = C30231ay.class.isAssignableFrom(cls);
        if (isAssignableFrom) {
            Class[] clsArr = C452523v.A05;
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            for (int i = 0; i < length; i++) {
                constructor = constructors[i];
                if (!Arrays.equals(clsArr, constructor.getParameterTypes())) {
                }
            }
            return r7.A03.A3B(cls);
        }
        Class[] clsArr2 = C452523v.A06;
        Constructor<?>[] constructors2 = cls.getConstructors();
        int length2 = constructors2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            constructor = constructors2[i2];
            if (!Arrays.equals(clsArr2, constructor.getParameterTypes())) {
            }
        }
        return r7.A03.A3B(cls);
        AnonymousClass0SI r32 = r7.A04;
        AbstractC013907w r22 = r7.A02;
        SavedStateHandleController savedStateHandleController2 = new SavedStateHandleController(str, C15610oN.A00(r32.A00(str), r7.A01));
        savedStateHandleController2.A02(r32, r22);
        SavedStateHandleController.A01(r32, r22);
        if (isAssignableFrom) {
            r0 = (AnonymousClass0SD) constructor.newInstance(r7.A00, savedStateHandleController2.A01);
        } else {
            try {
                r0 = (AnonymousClass0SD) constructor.newInstance(savedStateHandleController2.A01);
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder("Failed to access ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (InstantiationException e2) {
                StringBuilder sb2 = new StringBuilder("A ");
                sb2.append(cls);
                sb2.append(" cannot be instantiated.");
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sb3 = new StringBuilder("An exception happened in constructor of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3.getCause());
            }
        }
        r0.A01(savedStateHandleController2);
        return r0;
    }

    @Override // X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (this instanceof C452523v) {
            String canonicalName = cls.getCanonicalName();
            if (canonicalName != null) {
                return A01(canonicalName, cls);
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (!(this instanceof AbstractC452323o)) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        } else {
            String canonicalName2 = cls.getCanonicalName();
            if (canonicalName2 != null) {
                return A01(canonicalName2, cls);
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }
}
