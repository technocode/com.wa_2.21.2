package X;

/* renamed from: X.0Rc  reason: invalid class name and case insensitive filesystem */
public class C05940Rc extends AnonymousClass0RZ {
    public double childSystemTimeS;
    public double childUserTimeS;
    public double systemTimeS;
    public double userTimeS;

    public void A01(C05940Rc r3) {
        this.userTimeS = r3.userTimeS;
        this.systemTimeS = r3.systemTimeS;
        this.childUserTimeS = r3.childUserTimeS;
        this.childSystemTimeS = r3.childSystemTimeS;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C05940Rc.class != obj.getClass()) {
            return false;
        }
        C05940Rc r6 = (C05940Rc) obj;
        if (Double.compare(r6.systemTimeS, this.systemTimeS) == 0 && Double.compare(r6.userTimeS, this.userTimeS) == 0 && Double.compare(r6.childSystemTimeS, this.childSystemTimeS) == 0 && Double.compare(r6.childUserTimeS, this.childUserTimeS) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.systemTimeS);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.userTimeS);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.childSystemTimeS);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.childUserTimeS);
        return (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CpuMetrics{userTimeS=");
        A0S.append(this.userTimeS);
        A0S.append(", systemTimeS=");
        A0S.append(this.systemTimeS);
        A0S.append(", childUserTimeS=");
        A0S.append(this.childUserTimeS);
        A0S.append(", childSystemTimeS=");
        A0S.append(this.childSystemTimeS);
        A0S.append('}');
        return A0S.toString();
    }
}
