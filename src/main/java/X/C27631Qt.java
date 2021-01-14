package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.backup.google.GoogleDriveRestoreAnimationView;

/* renamed from: X.1Qt  reason: invalid class name and case insensitive filesystem */
public class C27631Qt extends Animation {
    public final GoogleDriveRestoreAnimationView A00;

    public C27631Qt(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView) {
        this.A00 = googleDriveRestoreAnimationView;
    }

    public void applyTransformation(float f, Transformation transformation) {
        GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView = this.A00;
        googleDriveRestoreAnimationView.A00 = f;
        googleDriveRestoreAnimationView.invalidate();
    }
}
