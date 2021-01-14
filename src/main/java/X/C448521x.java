package X;

/* renamed from: X.21x  reason: invalid class name and case insensitive filesystem */
public class C448521x extends AbstractC28981Wm {
    public long A00;
    public long A01;
    public boolean A02;
    public final int A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    public C448521x(AnonymousClass00S r13, AnonymousClass009 r14, AnonymousClass00Y r15, C28991Wn r16, String str, long j, long j2, Integer num, String str2, int i, String str3) {
        super(r13, r14, r15, r16, str, j, 1, j2);
        this.A04 = num;
        this.A06 = str2;
        this.A03 = i;
        this.A05 = str3;
    }

    @Override // X.AbstractC28981Wm
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; offlineCount = ");
        sb.append(this.A04);
        sb.append("; type = ");
        sb.append(this.A06);
        sb.append("; messageType = ");
        sb.append(this.A03);
        sb.append("; retryVersion = ");
        sb.append(this.A05);
        sb.append("; hasOrphaned = ");
        sb.append(this.A02);
        sb.append("; totalCount = ");
        sb.append(this.A01);
        sb.append("; processedCount = ");
        sb.append(this.A00);
        return sb.toString();
    }
}
