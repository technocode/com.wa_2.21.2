package X;

/* renamed from: X.1Gc  reason: invalid class name and case insensitive filesystem */
public class C25251Gc {
    public static final C25251Gc A02 = new C25251Gc(1.0E21f, EnumC25241Gb.AUTO);
    public final float A00;
    public final EnumC25241Gb A01;

    public C25251Gc(float f, EnumC25241Gb r2) {
        this.A00 = f;
        this.A01 = r2;
    }

    public String toString() {
        int ordinal = this.A01.ordinal();
        if (ordinal == 0) {
            return Float.toString(this.A00);
        }
        if (ordinal == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.A00);
            sb.append("%");
            return sb.toString();
        } else if (ordinal == 2) {
            return "auto";
        } else {
            throw new IllegalStateException();
        }
    }
}
