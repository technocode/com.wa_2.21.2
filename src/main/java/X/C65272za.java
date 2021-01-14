package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.util.Log;

/* renamed from: X.2za  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65272za implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass30T A00;

    public /* synthetic */ C65272za(AnonymousClass30T r1) {
        this.A00 = r1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass30T r1 = this.A00;
        Log.i("select-phone-number-dialog/phone-number-selected");
        if (r1.A00 != i) {
            r1.A00 = i;
            r1.notifyDataSetChanged();
        }
    }
}
