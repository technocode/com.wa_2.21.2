package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.2We  reason: invalid class name and case insensitive filesystem */
public class C50822We extends AbstractC16300pa {
    public AbstractC48892Oe A00;
    public final int A01;
    public final Drawable A02;
    public final /* synthetic */ AnonymousClass0YW A03;

    public C50822We(AnonymousClass0YW r3) {
        this.A03 = r3;
        int A002 = C004302a.A00(r3.A0L, R.color.camera_thumb);
        this.A01 = A002;
        this.A02 = new ColorDrawable(A002);
        A04(true);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        int count;
        AbstractC48892Oe r0 = this.A00;
        int i = 0;
        if (r0 == null) {
            count = 0;
        } else {
            count = r0.getCount();
        }
        AnonymousClass0YW r1 = this.A03;
        if (r1.A0f) {
            i = r1.A1N.size();
        }
        return count + i;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        C60652ps r2 = new C60652ps(this.A03.A0L);
        if (Build.VERSION.SDK_INT >= 21) {
            r2.setSelector(null);
        }
        return new View$OnClickListenerC50812Wd(this, r2);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r7, int i) {
        AbstractC48882Od A08 = A08(i);
        C60522pc r3 = ((View$OnClickListenerC50812Wd) r7).A00;
        r3.setMediaItem(A08);
        ((C59592ny) r3).A00 = null;
        r3.setId(R.id.thumb);
        AnonymousClass0YW r4 = this.A03;
        r4.A0U.A01((AnonymousClass2PJ) r3.getTag());
        if (A08 != null) {
            r3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            AnonymousClass0Q7.A0g(r3, A08.A4W().toString());
            C50792Wb r2 = new C50792Wb(this, r3, A08);
            r3.setTag(r2);
            r4.A0U.A02(r2, new C50802Wc(this, r3, r2, A08));
            r3.setChecked(r4.A1O.contains(r3.getUri()));
            return;
        }
        r3.setScaleType(ImageView.ScaleType.CENTER);
        AnonymousClass0Q7.A0g(r3, null);
        r3.setBackgroundColor(this.A01);
        r3.setImageDrawable(null);
        r3.setChecked(false);
    }

    public final AbstractC48882Od A08(int i) {
        AnonymousClass0YW r1 = this.A03;
        if (!r1.A0f) {
            return this.A00.A7I(i);
        }
        List list = r1.A1N;
        if (i < list.size()) {
            return (AbstractC48882Od) list.get(i);
        }
        return this.A00.A7I(i - list.size());
    }
}
