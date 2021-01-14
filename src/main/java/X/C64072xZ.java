package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.2xZ  reason: invalid class name and case insensitive filesystem */
public class C64072xZ extends AnimatorListenerAdapter {
    public boolean A00 = true;
    public final /* synthetic */ ProfileInfoActivity A01;
    public final /* synthetic */ Runnable A02;

    public C64072xZ(ProfileInfoActivity profileInfoActivity, Runnable runnable) {
        this.A01 = profileInfoActivity;
        this.A02 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            if (!(!((ActivityC004702f) this.A01).A0B)) {
                this.A02.run();
            }
        }
    }
}
