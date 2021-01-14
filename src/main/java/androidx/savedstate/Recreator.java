package androidx.savedstate;

import X.AbstractC005102k;
import X.AbstractC005402n;
import X.AbstractC16890qc;
import X.AnonymousClass008;
import X.AnonymousClass082;
import X.AnonymousClass0SK;
import X.C013807v;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class Recreator implements AnonymousClass0SK {
    public final AbstractC005402n A00;

    public Recreator(AbstractC005402n r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SK
    public void AKQ(AbstractC005102k r8, AnonymousClass082 r9) {
        if (r9 == AnonymousClass082.ON_CREATE) {
            ((C013807v) r8.A75()).A01.A01(this);
            AbstractC005402n r6 = this.A00;
            Bundle A002 = r6.A8t().A00("androidx.savedstate.Restarter");
            if (A002 != null) {
                ArrayList<String> stringArrayList = A002.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(AbstractC16890qc.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((AbstractC16890qc) declaredConstructor.newInstance(new Object[0])).AJC(r6);
                                } catch (Exception e) {
                                    throw new RuntimeException(AnonymousClass008.A0K("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder A0S = AnonymousClass008.A0S("Class");
                                A0S.append(asSubclass.getSimpleName());
                                A0S.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(A0S.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(AnonymousClass008.A0L("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
