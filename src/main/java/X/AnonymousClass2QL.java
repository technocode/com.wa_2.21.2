package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.group.GroupChatInfo;

/* renamed from: X.2QL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2QL implements AdapterView.OnItemClickListener {
    public final /* synthetic */ GroupChatInfo A00;

    public /* synthetic */ AnonymousClass2QL(GroupChatInfo groupChatInfo) {
        this.A00 = groupChatInfo;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A00.onListItemClicked(view);
    }
}
