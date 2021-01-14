package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcelable;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2eS  reason: invalid class name and case insensitive filesystem */
public class C54162eS extends AnonymousClass0JW {
    public final int A00;
    public final long A01;
    public final AnonymousClass088 A02 = AnonymousClass088.A00();
    public final AnonymousClass02M A03 = AnonymousClass02M.A00();
    public final C04350Ka A04 = C04350Ka.A00();
    public final C000300f A05 = C000300f.A00();
    public final C04360Kb A06 = C04360Kb.A00();
    public final AnonymousClass00G A07 = AnonymousClass00G.A01;
    public final AnonymousClass01X A08 = AnonymousClass01X.A00();
    public final C59502nm A09;
    public final C02590Cr A0A = C02590Cr.A00();
    public final C002701k A0B = C002701k.A00();
    public final AnonymousClass00Y A0C = AnonymousClass00Y.A00();
    public final C08340aw A0D;
    public final AnonymousClass0CP A0E = AnonymousClass0CP.A00();
    public final C02240Be A0F = C02240Be.A00();
    public final AnonymousClass0EK A0G = AnonymousClass0EK.A00();
    public final AbstractC007503q A0H;
    public final AnonymousClass0D1 A0I = AnonymousClass0D1.A00();
    public final C02220Bc A0J = C02220Bc.A00();
    public final WeakReference A0K;
    public final Collection A0L;
    public final Collection A0M;
    public final HashSet A0N;
    public final List A0O;
    public final Map A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public static int A00(int i) {
        if (i == 2 || i == 10 || i == 11) {
            return 4;
        }
        switch (i) {
            case 15:
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
            case 17:
                return 5;
            default:
                return 0;
        }
    }

    public C54162eS(MediaPreviewActivity mediaPreviewActivity, List list, Collection collection, Collection collection2, C08340aw r6, AbstractC007503q r7, long j, boolean z, int i, boolean z2, Map map, HashSet hashSet, boolean z3, C59502nm r16) {
        this.A0K = new WeakReference(mediaPreviewActivity);
        this.A0O = list;
        this.A0M = collection;
        this.A0L = collection2;
        this.A0D = r6;
        this.A0H = r7;
        this.A01 = j;
        this.A0Q = z;
        this.A00 = i;
        this.A0R = z2;
        this.A0P = map;
        this.A0N = hashSet;
        this.A0S = z3;
        this.A09 = r16;
    }

    public static final List A01(Bitmap bitmap, AnonymousClass2Mt r27) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : r27.A04) {
            if (obj instanceof C60492pZ) {
                arrayList.add(obj);
            }
        }
        Throwable th = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        RectF rectF = r27.A01;
        float f = (float) r27.A00;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        Matrix A002 = AnonymousClass2Mt.A00(width, height, f, rectF.width(), rectF.height(), false, false);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C60492pZ r7 = (C60492pZ) it.next();
            PointF pointF = new PointF(width, height);
            if (r7 != null) {
                RectF rectF2 = ((AbstractC48582Mw) r7).A04;
                rectF2.sort();
                Matrix matrix = new Matrix();
                matrix.preConcat(A002);
                matrix.preTranslate(-rectF.left, -rectF.top);
                matrix.preRotate(((AbstractC48582Mw) r7).A00, rectF2.centerX(), rectF2.centerY());
                float f2 = rectF2.left;
                float f3 = rectF2.top;
                float f4 = rectF2.right;
                float f5 = rectF2.bottom;
                float[] fArr = {f2, f3, f4, f3, f4, f5, f2, f5};
                matrix.mapPoints(fArr);
                float f6 = fArr[0];
                float f7 = pointF.x;
                double d = (double) (f6 / f7);
                float f8 = fArr[1];
                float f9 = pointF.y;
                arrayList2.add(new InteractiveAnnotation(r7.A00, r7.A01, r7.A06, new SerializablePoint[]{new SerializablePoint(d, (double) (f8 / f9)), new SerializablePoint((double) (fArr[2] / f7), (double) (fArr[3] / f9)), new SerializablePoint((double) (fArr[4] / f7), (double) (fArr[5] / f9)), new SerializablePoint((double) (fArr[6] / f7), (double) (fArr[7] / f9))}));
                th = null;
            } else {
                throw th;
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0409, code lost:
        if (r8 != false) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0217, code lost:
        if (r7 != false) goto L_0x0219;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0474 A[SYNTHETIC, Splitter:B:204:0x0474] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b0  */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.Object[] r34) {
        /*
        // Method dump skipped, instructions count: 1438
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54162eS.A02(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
        MediaPreviewActivity mediaPreviewActivity = (MediaPreviewActivity) this.A0K.get();
        if (mediaPreviewActivity != null) {
            AnonymousClass02M r6 = ((ActivityC004702f) mediaPreviewActivity).A0F;
            r6.A02.removeCallbacks(mediaPreviewActivity.A1E);
            if (mediaPreviewActivity.getIntent().getBooleanExtra("send", true) && (mediaPreviewActivity.A0U.size() > 1 || mediaPreviewActivity.A0U.contains(C12060hU.A00))) {
                mediaPreviewActivity.A0S(mediaPreviewActivity.A0U);
            }
            Iterator<? extends Parcelable> it = arrayList.iterator();
            while (it.hasNext()) {
                mediaPreviewActivity.A1I.remove(it.next());
            }
            mediaPreviewActivity.A0W();
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.putStringArrayListExtra("jids", AnonymousClass1VY.A0F(mediaPreviewActivity.A0U));
            mediaPreviewActivity.A00 = -1;
            mediaPreviewActivity.setResult(-1, intent);
            int intExtra = mediaPreviewActivity.getIntent().getIntExtra("product_origin", -1);
            if (mediaPreviewActivity.getIntent().getBooleanExtra("smb_send_product", false) && intExtra == 3) {
                r6.A06(R.string.product_message_sent, 0);
            }
            if (mediaPreviewActivity.getIntent().getBooleanExtra("start_home", false)) {
                mediaPreviewActivity.A0I(HomeActivity.A05(mediaPreviewActivity), true);
            } else {
                mediaPreviewActivity.finish();
            }
        }
    }

    public void A04(int i) {
        AnonymousClass02M r0 = this.A03;
        r0.A02.post(new RunnableEBaseShape0S0102000_I1(this, i, 0, 0));
    }
}
