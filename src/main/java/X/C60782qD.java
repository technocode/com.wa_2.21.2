package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.2qD  reason: invalid class name and case insensitive filesystem */
public class C60782qD extends C60332pG {
    public C60782qD(Context context, AnonymousClass0MP r2) {
        super(context, r2);
    }

    @Override // X.AnonymousClass2I2
    public void onDraw(Canvas canvas) {
        View view = ((C60332pG) this).A01;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = getContext().getResources().getDimensionPixelSize(R.dimen.popup_notification_audio_width);
            view.setLayoutParams(layoutParams);
        }
        Drawable A03 = C004302a.A03(view.getContext(), R.drawable.balloon_centered_normal);
        if (A03 != null) {
            view.setBackgroundDrawable(A03);
            ((AnonymousClass2I2) this).A0J = false;
            super.onDraw(canvas);
            return;
        }
        throw null;
    }
}
