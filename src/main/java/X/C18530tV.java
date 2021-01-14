package X;

/* renamed from: X.0tV  reason: invalid class name and case insensitive filesystem */
public class C18530tV {
    public C18560tY A00;
    public EnumC18580ta A01;
    public C18820ty A02;

    public C18530tV(C18560tY r1, C18820ty r2, EnumC18580ta r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.A00));
        sb.append(" {...} (src=");
        sb.append(this.A01);
        sb.append(")");
        return sb.toString();
    }
}
