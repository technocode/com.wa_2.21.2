package X;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0kF  reason: invalid class name and case insensitive filesystem */
public class C13440kF implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView A00;

    public C13440kF(SearchView searchView) {
        this.A00 = searchView;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.A00.A06();
        return true;
    }
}
