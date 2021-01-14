package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0jq  reason: invalid class name and case insensitive filesystem */
public class C13220jq implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass23S A00;

    public C13220jq(AnonymousClass23S r1) {
        this.A00 = r1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass23S r3 = this.A00;
        AppCompatSpinner appCompatSpinner = r3.A04;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(view, i, r3.A01.getItemId(i));
        }
        r3.dismiss();
    }
}
