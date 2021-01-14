package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1e5  reason: invalid class name and case insensitive filesystem */
public class C31961e5 implements AbstractC18720to {
    public float A00;
    public float A01;
    public int A02 = -1;
    public C18900u6 A03 = null;
    public List A04 = new ArrayList();
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = false;
    public final /* synthetic */ C18930u9 A08;

    public C31961e5(C18930u9 r3, C31931e2 r4) {
        this.A08 = r3;
        if (r4 != null) {
            r4.A02(this);
            if (this.A05) {
                this.A04.get(-1);
                throw null;
            }
        }
    }

    @Override // X.AbstractC18720to
    public void A26(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.A07 = true;
        this.A06 = false;
        C18900u6 r0 = this.A03;
        C18930u9.A04(r0.A02, r0.A03, f, f2, f3, z, z2, f4, f5, this);
        this.A06 = true;
        this.A05 = false;
    }

    @Override // X.AbstractC18720to
    public void A3W(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.A06 || this.A07) {
            C18900u6 r1 = this.A03;
            r1.A00(f, f2);
            this.A04.add(r1);
            this.A07 = false;
        }
        this.A03 = new C18900u6(f5, f6, f5 - f3, f6 - f4);
        this.A05 = false;
    }

    @Override // X.AbstractC18720to
    public void ABk(float f, float f2) {
        C18900u6 r1 = this.A03;
        r1.A00(f, f2);
        this.A04.add(r1);
        C18900u6 r12 = this.A03;
        this.A03 = new C18900u6(f, f2, f - r12.A02, f2 - r12.A03);
        this.A05 = false;
    }

    @Override // X.AbstractC18720to
    public void ACB(float f, float f2) {
        if (this.A05) {
            this.A03.A01((C18900u6) this.A04.get(this.A02));
            this.A04.set(this.A02, this.A03);
            this.A05 = false;
        }
        C18900u6 r1 = this.A03;
        if (r1 != null) {
            this.A04.add(r1);
        }
        this.A00 = f;
        this.A01 = f2;
        this.A03 = new C18900u6(f, f2, 0.0f, 0.0f);
        this.A02 = this.A04.size();
    }

    @Override // X.AbstractC18720to
    public void AMF(float f, float f2, float f3, float f4) {
        C18900u6 r1 = this.A03;
        r1.A00(f, f2);
        this.A04.add(r1);
        this.A03 = new C18900u6(f3, f4, f3 - f, f4 - f2);
        this.A05 = false;
    }

    @Override // X.AbstractC18720to
    public void close() {
        this.A04.add(this.A03);
        ABk(this.A00, this.A01);
        this.A05 = true;
    }
}
