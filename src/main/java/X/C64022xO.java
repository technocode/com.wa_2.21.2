package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2xO  reason: invalid class name and case insensitive filesystem */
public class C64022xO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public RecyclerView A05;
    public AnonymousClass3QG A06;
    public final ViewTreeObserver.OnGlobalLayoutListener A07 = new ViewTreeObserver$OnGlobalLayoutListenerC64012xN(this);
    public final GridLayoutManager A08;
    public final AbstractC16380pi A09 = new AnonymousClass3J0(this);

    public C64022xO(Context context, ViewGroup viewGroup, RecyclerView recyclerView, AnonymousClass3QG r6) {
        int i;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.sticker_picker_item);
        if (viewGroup != null) {
            i = viewGroup.getWidth();
            this.A04 = i;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C02780Dk.A00(context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            this.A04 = i;
        }
        int i2 = i / this.A01;
        this.A00 = i2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2 <= 0 ? 1 : i2);
        this.A08 = gridLayoutManager;
        this.A05 = recyclerView;
        this.A06 = r6;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.A0j(this.A09);
        recyclerView.setItemAnimator(null);
    }
}
