package X;

import android.transition.Transition;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.ViewProfilePhoto;

/* renamed from: X.1u7  reason: invalid class name */
public class AnonymousClass1u7 extends AnonymousClass1PM {
    public final /* synthetic */ ViewProfilePhoto A00;

    public AnonymousClass1u7(ViewProfilePhoto viewProfilePhoto) {
        this.A00 = viewProfilePhoto;
    }

    @Override // X.AnonymousClass1PM
    public void onTransitionStart(Transition transition) {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        View findViewById = viewProfilePhoto.findViewById(R.id.picture);
        View findViewById2 = viewProfilePhoto.findViewById(R.id.picture_animation);
        findViewById.setVisibility(4);
        findViewById2.setVisibility(0);
    }
}
