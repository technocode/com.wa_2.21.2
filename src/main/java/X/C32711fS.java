package X;

/* renamed from: X.1fS  reason: invalid class name and case insensitive filesystem */
public class C32711fS implements AbstractC19710vU {
    public final int A00;
    public final AbstractC19710vU A01;

    public C32711fS(AbstractC19710vU r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AbstractC19710vU
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32711fS)) {
            return false;
        }
        C32711fS r4 = (C32711fS) obj;
        if (this.A00 != r4.A00 || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC19710vU
    public int hashCode() {
        return (this.A01.hashCode() * 1013) + this.A00;
    }

    public String toString() {
        C19940vr r2 = new C19940vr("AnimatedFrameCache$FrameKey");
        r2.A00("imageCacheKey", this.A01);
        r2.A00("frameIndex", String.valueOf(this.A00));
        return r2.toString();
    }
}
