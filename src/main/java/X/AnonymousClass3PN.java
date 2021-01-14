package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.3PN  reason: invalid class name */
public class AnonymousClass3PN extends AbstractC10790fC {
    public final /* synthetic */ MyStatusesActivity A00;

    public AnonymousClass3PN(MyStatusesActivity myStatusesActivity) {
        this.A00 = myStatusesActivity;
    }

    @Override // X.AbstractC10790fC, android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MyStatusesActivity myStatusesActivity = this.A00;
        if (myStatusesActivity.A0s.isEmpty()) {
            super.onItemClick(adapterView, view, i, j);
        } else {
            myStatusesActivity.A0Y((AbstractC007503q) myStatusesActivity.A06.A00.get(i), view);
        }
    }
}
