package X;

import android.content.Intent;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.2Wx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C50992Wx implements AbstractC665434t {
    public final /* synthetic */ ContactInfoActivity A00;

    public /* synthetic */ C50992Wx(ContactInfoActivity contactInfoActivity) {
        this.A00 = contactInfoActivity;
    }

    @Override // X.AbstractC665434t
    public final void AEE() {
        ContactInfoActivity contactInfoActivity = this.A00;
        Intent intent = new Intent(contactInfoActivity, MediaGalleryActivity.class);
        intent.putExtra("jid", contactInfoActivity.A0h().getRawString());
        contactInfoActivity.startActivity(intent);
    }
}
