package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.BlockList;

/* renamed from: X.1HY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HY implements AdapterView.OnItemClickListener {
    public final /* synthetic */ BlockList A00;

    public /* synthetic */ AnonymousClass1HY(BlockList blockList) {
        this.A00 = blockList;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A00.openContextMenu(view);
    }
}
