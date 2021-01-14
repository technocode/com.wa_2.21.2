package X;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.concurrent.Callable;

/* renamed from: X.0yS  reason: invalid class name and case insensitive filesystem */
public class CallableC21260yS implements Callable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ C33081gA A01;

    public CallableC21260yS(C33081gA r1, Rect rect) {
        this.A01 = r1;
        this.A00 = rect;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        Point point;
        C33081gA r1 = this.A01;
        if (r1.isConnected()) {
            r1.A0C();
            C33091gB r6 = r1.A0L;
            Rect rect = this.A00;
            C33051g7 r5 = new C33051g7(this);
            r6.A05.A04("Focus requests must be on the Optic thread. ");
            if (r6.A08 && r6.A08) {
                C21950zb r8 = r6.A04;
                AnonymousClass0VO A012 = r8.A01(r6.A03);
                AnonymousClass0W3 r2 = AnonymousClass0VO.A0E;
                if (((Boolean) A012.A00(r2)).booleanValue() || ((Boolean) A012.A00(AnonymousClass0VO.A02)).booleanValue()) {
                    if (r6.A07) {
                        ((C21420yi) r6).A00.cancelAutoFocus();
                    }
                    r6.A06 = false;
                    r6.A07 = true;
                    r6.A01 = false;
                    if (rect == null) {
                        point = null;
                    } else {
                        C33331gZ A002 = r8.A00(r6.A03);
                        if (!((Boolean) r8.A01(r6.A03).A00(r2)).booleanValue()) {
                            point = new Point(0, 0);
                        } else if (A002 != null) {
                            ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0A, C21990zf.A04(rect));
                            point = new Point(rect.centerX(), rect.centerY());
                        } else {
                            throw null;
                        }
                        ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0B, 1);
                        A002.A00();
                    }
                    r6.A00(((C21420yi) r6).A01, EnumC21130yE.FOCUSING, point);
                    ((C21420yi) r6).A00.autoFocus(new C21410yh(r6, point, r5));
                }
            }
        }
        return null;
    }
}
