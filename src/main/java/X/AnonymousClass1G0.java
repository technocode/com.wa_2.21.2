package X;

/* renamed from: X.1G0  reason: invalid class name */
public abstract class AnonymousClass1G0 {
    public static final AnonymousClass1G0[] A00 = {new C37261nu(), new C37271nv(), new C37281nw(), new C37291nx(), new C37301ny(), new C37311nz(), new C37321o0(), new C37331o1()};

    public boolean A00(int i, int i2) {
        if (this instanceof C37331o1) {
            if (((((i * i2) % 3) + ((i + i2) & 1)) & 1) != 0) {
                return false;
            }
            return true;
        } else if (this instanceof C37321o0) {
            int i3 = i * i2;
            return (((i3 % 3) + (i3 & 1)) & 1) == 0;
        } else if (this instanceof C37311nz) {
            int i4 = i * i2;
            return (i4 % 3) + (i4 & 1) == 0;
        } else if (!(this instanceof C37301ny)) {
            return !(this instanceof C37291nx) ? !(this instanceof C37281nw) ? !(this instanceof C37271nv) ? ((i + i2) & 1) == 0 : (i & 1) == 0 : i2 % 3 == 0 : (i + i2) % 3 == 0;
        } else {
            return (((i2 / 3) + (i >> 1)) & 1) == 0;
        }
    }
}
