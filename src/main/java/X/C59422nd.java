package X;

import java.util.Iterator;

/* renamed from: X.2nd  reason: invalid class name and case insensitive filesystem */
public class C59422nd implements AbstractC43591yd {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C28551Ut A05;
    public final /* synthetic */ C52632bR A06;
    public final /* synthetic */ AnonymousClass2L7 A07;

    @Override // X.AbstractC11180fq
    public boolean APb() {
        return false;
    }

    public C59422nd(AnonymousClass2L7 r1, int i, int i2, C28551Ut r4, C52632bR r5) {
        this.A07 = r1;
        this.A04 = i;
        this.A03 = i2;
        this.A05 = r4;
        this.A06 = r5;
    }

    @Override // X.AbstractC43591yd
    public void AGA() {
        AnonymousClass2L7 r2 = this.A07;
        C02100Aq r1 = r2.A01;
        C28551Ut r0 = this.A05;
        r1.A07(r0);
        AnonymousClass02N r5 = r0.A07;
        C52632bR r4 = this.A06;
        if (r2 == null) {
            throw null;
        } else if (r4 != null) {
            AnonymousClass2L6 r6 = r4.A01;
            AnonymousClass09Z r7 = r6.A04;
            C28481Um A062 = r7.A06(r5);
            r6.A02.A00.edit().remove("storage_usage_deletion_jid").remove("storage_usage_deletion_current_msg_cnt").remove("storage_usage_deletion_all_msg_cnt").apply();
            r6.A01.A0I(new AnonymousClass1VD(r5, r7.A06(r5)));
            Iterator it = r6.A07.iterator();
            while (it.hasNext()) {
                ((AnonymousClass2L5) it.next()).AEt(r5, A062);
            }
            r4.A00.AGA();
        }
    }

    @Override // X.AbstractC43591yd
    public void AIs(int i, int i2) {
        int i3 = this.A02;
        if (i3 == -1) {
            i3 = Math.max(this.A03 / 100, 1);
            this.A02 = i3;
        }
        int i4 = this.A04 + i;
        this.A00 = i4;
        if (i4 - this.A01 > i3) {
            AnonymousClass2L7.A00(this.A05.A07, this.A03, i4, this.A06);
            this.A01 = this.A00;
        }
    }

    @Override // X.AbstractC43591yd
    public void AKI() {
        this.A00 = this.A04;
    }
}
