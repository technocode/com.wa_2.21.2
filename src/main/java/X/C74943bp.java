package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape0S1200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape2S1100000_I1;
import java.util.List;
import java.util.Set;

/* renamed from: X.3bp  reason: invalid class name and case insensitive filesystem */
public class C74943bp extends C73863Zc {
    public AnonymousClass3ZT A00;
    public final C48032Kq A01;

    public C74943bp(Context context, AnonymousClass00S r16, AnonymousClass01I r17, C02590Cr r18, C09610dF r19, AnonymousClass01A r20, AnonymousClass03P r21, C014308b r22, AnonymousClass01X r23, C48032Kq r24, AnonymousClass31y r25, C09030cB r26, AnonymousClass022 r27) {
        super(context, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27);
        this.A01 = r24;
    }

    /* renamed from: A07 */
    public void A04(C05490Ot r12, List list) {
        boolean z;
        Bitmap decodeByteArray;
        super.A04(r12, list);
        int i = 0;
        if (C48872Oc.A00(r12, 0, this.A0F, this.A01).A00.A01 != null) {
            this.A00.setVisibility(0);
            AnonymousClass3ZT r7 = this.A00;
            C48872Oc A002 = C48872Oc.A00(r12, 0, r7.A04, r7.A05);
            C48862Ob r5 = A002.A00;
            String str = r5.A01;
            String str2 = A002.A03;
            if (str2 == null) {
                str2 = "";
            }
            Set set = r5.A02;
            if (set != null) {
                r7.setOnClickListener(new ViewOnClickEBaseShape0S1200000_I1(r7, str, set, 1));
                z = true;
            } else {
                r7.setOnClickListener(new ViewOnClickCListenerShape2S1100000_I1(r7, str, 1));
                z = false;
            }
            byte[] A0y = r12.A0y();
            String str3 = null;
            if (A0y == null || (decodeByteArray = BitmapFactory.decodeByteArray(A0y, 0, A0y.length)) == null || z) {
                r7.A01.setImageDrawable(C002001d.A0b(r7.getContext(), R.drawable.ic_group_invite_link, R.color.search_link_icon));
                r7.A01.setScaleType(ImageView.ScaleType.CENTER);
                r7.A01.setScaleX(1.5f);
                r7.A01.setScaleY(1.5f);
                r7.A01.setBackgroundColor(C004302a.A00(r7.getContext(), R.color.black_alpha_05));
            } else {
                r7.A01.setImageBitmap(decodeByteArray);
                r7.A01.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            if (set == null) {
                str3 = A002.A02;
            }
            r7.A02.setTitleAndDescription(str2, str3, list);
            r7.A02.setSubText(r5.A00, list);
            View view = r7.A00;
            if (set == null) {
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        this.A00.setVisibility(8);
    }
}
