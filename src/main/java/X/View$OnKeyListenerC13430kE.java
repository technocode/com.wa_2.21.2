package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.Method;

/* renamed from: X.0kE  reason: invalid class name and case insensitive filesystem */
public class View$OnKeyListenerC13430kE implements View.OnKeyListener {
    public final /* synthetic */ SearchView A00;

    public View$OnKeyListenerC13430kE(SearchView searchView) {
        this.A00 = searchView;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        SearchView searchView = this.A00;
        if (searchView.A02 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
        if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.A03("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        } else if (searchView.A02 == null || searchView.A0E == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        } else {
            if (i == 66 || i == 84 || i == 61) {
                searchView.A0B(searchAutoComplete.getListSelection());
                return true;
            }
            if (i == 21) {
                i2 = 0;
            } else if (i == 22) {
                i2 = searchAutoComplete.length();
            } else if (i == 19 && searchAutoComplete.getListSelection() == 0) {
                return false;
            } else {
                return false;
            }
            searchAutoComplete.setSelection(i2);
            searchAutoComplete.setListSelection(0);
            searchAutoComplete.clearListSelection();
            Method method = SearchView.A0o.A02;
            if (method == null) {
                return true;
            }
            try {
                method.invoke(searchAutoComplete, Boolean.TRUE);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }
}
