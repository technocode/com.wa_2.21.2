package X;

/* renamed from: X.29c  reason: invalid class name and case insensitive filesystem */
public class C463329c extends AnonymousClass27D {
    public final long value;

    public C463329c(long j) {
        this.value = j;
    }

    public double doubleValue() {
        return (double) this.value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C463329c) {
            return ((C463329c) obj).value == this.value;
        }
        return super.equals(obj);
    }

    public float floatValue() {
        return (float) this.value;
    }

    public int hashCode() {
        long j = this.value;
        return (int) (j ^ (j >>> 32));
    }

    public int intValue() {
        return (int) this.value;
    }

    public long longValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
