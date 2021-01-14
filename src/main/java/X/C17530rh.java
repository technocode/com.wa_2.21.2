package X;

import android.os.Build;

/* renamed from: X.0rh  reason: invalid class name and case insensitive filesystem */
public final class C17530rh {
    public static final C17530rh A08 = new C17530rh(new C17520rg());
    public long A00;
    public long A01;
    public C06990Vm A02;
    public EnumC07010Vo A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public C17530rh() {
        this.A03 = EnumC07010Vo.NOT_REQUIRED;
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = new C06990Vm();
    }

    public C17530rh(C17520rg r3) {
        this.A03 = EnumC07010Vo.NOT_REQUIRED;
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = new C06990Vm();
        this.A05 = false;
        int i = Build.VERSION.SDK_INT;
        this.A06 = false;
        this.A03 = r3.A03;
        this.A04 = false;
        this.A07 = false;
        if (i >= 24) {
            this.A02 = r3.A02;
            this.A00 = -1;
            this.A01 = -1;
        }
    }

    public C17530rh(C17530rh r3) {
        this.A03 = EnumC07010Vo.NOT_REQUIRED;
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = new C06990Vm();
        this.A05 = r3.A05;
        this.A06 = r3.A06;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A07 = r3.A07;
        this.A02 = r3.A02;
    }

    public C06990Vm A00() {
        return this.A02;
    }

    public boolean A01() {
        return this.A02.A00.size() > 0;
    }

    public boolean A02() {
        return this.A06;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17530rh.class != obj.getClass()) {
            return false;
        }
        C17530rh r7 = (C17530rh) obj;
        if (this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A07 == r7.A07 && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A03 == r7.A03) {
            return this.A02.equals(r7.A02);
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return this.A02.hashCode() + (((((((((((((this.A03.hashCode() * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
