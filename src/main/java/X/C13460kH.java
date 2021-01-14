package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0kH  reason: invalid class name and case insensitive filesystem */
public class C13460kH implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ SearchView A00;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public C13460kH(SearchView searchView) {
        this.A00 = searchView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.A00.A0C(i);
    }
}
