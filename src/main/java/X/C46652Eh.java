package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.Conversation;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.2Eh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C46652Eh implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ContactInfoActivity A00;

    public /* synthetic */ C46652Eh(ContactInfoActivity contactInfoActivity) {
        this.A00 = contactInfoActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ContactInfoActivity contactInfoActivity = this.A00;
        int i2 = i - 1;
        if (i2 >= 0 && i2 < contactInfoActivity.A0D.getCount()) {
            C46762Eu r1 = contactInfoActivity.A0D;
            if (r1.A01 || i2 != 10) {
                contactInfoActivity.startActivity(Conversation.A04(contactInfoActivity, (C007003k) r1.A00.get(i2)));
                return;
            }
            r1.A01 = true;
            r1.notifyDataSetChanged();
        }
    }
}
