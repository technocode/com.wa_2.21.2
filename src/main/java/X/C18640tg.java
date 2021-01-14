package X;

/* renamed from: X.0tg  reason: invalid class name and case insensitive filesystem */
public class C18640tg {
    public static final C18640tg A02 = new C18640tg(EnumC18620te.xMidYMid, EnumC18630tf.meet);
    public static final C18640tg A03 = new C18640tg(EnumC18620te.none, null);
    public EnumC18620te A00;
    public EnumC18630tf A01;

    public C18640tg(EnumC18620te r1, EnumC18630tf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18640tg.class != obj.getClass()) {
            return false;
        }
        C18640tg r5 = (C18640tg) obj;
        if (this.A00 == r5.A00 && this.A01 == r5.A01) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        return sb.toString();
    }
}
