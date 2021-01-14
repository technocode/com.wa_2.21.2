package X;

import android.view.KeyEvent;
import com.whatsapp.ProfilePhotoReminder;

/* renamed from: X.1tG  reason: invalid class name and case insensitive filesystem */
public class C40431tG implements AbstractC26561Lk {
    public final /* synthetic */ ProfilePhotoReminder A00;

    public C40431tG(ProfilePhotoReminder profilePhotoReminder) {
        this.A00 = profilePhotoReminder;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A04.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C002001d.A2l(this.A00.A04, iArr, 25);
    }
}
