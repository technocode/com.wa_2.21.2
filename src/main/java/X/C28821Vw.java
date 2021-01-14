package X;

/* renamed from: X.1Vw  reason: invalid class name and case insensitive filesystem */
public class C28821Vw {
    public static volatile C28821Vw A01;
    public final C28751Vp A00;

    public C28821Vw(C28751Vp r1) {
        this.A00 = r1;
    }

    public static C28821Vw A00() {
        if (A01 == null) {
            synchronized (C28821Vw.class) {
                if (A01 == null) {
                    A01 = new C28821Vw(C28751Vp.A00());
                }
            }
        }
        return A01;
    }

    public synchronized boolean A01(String str, String str2) {
        C28751Vp r1 = this.A00;
        String string = r1.A00.getString(C28751Vp.A01(str, "auth/token"), null);
        if (string == null) {
            return false;
        }
        return string.equals(str2);
    }

    public synchronized boolean A02(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        C28751Vp r1 = this.A00;
        String string = r1.A00.getString(C28751Vp.A01(str, "request/token"), null);
        if (string == null) {
            return false;
        }
        return str2.equals(string);
    }
}
