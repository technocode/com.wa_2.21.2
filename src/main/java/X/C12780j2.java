package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.0j2  reason: invalid class name and case insensitive filesystem */
public class C12780j2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass0MC A00;
    public final /* synthetic */ AlertController$RecycleListView A01;
    public final /* synthetic */ C12810j6 A02;

    public C12780j2(AnonymousClass0MC r1, AlertController$RecycleListView alertController$RecycleListView, C12810j6 r3) {
        this.A00 = r1;
        this.A01 = alertController$RecycleListView;
        this.A02 = r3;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass0MC r2 = this.A00;
        boolean[] zArr = r2.A0N;
        if (zArr != null) {
            zArr[i] = this.A01.isItemChecked(i);
        }
        r2.A09.onClick(this.A02.A0Z, i, this.A01.isItemChecked(i));
    }
}
