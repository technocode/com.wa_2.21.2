package X;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.usernotice.UserNoticeModalIconView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.3S3  reason: invalid class name */
public class AnonymousClass3S3 extends AnonymousClass0JW {
    public final int A00;
    public final WeakReference A01;

    public AnonymousClass3S3(AnonymousClass3c7 r2) {
        this.A01 = new WeakReference(r2);
        this.A00 = r2.getTargetIconSize();
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        View view;
        File[] fileArr = (File[]) objArr;
        if (fileArr == null || fileArr.length == 0 || (view = (View) this.A01.get()) == null) {
            return null;
        }
        File file = fileArr[0];
        int i = this.A00;
        return new BitmapDrawable(view.getResources(), C002001d.A0n(file, new AnonymousClass02K(i, i)).A02);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Drawable drawable = (Drawable) obj;
        AnonymousClass3c7 r1 = (AnonymousClass3c7) this.A01.get();
        if (r1 == null) {
            return;
        }
        if (drawable == null) {
            r1.A02();
        } else if (!(r1 instanceof UserNoticeModalIconView)) {
            r1.clearColorFilter();
            r1.setImageDrawable(drawable);
        } else {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) r1;
            userNoticeModalIconView.setBackground(null);
            userNoticeModalIconView.setImageDrawable(drawable);
            userNoticeModalIconView.A00.setVisibility(8);
        }
    }
}
