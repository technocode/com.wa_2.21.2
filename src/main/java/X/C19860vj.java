package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

/* renamed from: X.0vj  reason: invalid class name and case insensitive filesystem */
public class C19860vj implements Handler.Callback {
    public final Handler A00 = new Handler(Looper.getMainLooper(), this);

    public void A00(int i, Object obj) {
        Handler handler = this.A00;
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public boolean handleMessage(Message message) {
        C07070Vu r0;
        C19780vb r3 = null;
        switch (message.what) {
            case 1:
                List list = (List) message.obj;
                for (int i = 0; i < list.size(); i++) {
                    ((AbstractC19760vZ) list.get(i)).ADm();
                }
                break;
            case 2:
                List list2 = (List) message.obj;
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    ((AbstractC19760vZ) list2.get(i2)).ADp();
                    ((AbstractC19760vZ) list2.get(i2)).ADm();
                }
                break;
            case 3:
                Object[] objArr = (Object[]) message.obj;
                List list3 = (List) objArr[0];
                Exception exc = (Exception) objArr[1];
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    ((AbstractC19760vZ) list3.get(i3)).ADj(exc);
                }
                break;
            case 4:
                Object[] objArr2 = (Object[]) message.obj;
                List list4 = (List) objArr2[0];
                String str = (String) objArr2[1];
                String str2 = (String) objArr2[2];
                for (int i4 = 0; i4 < list4.size(); i4++) {
                    ((AbstractC19760vZ) list4.get(i4)).ADn(str, str2);
                }
                break;
            case 5:
                ((AbstractC19790vc) message.obj).ADu();
                return false;
            case 6:
                Object[] objArr3 = (Object[]) message.obj;
                AbstractC19790vc r5 = (AbstractC19790vc) objArr3[0];
                byte[] bArr = (byte[]) objArr3[1];
                C22130zv r02 = (C22130zv) objArr3[2];
                if (r02 != null) {
                    Rect rect = r02.A06;
                    Rect rect2 = r02.A07;
                    AnonymousClass0N2.A0G(r02.A08);
                    r3 = new C19780vb(rect, rect2);
                }
                r5.AIT(bArr, r3);
                return false;
            case 7:
                Object[] objArr4 = (Object[]) message.obj;
                ((AbstractC19790vc) objArr4[0]).ADt((Exception) objArr4[1]);
                return false;
            case 8:
                Object[] objArr5 = (Object[]) message.obj;
                ((AbstractC19840vh) objArr5[0]).AJB(AnonymousClass0N2.A0k((C07050Vs) objArr5[1]));
                return false;
            case 9:
                Object[] objArr6 = (Object[]) message.obj;
                ((AbstractC19840vh) objArr6[0]).AJ9(AnonymousClass0N2.A0k((C07050Vs) objArr6[1]));
                return false;
            case 10:
                Object[] objArr7 = (Object[]) message.obj;
                ((AbstractC19840vh) objArr7[0]).AJA((Exception) objArr7[1]);
                return false;
            case 11:
                Object[] objArr8 = (Object[]) message.obj;
                ((AbstractC19770va) objArr8[0]).AGI((Point) objArr8[1]);
                return false;
            case 12:
                Object[] objArr9 = (Object[]) message.obj;
                ((AbstractC19770va) objArr9[0]).AGH((Point) objArr9[1]);
                return false;
            case 13:
                ((AbstractC19770va) message.obj).AGG();
                return false;
            case 14:
                ((AbstractC19770va) message.obj).AGF();
                return false;
            case 15:
                Object[] objArr10 = (Object[]) message.obj;
                TextureView$SurfaceTextureListenerC32431ew r2 = (TextureView$SurfaceTextureListenerC32431ew) objArr10[0];
                C21960zc r4 = (C21960zc) objArr10[1];
                int intValue = ((Number) objArr10[2]).intValue();
                int intValue2 = ((Number) objArr10[3]).intValue();
                if (r2 == null) {
                    throw null;
                } else if (intValue > 0 && intValue2 > 0 && (r0 = (C07070Vu) r4.A00.A00(AnonymousClass0VN.A0e)) != null) {
                    Matrix matrix = new Matrix();
                    AbstractC21080y9 r7 = r2.A0M;
                    if (r7.APW(intValue, intValue2, r0.A01, r0.A00, matrix, r2.A0A)) {
                        r7.AAl(intValue, intValue2, r4.A01, matrix);
                        if (r2.A0K == null) {
                            throw null;
                        } else if (!C32451ey.A0E) {
                            r2.A0G.setTransform(matrix);
                            return false;
                        }
                    }
                }
                break;
        }
        return false;
    }
}
