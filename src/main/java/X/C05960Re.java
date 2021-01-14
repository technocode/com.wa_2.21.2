package X;

/* renamed from: X.0Re  reason: invalid class name and case insensitive filesystem */
public class C05960Re extends AnonymousClass0RZ {
    public long mobileBytesRx;
    public long mobileBytesTx;
    public long wifiBytesRx;
    public long wifiBytesTx;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C05960Re.class != obj.getClass()) {
            return false;
        }
        C05960Re r7 = (C05960Re) obj;
        if (this.mobileBytesTx == r7.mobileBytesTx && this.mobileBytesRx == r7.mobileBytesRx && this.wifiBytesTx == r7.wifiBytesTx && this.wifiBytesRx == r7.wifiBytesRx) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.mobileBytesTx;
        long j2 = this.mobileBytesRx;
        long j3 = this.wifiBytesTx;
        long j4 = this.wifiBytesRx;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("NetworkMetrics{mobileBytesTx=");
        A0S.append(this.mobileBytesTx);
        A0S.append(", mobileBytesRx=");
        A0S.append(this.mobileBytesRx);
        A0S.append(", wifiBytesTx=");
        A0S.append(this.wifiBytesTx);
        A0S.append(", wifiBytesRx=");
        A0S.append(this.wifiBytesRx);
        A0S.append('}');
        return A0S.toString();
    }
}
