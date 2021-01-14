package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.ChangeNumberNotifyContacts;
import com.whatsapp.registration.NotifyContactsSelector;

/* renamed from: X.3ZF  reason: invalid class name */
public class AnonymousClass3ZF extends AbstractC39391rQ {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZF(ChangeNumberNotifyContacts changeNumberNotifyContacts, Context context) {
        super(context, R.color.link_color);
        this.A00 = changeNumberNotifyContacts;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        Intent intent = new Intent(changeNumberNotifyContacts, NotifyContactsSelector.class);
        intent.putStringArrayListExtra("selected", AnonymousClass1VY.A0F(changeNumberNotifyContacts.A0B));
        changeNumberNotifyContacts.startActivityForResult(intent, 1);
    }
}
