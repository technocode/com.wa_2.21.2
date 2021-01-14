package X;

/* renamed from: X.29b  reason: invalid class name and case insensitive filesystem */
public class C463229b extends AnonymousClass27D {
    public final double value;

    public C463229b(double d) {
        this.value = d;
    }

    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C463229b) {
            return Double.doubleToLongBits(((C463229b) obj).value) == Double.doubleToLongBits(this.value);
        }
        return super.equals(obj);
    }

    public float floatValue() {
        return (float) this.value;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return (long) this.value;
    }

    public String toString() {
        double d = this.value;
        long j = (long) d;
        if (d == ((double) j)) {
            return String.valueOf(j);
        }
        return String.valueOf(d);
    }
}
