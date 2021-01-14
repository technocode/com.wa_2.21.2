package X;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.search.verification.client.R;
import java.util.Iterator;

/* renamed from: X.0Hs  reason: invalid class name */
public abstract class AnonymousClass0Hs {
    public AnonymousClass03E A00;
    public CharSequence A01;
    public boolean A02 = false;

    public RemoteViews A02(AbstractC14530mR r2) {
        return null;
    }

    public RemoteViews A03(AbstractC14530mR r2) {
        return null;
    }

    public RemoteViews A04(AbstractC14530mR r2) {
        return null;
    }

    public void A05(Bundle bundle) {
    }

    public final Bitmap A00(int i, int i2, int i3, int i4) {
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap A012 = A01(IconCompat.A02(this.A00.A0B, R.drawable.notification_icon_background), i4, i2);
        Canvas canvas = new Canvas(A012);
        Drawable mutate = this.A00.A0B.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i5 = (i2 - i3) >> 1;
        int i6 = i3 + i5;
        mutate.setBounds(i5, i5, i6, i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return A012;
    }

    public final Bitmap A01(IconCompat iconCompat, int i, int i2) {
        int i3;
        Drawable A06 = iconCompat.A06(this.A00.A0B);
        if (i2 == 0) {
            i3 = A06.getIntrinsicWidth();
            i2 = A06.getIntrinsicHeight();
        } else {
            i3 = i2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        A06.setBounds(0, 0, i3, i2);
        if (i != 0) {
            A06.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        A06.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void A06(AbstractC14530mR r5) {
        if (this instanceof C29981aW) {
            C29981aW r3 = (C29981aW) this;
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((C30011aZ) r5).A02).setBigContentTitle(null);
            if (r3.A02) {
                bigContentTitle.setSummaryText(r3.A01);
            }
            Iterator it = r3.A00.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        } else if (!(this instanceof C03800Hr)) {
            C29961aU r2 = (C29961aU) this;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((C30011aZ) r5).A02).setBigContentTitle(null).bigPicture(r2.A00);
            if (r2.A01) {
                bigPicture.bigLargeIcon((Bitmap) null);
            }
            if (r2.A02) {
                bigPicture.setSummaryText(((AnonymousClass0Hs) r2).A01);
            }
        } else {
            C03800Hr r22 = (C03800Hr) this;
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(((C30011aZ) r5).A02).setBigContentTitle(null).bigText(r22.A00);
            if (r22.A02) {
                bigText.setSummaryText(r22.A01);
            }
        }
    }
}
