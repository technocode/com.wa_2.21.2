package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.chatinfo.ListChatInfo;

/* renamed from: X.2En  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C46712En implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ListChatInfo A00;

    public /* synthetic */ C46712En(ListChatInfo listChatInfo) {
        this.A00 = listChatInfo;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListChatInfo listChatInfo = this.A00;
        C007003k r0 = ((C46812Ez) view.getTag()).A03;
        if (r0 != null) {
            listChatInfo.A0A = r0;
            view.showContextMenu();
        }
    }
}
