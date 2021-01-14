package X;

import java.util.Arrays;

/* renamed from: X.23b  reason: invalid class name and case insensitive filesystem */
public class C451223b extends AnonymousClass0WI {
    public int A00 = 128;
    public int A01 = 0;
    public C13970lJ A02 = new C13970lJ(this);
    public AnonymousClass0WH[] A03 = new AnonymousClass0WH[128];
    public AnonymousClass0WH[] A04 = new AnonymousClass0WH[128];

    public C451223b(C13940lG r3) {
        super(r3);
    }

    public final void A06(AnonymousClass0WH r8) {
        int i = this.A01 + 1;
        AnonymousClass0WH[] r1 = this.A03;
        int length = r1.length;
        if (i > length) {
            AnonymousClass0WH[] r12 = (AnonymousClass0WH[]) Arrays.copyOf(r1, length << 1);
            this.A03 = r12;
            this.A04 = (AnonymousClass0WH[]) Arrays.copyOf(r12, r12.length << 1);
        }
        AnonymousClass0WH[] r6 = this.A03;
        int i2 = this.A01;
        r6[i2] = r8;
        int i3 = i2 + 1;
        this.A01 = i3;
        if (i3 > 1 && r6[i3 - 1].A02 > r8.A02) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.A04[i4] = r6[i4];
            }
            Arrays.sort(this.A04, 0, i3, new C13960lI());
            for (int i5 = 0; i5 < this.A01; i5++) {
                this.A03[i5] = this.A04[i5];
            }
        }
        r8.A07 = true;
        r8.A01(this);
    }

    public final void A07(AnonymousClass0WH r7) {
        int i = 0;
        while (true) {
            int i2 = this.A01;
            if (i < i2) {
                AnonymousClass0WH[] r2 = this.A03;
                if (r2[i] != r7) {
                    i++;
                } else {
                    while (true) {
                        int i3 = i2 - 1;
                        if (i < i3) {
                            int i4 = i + 1;
                            r2[i] = r2[i4];
                            i = i4;
                        } else {
                            this.A01 = i3;
                            r7.A07 = false;
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // X.AnonymousClass0WI
    public String toString() {
        StringBuilder A0Y = AnonymousClass008.A0Y("", " goal -> (");
        A0Y.append(super.A00);
        A0Y.append(") : ");
        String obj = A0Y.toString();
        for (int i = 0; i < this.A01; i++) {
            AnonymousClass0WH r1 = this.A03[i];
            C13970lJ r0 = this.A02;
            r0.A00 = r1;
            StringBuilder A0S = AnonymousClass008.A0S(obj);
            A0S.append(r0);
            A0S.append(" ");
            obj = A0S.toString();
        }
        return obj;
    }
}
