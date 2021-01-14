package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.io.File;

/* renamed from: X.2pb  reason: invalid class name and case insensitive filesystem */
public class C60512pb extends C59592ny {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public TextPaint A06;
    public AnonymousClass01X A07;
    public boolean A08;

    public C60512pb(Context context) {
        super(context);
        AnonymousClass01X A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A07 = A002;
        this.A00 = 1;
    }

    public final TextPaint A00() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize((float) getContext().getResources().getDimensionPixelSize(R.dimen.media_gallery_item_text_size));
        return textPaint;
    }

    public final void A01(Canvas canvas, AbstractC53892e0 r9, float f) {
        String str;
        File file = r9.A04;
        if (file != null) {
            str = file.getName();
        } else {
            str = null;
        }
        if (r9.A9V() == 4 && !TextUtils.isEmpty(str)) {
            if (this.A06 == null) {
                this.A06 = A00();
            }
            Drawable drawable = this.A04;
            if (drawable == null) {
                drawable = C004302a.A03(getContext(), R.drawable.gallery_album_overlay);
                if (drawable != null) {
                    this.A04 = drawable;
                } else {
                    throw null;
                }
            }
            drawable.setBounds(0, getHeight() - ((int) (this.A06.getTextSize() * 2.0f)), getWidth(), getHeight());
            this.A04.draw(canvas);
            TextPaint textPaint = this.A06;
            canvas.drawText(TextUtils.ellipsize(str, textPaint, f - ((textPaint.getTextSize() / 3.0f) * 2.0f), TextUtils.TruncateAt.END).toString(), this.A06.getTextSize() / 3.0f, ((float) getHeight()) - (this.A06.getTextSize() / 3.0f), this.A06);
        }
    }

    public void setDetailsLevel(int i) {
        this.A00 = i;
    }

    @Override // X.C59592ny
    public void setMediaItem(AbstractC48882Od r3) {
        super.setMediaItem(r3);
        AbstractC48882Od r1 = super.A04;
        if (r1 instanceof AbstractC53892e0) {
            AnonymousClass0Q7.A0g(this, AbstractC59162nB.A07(((AbstractC53892e0) r1).A00));
        }
    }

    public void setShowForwardScore(boolean z) {
        this.A08 = z;
    }
}
