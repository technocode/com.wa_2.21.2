package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1aG  reason: invalid class name and case insensitive filesystem */
public class C29831aG implements AbstractC14050lR {
    public int A00;
    public int A01 = 1;
    public int A02;
    public AbstractC14050lR A03 = null;
    public EnumC14070lT A04 = EnumC14070lT.UNKNOWN;
    public C451623f A05 = null;
    public AbstractC29841aH A06;
    public List A07 = new ArrayList();
    public List A08 = new ArrayList();
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;

    public C29831aG(AbstractC29841aH r4) {
        this.A06 = r4;
    }

    public void A00() {
        this.A08.clear();
        this.A07.clear();
        this.A0B = false;
        this.A02 = 0;
        this.A0A = false;
        this.A09 = false;
    }

    public void A01(int i) {
        if (!this.A0B) {
            this.A0B = true;
            this.A02 = i;
            for (AbstractC14050lR r0 : this.A07) {
                r0.AQn(r0);
            }
        }
    }

    @Override // X.AbstractC14050lR
    public void AQn(AbstractC14050lR r7) {
        for (C29831aG r0 : this.A08) {
            if (!r0.A0B) {
                return;
            }
        }
        this.A0A = true;
        AbstractC14050lR r02 = this.A03;
        if (r02 != null) {
            r02.AQn(this);
        }
        if (this.A09) {
            this.A06.AQn(this);
            return;
        }
        C29831aG r4 = null;
        int i = 0;
        for (C29831aG r1 : this.A08) {
            if (!(r1 instanceof C451623f)) {
                i++;
                r4 = r1;
            }
        }
        if (r4 != null && i == 1 && r4.A0B) {
            C451623f r2 = this.A05;
            if (r2 != null) {
                if (r2.A0B) {
                    this.A00 = this.A01 * r2.A02;
                } else {
                    return;
                }
            }
            A01(r4.A02 + this.A00);
        }
        AbstractC14050lR r03 = this.A03;
        if (r03 != null) {
            r03.AQn(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A06.A03.A0f);
        sb.append(":");
        sb.append(this.A04);
        sb.append("(");
        sb.append(this.A0B ? Integer.valueOf(this.A02) : "unresolved");
        sb.append(") <t=");
        sb.append(this.A08.size());
        sb.append(":d=");
        sb.append(this.A07.size());
        sb.append(">");
        return sb.toString();
    }
}
