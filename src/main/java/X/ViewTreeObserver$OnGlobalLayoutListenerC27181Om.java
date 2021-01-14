package X;

import android.graphics.Path;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.whatsapp.WaRoundCornerImageView;

/* renamed from: X.1Om  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC27181Om implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ WaRoundCornerImageView A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC27181Om(WaRoundCornerImageView waRoundCornerImageView) {
        this.A00 = waRoundCornerImageView;
    }

    public void onGlobalLayout() {
        if (Build.VERSION.SDK_INT >= 21) {
            WaRoundCornerImageView waRoundCornerImageView = this.A00;
            Path path = new Path();
            waRoundCornerImageView.A01 = path;
            int left = waRoundCornerImageView.getLeft();
            int top = waRoundCornerImageView.getTop();
            float f = waRoundCornerImageView.A00;
            path.addRoundRect((float) (waRoundCornerImageView.getPaddingLeft() + left), (float) (waRoundCornerImageView.getPaddingTop() + top), (float) (waRoundCornerImageView.getRight() - waRoundCornerImageView.getPaddingRight()), (float) (waRoundCornerImageView.getBottom() - waRoundCornerImageView.getPaddingBottom()), f, f, Path.Direction.CCW);
        }
    }
}
