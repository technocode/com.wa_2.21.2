package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: X.0pz  reason: invalid class name and case insensitive filesystem */
public class C16550pz {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public int[] A05;
    public final /* synthetic */ StaggeredGridLayoutManager A06;

    public C16550pz(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.A06 = staggeredGridLayoutManager;
        A00();
    }

    public void A00() {
        this.A01 = -1;
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A03 = false;
        this.A02 = false;
        this.A04 = false;
        int[] iArr = this.A05;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
