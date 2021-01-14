package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.emoji.EmojiDescriptor;
import java.lang.ref.Reference;

/* renamed from: X.1Ll  reason: invalid class name and case insensitive filesystem */
public class C26571Ll extends View {
    public int A00 = -1;
    public int A01;
    public Path A02;
    public Drawable A03;
    public boolean A04;
    public int[] A05;
    public final /* synthetic */ C26621Lq A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26571Ll(C26621Lq r2, Context context) {
        super(context);
        this.A06 = r2;
        this.A01 = C004302a.A00(context, R.color.emojiSkinToneIndicator);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A04) {
            if (this.A02 == null) {
                this.A02 = new Path();
            }
            Paint paint = this.A06.A0H;
            paint.setColor(this.A01);
            this.A02.reset();
            this.A02.moveTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.A02.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 3) >> 2));
            this.A02.lineTo((float) ((getWidth() * 3) >> 2), (float) ((getHeight() * 9) / 10));
            this.A02.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.A02.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A02, paint);
        }
        if (this.A03 != null) {
            int i = this.A06.A02;
            int width = (getWidth() - i) >> 1;
            int height = (getHeight() - i) >> 1;
            Drawable drawable = this.A03;
            if (drawable instanceof C48632Nb) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
            } else {
                drawable.setBounds(width, height, width + i, i + height);
            }
            this.A03.draw(canvas);
        }
    }

    public void setEmoji(int[] iArr) {
        Drawable drawable;
        if (iArr == null) {
            this.A05 = null;
            this.A00 = -1;
            this.A03 = null;
            this.A04 = false;
            setContentDescription(null);
            return;
        }
        int A002 = EmojiDescriptor.A00(new AnonymousClass2d1(iArr), false);
        if (this.A00 != A002) {
            this.A05 = iArr;
            this.A00 = A002;
            this.A04 = C28051Sr.A21(iArr);
            this.A03 = null;
            if (A002 != 0) {
                Reference reference = (Reference) C26621Lq.A0X.get(A002);
                if (reference == null) {
                    drawable = null;
                } else {
                    drawable = (Drawable) reference.get();
                }
                this.A03 = drawable;
                if (drawable == null) {
                    Message.obtain(C26621Lq.A0U, 0, A002, 0, new C26601Lo(this, new AnonymousClass2d1(iArr))).sendToTarget();
                } else {
                    invalidate();
                }
            }
            setContentDescription(C03960Il.A00(iArr));
        }
    }
}
