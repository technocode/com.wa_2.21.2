package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.31W  reason: invalid class name */
public class AnonymousClass31W extends LinearLayout {
    public final ImageView A00 = ((ImageView) AnonymousClass0Q7.A0D(this, R.id.wallpaper_category_preview_icon));
    public final ImageView A01 = ((ImageView) AnonymousClass0Q7.A0D(this, R.id.wallpaper_category_preview));
    public final TextView A02 = ((TextView) AnonymousClass0Q7.A0D(this, R.id.wallpaper_category_title));

    public AnonymousClass31W(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.wallpaper_category_view, this);
    }

    public void A00(String str, Drawable drawable, Drawable drawable2) {
        this.A02.setText(str);
        this.A01.setImageDrawable(drawable);
        ImageView imageView = this.A00;
        if (drawable2 == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageDrawable(drawable2);
        imageView.setVisibility(0);
    }

    public void setPreviewScaleType(ImageView.ScaleType scaleType) {
        this.A01.setScaleType(scaleType);
    }
}
