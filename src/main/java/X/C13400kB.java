package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0kB  reason: invalid class name and case insensitive filesystem */
public class C13400kB implements TextWatcher {
    public final /* synthetic */ SearchView A00;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C13400kB(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.A00;
        Editable text = searchView.A0k.getText();
        searchView.A0H = text;
        boolean z = !TextUtils.isEmpty(text);
        searchView.A0F(z);
        boolean z2 = !z;
        int i4 = 8;
        if (searchView.A0P && !searchView.A0H() && z2) {
            searchView.A0g.setVisibility(8);
            i4 = 0;
        }
        searchView.A0i.setVisibility(i4);
        searchView.A08();
        searchView.A0A();
        if (searchView.A0B != null && !TextUtils.equals(charSequence, searchView.A0F)) {
            searchView.A0B.AIy(charSequence.toString());
        }
        searchView.A0F = charSequence.toString();
    }
}
