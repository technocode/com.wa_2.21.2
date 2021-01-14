package X;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.1nA  reason: invalid class name and case insensitive filesystem */
public class C36931nA implements AnonymousClass0XW {
    public int A00;
    public int A01;
    public final WeakReference A02;

    public C36931nA(TabLayout tabLayout) {
        this.A02 = new WeakReference(tabLayout);
    }

    @Override // X.AnonymousClass0XW
    public void AIF(int i) {
        this.A00 = this.A01;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r7.A00 == 1) goto L_0x0016;
     */
    @Override // X.AnonymousClass0XW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AIG(int r8, float r9, int r10) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A02
            java.lang.Object r6 = r0.get()
            com.google.android.material.tabs.TabLayout r6 = (com.google.android.material.tabs.TabLayout) r6
            if (r6 == 0) goto L_0x0021
            int r5 = r7.A01
            r4 = 0
            r3 = 2
            r2 = 1
            if (r5 != r3) goto L_0x0016
            int r0 = r7.A00
            r1 = 0
            if (r0 != r2) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            if (r5 != r3) goto L_0x001d
            int r0 = r7.A00
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r4 = 1
        L_0x001e:
            r6.A0A(r8, r9, r1, r4)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36931nA.AIG(int, float, int):void");
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.A02.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.A0d.size()) {
            int i2 = this.A01;
            if (i2 == 0 || (i2 == 2 && this.A00 == 0)) {
                z = true;
            } else {
                z = false;
            }
            tabLayout.A0F(tabLayout.A04(i), z);
        }
    }
}
