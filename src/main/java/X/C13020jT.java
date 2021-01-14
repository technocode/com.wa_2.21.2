package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: X.0jT  reason: invalid class name and case insensitive filesystem */
public class C13020jT extends BaseAdapter {
    public int A00 = -1;
    public AnonymousClass0T8 A01;
    public boolean A02;
    public final int A03;
    public final LayoutInflater A04;
    public final boolean A05;

    public long getItemId(int i) {
        return (long) i;
    }

    public C13020jT(AnonymousClass0T8 r2, LayoutInflater layoutInflater, boolean z, int i) {
        this.A05 = z;
        this.A04 = layoutInflater;
        this.A01 = r2;
        this.A03 = i;
        A01();
    }

    /* renamed from: A00 */
    public AnonymousClass1ZT getItem(int i) {
        ArrayList A042;
        if (this.A05) {
            AnonymousClass0T8 r0 = this.A01;
            r0.A05();
            A042 = r0.A08;
        } else {
            A042 = this.A01.A04();
        }
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (AnonymousClass1ZT) A042.get(i);
    }

    public void A01() {
        AnonymousClass0T8 r0 = this.A01;
        AnonymousClass1ZT r4 = r0.A04;
        if (r4 != null) {
            r0.A05();
            ArrayList arrayList = r0.A08;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == r4) {
                    this.A00 = i;
                    return;
                }
            }
        }
        this.A00 = -1;
    }

    public int getCount() {
        ArrayList A042;
        if (this.A05) {
            AnonymousClass0T8 r0 = this.A01;
            r0.A05();
            A042 = r0.A08;
        } else {
            A042 = this.A01.A04();
        }
        int i = this.A00;
        int size = A042.size();
        if (i < 0) {
            return size;
        }
        return size - 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r6 == r4) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            r5 = 0
            if (r9 != 0) goto L_0x000b
            android.view.LayoutInflater r1 = r7.A04
            int r0 = r7.A03
            android.view.View r9 = r1.inflate(r0, r10, r5)
        L_0x000b:
            X.1ZT r0 = r7.getItem(r8)
            int r6 = r0.A0Q
            int r0 = r8 + -1
            if (r0 < 0) goto L_0x004b
            X.1ZT r0 = r7.getItem(r0)
            int r4 = r0.A0Q
        L_0x001b:
            r3 = r9
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            X.0T8 r1 = r7.A01
            boolean r0 = r1 instanceof X.AnonymousClass0TY
            if (r0 != 0) goto L_0x0042
            boolean r0 = r1.A0C
        L_0x0026:
            r2 = 1
            if (r0 == 0) goto L_0x002c
            r0 = 1
            if (r6 != r4) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r3.setGroupDividerEnabled(r0)
            r1 = r9
            X.0jY r1 = (X.AbstractC13070jY) r1
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x003a
            r3.setForceShowIcon(r2)
        L_0x003a:
            X.1ZT r0 = r7.getItem(r8)
            r1.AAn(r0, r5)
            return r9
        L_0x0042:
            X.0TY r1 = (X.AnonymousClass0TY) r1
            X.0T8 r0 = r1.A00
            boolean r0 = r0.A0G()
            goto L_0x0026
        L_0x004b:
            r4 = r6
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13020jT.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
