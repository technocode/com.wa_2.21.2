package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.contact.picker.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.2G2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2G2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity A00;

    public /* synthetic */ AnonymousClass2G2(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        this.A00 = inviteNonWhatsAppContactPickerActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.A00;
        inviteNonWhatsAppContactPickerActivity.A04.A02.A07(((AnonymousClass2GM) inviteNonWhatsAppContactPickerActivity.A03.A00.get(i)).A5O());
    }
}
