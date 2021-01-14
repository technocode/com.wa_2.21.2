package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0cl  reason: invalid class name and case insensitive filesystem */
public class C09360cl extends AbstractC09350ck {
    public int A00 = 0;
    public int A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03 = true;
    public boolean A04 = false;

    @Override // X.AbstractC09350ck
    public AbstractC09350ck A02() {
        C09360cl r3 = (C09360cl) super.clone();
        r3.A02 = new ArrayList();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            r3.A0V(((AbstractC09350ck) this.A02.get(i)).clone());
        }
        return r3;
    }

    @Override // X.AbstractC09350ck
    public AbstractC09350ck A07(AbstractC09420cr r1) {
        super.A07(r1);
        return this;
    }

    @Override // X.AbstractC09350ck
    public AbstractC09350ck A08(AbstractC09420cr r1) {
        super.A08(r1);
        return this;
    }

    @Override // X.AbstractC09350ck
    public String A0B(String str) {
        String A0B = super.A0B(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i >= arrayList.size()) {
                return A0B;
            }
            StringBuilder A0Y = AnonymousClass008.A0Y(A0B, "\n");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            A0Y.append(((AbstractC09350ck) arrayList.get(i)).A0B(sb.toString()));
            A0B = A0Y.toString();
            i++;
        }
    }

    @Override // X.AbstractC09350ck
    public void A0F(View view) {
        super.A0F(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC09350ck) this.A02.get(i)).A0F(view);
        }
    }

    @Override // X.AbstractC09350ck
    public void A0G(View view) {
        super.A0G(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC09350ck) this.A02.get(i)).A0G(view);
        }
    }

    @Override // X.AbstractC09350ck
    public void A0O(C17280rH r4) {
        super.A0O(r4);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC09350ck) this.A02.get(i)).A0O(r4);
        }
    }

    public void A0U(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((AbstractC09350ck) arrayList.get(i)).A05(view);
                i++;
            } else {
                this.A0H.add(view);
                return;
            }
        }
    }

    public void A0V(AbstractC09350ck r6) {
        this.A02.add(r6);
        r6.A07 = this;
        long j = super.A01;
        if (j >= 0) {
            r6.A03(j);
        }
        if ((this.A00 & 1) != 0) {
            r6.A04(super.A03);
        }
        if ((this.A00 & 2) != 0) {
            r6.A0L(this.A05);
        }
        if ((this.A00 & 4) != 0) {
            r6.A0K(super.A04);
        }
        if ((this.A00 & 8) != 0) {
            r6.A0M(this.A06);
        }
    }
}
