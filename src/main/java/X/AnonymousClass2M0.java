package X;

import android.content.DialogInterface;
import android.graphics.PointF;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.doodle.TitleBarComponent;

/* renamed from: X.2M0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2M0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass2MF A00;
    public final /* synthetic */ AnonymousClass2MQ A01;
    public final /* synthetic */ C53232ck A02;

    public /* synthetic */ AnonymousClass2M0(AnonymousClass2MF r1, C53232ck r2, AnonymousClass2MQ r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass2MF r6 = this.A00;
        C53232ck r7 = this.A02;
        AnonymousClass2MQ r5 = this.A01;
        if (r7 != null) {
            ((AbstractC48582Mw) r7).A02 = false;
            if (TextUtils.isEmpty(r5.A0C)) {
                r6.A04.A0E(r7);
            } else {
                DoodleView doodleView = r6.A04;
                String str = r5.A0C;
                int i = r5.A03;
                int i2 = r5.A04;
                if (!(str.equals(r7.A07) && ((AbstractC48582Mw) r7).A03.getColor() == i && i2 == r7.A04)) {
                    C48592Mx r2 = doodleView.A0U;
                    r2.A00.A00.add(new C53282cp(r7, r7.A01()));
                    r7.A0I(i2);
                    r7.A0J(str, i2);
                    ((AbstractC48582Mw) r7).A03.setColor(i);
                    doodleView.invalidate();
                    if (r7 != doodleView.A0R) {
                        doodleView.A0X = false;
                    }
                }
            }
        } else if (!TextUtils.isEmpty(r5.A0C)) {
            r6.A04.A0F(r5.A0C, r5.A03, r5.A04);
        }
        r6.A0D.setColorAndInvalidate(r5.A03);
        DoodleView doodleView2 = r6.A04;
        doodleView2.A0B = r5.A03;
        doodleView2.invalidate();
        r6.A07.A02();
        TitleBarComponent titleBarComponent = r6.A0F;
        PointF pointF = new PointF(r5.A00, r5.A01);
        if (!(titleBarComponent.A02 == null || titleBarComponent.A03 == null)) {
            if (TitleBarComponent.A00(titleBarComponent.A0H, pointF.x, pointF.y)) {
                titleBarComponent.A02.A01();
            } else if (!titleBarComponent.A03.A0Y && TitleBarComponent.A00(titleBarComponent.A0F, pointF.x, pointF.y)) {
                titleBarComponent.A02.A00.A01();
            } else if (TitleBarComponent.A00(titleBarComponent.A0I, pointF.x, pointF.y)) {
                titleBarComponent.A03.A0R = null;
            } else {
                ImageView imageView = titleBarComponent.A0E;
                if (imageView.getVisibility() == 0 && TitleBarComponent.A00(imageView, pointF.x, pointF.y)) {
                    titleBarComponent.A02.A00();
                }
            }
        }
        r6.A04();
    }
}
