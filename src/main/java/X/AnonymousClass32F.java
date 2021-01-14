package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.32F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass32F implements AdapterView.OnItemLongClickListener {
    public final /* synthetic */ MyStatusesActivity A00;

    public /* synthetic */ AnonymousClass32F(MyStatusesActivity myStatusesActivity) {
        this.A00 = myStatusesActivity;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        MyStatusesActivity myStatusesActivity = this.A00;
        if (i >= myStatusesActivity.A06.getCount()) {
            return false;
        }
        myStatusesActivity.A0Y((AbstractC007503q) myStatusesActivity.A06.A00.get(i), view);
        return true;
    }
}
