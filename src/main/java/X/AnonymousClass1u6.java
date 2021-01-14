package X;

import android.transition.Transition;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.ViewProfilePhoto;

/* renamed from: X.1u6  reason: invalid class name */
public class AnonymousClass1u6 extends AnonymousClass1PM {
    public final /* synthetic */ ViewProfilePhoto A00;

    public AnonymousClass1u6(ViewProfilePhoto viewProfilePhoto) {
        this.A00 = viewProfilePhoto;
    }

    @Override // X.AnonymousClass1PM
    public void onTransitionEnd(Transition transition) {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        View findViewById = viewProfilePhoto.findViewById(R.id.picture);
        View findViewById2 = viewProfilePhoto.findViewById(R.id.picture_animation);
        findViewById.setVisibility(0);
        findViewById2.setVisibility(4);
        viewProfilePhoto.getWindow().setStatusBarColor(-16777216);
    }
}
