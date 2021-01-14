package X;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: X.0jp  reason: invalid class name and case insensitive filesystem */
public class C13210jp implements ListAdapter, SpinnerAdapter {
    public ListAdapter A00;
    public SpinnerAdapter A01;

    public int getItemViewType(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public C13210jp(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.A01 = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.A00 = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.A00;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public int getCount() {
        SpinnerAdapter spinnerAdapter = this.A01;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.A01;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    public Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.A01;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    public long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.A01;
        if (spinnerAdapter == null) {
            return -1;
        }
        return spinnerAdapter.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.A01;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    public boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.A01;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public boolean isEnabled(int i) {
        ListAdapter listAdapter = this.A00;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.A01;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.A01;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
