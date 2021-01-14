package X;

/* renamed from: X.1b3  reason: invalid class name and case insensitive filesystem */
public class C30271b3 implements AnonymousClass0O4 {
    public static C30271b3 A00;

    @Override // X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        try {
            return (AnonymousClass0SD) cls.newInstance();
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        }
    }
}
