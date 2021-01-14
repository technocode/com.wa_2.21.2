package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;

/* renamed from: X.2dV  reason: invalid class name and case insensitive filesystem */
public class C53582dV implements AnonymousClass2NH {
    public final /* synthetic */ C53602dX A00;

    public C53582dV(C53602dX r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass2NH
    public void AFX() {
        Log.d("FilterPreviewAdapter/fetchFilters failed to get filters");
        RecyclerView recyclerView = this.A00.A0A.A0R;
        if (recyclerView != null) {
            recyclerView.post(new RunnableEBaseShape9S0100000_I1_4(this, 34));
        }
    }

    @Override // X.AnonymousClass2NH
    public void AJ3(Object obj) {
        RecyclerView recyclerView = this.A00.A0A.A0R;
        if (recyclerView != null) {
            recyclerView.post(new RunnableEBaseShape8S0200000_I1_3(this, obj, 1));
        }
    }
}
