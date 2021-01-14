package X;

/* renamed from: X.0RY  reason: invalid class name */
public class AnonymousClass0RY extends AnonymousClass0RZ {
    public long realtimeMs;
    public long uptimeMs;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0RY.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0RY r7 = (AnonymousClass0RY) obj;
        if (this.uptimeMs == r7.uptimeMs && this.realtimeMs == r7.realtimeMs) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.uptimeMs;
        long j2 = this.realtimeMs;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("TimeMetrics{uptimeMs=");
        A0S.append(this.uptimeMs);
        A0S.append(", realtimeMs=");
        A0S.append(this.realtimeMs);
        A0S.append('}');
        return A0S.toString();
    }
}
