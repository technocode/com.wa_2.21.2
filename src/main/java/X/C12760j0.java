package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.0j0  reason: invalid class name and case insensitive filesystem */
public class C12760j0 extends ArrayAdapter {
    public final /* synthetic */ AnonymousClass0MC A00;
    public final /* synthetic */ AlertController$RecycleListView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12760j0(AnonymousClass0MC r2, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, 16908308, charSequenceArr);
        this.A00 = r2;
        this.A01 = alertController$RecycleListView;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.A00.A0N;
        if (zArr != null && zArr[i]) {
            this.A01.setItemChecked(i, true);
        }
        return view2;
    }
}
