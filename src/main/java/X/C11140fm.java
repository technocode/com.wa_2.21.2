package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.0fm  reason: invalid class name and case insensitive filesystem */
public class C11140fm extends AbstractC10790fC {
    public final /* synthetic */ CallsFragment A00;

    public C11140fm(CallsFragment callsFragment) {
        this.A00 = callsFragment;
    }

    @Override // X.AbstractC10790fC, android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.A00.A01 == null) {
            super.onItemClick(adapterView, view, i, j);
        } else {
            A00(adapterView, view, i, j);
        }
    }
}
