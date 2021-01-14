package X;

import java.util.Set;

/* renamed from: X.07F  reason: invalid class name */
public abstract class AnonymousClass07F {
    public AnonymousClass07L A00(Class cls) {
        if (!(this instanceof AnonymousClass07W)) {
            C001801b.A1R(cls, "Null interface requested.");
            return (AnonymousClass07L) ((AnonymousClass07E) this).A02.get(cls);
        }
        AnonymousClass07W r1 = (AnonymousClass07W) this;
        if (r1.A02.contains(cls)) {
            return r1.A00.A00(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    public AnonymousClass07L A01(Class cls) {
        if (!(this instanceof AnonymousClass07W)) {
            AnonymousClass07U r0 = (AnonymousClass07U) ((AnonymousClass07E) this).A03.get(cls);
            if (r0 == null) {
                return AnonymousClass07E.A04;
            }
            return r0;
        }
        AnonymousClass07W r1 = (AnonymousClass07W) this;
        if (r1.A05.contains(cls)) {
            return r1.A00.A01(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    public Object A02(Class cls) {
        if (!(this instanceof AnonymousClass07W)) {
            AnonymousClass07L A00 = A00(cls);
            if (A00 == null) {
                return null;
            }
            return A00.get();
        }
        AnonymousClass07W r1 = (AnonymousClass07W) this;
        if (r1.A01.contains(cls)) {
            Object A02 = r1.A00.A02(cls);
            if (cls.equals(AnonymousClass07N.class)) {
                return new C36981nJ();
            }
            return A02;
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    public Set A03(Class cls) {
        if (!(this instanceof AnonymousClass07W)) {
            return (Set) A01(cls).get();
        }
        AnonymousClass07W r1 = (AnonymousClass07W) this;
        if (r1.A04.contains(cls)) {
            return r1.A00.A03(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}
