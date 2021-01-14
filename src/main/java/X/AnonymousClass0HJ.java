package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0HJ  reason: invalid class name */
public class AnonymousClass0HJ {
    public static volatile AnonymousClass0HJ A02;
    public final AnonymousClass08F A00;
    public final AnonymousClass00G A01;

    public AnonymousClass0HJ(AnonymousClass00G r1, AnonymousClass08F r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static int A00(AnonymousClass02N r1) {
        if (AnonymousClass1VY.A0a(r1)) {
            return R.drawable.avatar_server_psa;
        }
        if (AnonymousClass1VY.A0b(r1)) {
            return R.drawable.avatar_status;
        }
        if (AnonymousClass1VY.A0T(r1)) {
            return R.drawable.avatar_broadcast;
        }
        if (AnonymousClass1VY.A0Y(r1)) {
            return R.drawable.avatar_group;
        }
        return R.drawable.avatar_contact;
    }

    public static Bitmap A01(Context context, int i, int i2, float f) {
        Drawable drawable = context.getResources().getDrawable(i);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        int A002 = C004302a.A00(context, R.color.primary_surface);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i2, i2);
        if (drawable instanceof BitmapDrawable) {
            Paint paint = new Paint();
            float f2 = (float) i2;
            RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setFilterBitmap(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(A002);
            if (f >= 0.0f) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(((BitmapDrawable) drawable).getBitmap(), (Rect) null, rectF, paint);
            return createBitmap;
        }
        drawable.draw(canvas);
        return createBitmap;
    }

    public static AnonymousClass0HJ A02() {
        if (A02 == null) {
            synchronized (AnonymousClass0HJ.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0HJ(AnonymousClass00G.A01, AnonymousClass08F.A02);
                }
            }
        }
        return A02;
    }

    public int A03(C007003k r2) {
        return A00((AnonymousClass02N) r2.A02(AnonymousClass02N.class));
    }

    public Bitmap A04(C007003k r4, int i, float f) {
        Bitmap decodeResource;
        if (Build.VERSION.SDK_INT >= 21) {
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int A03 = A03(r4);
            if (i2 >= 0) {
                decodeResource = A01(this.A01.A00, A03, i, f);
            } else {
                decodeResource = this.A00.A00(this.A01.A00, A03);
            }
        } else {
            decodeResource = BitmapFactory.decodeResource(this.A01.A00.getResources(), A03(r4));
        }
        return i != 0 ? Bitmap.createScaledBitmap(decodeResource, i, i, true) : decodeResource;
    }

    public void A05(ImageView imageView, int i) {
        imageView.setImageBitmap(this.A00.A00(imageView.getContext(), i));
    }

    public void A06(ImageView imageView, C007003k r3) {
        A05(imageView, A00((AnonymousClass02N) r3.A02(AnonymousClass02N.class)));
    }
}
