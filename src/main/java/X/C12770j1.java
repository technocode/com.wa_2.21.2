package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.0j1  reason: invalid class name and case insensitive filesystem */
public class C12770j1 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass0MC A00;
    public final /* synthetic */ C12810j6 A01;

    public C12770j1(AnonymousClass0MC r1, C12810j6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass0MC r3 = this.A00;
        DialogInterface.OnClickListener onClickListener = r3.A05;
        AnonymousClass0ME r1 = this.A01.A0Z;
        onClickListener.onClick(r1, i);
        if (!r3.A0L) {
            r1.dismiss();
        }
    }
}
