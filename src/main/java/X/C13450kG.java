package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0kG  reason: invalid class name and case insensitive filesystem */
public class C13450kG implements AdapterView.OnItemClickListener {
    public final /* synthetic */ SearchView A00;

    public C13450kG(SearchView searchView) {
        this.A00 = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A00.A0B(i);
    }
}
