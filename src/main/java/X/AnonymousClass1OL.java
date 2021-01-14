package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.ViewProfilePhoto;

/* renamed from: X.1OL  reason: invalid class name */
public class AnonymousClass1OL extends Handler {
    public final /* synthetic */ ViewProfilePhoto A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1OL(ViewProfilePhoto viewProfilePhoto, Looper looper) {
        super(looper);
        this.A00 = viewProfilePhoto;
    }

    public void handleMessage(Message message) {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        AnonymousClass02M r2 = ((ActivityC004702f) viewProfilePhoto).A0F;
        boolean A09 = viewProfilePhoto.A00.A09();
        int i = R.string.failed_update_profile_photo;
        if (A09) {
            i = R.string.failed_update_photo;
        }
        r2.A06(i, 0);
        viewProfilePhoto.findViewById(R.id.progress_bar).setVisibility(8);
    }
}
