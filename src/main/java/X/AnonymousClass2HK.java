package X;

import android.content.Intent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import com.whatsapp.stickers.StickerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2HK  reason: invalid class name */
public class AnonymousClass2HK implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AbstractC51572Zg A00;
    public final /* synthetic */ C007303n A01;

    public AnonymousClass2HK(AbstractC51572Zg r1, C007303n r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean onPreDraw() {
        AbstractC51572Zg r4 = this.A00;
        r4.getViewTreeObserver().removeOnPreDrawListener(this);
        C007303n r3 = this.A01;
        if (r4 instanceof C60442pR) {
            Iterator it = ((C60442pR) r4).A08.iterator();
            while (it.hasNext()) {
                AnonymousClass2IO r1 = (AnonymousClass2IO) it.next();
                if (r3.equals(r1.A03.A0n)) {
                    StickerView stickerView = r1.A08;
                    stickerView.setBackgroundDrawable(new AnonymousClass2IM(r1));
                    AnonymousClass2IN r2 = new AnonymousClass2IN(r1);
                    r2.setDuration(2400);
                    r2.setInterpolator(new AccelerateInterpolator());
                    stickerView.startAnimation(r2);
                    return true;
                }
            }
            return true;
        } else if (!(r4 instanceof C60372pK)) {
            AnonymousClass2I1 r22 = new AnonymousClass2I1(r4);
            r22.setDuration(2400);
            r22.setInterpolator(new AccelerateInterpolator());
            r4.startAnimation(r22);
            return true;
        } else {
            C60372pK r42 = (C60372pK) r4;
            AnonymousClass2I1 r23 = new AnonymousClass2I1(r42);
            r23.setDuration(2400);
            r23.setInterpolator(new AccelerateInterpolator());
            r42.startAnimation(r23);
            ArrayList arrayList = r42.A04;
            if (arrayList == null) {
                return true;
            }
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && !r3.equals(((AbstractC007503q) it2.next()).A0n)) {
                i++;
            }
            Intent A0k = r42.A0k();
            if (AnonymousClass2UT.A00) {
                A0k.putExtra("start_index", i);
            }
            r42.getContext().startActivity(A0k);
            return true;
        }
    }
}
