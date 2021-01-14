package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3R8  reason: invalid class name */
public class AnonymousClass3R8 implements AbstractC63962xI {
    public int A00;
    public int A01 = -1;
    public int A02;
    public long A03 = 0;
    public AbstractC63952xH A04;
    public AnonymousClass3R7 A05;
    public ArrayList A06;
    public final Context A07;
    public final View A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final AnonymousClass01X A0B;
    public final HashMap A0C = new HashMap();

    public AnonymousClass3R8(Context context, AnonymousClass01X r5, View view) {
        this.A07 = context;
        this.A0B = r5;
        this.A08 = view.findViewById(R.id.sticker_picker_header);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_header_recycler);
        this.A0A = recyclerView;
        recyclerView.A0i = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A09 = linearLayoutManager;
        linearLayoutManager.A1A(0);
        this.A0A.setLayoutManager(this.A09);
        C75053c3 r1 = new C75053c3();
        ((AbstractC30641bg) r1).A00 = false;
        this.A0A.setItemAnimator(r1);
        LinearLayoutManager linearLayoutManager2 = this.A09;
        boolean z = r5.A02().A06;
        linearLayoutManager2.A0c(null);
        if (z != linearLayoutManager2.A08) {
            linearLayoutManager2.A08 = z;
            linearLayoutManager2.A0K();
        }
    }

    @Override // X.AbstractC63962xI
    public View A9i() {
        return this.A08;
    }

    @Override // X.AbstractC63962xI
    public void AIH(int i) {
        int i2;
        int i3;
        int i4 = this.A00;
        if (i != i4) {
            ArrayList arrayList = this.A06;
            if (arrayList != null) {
                i2 = 0;
                while (true) {
                    if (i2 < arrayList.size()) {
                        if (((C662433l) arrayList.get(i2)).A00(i4)) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            i2 = -1;
            this.A00 = i;
            if (this.A05 != null) {
                ArrayList arrayList2 = this.A06;
                if (arrayList2 != null) {
                    i3 = 0;
                    while (true) {
                        if (i3 < arrayList2.size()) {
                            if (((C662433l) arrayList2.get(i3)).A00(i)) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
                i3 = -1;
                if (i3 != i2) {
                    LinearLayoutManager linearLayoutManager = this.A09;
                    int A0r = linearLayoutManager.A0r();
                    int A0t = linearLayoutManager.A0t();
                    int i5 = A0t - A0r;
                    if (this.A0B.A02().A06 && this.A02 != -1) {
                        View A0I = linearLayoutManager.A0I(linearLayoutManager.A0A() - 1);
                        int i6 = this.A02;
                        if (A0t >= i6 || i3 >= i6) {
                            this.A0A.requestChildFocus(A0I, A0I);
                        } else {
                            this.A0A.clearChildFocus(A0I);
                        }
                    }
                    int i7 = (i5 << 1) / 5;
                    int i8 = i3 - i7;
                    if (i8 < A0r) {
                        if (i8 < 0) {
                            i8 = 0;
                        }
                        C74163aH r0 = new C74163aH(this.A08.getContext());
                        ((AbstractC16520pw) r0).A00 = i8;
                        linearLayoutManager.A0Z(r0);
                    } else {
                        int i9 = i3 + i7;
                        if (i9 > A0t) {
                            if (i9 >= linearLayoutManager.A0B()) {
                                i9 = linearLayoutManager.A0B() - 1;
                            }
                            C74163aH r02 = new C74163aH(this.A08.getContext());
                            ((AbstractC16520pw) r02).A00 = i9;
                            linearLayoutManager.A0Z(r02);
                        }
                    }
                }
                ((AbstractC16300pa) this.A05).A01.A00();
            }
        }
    }

    @Override // X.AbstractC63962xI
    public void AO6(AbstractC63952xH r2) {
        this.A04 = r2;
        if (r2 != null) {
            AIH(r2.A00());
        }
    }
}
