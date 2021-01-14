package X;

import android.content.Context;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3by  reason: invalid class name and case insensitive filesystem */
public class C75013by extends PhotoView {
    public final /* synthetic */ AnonymousClass3PY A00;
    public final /* synthetic */ AbstractC71653Pu A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75013by(AnonymousClass3PY r1, Context context, AbstractC71653Pu r3) {
        super(context);
        this.A00 = r1;
        this.A01 = r3;
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AbstractC71663Pv r0 = this.A01.A00;
        r0.A0O(true, true);
        r0.A0F();
        this.A00.A01 = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r2 == 3) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r8.A00.A01 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        r0 = r8.A01.A00;
        r0.A0I();
        r0.A0G();
        r1 = r8.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r1 == null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r2 = ((com.whatsapp.mediaview.PhotoView) r8).A00;
        r3 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r3 != 0.0f) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r3 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1.A00(r2, r3, (float) (getWidth() >> 1), (float) (getHeight() >> 1), 200);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r9.getPointerCount() == 1) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    @Override // com.whatsapp.mediaview.PhotoView
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r2 = r9.getActionMasked()
            r1 = 1
            r0 = 5
            if (r2 != r0) goto L_0x001a
            int r0 = r9.getPointerCount()
            if (r0 <= r1) goto L_0x0022
            android.view.ViewParent r0 = r8.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0015:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        L_0x001a:
            if (r2 != r1) goto L_0x0022
            int r0 = r9.getPointerCount()
            if (r0 == r1) goto L_0x002b
        L_0x0022:
            X.3PY r0 = r8.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0015
            r0 = 3
            if (r2 != r0) goto L_0x0015
        L_0x002b:
            X.3PY r0 = r8.A00
            r1 = 0
            r0.A01 = r1
            android.view.ViewParent r0 = r8.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            X.3Pu r0 = r8.A01
            X.3Pv r0 = r0.A00
            r0.A0I()
            r0.A0G()
            X.2Uc r1 = r8.A0P
            if (r1 == 0) goto L_0x0015
            float r2 = r8.A00
            float r3 = r8.A05
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0050
            float r3 = r8.A04
        L_0x0050:
            int r0 = r8.getWidth()
            int r0 = r0 >> 1
            float r4 = (float) r0
            int r0 = r8.getHeight()
            int r0 = r0 >> 1
            float r5 = (float) r0
            r6 = 200(0xc8, double:9.9E-322)
            r1.A00(r2, r3, r4, r5, r6)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75013by.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
