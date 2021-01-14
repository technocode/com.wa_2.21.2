package X;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: X.0k1  reason: invalid class name and case insensitive filesystem */
public class C13320k1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ C29631Zu A00;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public C13320k1(C29631Zu r1) {
        this.A00 = r1;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C13290jy r1;
        if (i != -1 && (r1 = this.A00.A0E) != null) {
            r1.A0B = false;
        }
    }
}
