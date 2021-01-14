package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.views.MessageThumbView;

/* renamed from: X.3Nx  reason: invalid class name and case insensitive filesystem */
public class C71183Nx implements AnonymousClass0D9 {
    public final /* synthetic */ MessageThumbView A00;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C71183Nx(MessageThumbView messageThumbView) {
        this.A00 = messageThumbView;
    }

    public final void A00(Bitmap bitmap) {
        MessageThumbView messageThumbView = this.A00;
        Drawable drawable = messageThumbView.getDrawable();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(messageThumbView.getResources(), bitmap);
        if (drawable == null || (drawable instanceof ColorDrawable)) {
            messageThumbView.setImageDrawable(bitmapDrawable);
            return;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
        messageThumbView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(150);
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00.getWidth();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r6) {
        MessageThumbView messageThumbView = this.A00;
        if (messageThumbView.A00 > 0) {
            A00(C02230Bd.A0C(bitmap, messageThumbView.getResources().getDimensionPixelSize(R.dimen.search_media_thumbnail_size), (float) messageThumbView.A00));
        } else {
            A00(bitmap);
        }
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A00.setImageDrawable(new ColorDrawable(view.getResources().getColor(R.color.search_grid_item_bg)));
    }
}
