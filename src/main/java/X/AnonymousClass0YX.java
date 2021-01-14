package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.0YX  reason: invalid class name */
public class AnonymousClass0YX {
    public C12300hs A00;
    public final float A01;
    public final int A02;
    public final AnonymousClass0ZR A03 = new AnonymousClass0ZR();
    public final /* synthetic */ AnonymousClass0L2 A04;

    public AnonymousClass0YX(AnonymousClass0L2 r2, int i, float f) {
        this.A04 = r2;
        this.A02 = i;
        this.A01 = f;
    }

    public void A00() {
        C12300hs r1 = this.A00;
        if (r1 != null) {
            r1.A04 = true;
            r1.interrupt();
            this.A00 = null;
        }
    }

    public void A01(C12310ht r11, ImageView imageView) {
        imageView.setContentDescription(r11.A06);
        String obj = Long.valueOf(r11.A04).toString();
        imageView.setTag(obj);
        Bitmap bitmap = r11.A00;
        if (bitmap != null) {
            new C12260ho(this.A04.A01).APi(imageView, bitmap, true);
            return;
        }
        C007003k r0 = r11.A01;
        if (r0 != null) {
            A02(r0, imageView);
        } else {
            A06(r11, imageView, obj, new C12260ho(this.A04.A01), this.A02, this.A01);
        }
    }

    public void A02(C007003k r4, ImageView imageView) {
        if (imageView != null) {
            A04(r4, imageView, true, new C12260ho(this.A04.A01, r4));
        }
    }

    public void A03(C007003k r4, ImageView imageView) {
        A04(r4, imageView, false, new C12260ho(this.A04.A01, r4));
    }

    public void A04(C007003k r8, ImageView imageView, boolean z, AbstractC12270hp r11) {
        A05(r8, imageView, z, r11, this.A02, this.A01);
    }

    public final void A05(C007003k r4, ImageView imageView, boolean z, AbstractC12270hp r7, int i, float f) {
        String A08;
        if (z) {
            AnonymousClass0L2 r2 = this.A04;
            if (r2.A00.A09(r4.A09)) {
                A08 = r2.A06.A06(R.string.you);
            } else {
                A08 = r2.A03.A08(r4, false);
            }
            imageView.setContentDescription(A08);
        }
        String A05 = r4.A05(i, f);
        if (A05 == null) {
            r7.APu(imageView);
            return;
        }
        boolean equals = A05.equals(imageView.getTag());
        imageView.setTag(A05);
        Bitmap bitmap = (Bitmap) this.A04.A04.A02.A02().A02(A05);
        if (bitmap != null) {
            r7.APi(imageView, bitmap, true);
            return;
        }
        if (!equals || !r4.A0R) {
            r7.APu(imageView);
        }
        if (r4.A0R) {
            A06(r4, imageView, A05, r7, i, f);
        }
    }

    public final void A06(Object obj, ImageView imageView, Object obj2, AbstractC12270hp r16, int i, float f) {
        AnonymousClass0ZR r4 = this.A03;
        Stack stack = r4.A00;
        synchronized (stack) {
            int i2 = 0;
            while (i2 < stack.size()) {
                if (((C12290hr) stack.get(i2)).A04 == imageView) {
                    stack.remove(i2);
                } else {
                    i2++;
                }
            }
        }
        C12290hr r5 = new C12290hr(obj, imageView, obj2, r16, i, f);
        synchronized (stack) {
            stack.add(0, r5);
            stack.notifyAll();
        }
        if (this.A00 == null) {
            C12300hs r0 = new C12300hs(r4);
            this.A00 = r0;
            r0.start();
        }
    }

    public void A07(AnonymousClass1Z4 r8, ImageView imageView) {
        A08(r8, imageView, new C12260ho(this.A04.A01), this.A02, this.A01);
    }

    public void A08(AnonymousClass1Z4 r11, ImageView imageView, AbstractC12270hp r13, int i, float f) {
        int length;
        imageView.setContentDescription(r11.A07());
        ArrayList arrayList = new ArrayList();
        List<AnonymousClass1Z3> list = r11.A05;
        if (list != null) {
            for (AnonymousClass1Z3 r0 : list) {
                UserJid userJid = r0.A01;
                if (userJid != null) {
                    arrayList.add(userJid);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass02N r2 = (AnonymousClass02N) it.next();
            if (AnonymousClass1VY.A0e(r2)) {
                AnonymousClass0L2 r1 = this.A04;
                C007003k A09 = r1.A02.A09(r2);
                if (A09 != null) {
                    A05(A09, imageView, true, new C12260ho(r1.A01), i, f);
                    return;
                }
            }
        }
        byte[] bArr = r11.A09;
        if (bArr == null || (length = bArr.length) <= 0) {
            ((C12260ho) r13).APu(imageView);
        } else {
            ((C12260ho) r13).APi(imageView, BitmapFactory.decodeByteArray(bArr, 0, length), true);
        }
    }
}
