package X;

import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3UB  reason: invalid class name */
public class AnonymousClass3UB extends AnonymousClass0YU {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TranslateAnimation A01;
    public final /* synthetic */ AnonymousClass037 A02;
    public final /* synthetic */ VoipActivityV2 A03;
    public final /* synthetic */ Runnable A04;

    public AnonymousClass3UB(VoipActivityV2 voipActivityV2, TranslateAnimation translateAnimation, AnonymousClass037 r3, View view, Runnable runnable) {
        this.A03 = voipActivityV2;
        this.A01 = translateAnimation;
        this.A02 = r3;
        this.A00 = view;
        this.A04 = runnable;
    }

    @Override // X.AnonymousClass0YU
    public void onAnimationEnd(Animation animation) {
        this.A01.setAnimationListener(null);
        AnonymousClass037 r2 = this.A02;
        if (r2 != null) {
            AnonymousClass0LW A042 = this.A03.A04();
            if (A042 != null) {
                AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                r0.A03(r2);
                r0.A04();
            } else {
                throw null;
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A03.A0L.setImportantForAccessibility(1);
        }
        this.A00.setVisibility(8);
        this.A04.run();
    }
}
