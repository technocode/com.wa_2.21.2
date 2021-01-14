package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Za  reason: invalid class name */
public abstract class AnonymousClass3Za extends AnonymousClass3OP {
    public AnonymousClass3ON A00;

    public abstract String getDefaultMessageText();

    public abstract int getDrawableRes();

    public AnonymousClass02R getTimestampStrings() {
        return null;
    }

    public AnonymousClass3Za(Context context, AnonymousClass00S r2, AnonymousClass01I r3, C02590Cr r4, C09610dF r5, AnonymousClass01A r6, AnonymousClass03P r7, C014308b r8, AnonymousClass01X r9, AnonymousClass31y r10, C09030cB r11, AnonymousClass022 r12) {
        super(context, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    }

    @Override // X.AnonymousClass3OP
    public CharSequence A01(AbstractC007503q r9, C007003k r10) {
        Drawable A0b = C002001d.A0b(getContext(), getDrawableRes(), R.color.msgStatusTint);
        TextPaint paint = ((AnonymousClass3OP) this).A01.getPaint();
        int iconSizeIncrease = getIconSizeIncrease() + ((int) paint.getTextSize());
        StringBuilder sb = new StringBuilder("  ");
        sb.append((Object) "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        C05270Nw.A02(spannableStringBuilder, A0b, paint, iconSizeIncrease, 0, 1);
        return C28051Sr.A0j(spannableStringBuilder, r10, r9.A0n.A02, this.A08, this.A0A, this.A0F);
    }

    public int getIconSizeIncrease() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.search_icon_label_size_increase);
    }

    public void setThumbnailOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setId(R.id.thumb_view);
        this.A00.setOnClickListener(onClickListener);
    }

    public void setUpThumbView(AnonymousClass3ON r4) {
        r4.setRadius(getResources().getDimensionPixelSize(R.dimen.search_media_thumbnail_corner_radius));
        r4.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.search_media_thumbnail_size), getResources().getDimensionPixelSize(R.dimen.search_media_thumbnail_size)));
        AnonymousClass0SE.A05(this.A0F, r4, getResources().getDimensionPixelSize(R.dimen.search_attachment_margin), 0);
    }
}
